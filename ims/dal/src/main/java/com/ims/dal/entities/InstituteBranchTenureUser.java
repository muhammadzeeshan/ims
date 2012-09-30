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
 * InstituteBranchTenureUser generated by hbm2java
 */
@Entity
@Table(name="institute_branch_tenure_user"
    ,catalog="ims"
)
public class InstituteBranchTenureUser  implements java.io.Serializable {


     private Long id;
     private User user;
     private InstituteBranchTenure instituteBranchTenure;
     private Date createdDate;
     private Long createdBy;
     private Date lastUpdatedDate;
     private Long lastUpdatedBy;
     private String status;
     private Set<InstituteBranchUserAcademicProgram> instituteBranchUserAcademicPrograms = new HashSet<InstituteBranchUserAcademicProgram>(0);
     private Set<Collection> collections = new HashSet<Collection>(0);
     private Set<UserRoleInstituteBranchModule> userRoleInstituteBranchModules = new HashSet<UserRoleInstituteBranchModule>(0);

    public InstituteBranchTenureUser() {
    }

	
    public InstituteBranchTenureUser(User user, InstituteBranchTenure instituteBranchTenure) {
        this.user = user;
        this.instituteBranchTenure = instituteBranchTenure;
    }
    public InstituteBranchTenureUser(User user, InstituteBranchTenure instituteBranchTenure, Date createdDate, Long createdBy, Date lastUpdatedDate, Long lastUpdatedBy, String status, Set<InstituteBranchUserAcademicProgram> instituteBranchUserAcademicPrograms, Set<Collection> collections, Set<UserRoleInstituteBranchModule> userRoleInstituteBranchModules) {
       this.user = user;
       this.instituteBranchTenure = instituteBranchTenure;
       this.createdDate = createdDate;
       this.createdBy = createdBy;
       this.lastUpdatedDate = lastUpdatedDate;
       this.lastUpdatedBy = lastUpdatedBy;
       this.status = status;
       this.instituteBranchUserAcademicPrograms = instituteBranchUserAcademicPrograms;
       this.collections = collections;
       this.userRoleInstituteBranchModules = userRoleInstituteBranchModules;
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
    @JoinColumn(name="user_id", nullable=false)
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="institute_branch_tenure_id", nullable=false)
    public InstituteBranchTenure getInstituteBranchTenure() {
        return this.instituteBranchTenure;
    }
    
    public void setInstituteBranchTenure(InstituteBranchTenure instituteBranchTenure) {
        this.instituteBranchTenure = instituteBranchTenure;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="instituteBranchTenureUser")
    public Set<InstituteBranchUserAcademicProgram> getInstituteBranchUserAcademicPrograms() {
        return this.instituteBranchUserAcademicPrograms;
    }
    
    public void setInstituteBranchUserAcademicPrograms(Set<InstituteBranchUserAcademicProgram> instituteBranchUserAcademicPrograms) {
        this.instituteBranchUserAcademicPrograms = instituteBranchUserAcademicPrograms;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="instituteBranchTenureUser")
    public Set<Collection> getCollections() {
        return this.collections;
    }
    
    public void setCollections(Set<Collection> collections) {
        this.collections = collections;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="instituteBranchTenureUser")
    public Set<UserRoleInstituteBranchModule> getUserRoleInstituteBranchModules() {
        return this.userRoleInstituteBranchModules;
    }
    
    public void setUserRoleInstituteBranchModules(Set<UserRoleInstituteBranchModule> userRoleInstituteBranchModules) {
        this.userRoleInstituteBranchModules = userRoleInstituteBranchModules;
    }




}


