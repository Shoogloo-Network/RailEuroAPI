package com.controller.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

@Configuration
public class SecurityConfig {
	@Bean
	   public FilterRegistrationBean<SecurityFilter> abcFilter() {
		   FilterRegistrationBean<SecurityFilter> filterRegBean = new FilterRegistrationBean<>();
		   filterRegBean.setFilter(new SecurityFilter());
		   filterRegBean.addUrlPatterns("/bookings/*");
		  
		   filterRegBean.setOrder(Ordered.LOWEST_PRECEDENCE -1);
		   return filterRegBean;
	   }
}