package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, Long> id;
	public static volatile SingularAttribute<User, Long> createdBy;
	public static volatile SetAttribute<User, InstituteBranchTenureUser> instituteBranchTenureUsers;
	public static volatile SingularAttribute<User, String> status;
	public static volatile SingularAttribute<User, Long> lastUpdatedBy;
	public static volatile SingularAttribute<User, Date> lastUpdatedDate;
	public static volatile SingularAttribute<User, Date> createdDate;

}

