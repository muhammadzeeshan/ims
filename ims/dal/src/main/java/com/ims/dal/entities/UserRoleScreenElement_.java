package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserRoleScreenElement.class)
public abstract class UserRoleScreenElement_ {

	public static volatile SingularAttribute<UserRoleScreenElement, Long> id;
	public static volatile SingularAttribute<UserRoleScreenElement, Long> createdBy;
	public static volatile SingularAttribute<UserRoleScreenElement, String> status;
	public static volatile SingularAttribute<UserRoleScreenElement, Long> lastUpdatedBy;
	public static volatile SingularAttribute<UserRoleScreenElement, Rule> rule;
	public static volatile SetAttribute<UserRoleScreenElement, UserProfile> userProfiles;
	public static volatile SingularAttribute<UserRoleScreenElement, Date> lastUpdatedDate;
	public static volatile SingularAttribute<UserRoleScreenElement, ModuleScreenElement> moduleScreenElement;
	public static volatile SingularAttribute<UserRoleScreenElement, Permission> permission;
	public static volatile SetAttribute<UserRoleScreenElement, BusinessData> businessDatas;
	public static volatile SingularAttribute<UserRoleScreenElement, Date> createdDate;
	public static volatile SingularAttribute<UserRoleScreenElement, UserRoleInstituteBranchModule> userRoleInstituteBranchModule;

}

