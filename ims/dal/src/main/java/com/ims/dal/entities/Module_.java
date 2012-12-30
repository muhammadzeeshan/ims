package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Module.class)
public abstract class Module_ {

	public static volatile SingularAttribute<Module, Long> id;
	public static volatile SingularAttribute<Module, Long> createdBy;
	public static volatile SingularAttribute<Module, String> status;
	public static volatile SingularAttribute<Module, Long> lastUpdatedBy;
	public static volatile SingularAttribute<Module, Date> lastUpdatedDate;
	public static volatile SetAttribute<Module, ModuleScreen> moduleScreens;
	public static volatile SingularAttribute<Module, Date> createdDate;
	public static volatile SetAttribute<Module, InstituteBranchModule> instituteBranchModules;

}

