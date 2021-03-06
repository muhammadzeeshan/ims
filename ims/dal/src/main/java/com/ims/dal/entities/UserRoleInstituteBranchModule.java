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
 * UserRoleInstituteBranchModule generated by hbm2java
 */
@Entity
@Table(name="user_role_institute_branch_module"
    ,catalog="ims"
)
public class UserRoleInstituteBranchModule  implements java.io.Serializable {


     private Long id;
     private RoleInstituteBranchModule roleInstituteBranchModule;
     private InstituteBranchTenureUser instituteBranchTenureUser;
     private Date createdDate;
     private Long createdBy;
     private Date lastUpdatedDate;
     private Long lastUpdatedBy;
     private String status;
     private Set<UserRoleScreenElement> userRoleScreenElements = new HashSet<UserRoleScreenElement>(0);

    public UserRoleInstituteBranchModule() {
    }

	
    public UserRoleInstituteBranchModule(RoleInstituteBranchModule roleInstituteBranchModule, InstituteBranchTenureUser instituteBranchTenureUser) {
        this.roleInstituteBranchModule = roleInstituteBranchModule;
        this.instituteBranchTenureUser = instituteBranchTenureUser;
    }
    public UserRoleInstituteBranchModule(RoleInstituteBranchModule roleInstituteBranchModule, InstituteBranchTenureUser instituteBranchTenureUser, Date createdDate, Long createdBy, Date lastUpdatedDate, Long lastUpdatedBy, String status, Set<UserRoleScreenElement> userRoleScreenElements) {
       this.roleInstituteBranchModule = roleInstituteBranchModule;
       this.instituteBranchTenureUser = instituteBranchTenureUser;
       this.createdDate = createdDate;
       this.createdBy = createdBy;
       this.lastUpdatedDate = lastUpdatedDate;
       this.lastUpdatedBy = lastUpdatedBy;
       this.status = status;
       this.userRoleScreenElements = userRoleScreenElements;
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
    @JoinColumn(name="role_institute_branch_module_id", nullable=false)
    public RoleInstituteBranchModule getRoleInstituteBranchModule() {
        return this.roleInstituteBranchModule;
    }
    
    public void setRoleInstituteBranchModule(RoleInstituteBranchModule roleInstituteBranchModule) {
        this.roleInstituteBranchModule = roleInstituteBranchModule;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="institute_branch_tenure_user_id", nullable=false)
    public InstituteBranchTenureUser getInstituteBranchTenureUser() {
        return this.instituteBranchTenureUser;
    }
    
    public void setInstituteBranchTenureUser(InstituteBranchTenureUser instituteBranchTenureUser) {
        this.instituteBranchTenureUser = instituteBranchTenureUser;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="userRoleInstituteBranchModule")
    public Set<UserRoleScreenElement> getUserRoleScreenElements() {
        return this.userRoleScreenElements;
    }
    
    public void setUserRoleScreenElements(Set<UserRoleScreenElement> userRoleScreenElements) {
        this.userRoleScreenElements = userRoleScreenElements;
    }




}


