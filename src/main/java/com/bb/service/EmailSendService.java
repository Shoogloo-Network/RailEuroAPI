package com.bb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controller.helper.MailHelper;
import com.controller.helper.booking.ValueDocument;
import com.user.entity.MailsData;
import com.user.entity.MailsDataAttachment;
import com.util.MailTicket;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class EmailSendService {
	@Autowired
	
	public String mailsend(MailHelper mailHelper, String booking) throws IOException {
		String host = "smtp.office365.com";
		String from = "info@cheaptraintickets.in";
		Properties props = System.getProperties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.user", from);
		props.put("mail.smtp.password", "$harma@007");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		String urlString = null;
		if (booking.contains("success")) {
			urlString = "https://report.cheaptraintickets.co.uk/mailtemplate/booking-success-email.php";
		} else if (booking.contains("refund")) {
			urlString = "https://report.cheaptraintickets.co.uk/mailtemplate/refund-email.php?bref="
					+ mailHelper.getBookingReference() + "&frm=" + mailHelper.getOrigin() + "&to="
					+ mailHelper.getDestination() + "&name=" + mailHelper.getName() + "&dep="
					+ mailHelper.getDeparture() + "&arr=" + mailHelper.getArrival() + "&pnr=" + mailHelper.getPnr()
					+ "&amt=" + mailHelper.getTotalamount() + "&fee=" + mailHelper.getPartnerComission() + "&ref="
					+ mailHelper.getRefund();
		} else if (booking.contains("ctrn")) {
			if (mailHelper.getCtr() != null)
				urlString = "https://report.cheaptraintickets.co.uk/mailtemplate/instructions-email.php?ctrn="
						+ mailHelper.getCtr();
			else
				urlString = "https://report.cheaptraintickets.co.uk/mailtemplate/instructions-email.php?ctrn="
						+ mailHelper.getPnr();

		}
		if (urlString.contains(" "))
			urlString = urlString.replace(" ", "%20");
		URL url = new URL(urlString);
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		StringBuilder htmlContent = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			htmlContent.append(line);
		}
		reader.close();
		try {
			Session session = Session.getDefaultInstance(props, null);
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			// message.addRecipients(Message.RecipientType.TO,mailHelper.getToSendMail());
		//	System.out.println("sender mail " + mailHelper.getToSendMail());
			message.addRecipients(Message.RecipientType.TO, "hardik.nagpal@shoogloo.com");
			if (booking.contains("success")) {
				message.setSubject("success ");
			} else if (booking.contains("refund")) {
				message.setSubject("Refund mail");
			} else if (booking.contains("ctrn")) {
				message.setSubject("instructions-email");
			}
			// message.setText("Welcome to JavaMail");
			MimeBodyPart htmlBodyPart = new MimeBodyPart();
			htmlBodyPart.setContent(htmlContent.toString(), "text/html; charset=utf-8");
			MimeBodyPart imageBodyPart = new MimeBodyPart();
			DataSource fds = new FileDataSource("");
			imageBodyPart.setDataHandler(new DataHandler(fds));
			imageBodyPart.setDisposition(MimeBodyPart.INLINE);
			imageBodyPart.setHeader("Content-ID", "<image>");
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(htmlBodyPart);

			if (mailHelper.getAttachmentUrl() != null) {
				// Add Attachment Start
				for (ValueDocument attachl : mailHelper.getAttachmentUrl()) {
					MimeBodyPart pdfAttach = new MimeBodyPart();
					downLadFile(attachl.getUrl());
					String durl = attachl.getUrl();
					String fileName = durl.substring(durl.lastIndexOf("/"));
					DataSource source = new FileDataSource("/tmp/" + fileName);
					System.out.println("''''"+source.toString());
					pdfAttach.setDataHandler(new DataHandler(source));
					pdfAttach.setFileName(mailHelper.getName());
					multipart.addBodyPart(pdfAttach);
				}
			}
			// multipart.addBodyPart(imageBodyPart);
			message.setContent(multipart);
			// System.out.println("message"+message.toString());
			Transport transport = session.getTransport("smtp");
			transport.connect("smtp.office365.com", "info@cheaptraintickets.in", "$harma@007");
			transport.sendMessage(message, message.getAllRecipients());
			// System.out.println("send successfull");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return "send successfull";
	}

	public String downLadFile(String url) {

		try {/*
				 * (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
				 * FileOutputStream fileOutputStream = new FileOutputStream(url)) { byte
				 * dataBuffer[] = new byte[1024]; int bytesRead; while ((bytesRead =
				 * in.read(dataBuffer, 0, 1024)) != -1) { fileOutputStream.write(dataBuffer, 0,
				 * bytesRead);
				 */
			InputStream in = new URL(url).openStream();
			String fileName = url.substring(url.lastIndexOf("/"));
			 System.out.println("fileName"+fileName);
			Files.copy(in, Paths.get("/tmp/" + fileName), StandardCopyOption.REPLACE_EXISTING);
			return fileName;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}



}
