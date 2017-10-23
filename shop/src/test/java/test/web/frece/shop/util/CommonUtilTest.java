package test.web.frece.shop.util;

import static org.junit.Assert.*;

import org.junit.Test;

import web.frece.shop.util.CommonUtil;

public class CommonUtilTest {

	@Test
	public void testGetCurrentTime() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCurrentDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetProperty() {
		try {
			String userName = CommonUtil.getProperty("email.properties", "emailAccount");
			String password = CommonUtil.getProperty("email.properties", "emailAccPass");
			
			System.out.println(userName);
			System.out.println(password);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Test
	public void testGetPropertyAsList() {
		fail("Not yet implemented");
	}

}
