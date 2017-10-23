package web.frece.shop.util;

import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CommonUtil {
	private static final Logger logger = LoggerFactory.getLogger(CommonUtil.class);
	
	
	public static String getCurrentTime() {

		return new java.sql.Timestamp(System.currentTimeMillis()).toString().substring(0, 19);
	}
	
	public static String getCurrentDate() {
		
		return new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date()).toString();
	}
	
	public static String getProperty(String resource, String property) {
		Configuration config = null;
		try {
			config = new PropertiesConfiguration("properties/" + resource);
		} catch (Exception e) {
			logger.error("getProperty:" + resource + " - " + property, e);
			throw new RuntimeException("get properties error");
		}
		return config.getString(property);	
	}
	
	public static  List<Object> getPropertyAsList(String resource, String property) {
		Configuration config = null;
		try {
			config = new PropertiesConfiguration("properties/" + resource);
		} catch (Exception e) {
			logger.error("getPropertyAsList:" + resource + " - " + property, e);
			throw new RuntimeException("get properties error");
		}
		return config.getList(property);	
	}
	
	
}
