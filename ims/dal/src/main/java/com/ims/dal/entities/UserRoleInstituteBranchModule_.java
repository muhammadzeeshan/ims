package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserRoleInstituteBranchModule.class)
public abstract class UserRoleInstituteBranchModule_ {

	public static volatile SingularAttribute<UserRoleInstituteBranchModule, Long> id;
	public static volatile SingularAttribute<UserRoleInstituteBranchModule, Long> createdBy;
	public static volatile SingularAttribute<UserRoleInstituteBranchModule, RoleInstituteBranchModule> roleInstituteBranchModule;
	public static volatile SingularAttribute<UserRoleInstituteBranchModule, String> status;
	public static volatile SingularAttribute<UserRoleInstituteBranchModule, Long> lastUpdatedBy;
	public static volatile SingularAttribute<UserRoleInstituteBranchModule, InstituteBranchTenureUser> instituteBranchTenureUser;
	public static volatile SingularAttribute<UserRoleInstituteBranchModule, Date> lastUpdatedDate;
	public static volatile SetAttribute<UserRoleInstituteBranchModule, UserRoleScreenElement> userRoleScreenElements;
	public static volatile SingularAttribute<UserRoleInstituteBranchModule, Date> createdDate;

}

