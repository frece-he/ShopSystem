package web.frece.shop.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import net.sf.json.JSONObject;

public class Converter {
	@SuppressWarnings("unchecked")
	public static Map<String, Object> jsonToMap(JSONObject json) {
		if(null == json || json.isEmpty() || json.isNullObject()) {
			return null;
		}
		Map<String, Object> resMap = new HashMap<String, Object>();
		Iterator<String> it = json.keys();
		while (it.hasNext()) {
			String key = String.valueOf(it.next());
			Object value = json.get(key);
			resMap.put(key, value);
		}
		return resMap;
	}
	
	
}
