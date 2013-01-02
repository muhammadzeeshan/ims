package com.ims.restclient.constants;



import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

import com.ims.restclient.Exception.EmptyBodyException;
import com.ims.restclient.Exception.RestClientException;

public enum RestServices {

	ROLE_SAVE("/security/role/save", HttpPost.METHOD_NAME),ROLE_GETBYID("/security/role/{0}", HttpGet.METHOD_NAME),
	ROLE_GETALL("/security/role", HttpGet.METHOD_NAME);
	
	private String serviceURL;
	private String httpMethod;
	private boolean canHaveRequestBody;
	
	private RestServices(String url, String requestMethod) {
		this.httpMethod = requestMethod;
		this.serviceURL = url;
	}

	
	public boolean isCanHaveRequestBody() {
		return canHaveRequestBody;
	}


	private String getServiceURL(String... params) {
		
		StringBuilder builder = new StringBuilder(Configuration.SERVICES_SERVER_URL.getConfigurationFromProperties());
		builder.append(this.serviceURL);
		
		for(int i=0; i<params.length && params != null && params.length > 0; i++) {
			builder = builder.replace(0, builder.indexOf("{"+i+"}"), params[0]);	
		}
		
		return builder.toString();
		
	}

	private AbstractHttpEntity getStringEntity(String body){
		
			return new StringEntity(body,ContentType.APPLICATION_JSON);
	}
	
	public HttpRequestBase getRequestMethod(String body, String... params)throws RestClientException {
		
		HttpRequestBase method = null;
		
		switch(httpMethod) {
			case HttpGet.METHOD_NAME :
					HttpGet get = new HttpGet(this.getServiceURL(params));
					method = get;
				break;

			case HttpPut.METHOD_NAME :
					if(body == null)
						throw new EmptyBodyException(Constants.MSG_BODY_CANNOT_EMPTY.getValue());
					
					HttpPut put = new HttpPut(this.getServiceURL(params));
					put.setEntity(this.getStringEntity(body));
					method = put;
					canHaveRequestBody = true;
				break;

			case HttpPost.METHOD_NAME : 
					if(body == null)
						throw new EmptyBodyException(Constants.MSG_BODY_CANNOT_EMPTY.getValue());
	
					HttpPost post = new HttpPost(this.getServiceURL(params));
					post.setEntity(this.getStringEntity(body));
					method = post;
					canHaveRequestBody = true;
				break;

			case HttpDelete.METHOD_NAME :
					HttpDelete delete = new HttpDelete(this.getServiceURL(params));
					method = delete;
				break;
		}
		
		return method;
	}
	
	
}
