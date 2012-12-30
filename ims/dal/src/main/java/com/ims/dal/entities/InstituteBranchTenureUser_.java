package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InstituteBranchTenureUser.class)
public abstract class InstituteBranchTenureUser_ {

	public static volatile SingularAttribute<InstituteBranchTenureUser, Long> id;
	public static volatile SingularAttribute<InstituteBranchTenureUser, InstituteBranchTenure> instituteBranchTenure;
	public static volatile SingularAttribute<InstituteBranchTenureUser, Long> createdBy;
	public static volatile SingularAttribute<InstituteBranchTenureUser, String> status;
	public static volatile SetAttribute<InstituteBranchTenureUser, UserRoleInstituteBranchModule> userRoleInstituteBranchModules;
	public static volatile SingularAttribute<InstituteBranchTenureUser, Long> lastUpdatedBy;
	public static volatile SingularAttribute<InstituteBranchTenureUser, Date> lastUpdatedDate;
	public static volatile SetAttribute<InstituteBranchTenureUser, InstituteBranchUserAcademicProgram> instituteBranchUserAcademicPrograms;
	public static volatile SingularAttribute<InstituteBranchTenureUser, Date> createdDate;
	public static volatile SingularAttribute<InstituteBranchTenureUser, User> user;
	public static volatile SetAttribute<InstituteBranchTenureUser, Collection> collections;

}

