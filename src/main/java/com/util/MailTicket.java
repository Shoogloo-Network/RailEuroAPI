package com.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.user.entity.MailsData;
import com.user.entity.MailsDataAttachment;

public class MailTicket extends Thread{
	MailsData mailsData=null;
	public MailTicket(MailsData mailsData)
	{
		this.mailsData=mailsData;
		
	}
	
	public static void main(String[] args) throws IOException {
			
		MailTicket mail = new MailTicket(new MailsData());
		String fileName = mail.downLadFile(
				"https://statics-sandbox.era.raileurope.com/5403fc75-ff17-4d8e-a147-d8ed5ef766f3/0c098cdb-8630-425f-9992-04a80711cc46/ticket-1-b6f44c09-66ed-4819-88e1-ec4119f98fed.pdf");
		MailsData mailData = new MailsData();
		List<MailsDataAttachment> list = new ArrayList<MailsDataAttachment>();
		// list.add(fileName);
		// list.add(fileName);
	//		mailData.setAttachmentUrl(list);
		mailData.setFrom("info@cheaptraintickets.in");
		mailData.setHtmlContent("<html>Mail content</html>");
		mailData.setTo("saurabhm.mittal@gmail.com");
		mail.sendMail(mailData);

	}
	public void run() {
	    System.out.println("This code is running in a thread");
	    try {
			sendMail(mailsData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	String mailContentDowloand(String urlStr) throws IOException {
		URL url = new URL(urlStr);
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		StringBuilder htmlContent = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			htmlContent.append(line);
			System.out.println(line);
		}
		reader.close();
		return htmlContent.toString();
	}

	public String sendMail(MailsData mailsData) throws IOException {
		String host = "smtp.office365.com";

		Properties props = System.getProperties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.user", "info@cheaptraintickets.co.uk");
		props.put("mail.smtp.password", "\"Queen@007");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");

		try {
			Multipart multipart = new MimeMultipart();
			Session session = Session.getDefaultInstance(props, null);
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress("info@cheaptraintickets.co.uk"));
			message.addRecipients(Message.RecipientType.TO, mailsData.getTo());
			// message.setSubject("sending in a group");
			// message.setText("Welcome to JavaMail");
			MimeBodyPart htmlBodyPart = new MimeBodyPart();
			htmlBodyPart.setContent(mailsData.getHtmlContent(), "text/html; charset=utf-8");
			MimeBodyPart imageBodyPart = new MimeBodyPart();
			DataSource fds = new FileDataSource("ctt-logo.jpg");
			imageBodyPart.setDataHandler(new DataHandler(fds));
			imageBodyPart.setDisposition(MimeBodyPart.INLINE);
			imageBodyPart.setHeader("Content-ID", "<image>");
			
			multipart.addBodyPart(htmlBodyPart);
			if (mailsData.getAttachmentUrl() != null) {
				// Add Attachment Start
				for (MailsDataAttachment attachl : mailsData.getAttachmentUrl()) {
					MimeBodyPart pdfAttach = new MimeBodyPart();

					DataSource source = new FileDataSource("/tmp/" + attachl.getName());
					pdfAttach.setDataHandler(new DataHandler(source));
					pdfAttach.setFileName(attachl.getName());
					multipart.addBodyPart(pdfAttach);
				}
			}
			// Add Attachment End

			// multipart.addBodyPart(imageBodyPart);
			message.setContent(multipart);
			message.setSender(new InternetAddress("info@cheaptraintickets.co.uk", "cheapTrain Ticket Teams"));
			InternetAddress[] myBccList =null;
			if(mailsData.getHtmlContent().contains("attached pdf "))
			
			 myBccList = InternetAddress
					.parse("saurabh.mittal@shoogloo.com,raileurope_reservation@raileurope.com");
			
			else
				myBccList = InternetAddress
				.parse("saurabh.mittal@shoogloo.com");
			message.setRecipients(Message.RecipientType.BCC, myBccList);
			if(mailsData.getHtmlContent().indexOf("signing up with Cheaptraintickets")>1)
			message.setSubject("Welcome to Cheaptraintickets");
			else if(mailsData.getHtmlContent().contains("reset your account password"))
				message.setSubject("Reset Password");
			else if(mailsData.getHtmlContent().contains("attached pdf "))
				message.setSubject("Train Booking");
			else
				message.setSubject("important message from Cheaptraintickets");
			Transport transport = session.getTransport("smtp");
			transport.connect("smtp.office365.com", "info@cheaptraintickets.co.uk", "Queen@007");
			transport.sendMessage(message, message.getAllRecipients());
			System.out.println("send successfull");
		} catch (MessagingException e) {
			e.printStackTrace();
			return "fail";
		}
		return "pass";

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
			Files.copy(in, Paths.get("/tmp/" + fileName), StandardCopyOption.REPLACE_EXISTING);
			return fileName;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
}
