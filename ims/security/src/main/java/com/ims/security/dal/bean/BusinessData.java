package com.ims.security.dal.bean;
// default package
// Generated Jul 21, 2012 4:09:02 PM by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * BusinessData generated by hbm2java
 */
@Entity
@Table(name = "Business_Data", catalog = "ims2")
public class BusinessData implements java.io.Serializable {

	private Integer id;
	private BusinessDataReference businessDataReference;
	private UserRoleScreenElement userRoleScreenElement;
	private String value;

	public BusinessData() {
	}

	public BusinessData(BusinessDataReference businessDataReference,
			UserRoleScreenElement userRoleScreenElement) {
		this.businessDataReference = businessDataReference;
		this.userRoleScreenElement = userRoleScreenElement;
	}

	public BusinessData(BusinessDataReference businessDataReference,
			UserRoleScreenElement userRoleScreenElement, String value) {
		this.businessDataReference = businessDataReference;
		this.userRoleScreenElement = userRoleScreenElement;
		this.value = value;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Business_Data_Reference_id", nullable = false)
	public BusinessDataReference getBusinessDataReference() {
		return this.businessDataReference;
	}

	public void setBusinessDataReference(
			BusinessDataReference businessDataReference) {
		this.businessDataReference = businessDataReference;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "User_Role_Screen_Element_id", nullable = false)
	public UserRoleScreenElement getUserRoleScreenElement() {
		return this.userRoleScreenElement;
	}

	public void setUserRoleScreenElement(
			UserRoleScreenElement userRoleScreenElement) {
		this.userRoleScreenElement = userRoleScreenElement;
	}

	@Column(name = "value")
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
