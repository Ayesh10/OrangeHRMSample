package com.DemoOrangeHRM.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
public static String getPropertyData(String path, String key) 
		throws FileNotFoundException, IOException {
	String filepath = System.getProperty("user.dir")+path; 
	Properties property = new Properties();
	property.load(new FileInputStream(new File(filepath)));
	return property.getProperty(key);
}


}
