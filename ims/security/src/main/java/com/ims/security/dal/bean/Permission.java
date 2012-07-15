package com.ims.security.dal.bean;
// default package
// Generated Jul 15, 2012 5:12:06 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Permission generated by hbm2java
 */
public class Permission implements java.io.Serializable {

	private Integer id;
	private Set userRoleScreenElements = new HashSet(0);

	public Permission() {
	}

	public Permission(Set userRoleScreenElements) {
		this.userRoleScreenElements = userRoleScreenElements;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set getUserRoleScreenElements() {
		return this.userRoleScreenElements;
	}

	public void setUserRoleScreenElements(Set userRoleScreenElements) {
		this.userRoleScreenElements = userRoleScreenElements;
	}

}
