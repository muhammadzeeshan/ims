package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Transaction.class)
public abstract class Transaction_ {

	public static volatile SingularAttribute<Transaction, Long> id;
	public static volatile SingularAttribute<Transaction, Long> createdBy;
	public static volatile SingularAttribute<Transaction, String> status;
	public static volatile SingularAttribute<Transaction, Long> lastUpdatedBy;
	public static volatile SingularAttribute<Transaction, TransactionTypeDetail> transactionTypeDetail;
	public static volatile SingularAttribute<Transaction, Date> lastUpdatedDate;
	public static volatile SingularAttribute<Transaction, Collection> collection;
	public static volatile SingularAttribute<Transaction, Date> createdDate;

}

