package com.ims.webapp.interceptors;

import com.ims.webapp.controller.AbstractController;
import com.ims.webapp.exception.InvalidControllerException;
import com.ims.webapp.util.Constants;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class ValidateControllerInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		if(invocation.getAction() instanceof AbstractController){
			return invocation.invoke();
		}
		throw new InvalidControllerException(Constants.TEXT_INVALID_CONTROLLER.getValue());
		
	}

}
