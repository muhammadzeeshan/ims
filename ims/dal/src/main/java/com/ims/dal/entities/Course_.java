package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Course.class)
public abstract class Course_ {

	public static volatile SingularAttribute<Course, Long> id;
	public static volatile SetAttribute<Course, AcademicProgramCourse> academicProgramCourses;
	public static volatile SingularAttribute<Course, Long> createdBy;
	public static volatile SingularAttribute<Course, String> status;
	public static volatile SingularAttribute<Course, Long> lastUpdatedBy;
	public static volatile SingularAttribute<Course, Date> lastUpdatedDate;
	public static volatile SingularAttribute<Course, Date> createdDate;

}

