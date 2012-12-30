package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CollectionType.class)
public abstract class CollectionType_ {

	public static volatile SingularAttribute<CollectionType, Long> id;
	public static volatile SetAttribute<CollectionType, CollectionSetupData> collectionSetupDatas;
	public static volatile SingularAttribute<CollectionType, Long> createdBy;
	public static volatile SingularAttribute<CollectionType, String> status;
	public static volatile SingularAttribute<CollectionType, Long> lastUpdatedBy;
	public static volatile SingularAttribute<CollectionType, Date> lastUpdatedDate;
	public static volatile SingularAttribute<CollectionType, Date> createdDate;

}

