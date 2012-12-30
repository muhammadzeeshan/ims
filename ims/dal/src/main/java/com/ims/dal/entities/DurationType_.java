package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DurationType.class)
public abstract class DurationType_ {

	public static volatile SingularAttribute<DurationType, Long> id;
	public static volatile SetAttribute<DurationType, CollectionSetupData> collectionSetupDatas;
	public static volatile SingularAttribute<DurationType, Long> createdBy;
	public static volatile SingularAttribute<DurationType, String> status;
	public static volatile SingularAttribute<DurationType, Long> lastUpdatedBy;
	public static volatile SingularAttribute<DurationType, Date> lastUpdatedDate;
	public static volatile SingularAttribute<DurationType, Date> createdDate;
	public static volatile SetAttribute<DurationType, Collection> collections;

}

