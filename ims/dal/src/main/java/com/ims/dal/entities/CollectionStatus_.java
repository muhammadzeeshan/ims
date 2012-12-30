package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CollectionStatus.class)
public abstract class CollectionStatus_ {

	public static volatile SingularAttribute<CollectionStatus, Long> id;
	public static volatile SingularAttribute<CollectionStatus, Long> createdBy;
	public static volatile SingularAttribute<CollectionStatus, String> status;
	public static volatile SingularAttribute<CollectionStatus, Long> lastUpdatedBy;
	public static volatile SingularAttribute<CollectionStatus, Date> lastUpdatedDate;
	public static volatile SingularAttribute<CollectionStatus, Date> createdDate;
	public static volatile SetAttribute<CollectionStatus, Collection> collections;

}

