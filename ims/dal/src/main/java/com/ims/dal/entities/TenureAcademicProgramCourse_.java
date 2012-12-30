package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TenureAcademicProgramCourse.class)
public abstract class TenureAcademicProgramCourse_ {

	public static volatile SingularAttribute<TenureAcademicProgramCourse, Long> id;
	public static volatile SingularAttribute<TenureAcademicProgramCourse, InstituteBranchTenure> instituteBranchTenure;
	public static volatile SingularAttribute<TenureAcademicProgramCourse, Long> createdBy;
	public static volatile SingularAttribute<TenureAcademicProgramCourse, String> status;
	public static volatile SingularAttribute<TenureAcademicProgramCourse, Long> lastUpdatedBy;
	public static volatile SingularAttribute<TenureAcademicProgramCourse, AcademicProgramCourse> academicProgramCourse;
	public static volatile SingularAttribute<TenureAcademicProgramCourse, Date> lastUpdatedDate;
	public static volatile SetAttribute<TenureAcademicProgramCourse, InstituteBranchUserAcademicProgram> instituteBranchUserAcademicPrograms;
	public static volatile SingularAttribute<TenureAcademicProgramCourse, Date> createdDate;

}

