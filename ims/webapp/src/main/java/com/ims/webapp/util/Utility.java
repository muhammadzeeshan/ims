package com.ims.webapp.util;

import org.apache.struts2.ServletActionContext;

public class Utility {

	
	public static String getTemplatePath( String templateName) {
		
		StringBuilder builder = new StringBuilder(Constants.PROP_DATATEMPLATE_PATH.getConfigurationFromProperties());
		int startIndex = builder.indexOf("{0}");
		return builder.replace(startIndex , startIndex+3, getSelectedLayoutFromSession()).append(templateName).toString(); 
		
	} 

	
	public static String getSelectedLayoutFromSession(){
		//We can get http session and request object through this;
		//ServletActionContext.getRequest();
		
		return "desktop";
		
	}
}
