package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TransactionType.class)
public abstract class TransactionType_ {

	public static volatile SingularAttribute<TransactionType, Long> id;
	public static volatile SetAttribute<TransactionType, TransactionTypeDetail> transactionTypeDetails;
	public static volatile SingularAttribute<TransactionType, Long> createdBy;
	public static volatile SingularAttribute<TransactionType, String> status;
	public static volatile SingularAttribute<TransactionType, Long> lastUpdatedBy;
	public static volatile SingularAttribute<TransactionType, Date> lastUpdatedDate;
	public static volatile SingularAttribute<TransactionType, Date> createdDate;

}

