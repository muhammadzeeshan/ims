package com.ims.dal.entities;
// Generated Oct 1, 2012 1:18:07 AM by Hibernate Tools 3.4.0.CR1


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
 * InstituteBranch generated by hbm2java
 */
@Entity
@Table(name="institute_branch"
    ,catalog="ims"
)
public class InstituteBranch  implements java.io.Serializable {


     private Long id;
     private Institute institute;
     private Date createdDate;
     private Long createdBy;
     private Date lastUpdatedDate;
     private Long lastUpdatedBy;
     private String status;
     private Set<InstituteBranchModule> instituteBranchModules = new HashSet<InstituteBranchModule>(0);
     private Set<InstituteBranchAcademicProgram> instituteBranchAcademicPrograms = new HashSet<InstituteBranchAcademicProgram>(0);
     private Set<InstituteBranchTenure> instituteBranchTenures = new HashSet<InstituteBranchTenure>(0);

    public InstituteBranch() {
    }

	
    public InstituteBranch(Institute institute) {
        this.institute = institute;
    }
    public InstituteBranch(Institute institute, Date createdDate, Long createdBy, Date lastUpdatedDate, Long lastUpdatedBy, String status, Set<InstituteBranchModule> instituteBranchModules, Set<InstituteBranchAcademicProgram> instituteBranchAcademicPrograms, Set<InstituteBranchTenure> instituteBranchTenures) {
       this.institute = institute;
       this.createdDate = createdDate;
       this.createdBy = createdBy;
       this.lastUpdatedDate = lastUpdatedDate;
       this.lastUpdatedBy = lastUpdatedBy;
       this.status = status;
       this.instituteBranchModules = instituteBranchModules;
       this.instituteBranchAcademicPrograms = instituteBranchAcademicPrograms;
       this.instituteBranchTenures = instituteBranchTenures;
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
    @JoinColumn(name="institute_id", nullable=false)
    public Institute getInstitute() {
        return this.institute;
    }
    
    public void setInstitute(Institute institute) {
        this.institute = institute;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="instituteBranch")
    public Set<InstituteBranchModule> getInstituteBranchModules() {
        return this.instituteBranchModules;
    }
    
    public void setInstituteBranchModules(Set<InstituteBranchModule> instituteBranchModules) {
        this.instituteBranchModules = instituteBranchModules;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="instituteBranch")
    public Set<InstituteBranchAcademicProgram> getInstituteBranchAcademicPrograms() {
        return this.instituteBranchAcademicPrograms;
    }
    
    public void setInstituteBranchAcademicPrograms(Set<InstituteBranchAcademicProgram> instituteBranchAcademicPrograms) {
        this.instituteBranchAcademicPrograms = instituteBranchAcademicPrograms;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="instituteBranch")
    public Set<InstituteBranchTenure> getInstituteBranchTenures() {
        return this.instituteBranchTenures;
    }
    
    public void setInstituteBranchTenures(Set<InstituteBranchTenure> instituteBranchTenures) {
        this.instituteBranchTenures = instituteBranchTenures;
    }




}

