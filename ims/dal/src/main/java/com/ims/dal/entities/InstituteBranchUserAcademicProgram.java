package com.ims.dal.entities;
// Generated Dec 30, 2012 4:18:24 PM by Hibernate Tools 3.4.0.CR1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * InstituteBranchUserAcademicProgram generated by hbm2java
 */
@Entity
@Table(name="institute_branch_user_academic_program"
    ,catalog="ims"
)
public class InstituteBranchUserAcademicProgram  implements java.io.Serializable {


     private Long id;
     private InstituteBranchTenureUser instituteBranchTenureUser;
     private TenureAcademicProgramCourse tenureAcademicProgramCourse;
     private Date createdDate;
     private Long createdBy;
     private Date lastUpdatedDate;
     private Long lastUpdatedBy;
     private String status;

    public InstituteBranchUserAcademicProgram() {
    }

	
    public InstituteBranchUserAcademicProgram(InstituteBranchTenureUser instituteBranchTenureUser, TenureAcademicProgramCourse tenureAcademicProgramCourse) {
        this.instituteBranchTenureUser = instituteBranchTenureUser;
        this.tenureAcademicProgramCourse = tenureAcademicProgramCourse;
    }
    public InstituteBranchUserAcademicProgram(InstituteBranchTenureUser instituteBranchTenureUser, TenureAcademicProgramCourse tenureAcademicProgramCourse, Date createdDate, Long createdBy, Date lastUpdatedDate, Long lastUpdatedBy, String status) {
       this.instituteBranchTenureUser = instituteBranchTenureUser;
       this.tenureAcademicProgramCourse = tenureAcademicProgramCourse;
       this.createdDate = createdDate;
       this.createdBy = createdBy;
       this.lastUpdatedDate = lastUpdatedDate;
       this.lastUpdatedBy = lastUpdatedBy;
       this.status = status;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="institute_branch_tenure_user_id", nullable=false)
    public InstituteBranchTenureUser getInstituteBranchTenureUser() {
        return this.instituteBranchTenureUser;
    }
    
    public void setInstituteBranchTenureUser(InstituteBranchTenureUser instituteBranchTenureUser) {
        this.instituteBranchTenureUser = instituteBranchTenureUser;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="tenure_academic_program_course_id", nullable=false)
    public TenureAcademicProgramCourse getTenureAcademicProgramCourse() {
        return this.tenureAcademicProgramCourse;
    }
    
    public void setTenureAcademicProgramCourse(TenureAcademicProgramCourse tenureAcademicProgramCourse) {
        this.tenureAcademicProgramCourse = tenureAcademicProgramCourse;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_date", length=19)
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    
    @Column(name="created_by")
    public Long getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_updated_date", length=19)
    public Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    
    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    
    @Column(name="last_updated_by")
    public Long getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }
    
    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    
    @Column(name="status", length=5)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


