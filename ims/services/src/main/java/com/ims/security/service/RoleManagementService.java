package com.ims.security.service;


import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.ims.dal.entities.Role;
import com.ims.framework.AbstractService;
import com.ims.security.dal.RoleDAO;

@Service
@Configurable(autowire=Autowire.BY_TYPE)
public class RoleManagementService extends AbstractService<Role, RoleDAO<Role> > {

	protected RoleDAO<Role> daoObj;
	
}
