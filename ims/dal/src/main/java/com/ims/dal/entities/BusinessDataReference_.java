package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BusinessDataReference.class)
public abstract class BusinessDataReference_ {

	public static volatile SingularAttribute<BusinessDataReference, Long> id;
	public static volatile SingularAttribute<BusinessDataReference, Long> createdBy;
	public static volatile SingularAttribute<BusinessDataReference, String> status;
	public static volatile SingularAttribute<BusinessDataReference, String> name;
	public static volatile SingularAttribute<BusinessDataReference, Long> lastUpdatedBy;
	public static volatile SingularAttribute<BusinessDataReference, Date> lastUpdatedDate;
	public static volatile SetAttribute<BusinessDataReference, BusinessData> businessDatas;
	public static volatile SingularAttribute<BusinessDataReference, Date> createdDate;

}

