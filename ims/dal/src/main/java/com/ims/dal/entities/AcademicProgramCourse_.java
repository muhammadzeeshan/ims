package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AcademicProgramCourse.class)
public abstract class AcademicProgramCourse_ {

	public static volatile SingularAttribute<AcademicProgramCourse, Course> course;
	public static volatile SingularAttribute<AcademicProgramCourse, Long> id;
	public static volatile SetAttribute<AcademicProgramCourse, TenureAcademicProgramCourse> tenureAcademicProgramCourses;
	public static volatile SingularAttribute<AcademicProgramCourse, Long> createdBy;
	public static volatile SingularAttribute<AcademicProgramCourse, String> status;
	public static volatile SingularAttribute<AcademicProgramCourse, Long> lastUpdatedBy;
	public static volatile SingularAttribute<AcademicProgramCourse, Date> lastUpdatedDate;
	public static volatile SingularAttribute<AcademicProgramCourse, AcademicProgram> academicProgram;
	public static volatile SingularAttribute<AcademicProgramCourse, Date> createdDate;

}

