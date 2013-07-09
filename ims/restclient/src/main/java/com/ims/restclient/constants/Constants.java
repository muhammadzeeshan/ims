package com.ims.restclient.constants;

public enum Constants {
	

	MSG_BODY_CANNOT_EMPTY("Body cannot be empty");
	
	private String value;
	
	private Constants(String val){
		this.value = val;
	}

	public String getValue(){
		return this.value;
	}
	
		
}
