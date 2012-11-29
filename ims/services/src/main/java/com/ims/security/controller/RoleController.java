package com.ims.security.controller;

import java.util.Collection;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ims.dal.entities.Role;
import com.ims.security.service.RoleManagementService;
import com.ims.utility.GsonUtility;


@Controller
@RequestMapping("/security/role")
public class RoleController {
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private RoleManagementService roleService;
	
	
	@RequestMapping(value="/save", consumes="application/json", method=RequestMethod.POST )
	public void save(@RequestBody String body) {
		Role role = GsonUtility.getObjectFromJson(body, Role.class);
		roleService.persist(role);
	}
	

	@RequestMapping(value="/{roleId}", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody String getById(@RequestParam Long roleId) {

		roleService.getById(Role.class, roleId);
		return GsonUtility.getJsonFromObject(Role.class);
		
	}

	@RequestMapping(method=RequestMethod.GET, produces="application/json")
	public @ResponseBody String getAll() {
		
		Collection<Role> roles = roleService.getAll(Role.class);
		return GsonUtility.getJsonFromObject(roles);
	}

	
}
