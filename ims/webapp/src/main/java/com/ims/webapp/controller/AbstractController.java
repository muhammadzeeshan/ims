package com.ims.webapp.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.jboss.logging.Logger;

import com.ims.webapp.util.Constants;
import com.ims.webapp.util.Utility;

public abstract class AbstractController implements ServletRequestAware, ServletResponseAware, ParameterAware {

	private Logger logger = Logger.getLogger(AbstractController.class);
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	private Map<String, String[]> parameters;
	
	@Override
	public void setServletRequest(HttpServletRequest req) {
		this.request = req;
	}
	
	@Override
	public void setServletResponse(HttpServletResponse resp) {

		this.response = resp;
	}
	
	@Override
	public void setParameters(Map<String, String[]> params) {
		this.parameters = params;
	}
	
	protected HttpServletRequest getRequest() {
		return request;
	}

	protected HttpServletResponse getResponse() {
		return response;
	}

	protected Map<String, String[]> getParameters() {
		return parameters;
	}

	protected void setTemplatePathRequestAttribute(String templatePath) {
		String path = Utility.getTemplatePath(templatePath);
		logger.info(" TemplatePath : "+path);
		getRequest().setAttribute(Constants.KEY_REQUEST_Attribute_TEMPLATEPATH.getValue(), path);
	}
}
