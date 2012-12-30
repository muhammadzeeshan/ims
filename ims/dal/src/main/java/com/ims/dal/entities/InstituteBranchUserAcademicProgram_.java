package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InstituteBranchUserAcademicProgram.class)
public abstract class InstituteBranchUserAcademicProgram_ {

	public static volatile SingularAttribute<InstituteBranchUserAcademicProgram, Long> id;
	public static volatile SingularAttribute<InstituteBranchUserAcademicProgram, Long> createdBy;
	public static volatile SingularAttribute<InstituteBranchUserAcademicProgram, String> status;
	public static volatile SingularAttribute<InstituteBranchUserAcademicProgram, Long> lastUpdatedBy;
	public static volatile SingularAttribute<InstituteBranchUserAcademicProgram, TenureAcademicProgramCourse> tenureAcademicProgramCourse;
	public static volatile SingularAttribute<InstituteBranchUserAcademicProgram, InstituteBranchTenureUser> instituteBranchTenureUser;
	public static volatile SingularAttribute<InstituteBranchUserAcademicProgram, Date> lastUpdatedDate;
	public static volatile SingularAttribute<InstituteBranchUserAcademicProgram, Date> createdDate;

}

