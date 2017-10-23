package test.web.frece.shop.util;

import static org.junit.Assert.*;

import org.junit.Test;

import web.frece.shop.util.MailUtil;

public class MailUtilTest {

	@Test
	public void testSendEmail() {
		try {
			MailUtil.sendEmail("toemail@qq.com", "test content");
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
