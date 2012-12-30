package com.ims.dal.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InstituteBranchAcademicProgram.class)
public abstract class InstituteBranchAcademicProgram_ {

	public static volatile SingularAttribute<InstituteBranchAcademicProgram, Long> id;
	public static volatile SingularAttribute<InstituteBranchAcademicProgram, Long> createdBy;
	public static volatile SingularAttribute<InstituteBranchAcademicProgram, String> status;
	public static volatile SingularAttribute<InstituteBranchAcademicProgram, Long> lastUpdatedBy;
	public static volatile SingularAttribute<InstituteBranchAcademicProgram, Date> lastUpdatedDate;
	public static volatile SingularAttribute<InstituteBranchAcademicProgram, AcademicProgram> academicProgram;
	public static volatile SingularAttribute<InstituteBranchAcademicProgram, Date> createdDate;
	public static volatile SingularAttribute<InstituteBranchAcademicProgram, InstituteBranch> instituteBranch;

}

