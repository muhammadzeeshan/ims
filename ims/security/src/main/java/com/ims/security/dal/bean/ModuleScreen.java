package com.ims.security.dal.bean;
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ModuleScreen generated by hbm2java
 */
@Entity
@Table(name = "Module_Screen", catalog = "ims2")
public class ModuleScreen implements java.io.Serializable {

	private Integer id;
	private Module module;
	private Set moduleScreenElements = new HashSet(0);

	public ModuleScreen() {
	}

	public ModuleScreen(Module module) {
		this.module = module;
	}

	public ModuleScreen(Module module, Set moduleScreenElements) {
		this.module = module;
		this.moduleScreenElements = moduleScreenElements;
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
	@JoinColumn(name = "Module_id", nullable = false)
	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "moduleScreen")
	public Set getModuleScreenElements() {
		return this.moduleScreenElements;
	}

	public void setModuleScreenElements(Set moduleScreenElements) {
		this.moduleScreenElements = moduleScreenElements;
	}

}
