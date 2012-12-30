package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Institute.class)
public abstract class Institute_ {

	public static volatile SingularAttribute<Institute, Long> id;
	public static volatile SingularAttribute<Institute, Long> createdBy;
	public static volatile SingularAttribute<Institute, String> status;
	public static volatile SingularAttribute<Institute, Long> lastUpdatedBy;
	public static volatile SetAttribute<Institute, InstituteBranch> instituteBranchs;
	public static volatile SingularAttribute<Institute, Date> lastUpdatedDate;
	public static volatile SingularAttribute<Institute, Date> createdDate;

}

