package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Permission.class)
public abstract class Permission_ {

	public static volatile SingularAttribute<Permission, Long> id;
	public static volatile SingularAttribute<Permission, Long> createdBy;
	public static volatile SingularAttribute<Permission, String> status;
	public static volatile SingularAttribute<Permission, Long> lastUpdatedBy;
	public static volatile SingularAttribute<Permission, Date> lastUpdatedDate;
	public static volatile SetAttribute<Permission, UserRoleScreenElement> userRoleScreenElements;
	public static volatile SingularAttribute<Permission, Date> createdDate;

}

