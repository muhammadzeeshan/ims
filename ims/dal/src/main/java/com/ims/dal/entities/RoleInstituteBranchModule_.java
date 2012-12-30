package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RoleInstituteBranchModule.class)
public abstract class RoleInstituteBranchModule_ {

	public static volatile SingularAttribute<RoleInstituteBranchModule, Long> id;
	public static volatile SingularAttribute<RoleInstituteBranchModule, Long> createdBy;
	public static volatile SingularAttribute<RoleInstituteBranchModule, String> status;
	public static volatile SetAttribute<RoleInstituteBranchModule, UserRoleInstituteBranchModule> userRoleInstituteBranchModules;
	public static volatile SingularAttribute<RoleInstituteBranchModule, Long> lastUpdatedBy;
	public static volatile SingularAttribute<RoleInstituteBranchModule, Role> role;
	public static volatile SingularAttribute<RoleInstituteBranchModule, Date> lastUpdatedDate;
	public static volatile SingularAttribute<RoleInstituteBranchModule, InstituteBranchModule> instituteBranchModule;
	public static volatile SingularAttribute<RoleInstituteBranchModule, Date> createdDate;

}

