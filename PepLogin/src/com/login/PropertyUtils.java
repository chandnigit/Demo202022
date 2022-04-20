package com.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class PropertyUtils {

	private static Map<String, String> dataProperties=null;
	
	private PropertyUtils() {}
	
	public static void readDataFile() {
		if(dataProperties==null)
		{
			readFile();
		}
		
	}
	public static String getDataProperty(String key)
	{
		if(dataProperties==null) {
			System.out.println("ERROR:: Propert file is not loaded in memory");
		}
		if(dataProperties.containsKey(key)) {
			return dataProperties.get(key);
		}
		System.out.println("ERROR::Could not able to find the element ["+key+"] in data file");
		return null;
	}
	
	private static void readFile() {
		
		Properties p=new Properties();
		try {
			File file=new File("./src/com/login/data.properties");
			if(!file.exists()) {
				throw new FileNotFoundException("Could not find data.properties");
			}
			p.load(new FileInputStream(file));
			dataProperties=new HashMap<String, String>();
			Iterator<Entry<Object, Object>> elements=p.entrySet().iterator();
			while(elements.hasNext()) {
				Entry<Object, Object> element=elements.next();
				dataProperties.put((String)element.getKey(),(String) element.getValue());
			}
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
