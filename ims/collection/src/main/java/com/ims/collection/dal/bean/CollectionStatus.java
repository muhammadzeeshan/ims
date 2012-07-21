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
 * CollectionStatus generated by hbm2java
 */
@Entity
@Table(name = "Collection_Status", catalog = "ims2")
public class CollectionStatus implements java.io.Serializable {

	private Integer id;
	private Set collections = new HashSet(0);

	public CollectionStatus() {
	}

	public CollectionStatus(Set collections) {
		this.collections = collections;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "collectionStatus")
	public Set getCollections() {
		return this.collections;
	}

	public void setCollections(Set collections) {
		this.collections = collections;
	}

}
