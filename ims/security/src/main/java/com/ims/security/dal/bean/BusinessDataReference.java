package com.ims.security.dal.bean;
// default package
// Generated Jul 15, 2012 5:12:06 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * BusinessDataReference generated by hbm2java
 */
public class BusinessDataReference implements java.io.Serializable {

	private Integer id;
	private String name;
	private Set businessDatas = new HashSet(0);

	public BusinessDataReference() {
	}

	public BusinessDataReference(String name, Set businessDatas) {
		this.name = name;
		this.businessDatas = businessDatas;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getBusinessDatas() {
		return this.businessDatas;
	}

	public void setBusinessDatas(Set businessDatas) {
		this.businessDatas = businessDatas;
	}

}
