package com.DemoOrangeHRM.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonUtils {
public static List<Map<String, String>> deserializeJson() throws IOException {
	ObjectMapper mapper = new ObjectMapper();
	return mapper.readValue(
			new File(System.getProperty("user.dir")+
			"\\src\\test\\java\\com\\vf\\resources\\credential.json"),
			 new TypeReference<List<Map<String, String>>>() {});
	
}
}
