package com.aa.mail.ejb;



import java.security.Security;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

	private String SMTP_HOST_NAME;
	private String SMTP_PORT;
	private String debug;
	private String SSL_FACTORY;
	private String fallback;
	private String auth;

	private String useremail;
	private String pass;

	private String emailto;

	private String subject;
	private String messageL;


	public SendMail()
	{
		Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
		ResourceBundle rb = ResourceBundle.getBundle("com.aa.mail.ejb.conf");
		SMTP_HOST_NAME=rb.getString("SMTP_HOST_NAME");
		SMTP_PORT=rb.getString("SMTP_PORT");
		debug=rb.getString("debug_mail");
		SSL_FACTORY=rb.getString("SSL_FACTORY");
		fallback=rb.getString("fallback");
		auth= rb.getString("auth");
		useremail=rb.getString("emailFromAddress");
		pass=rb.getString("emailPassw");
		emailto=rb.getString("sendToProvider");
		subject=rb.getString("emailSubjectTxt");
		messageL=rb.getString("emailMsgTxt");
	}



	/**
	 * @param recipients
	 * @param subject
	 * @param message
	 * @param from
	 * @throws MessagingException
	 */
	public void sendSSLMessage(String codeError,String messageerror) throws MessagingException {

		Properties props = new Properties();
		props.put("mail.smtp.host", SMTP_HOST_NAME);
		props.put("mail.smtp.auth", auth);
		props.put("mail.debug", debug);
		props.put("mail.smtp.port", SMTP_PORT);
		props.put("mail.smtp.socketFactory.port", SMTP_PORT);
		props.put("mail.smtp.socketFactory.class", SSL_FACTORY);
		props.put("mail.smtp.socketFactory.fallback", fallback);

		Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(useremail,
						pass);
			}
		});

		session.setDebug(Boolean.parseBoolean(debug));

		Message msg = new MimeMessage(session);
		InternetAddress addressFrom = new InternetAddress(useremail);
		msg.setFrom(addressFrom);

		/*InternetAddress[] addressTo = new InternetAddress[recipients.length];
		for (int i = 0; i < recipients.length; i++) {
			addressTo[i] = new InternetAddress(recipients[i]);
		}
		msg.setRecipients(Message.RecipientType.TO, addressTo);*/
		msg.setRecipients(Message.RecipientType.TO,javax.mail.internet.InternetAddress.parse(emailto, false) );

		msg.setSubject(subject);

		StringBuffer messagesend=new StringBuffer(messageL);
		messagesend.append("<br/>" );
		messagesend.append(codeError );
		messagesend.append("<br/>" );
		messagesend.append(messageerror );


		msg.setContent(messagesend.toString(), "text/html");
		Transport.send(msg);
	}

	
	public void sendSSLMessage(String messageL) throws MessagingException {

		Properties props = new Properties();
		props.put("mail.smtp.host", SMTP_HOST_NAME);
		props.put("mail.smtp.auth", auth);
		props.put("mail.debug", debug);
		props.put("mail.smtp.port", SMTP_PORT);
		props.put("mail.smtp.socketFactory.port", SMTP_PORT);
		props.put("mail.smtp.socketFactory.class", SSL_FACTORY);
		props.put("mail.smtp.socketFactory.fallback", fallback);

		Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(useremail,
						pass);
			}
		});

		session.setDebug(Boolean.parseBoolean(debug));

		Message msg = new MimeMessage(session);
		InternetAddress addressFrom = new InternetAddress(useremail);
		msg.setFrom(addressFrom);

		/*InternetAddress[] addressTo = new InternetAddress[recipients.length];
		for (int i = 0; i < recipients.length; i++) {
			addressTo[i] = new InternetAddress(recipients[i]);
		}
		msg.setRecipients(Message.RecipientType.TO, addressTo);*/
		msg.setRecipients(Message.RecipientType.TO,javax.mail.internet.InternetAddress.parse(emailto, false) );

		msg.setSubject(subject);

		StringBuffer messagesend=new StringBuffer(messageL);


		msg.setContent(messagesend.toString(), "text/html");
		Transport.send(msg);
	}

	
	
}
