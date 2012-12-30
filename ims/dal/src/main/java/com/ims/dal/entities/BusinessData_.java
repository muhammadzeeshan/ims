package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BusinessData.class)
public abstract class BusinessData_ {

	public static volatile SingularAttribute<BusinessData, Long> id;
	public static volatile SingularAttribute<BusinessData, BusinessDataReference> businessDataReference;
	public static volatile SingularAttribute<BusinessData, Long> createdBy;
	public static volatile SingularAttribute<BusinessData, String> status;
	public static volatile SingularAttribute<BusinessData, Long> lastUpdatedBy;
	public static volatile SingularAttribute<BusinessData, UserRoleScreenElement> userRoleScreenElement;
	public static volatile SingularAttribute<BusinessData, String> value;
	public static volatile SingularAttribute<BusinessData, Date> lastUpdatedDate;
	public static volatile SingularAttribute<BusinessData, Date> createdDate;

}

