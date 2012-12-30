package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InstituteBranch.class)
public abstract class InstituteBranch_ {

	public static volatile SingularAttribute<InstituteBranch, Long> id;
	public static volatile SingularAttribute<InstituteBranch, Institute> institute;
	public static volatile SingularAttribute<InstituteBranch, Long> createdBy;
	public static volatile SingularAttribute<InstituteBranch, String> status;
	public static volatile SingularAttribute<InstituteBranch, Long> lastUpdatedBy;
	public static volatile SetAttribute<InstituteBranch, InstituteBranchTenure> instituteBranchTenures;
	public static volatile SingularAttribute<InstituteBranch, Date> lastUpdatedDate;
	public static volatile SingularAttribute<InstituteBranch, Date> createdDate;
	public static volatile SetAttribute<InstituteBranch, InstituteBranchModule> instituteBranchModules;
	public static volatile SetAttribute<InstituteBranch, InstituteBranchAcademicProgram> instituteBranchAcademicPrograms;

}

