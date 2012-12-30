package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TransactionTypeDetail.class)
public abstract class TransactionTypeDetail_ {

	public static volatile SingularAttribute<TransactionTypeDetail, Long> id;
	public static volatile SetAttribute<TransactionTypeDetail, Transaction> transactions;
	public static volatile SingularAttribute<TransactionTypeDetail, TransactionType> transactionType;
	public static volatile SingularAttribute<TransactionTypeDetail, Long> createdBy;
	public static volatile SingularAttribute<TransactionTypeDetail, String> status;
	public static volatile SingularAttribute<TransactionTypeDetail, Long> lastUpdatedBy;
	public static volatile SingularAttribute<TransactionTypeDetail, Date> lastUpdatedDate;
	public static volatile SingularAttribute<TransactionTypeDetail, Date> createdDate;

}

