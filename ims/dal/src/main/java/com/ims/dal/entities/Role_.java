package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Role.class)
public abstract class Role_ {

	public static volatile SingularAttribute<Role, Long> id;
	public static volatile SingularAttribute<Role, Long> createdBy;
	public static volatile SingularAttribute<Role, String> status;
	public static volatile SingularAttribute<Role, Long> lastUpdatedBy;
	public static volatile SetAttribute<Role, RoleInstituteBranchModule> roleInstituteBranchModules;
	public static volatile SingularAttribute<Role, RoleType> roleType;
	public static volatile SingularAttribute<Role, Date> lastUpdatedDate;
	public static volatile SingularAttribute<Role, Date> createdDate;

}

