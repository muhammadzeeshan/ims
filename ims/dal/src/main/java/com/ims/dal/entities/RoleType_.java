package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RoleType.class)
public abstract class RoleType_ {

	public static volatile SingularAttribute<RoleType, Long> id;
	public static volatile SingularAttribute<RoleType, Long> createdBy;
	public static volatile SingularAttribute<RoleType, String> status;
	public static volatile SetAttribute<RoleType, Role> roles;
	public static volatile SingularAttribute<RoleType, Long> lastUpdatedBy;
	public static volatile SingularAttribute<RoleType, Date> lastUpdatedDate;
	public static volatile SingularAttribute<RoleType, Date> createdDate;

}

