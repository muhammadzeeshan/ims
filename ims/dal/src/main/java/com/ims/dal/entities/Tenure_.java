package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tenure.class)
public abstract class Tenure_ {

	public static volatile SingularAttribute<Tenure, Long> id;
	public static volatile SingularAttribute<Tenure, Long> createdBy;
	public static volatile SingularAttribute<Tenure, String> status;
	public static volatile SingularAttribute<Tenure, Long> lastUpdatedBy;
	public static volatile SetAttribute<Tenure, InstituteBranchTenure> instituteBranchTenures;
	public static volatile SingularAttribute<Tenure, Date> lastUpdatedDate;
	public static volatile SingularAttribute<Tenure, Date> createdDate;

}

