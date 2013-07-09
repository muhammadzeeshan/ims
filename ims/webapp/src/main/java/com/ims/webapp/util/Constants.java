package com.ims.webapp.util;

import java.io.IOException;
import java.util.Properties;

import com.ims.webapp.controller.AbstractController;

public enum Constants {

	PROP_DATATEMPLATE_PATH("datatemplates.path"),
	KEY_REQUEST_Attribute_TEMPLATEPATH("templatePath"),
	TEXT_INVALID_CONTROLLER("Controller must extend "+AbstractController.class);
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
