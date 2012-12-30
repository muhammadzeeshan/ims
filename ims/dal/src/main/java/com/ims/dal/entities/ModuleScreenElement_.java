package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ModuleScreenElement.class)
public abstract class ModuleScreenElement_ {

	public static volatile SingularAttribute<ModuleScreenElement, Long> id;
	public static volatile SingularAttribute<ModuleScreenElement, Long> createdBy;
	public static volatile SingularAttribute<ModuleScreenElement, String> status;
	public static volatile SingularAttribute<ModuleScreenElement, Long> lastUpdatedBy;
	public static volatile SingularAttribute<ModuleScreenElement, Date> lastUpdatedDate;
	public static volatile SingularAttribute<ModuleScreenElement, ModuleScreen> moduleScreen;
	public static volatile SetAttribute<ModuleScreenElement, UserRoleScreenElement> userRoleScreenElements;
	public static volatile SingularAttribute<ModuleScreenElement, Date> createdDate;
	public static volatile SingularAttribute<ModuleScreenElement, BusinessFields> businessFields;

}

