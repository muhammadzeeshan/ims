package com.ims;

public enum Constants {

	STATUS_ACTIVE("A");
	
	
	private Constants(String value){
		this.value = value;
	}
	
	private String value;
	
	public String getValue(){
		return this.value;
	}
	
}
