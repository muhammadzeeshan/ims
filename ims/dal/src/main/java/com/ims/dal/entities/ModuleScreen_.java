package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ModuleScreen.class)
public abstract class ModuleScreen_ {

	public static volatile SingularAttribute<ModuleScreen, Long> id;
	public static volatile SingularAttribute<ModuleScreen, Module> module;
	public static volatile SingularAttribute<ModuleScreen, Long> createdBy;
	public static volatile SingularAttribute<ModuleScreen, String> status;
	public static volatile SingularAttribute<ModuleScreen, Long> lastUpdatedBy;
	public static volatile SingularAttribute<ModuleScreen, Date> lastUpdatedDate;
	public static volatile SetAttribute<ModuleScreen, ModuleScreenElement> moduleScreenElements;
	public static volatile SingularAttribute<ModuleScreen, Date> createdDate;

}

