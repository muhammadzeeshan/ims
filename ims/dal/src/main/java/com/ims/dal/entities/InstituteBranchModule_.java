package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InstituteBranchModule.class)
public abstract class InstituteBranchModule_ {

	public static volatile SingularAttribute<InstituteBranchModule, Long> id;
	public static volatile SingularAttribute<InstituteBranchModule, Module> module;
	public static volatile SingularAttribute<InstituteBranchModule, Long> createdBy;
	public static volatile SingularAttribute<InstituteBranchModule, String> status;
	public static volatile SingularAttribute<InstituteBranchModule, Long> lastUpdatedBy;
	public static volatile SetAttribute<InstituteBranchModule, RoleInstituteBranchModule> roleInstituteBranchModules;
	public static volatile SingularAttribute<InstituteBranchModule, Date> lastUpdatedDate;
	public static volatile SingularAttribute<InstituteBranchModule, Date> createdDate;
	public static volatile SingularAttribute<InstituteBranchModule, InstituteBranch> instituteBranch;

}

