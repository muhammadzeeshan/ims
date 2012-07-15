package com.ims.collection.dal.bean;
// default package
// Generated Jul 15, 2012 5:12:06 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * CollectionReference generated by hbm2java
 */
public class CollectionReference implements java.io.Serializable {

	private Integer id;
	private Set collectionSetupDatas = new HashSet(0);

	public CollectionReference() {
	}

	public CollectionReference(Set collectionSetupDatas) {
		this.collectionSetupDatas = collectionSetupDatas;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set getCollectionSetupDatas() {
		return this.collectionSetupDatas;
	}

	public void setCollectionSetupDatas(Set collectionSetupDatas) {
		this.collectionSetupDatas = collectionSetupDatas;
	}

}
