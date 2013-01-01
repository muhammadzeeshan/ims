package com.ims.webapp.util;

import java.io.IOException;
import java.util.Properties;

public enum Constants {

	DATATEMPLATE_PATH("datatemplates.path");
	private String value;
	
	private Constants(String val) {
		this.value = val;
	}

	public String getValue() {
		return this.value;
	}
	
	public String getConfigurationFromProperties() {
		return configProperties.getProperty(this.value);
	}
	
	private static Properties configProperties;
	
	static {
		
		try {
			configProperties = new Properties();
			configProperties.load(Constants.class.getResourceAsStream("/config.properties"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
