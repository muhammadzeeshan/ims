package com.ims.security.service;


import org.springframework.stereotype.Service;

import com.ims.dal.entities.Role;
import com.ims.framework.AbstractService;
import com.ims.security.dal.RoleDAO;

@Service
public class RoleManagementService extends AbstractService<Role, RoleDAO<Role> > {


}
