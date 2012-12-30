package com.ims.dal.entities;
// Generated Dec 30, 2012 4:18:24 PM by Hibernate Tools 3.4.0.CR1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TenureAcademicProgramCourse generated by hbm2java
 */
@Entity
@Table(name="tenure_academic_program_course"
    ,catalog="ims"
)
public class TenureAcademicProgramCourse  implements java.io.Serializable {


     private Long id;
     private InstituteBranchTenure instituteBranchTenure;
     private AcademicProgramCourse academicProgramCourse;
     private Date createdDate;
     private Long createdBy;
     private Date lastUpdatedDate;
     private Long lastUpdatedBy;
     private String status;
     private Set<InstituteBranchUserAcademicProgram> instituteBranchUserAcademicPrograms = new HashSet<InstituteBranchUserAcademicProgram>(0);

    public TenureAcademicProgramCourse() {
    }

	
    public TenureAcademicProgramCourse(InstituteBranchTenure instituteBranchTenure, AcademicProgramCourse academicProgramCourse) {
        this.instituteBranchTenure = instituteBranchTenure;
        this.academicProgramCourse = academicProgramCourse;
    }
    public TenureAcademicProgramCourse(InstituteBranchTenure instituteBranchTenure, AcademicProgramCourse academicProgramCourse, Date createdDate, Long createdBy, Date lastUpdatedDate, Long lastUpdatedBy, String status, Set<InstituteBranchUserAcademicProgram> instituteBranchUserAcademicPrograms) {
       this.instituteBranchTenure = instituteBranchTenure;
       this.academicProgramCourse = academicProgramCourse;
       this.createdDate = createdDate;
       this.createdBy = createdBy;
       this.lastUpdatedDate = lastUpdatedDate;
       this.lastUpdatedBy = lastUpdatedBy;
       this.status = status;
       this.instituteBranchUserAcademicPrograms = instituteBranchUserAcademicPrograms;
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
    @JoinColumn(name="institute_branch_tenure_id", nullable=false)
    public InstituteBranchTenure getInstituteBranchTenure() {
        return this.instituteBranchTenure;
    }
    
    public void setInstituteBranchTenure(InstituteBranchTenure instituteBranchTenure) {
        this.instituteBranchTenure = instituteBranchTenure;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="academic_program_course_id", nullable=false)
    public AcademicProgramCourse getAcademicProgramCourse() {
        return this.academicProgramCourse;
    }
    
    public void setAcademicProgramCourse(AcademicProgramCourse academicProgramCourse) {
        this.academicProgramCourse = academicProgramCourse;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="tenureAcademicProgramCourse")
    public Set<InstituteBranchUserAcademicProgram> getInstituteBranchUserAcademicPrograms() {
        return this.instituteBranchUserAcademicPrograms;
    }
    
    public void setInstituteBranchUserAcademicPrograms(Set<InstituteBranchUserAcademicProgram> instituteBranchUserAcademicPrograms) {
        this.instituteBranchUserAcademicPrograms = instituteBranchUserAcademicPrograms;
    }




}


