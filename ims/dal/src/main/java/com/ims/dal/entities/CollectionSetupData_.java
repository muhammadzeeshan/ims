package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CollectionSetupData.class)
public abstract class CollectionSetupData_ {

	public static volatile SingularAttribute<CollectionSetupData, CollectionType> collectionType;
	public static volatile SingularAttribute<CollectionSetupData, Date> startDate;
	public static volatile SingularAttribute<CollectionSetupData, String> status;
	public static volatile SingularAttribute<CollectionSetupData, Date> lastDate;
	public static volatile SingularAttribute<CollectionSetupData, CollectionReference> collectionReference;
	public static volatile SingularAttribute<CollectionSetupData, Long> id;
	public static volatile SingularAttribute<CollectionSetupData, Long> amount;
	public static volatile SingularAttribute<CollectionSetupData, Long> createdBy;
	public static volatile SingularAttribute<CollectionSetupData, Long> collectionReferenceFieldId;
	public static volatile SingularAttribute<CollectionSetupData, Long> lastUpdatedBy;
	public static volatile SingularAttribute<CollectionSetupData, Date> lastUpdatedDate;
	public static volatile SingularAttribute<CollectionSetupData, DurationType> durationType;
	public static volatile SingularAttribute<CollectionSetupData, Date> createdDate;
	public static volatile SetAttribute<CollectionSetupData, Collection> collections;

}

