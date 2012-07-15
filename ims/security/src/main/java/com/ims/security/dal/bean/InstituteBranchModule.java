package com.ims.security.dal.bean;
// default package
// Generated Jul 15, 2012 5:12:06 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import com.ims.core.dal.bean.InstituteBranch;

/**
 * InstituteBranchModule generated by hbm2java
 */
public class InstituteBranchModule implements java.io.Serializable {

	private Integer id;
	private Module module;
	private InstituteBranch instituteBranch;
	private Set roleInstituteBranchModules = new HashSet(0);

	public InstituteBranchModule() {
	}

	public InstituteBranchModule(Module module, InstituteBranch instituteBranch) {
		this.module = module;
		this.instituteBranch = instituteBranch;
	}

	public InstituteBranchModule(Module module,
			InstituteBranch instituteBranch, Set roleInstituteBranchModules) {
		this.module = module;
		this.instituteBranch = instituteBranch;
		this.roleInstituteBranchModules = roleInstituteBranchModules;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public InstituteBranch getInstituteBranch() {
		return this.instituteBranch;
	}

	public void setInstituteBranch(InstituteBranch instituteBranch) {
		this.instituteBranch = instituteBranch;
	}

	public Set getRoleInstituteBranchModules() {
		return this.roleInstituteBranchModules;
	}

	public void setRoleInstituteBranchModules(Set roleInstituteBranchModules) {
		this.roleInstituteBranchModules = roleInstituteBranchModules;
	}

}
