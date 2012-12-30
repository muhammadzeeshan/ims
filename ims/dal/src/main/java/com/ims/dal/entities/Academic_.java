package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Academic.class)
public abstract class Academic_ {

	public static volatile SingularAttribute<Academic, Long> id;
	public static volatile SetAttribute<Academic, AcademicProgram> academicPrograms;
	public static volatile SingularAttribute<Academic, Long> createdBy;
	public static volatile SingularAttribute<Academic, String> status;
	public static volatile SingularAttribute<Academic, Long> lastUpdatedBy;
	public static volatile SingularAttribute<Academic, Date> lastUpdatedDate;
	public static volatile SingularAttribute<Academic, Date> createdDate;

}

