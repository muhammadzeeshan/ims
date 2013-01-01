package com.ims.webapp.controller;



import java.util.Collection;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.ims.dal.vo.Role;
import com.ims.restclient.RestClient;
import com.ims.restclient.Exception.RestClientExeption;
import com.ims.restclient.constants.RestServices;
import com.ims.utility.GsonUtility;
import com.ims.webapp.integration.struts2.ServletObjects;


@Namespace(value="/")
@ResultPath(value="/")
@Results({
	@Result(name="displayRoles", location="dialogLayout", type="tiles")
})
public class RoleManagementController {


	private Role role;
	private String roleId;
	private Collection<Role> roles;

	
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

	@Action(value="getRoles")
	public String displayRoles() {
/*		try {
			RestClient client = new RestClient(RestServices.ROLE_GETALL);
			client.executeRequest();
			String body = new String(client.getResponseWrapper().getBody().toByteArray());
			Collection<Role> roles = new GsonUtility().getObjectFromJson(body, Collection.class);
			this.setRoles(roles);
			
		} catch (RestClientExeption e) {
			e.printStackTrace();
		}
*/		
		
		System.out.println("****************** DISPLAY ROLES ********************");
		return "displayRoles";
	}

	@Action(value="saveRole")
	public String saveRole()throws RestClientExeption {
		try {
			String  json = GsonUtility.getJsonFromObject(this.getRole());
			RestClient client = new RestClient(RestServices.ROLE_SAVE,json,null);
			client.executeRequest();
			
		} catch (RestClientExeption e) {
			e.printStackTrace();
			throw e;
		}
		
		System.out.println("****************** SAVE ROLE ********************");
		return "displayRoles";
	}

	
	
	@Action(value="getRoleById")
	public String getRoleById()throws RestClientExeption {
		try {
			RestClient client = new RestClient(RestServices.ROLE_SAVE, roleId, null);
			client.executeRequest();
			Role role = GsonUtility.getObjectFromJson(new String(client.getResponseWrapper().getBody().toByteArray()),Role.class);
			this.setRole(role);
			
		} catch (RestClientExeption e) {
			e.printStackTrace();
			throw e;
		}
		
		System.out.println("****************** SAVE ROLE ********************");
		return "displayRoles";
	}
	
}
