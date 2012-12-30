package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Collection.class)
public abstract class Collection_ {

	public static volatile SingularAttribute<Collection, Long> id;
	public static volatile SetAttribute<Collection, Transaction> transactions;
	public static volatile SingularAttribute<Collection, CollectionSetupData> collectionSetupData;
	public static volatile SingularAttribute<Collection, Long> createdBy;
	public static volatile SingularAttribute<Collection, String> status;
	public static volatile SingularAttribute<Collection, Long> lastUpdatedBy;
	public static volatile SingularAttribute<Collection, InstituteBranchTenureUser> instituteBranchTenureUser;
	public static volatile SingularAttribute<Collection, Date> lastUpdatedDate;
	public static volatile SingularAttribute<Collection, CollectionStatus> collectionStatus;
	public static volatile SingularAttribute<Collection, DurationType> durationType;
	public static volatile SingularAttribute<Collection, Date> createdDate;
	public static volatile SingularAttribute<Collection, CollectionMode> collectionMode;

}

