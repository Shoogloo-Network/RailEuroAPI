package com.controller.filter;

import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bb.service.AuthJwtToken;
import com.controller.helper.UserAccessToken;
import com.mongo.repository.JwtTokenRepository;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
@Order(1)
public class SecurityFilter implements Filter {
	@Autowired
	AuthJwtToken jwtAuthToken;
	@Autowired
	JwtTokenRepository jwtTokenRepository;
	public static int tokenEnable = 0;

	@CrossOrigin
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		String token = httpRequest.getHeader("access-token");
		Enumeration<String> en = httpRequest.getHeaderNames();
	/*Iterator<String> it = en.asIterator();
	while(it.hasNext())
		System.out.println("iii"+it.next());
	it=httpRequest.getParameterNames().asIterator();
	while(it.hasNext())
		System.out.println("jjjj"+it.next());
	it=httpRequest.getAttributeNames().asIterator();
	while(it.hasNext())
		System.out.println("lkkkk"+it.next());
	*/
		Object token2=httpRequest.getAttribute("access-token");

		System.out.println("path=" + httpRequest.getRequestURI()+"  token="+token+"   ----2=="+token2);
		if (tokenEnable == 1 && (httpRequest.getRequestURI().contains("checkout/confirm")||
				httpRequest.getRequestURI().contains("confirm"))) {
			UserAccessToken tokenObject = jwtTokenRepository.findByAccessToken(token);
			System.out.println("tokenObject=" + tokenObject);
			if (tokenObject == null) {

				httpResponse.reset();
			httpResponse.resetBuffer();
				httpResponse.sendRedirect("https://www.parislondrestrain.fr//rail/error/e");
				System.out.println("token Not Found=" + token);
			} else {
				Date dd = new Date();
				System.out.println("token Found=" + token);
				chain.doFilter(httpRequest, response);
				/*
				 * if (dd.before(tokenObject.getExpireAfterSeconds())) {
				 * System.out.println("before"); chain.doFilter(httpRequest, response); } else {
				 * httpResponse.reset(); httpResponse.resetBuffer();
				 * httpResponse.sendRedirect("/rail/error/e");
				 * 
				 * }
				 */

			}
		} else {
			System.out.println("66");
			chain.doFilter(httpRequest, response);
		}

	}

}
