package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BusinessFields.class)
public abstract class BusinessFields_ {

	public static volatile SingularAttribute<BusinessFields, Long> id;
	public static volatile SingularAttribute<BusinessFields, Long> createdBy;
	public static volatile SingularAttribute<BusinessFields, String> status;
	public static volatile SingularAttribute<BusinessFields, Long> lastUpdatedBy;
	public static volatile SingularAttribute<BusinessFields, Date> lastUpdatedDate;
	public static volatile SetAttribute<BusinessFields, ModuleScreenElement> moduleScreenElements;
	public static volatile SingularAttribute<BusinessFields, Date> createdDate;

}

