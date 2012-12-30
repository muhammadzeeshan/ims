package com.ims.restclient;

import java.io.ByteArrayOutputStream;
import java.io.IOException;


import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestClientException;

import com.ims.restclient.Exception.RestClientExeption;
import com.ims.restclient.constants.RestServices;

public final class RestClient {

	private RestServices service;
	private String[] params;
	private String body;
	private HttpResponseWrapper responseWrapper;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public HttpResponseWrapper getResponseWrapper() {
		return responseWrapper;
	}

	public void setResponseWrapper(HttpResponseWrapper responseWrapper) {
		this.responseWrapper = responseWrapper;
	}

	public RestClient(RestServices restService, String... params) {
		this.service = restService;
		this.params = params;
	}

	public RestClient(RestServices restService, String body, String... params) {
		this.service = restService;
		this.params = params;
		this.body = body;
	}

	
	public void executeRequest() throws RestClientExeption {
		
		logger.info("Start : executeRequest()");
		
		logger.info("Instantiating HttpClient");
		HttpClient client = new DefaultHttpClient();
		
		try {
			
			HttpRequestBase method = this.service.getRequestMethod(this.body, this.params);
			
			logger.info("Executing request");
			HttpResponse response = client.execute(method);
			logger.info("Got Response");
			
			int statusCode = response.getStatusLine().getStatusCode();
			logger.info("Response Status Code : "+statusCode);
			
			if(statusCode == HttpStatus.SC_OK) {
				this.responseWrapper = new HttpResponseWrapper(statusCode,response.getStatusLine().getReasonPhrase());
				
				if(this.service.canHaveBody()) {
					logger.info("Response has body");
					ByteArrayOutputStream out = new ByteArrayOutputStream();
					
					logger.info("Processing body contents..");
					response.getEntity().writeTo(out);
					responseWrapper.setBody(out);
				}
				
			} else {
				logger.info("Response Not OK");
				throw new RestClientException("Response Code : "+statusCode +" \nMessage : "+response.getStatusLine().getReasonPhrase());
			}
			
		} catch (RestClientExeption e) {
			e.printStackTrace();
			logger.error("Exception : Class ="+e.getClass() +"\nMessage = "+e.getMessage());
			throw e;
			
		} catch (ClientProtocolException e) {
			e.printStackTrace();
			logger.error("Exception : Class ="+e.getClass() +"\nMessage = "+e.getMessage());
			throw new RestClientExeption(e.getMessage(),e);
			
		} catch (IOException e) {
			e.printStackTrace();
			logger.error("Exception : Class ="+e.getClass() +"\nMessage = "+e.getMessage());
			throw new RestClientExeption(e.getMessage(),e);
			
		} finally {
			logger.info("Closing HttpCLient connection");
			client.getConnectionManager().shutdown();
		}
		
		logger.info("End : executeRequest()");
	}


}
