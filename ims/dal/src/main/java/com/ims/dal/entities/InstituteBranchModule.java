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
 * InstituteBranchModule generated by hbm2java
 */
@Entity
@Table(name="institute_branch_module"
    ,catalog="ims"
)
public class InstituteBranchModule  implements java.io.Serializable {


     private Long id;
     private Module module;
     private InstituteBranch instituteBranch;
     private Date createdDate;
     private Long createdBy;
     private Date lastUpdatedDate;
     private Long lastUpdatedBy;
     private String status;
     private Set<RoleInstituteBranchModule> roleInstituteBranchModules = new HashSet<RoleInstituteBranchModule>(0);

    public InstituteBranchModule() {
    }

	
    public InstituteBranchModule(Module module, InstituteBranch instituteBranch) {
        this.module = module;
        this.instituteBranch = instituteBranch;
    }
    public InstituteBranchModule(Module module, InstituteBranch instituteBranch, Date createdDate, Long createdBy, Date lastUpdatedDate, Long lastUpdatedBy, String status, Set<RoleInstituteBranchModule> roleInstituteBranchModules) {
       this.module = module;
       this.instituteBranch = instituteBranch;
       this.createdDate = createdDate;
       this.createdBy = createdBy;
       this.lastUpdatedDate = lastUpdatedDate;
       this.lastUpdatedBy = lastUpdatedBy;
       this.status = status;
       this.roleInstituteBranchModules = roleInstituteBranchModules;
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
    @JoinColumn(name="module_id", nullable=false)
    public Module getModule() {
        return this.module;
    }
    
    public void setModule(Module module) {
        this.module = module;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="institute_branch_id", nullable=false)
    public InstituteBranch getInstituteBranch() {
        return this.instituteBranch;
    }
    
    public void setInstituteBranch(InstituteBranch instituteBranch) {
        this.instituteBranch = instituteBranch;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="instituteBranchModule")
    public Set<RoleInstituteBranchModule> getRoleInstituteBranchModules() {
        return this.roleInstituteBranchModules;
    }
    
    public void setRoleInstituteBranchModules(Set<RoleInstituteBranchModule> roleInstituteBranchModules) {
        this.roleInstituteBranchModules = roleInstituteBranchModules;
    }




}


