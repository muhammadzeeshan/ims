package com.ims.security.controller;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.ims.dal.entities.Role;


@Controller
@RequestMapping("/security/role")
public class RoleController {
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	@RequestMapping(value="/save", method=RequestMethod.GET)
	public void save(@RequestBody String body) {
		logger.info("******************       BISMILLAH         *********************");
	}
	
	
	
}
