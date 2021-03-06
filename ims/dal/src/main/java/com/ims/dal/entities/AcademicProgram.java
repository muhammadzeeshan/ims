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
 * AcademicProgram generated by hbm2java
 */
@Entity
@Table(name="academic_program"
    ,catalog="ims"
)
public class AcademicProgram  implements java.io.Serializable {


     private Long id;
     private Academic academic;
     private Date createdDate;
     private Long createdBy;
     private Date lastUpdatedDate;
     private Long lastUpdatedBy;
     private String status;
     private Set<InstituteBranchAcademicProgram> instituteBranchAcademicPrograms = new HashSet<InstituteBranchAcademicProgram>(0);
     private Set<AcademicProgramCourse> academicProgramCourses = new HashSet<AcademicProgramCourse>(0);

    public AcademicProgram() {
    }

	
    public AcademicProgram(Academic academic) {
        this.academic = academic;
    }
    public AcademicProgram(Academic academic, Date createdDate, Long createdBy, Date lastUpdatedDate, Long lastUpdatedBy, String status, Set<InstituteBranchAcademicProgram> instituteBranchAcademicPrograms, Set<AcademicProgramCourse> academicProgramCourses) {
       this.academic = academic;
       this.createdDate = createdDate;
       this.createdBy = createdBy;
       this.lastUpdatedDate = lastUpdatedDate;
       this.lastUpdatedBy = lastUpdatedBy;
       this.status = status;
       this.instituteBranchAcademicPrograms = instituteBranchAcademicPrograms;
       this.academicProgramCourses = academicProgramCourses;
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
    @JoinColumn(name="academic_id", nullable=false)
    public Academic getAcademic() {
        return this.academic;
    }
    
    public void setAcademic(Academic academic) {
        this.academic = academic;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="academicProgram")
    public Set<InstituteBranchAcademicProgram> getInstituteBranchAcademicPrograms() {
        return this.instituteBranchAcademicPrograms;
    }
    
    public void setInstituteBranchAcademicPrograms(Set<InstituteBranchAcademicProgram> instituteBranchAcademicPrograms) {
        this.instituteBranchAcademicPrograms = instituteBranchAcademicPrograms;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="academicProgram")
    public Set<AcademicProgramCourse> getAcademicProgramCourses() {
        return this.academicProgramCourses;
    }
    
    public void setAcademicProgramCourses(Set<AcademicProgramCourse> academicProgramCourses) {
        this.academicProgramCourses = academicProgramCourses;
    }




}


