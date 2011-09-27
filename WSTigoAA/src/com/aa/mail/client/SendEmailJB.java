package com.aa.mail.client;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.jboss.logging.Logger;

public class SendEmailJB {
	
	//TODO ERRORE EN JBOSS
	
	public void sendMsg(String email, String subject, String body)
	throws MessagingException, NamingException {
		Properties props = new Properties();
		InitialContext ictx = new InitialContext(props);
		Session mailSession = (Session) ictx.lookup("java:/Mail");
//		Session mailSessoin = Session.getDefaultInstance(props);
		String username = (String) props.get("mail.smtps.user");
		String password = (String) props.get("mail.smtps.password");
		MimeMessage message = new MimeMessage(mailSession);
		message.setSubject(subject);
		message.setRecipients(javax.mail.Message.RecipientType.TO,
				javax.mail.internet.InternetAddress.parse(email, false));
		message.setText(body);
		message.saveChanges();

		Transport transport = mailSession.getTransport("smtps");
		try {
			transport.connect(username, password);
			transport.sendMessage(message, message.getAllRecipients());
			Logger.getLogger(this.getClass()).warn("Message sent");
		}
		finally {
			transport.close();
		}
	}
	
	
	
}
