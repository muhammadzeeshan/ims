package com.ims.restclient.constants;

import java.io.IOException;
import java.util.Properties;

public enum Configuration {

	SERVICES_SERVER_URL("services.server");
	
	private String value;
	
	private Configuration(String val){
		this.value = val;
	}

	public String getValue(){
		return this.value;
	}
	
	public String getConfigurationFromProperties() {
		return configProperties.getProperty(this.value);
	}
	
	private static Properties configProperties;
	
	static {
		
		try {
			configProperties = new Properties();
			configProperties.load(Configuration.class.getResourceAsStream("/config.properties"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
