package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserProfile.class)
public abstract class UserProfile_ {

	public static volatile SingularAttribute<UserProfile, Long> id;
	public static volatile SingularAttribute<UserProfile, Long> createdBy;
	public static volatile SingularAttribute<UserProfile, String> status;
	public static volatile SingularAttribute<UserProfile, Long> lastUpdatedBy;
	public static volatile SingularAttribute<UserProfile, UserRoleScreenElement> userRoleScreenElement;
	public static volatile SingularAttribute<UserProfile, Date> lastUpdatedDate;
	public static volatile SingularAttribute<UserProfile, Date> createdDate;

}

