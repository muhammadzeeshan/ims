package com.ims.collection.dal.bean;
// default package
// Generated Jul 21, 2012 4:09:02 PM by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CollectionType generated by hbm2java
 */
@Entity
@Table(name = "Collection_Type", catalog = "ims2")
public class CollectionType implements java.io.Serializable {

	private Integer id;
	private Set collectionSetupDatas = new HashSet(0);

	public CollectionType() {
	}

	public CollectionType(Set collectionSetupDatas) {
		this.collectionSetupDatas = collectionSetupDatas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "collectionType")
	public Set getCollectionSetupDatas() {
		return this.collectionSetupDatas;
	}

	public void setCollectionSetupDatas(Set collectionSetupDatas) {
		this.collectionSetupDatas = collectionSetupDatas;
	}

}