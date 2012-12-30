package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CollectionReference.class)
public abstract class CollectionReference_ {

	public static volatile SingularAttribute<CollectionReference, Long> id;
	public static volatile SetAttribute<CollectionReference, CollectionSetupData> collectionSetupDatas;
	public static volatile SingularAttribute<CollectionReference, Long> createdBy;
	public static volatile SingularAttribute<CollectionReference, String> status;
	public static volatile SingularAttribute<CollectionReference, Long> lastUpdatedBy;
	public static volatile SingularAttribute<CollectionReference, Date> lastUpdatedDate;
	public static volatile SingularAttribute<CollectionReference, Date> createdDate;

}

