package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InstituteBranchTenure.class)
public abstract class InstituteBranchTenure_ {

	public static volatile SingularAttribute<InstituteBranchTenure, Long> id;
	public static volatile SetAttribute<InstituteBranchTenure, TenureAcademicProgramCourse> tenureAcademicProgramCourses;
	public static volatile SingularAttribute<InstituteBranchTenure, Long> createdBy;
	public static volatile SetAttribute<InstituteBranchTenure, InstituteBranchTenureUser> instituteBranchTenureUsers;
	public static volatile SingularAttribute<InstituteBranchTenure, String> status;
	public static volatile SingularAttribute<InstituteBranchTenure, Long> lastUpdatedBy;
	public static volatile SingularAttribute<InstituteBranchTenure, Tenure> tenure;
	public static volatile SingularAttribute<InstituteBranchTenure, Date> lastUpdatedDate;
	public static volatile SingularAttribute<InstituteBranchTenure, Date> createdDate;
	public static volatile SingularAttribute<InstituteBranchTenure, InstituteBranch> instituteBranch;

}

