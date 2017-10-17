package web.frece.shop.util;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailUtils {

	public static void sendEmail(String toEmailAcc, String content) throws Exception {
		// 1. 创建链接对象链接到邮箱服务器
		Properties props = new Properties();
		// 设置邮箱服务器
		props.setProperty("mail.smtp.host", "smtp.163.com");
		props.setProperty("mail.smtp.auth", "true");
		// 使用此邮箱和密码登陆到上述邮箱服务器发送信息
		String userName = "username123@163.com";
		String password = "password456";
		Authenticator authenticator = new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, password);
			}
		};
		Session mailSession = Session.getInstance(props, authenticator);

		// 2. 创建邮件对象
		Message mailMsg = new MimeMessage(mailSession);
		// 2.1 设置发件人
		mailMsg.setFrom(new InternetAddress(userName));
		// 2.2 设置收件人
		mailMsg.setRecipient(RecipientType.TO, new InternetAddress(toEmailAcc));
		/*
		 * //2.2.2 设置抄送人 mailMsg.setRecipient(RecipientType.CC, new
		 * InternetAddress("cc@myshop.com")); //2.2.3 设置暗送人
		 * mailMsg.setRecipient(RecipientType.BCC, new
		 * InternetAddress("bcc@myshop.com"));
		 */
		// 2.3设置邮件主题
		mailMsg.setSubject("test Subject from myshop.com");
		// 2.4 s设置邮件正文
		// mailMsg.setContent("<h1>html text</h1>", "text/html;charset=UTF-8");
		mailMsg.setContent(content, "text;charset=UTF-8");

		// 3.发送邮件
		Transport.send(mailMsg);
	}
}
