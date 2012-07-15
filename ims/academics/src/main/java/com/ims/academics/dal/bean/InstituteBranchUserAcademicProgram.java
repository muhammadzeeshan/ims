package com.ims.academics.dal.bean;

import com.ims.security.dal.bean.InstituteBranchTenureUser;
// default package
// Generated Jul 15, 2012 5:12:06 PM by Hibernate Tools 3.4.0.CR1

/**
 * InstituteBranchUserAcademicProgram generated by hbm2java
 */
public class InstituteBranchUserAcademicProgram implements java.io.Serializable {

	private Integer id;
	private InstituteBranchTenureUser instituteBranchTenureUser;
	private TenureAcademicProgramCourse tenureAcademicProgramCourse;

	public InstituteBranchUserAcademicProgram() {
	}

	public InstituteBranchUserAcademicProgram(
			InstituteBranchTenureUser instituteBranchTenureUser,
			TenureAcademicProgramCourse tenureAcademicProgramCourse) {
		this.instituteBranchTenureUser = instituteBranchTenureUser;
		this.tenureAcademicProgramCourse = tenureAcademicProgramCourse;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public InstituteBranchTenureUser getInstituteBranchTenureUser() {
		return this.instituteBranchTenureUser;
	}

	public void setInstituteBranchTenureUser(
			InstituteBranchTenureUser instituteBranchTenureUser) {
		this.instituteBranchTenureUser = instituteBranchTenureUser;
	}

	public TenureAcademicProgramCourse getTenureAcademicProgramCourse() {
		return this.tenureAcademicProgramCourse;
	}

	public void setTenureAcademicProgramCourse(
			TenureAcademicProgramCourse tenureAcademicProgramCourse) {
		this.tenureAcademicProgramCourse = tenureAcademicProgramCourse;
	}

}
