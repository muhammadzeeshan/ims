package com.ims.webapp.controller;



import java.util.Collection;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ims.dal.vo.Role;
import com.ims.restclient.RestClient;
import com.ims.restclient.Exception.RestClientException;
import com.ims.restclient.constants.RestServices;
import com.ims.utility.GsonUtility;

@Controller(value="/roles")
public class RoleManagementController {


	private Role role;
	private String roleId;
	private Collection<Role> roles;
	
	@Autowired
	private ApplicationContext context;

	
	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	@RequestMapping(value="/roles",method=RequestMethod.GET)
	public String displayRoles() {
		/*try {
			RestClient client = new RestClient(RestServices.ROLE_GETALL);
			client.executeRequest();
			
			String body = new String(client.getResponseWrapper().getBody().toByteArray());
			Collection<Role> roles = GsonUtility.getObjectFromJson(body, Collection.class);
			
			
		} catch (RestClientException e) {
			e.printStackTrace();
		}*/
		
		
		System.out.println("****************** DISPLAY ROLES ********************");
		return "index";
	}

	public String saveRole()throws RestClientException {
		try {
			String  json = GsonUtility.getJsonFromObject(this.getRole());
			RestClient client = new RestClient(RestServices.ROLE_SAVE,json,null);
			client.executeRequest();
			
		} catch (RestClientException e) {
			e.printStackTrace();
			throw e;
		}
		
		System.out.println("****************** SAVE ROLE ********************");
		return "displayRoles";
	}

	
	
	public String getRoleById()throws RestClientException {
		try {
			RestClient client = new RestClient(RestServices.ROLE_SAVE, roleId, null);
			client.executeRequest();
			Role role = GsonUtility.getObjectFromJson(new String(client.getResponseWrapper().getBody().toByteArray()),Role.class);
			this.setRole(role);
			
		} catch (RestClientException e) {
			e.printStackTrace();
			throw e;
		}
		
		System.out.println("****************** SAVE ROLE ********************");
		return "displayRoles";
	}




}
