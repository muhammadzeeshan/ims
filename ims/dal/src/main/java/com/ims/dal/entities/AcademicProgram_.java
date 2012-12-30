package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AcademicProgram.class)
public abstract class AcademicProgram_ {

	public static volatile SingularAttribute<AcademicProgram, Long> id;
	public static volatile SetAttribute<AcademicProgram, AcademicProgramCourse> academicProgramCourses;
	public static volatile SingularAttribute<AcademicProgram, Long> createdBy;
	public static volatile SingularAttribute<AcademicProgram, String> status;
	public static volatile SingularAttribute<AcademicProgram, Long> lastUpdatedBy;
	public static volatile SingularAttribute<AcademicProgram, Date> lastUpdatedDate;
	public static volatile SingularAttribute<AcademicProgram, Date> createdDate;
	public static volatile SetAttribute<AcademicProgram, InstituteBranchAcademicProgram> instituteBranchAcademicPrograms;
	public static volatile SingularAttribute<AcademicProgram, Academic> academic;

}

