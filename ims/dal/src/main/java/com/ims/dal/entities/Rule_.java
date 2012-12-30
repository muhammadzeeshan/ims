package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Rule.class)
public abstract class Rule_ {

	public static volatile SingularAttribute<Rule, Long> id;
	public static volatile SingularAttribute<Rule, Long> createdBy;
	public static volatile SingularAttribute<Rule, String> status;
	public static volatile SingularAttribute<Rule, Long> lastUpdatedBy;
	public static volatile SingularAttribute<Rule, Date> lastUpdatedDate;
	public static volatile SetAttribute<Rule, UserRoleScreenElement> userRoleScreenElements;
	public static volatile SingularAttribute<Rule, Date> createdDate;

}

