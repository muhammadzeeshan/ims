package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CollectionMode.class)
public abstract class CollectionMode_ {

	public static volatile SingularAttribute<CollectionMode, Long> id;
	public static volatile SingularAttribute<CollectionMode, Long> createdBy;
	public static volatile SingularAttribute<CollectionMode, String> status;
	public static volatile SingularAttribute<CollectionMode, Long> lastUpdatedBy;
	public static volatile SingularAttribute<CollectionMode, Date> lastUpdatedDate;
	public static volatile SingularAttribute<CollectionMode, Date> createdDate;
	public static volatile SetAttribute<CollectionMode, Collection> collections;

}

