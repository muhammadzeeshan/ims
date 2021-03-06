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
 * UserRoleScreenElement generated by hbm2java
 */
@Entity
@Table(name="user_role_screen_element"
    ,catalog="ims"
)
public class UserRoleScreenElement  implements java.io.Serializable {


     private Long id;
     private UserRoleInstituteBranchModule userRoleInstituteBranchModule;
     private Permission permission;
     private Rule rule;
     private ModuleScreenElement moduleScreenElement;
     private Date createdDate;
     private Long createdBy;
     private Date lastUpdatedDate;
     private Long lastUpdatedBy;
     private String status;
     private Set<UserProfile> userProfiles = new HashSet<UserProfile>(0);
     private Set<BusinessData> businessDatas = new HashSet<BusinessData>(0);

    public UserRoleScreenElement() {
    }

	
    public UserRoleScreenElement(UserRoleInstituteBranchModule userRoleInstituteBranchModule, Permission permission, Rule rule, ModuleScreenElement moduleScreenElement) {
        this.userRoleInstituteBranchModule = userRoleInstituteBranchModule;
        this.permission = permission;
        this.rule = rule;
        this.moduleScreenElement = moduleScreenElement;
    }
    public UserRoleScreenElement(UserRoleInstituteBranchModule userRoleInstituteBranchModule, Permission permission, Rule rule, ModuleScreenElement moduleScreenElement, Date createdDate, Long createdBy, Date lastUpdatedDate, Long lastUpdatedBy, String status, Set<UserProfile> userProfiles, Set<BusinessData> businessDatas) {
       this.userRoleInstituteBranchModule = userRoleInstituteBranchModule;
       this.permission = permission;
       this.rule = rule;
       this.moduleScreenElement = moduleScreenElement;
       this.createdDate = createdDate;
       this.createdBy = createdBy;
       this.lastUpdatedDate = lastUpdatedDate;
       this.lastUpdatedBy = lastUpdatedBy;
       this.status = status;
       this.userProfiles = userProfiles;
       this.businessDatas = businessDatas;
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
    @JoinColumn(name="user_role_institute_branch_module_id", nullable=false)
    public UserRoleInstituteBranchModule getUserRoleInstituteBranchModule() {
        return this.userRoleInstituteBranchModule;
    }
    
    public void setUserRoleInstituteBranchModule(UserRoleInstituteBranchModule userRoleInstituteBranchModule) {
        this.userRoleInstituteBranchModule = userRoleInstituteBranchModule;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="permission_id", nullable=false)
    public Permission getPermission() {
        return this.permission;
    }
    
    public void setPermission(Permission permission) {
        this.permission = permission;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="rule_id", nullable=false)
    public Rule getRule() {
        return this.rule;
    }
    
    public void setRule(Rule rule) {
        this.rule = rule;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="module_screen_element_id", nullable=false)
    public ModuleScreenElement getModuleScreenElement() {
        return this.moduleScreenElement;
    }
    
    public void setModuleScreenElement(ModuleScreenElement moduleScreenElement) {
        this.moduleScreenElement = moduleScreenElement;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="userRoleScreenElement")
    public Set<UserProfile> getUserProfiles() {
        return this.userProfiles;
    }
    
    public void setUserProfiles(Set<UserProfile> userProfiles) {
        this.userProfiles = userProfiles;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="userRoleScreenElement")
    public Set<BusinessData> getBusinessDatas() {
        return this.businessDatas;
    }
    
    public void setBusinessDatas(Set<BusinessData> businessDatas) {
        this.businessDatas = businessDatas;
    }




}


