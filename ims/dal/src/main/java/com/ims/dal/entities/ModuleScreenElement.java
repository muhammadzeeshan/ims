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
 * ModuleScreenElement generated by hbm2java
 */
@Entity
@Table(name="module_screen_element"
    ,catalog="ims"
)
public class ModuleScreenElement  implements java.io.Serializable {


     private Long id;
     private BusinessFields businessFields;
     private ModuleScreen moduleScreen;
     private Date createdDate;
     private Long createdBy;
     private Date lastUpdatedDate;
     private Long lastUpdatedBy;
     private String status;
     private Set<UserRoleScreenElement> userRoleScreenElements = new HashSet<UserRoleScreenElement>(0);

    public ModuleScreenElement() {
    }

	
    public ModuleScreenElement(BusinessFields businessFields, ModuleScreen moduleScreen) {
        this.businessFields = businessFields;
        this.moduleScreen = moduleScreen;
    }
    public ModuleScreenElement(BusinessFields businessFields, ModuleScreen moduleScreen, Date createdDate, Long createdBy, Date lastUpdatedDate, Long lastUpdatedBy, String status, Set<UserRoleScreenElement> userRoleScreenElements) {
       this.businessFields = businessFields;
       this.moduleScreen = moduleScreen;
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
    @JoinColumn(name="business_fields_id", nullable=false)
    public BusinessFields getBusinessFields() {
        return this.businessFields;
    }
    
    public void setBusinessFields(BusinessFields businessFields) {
        this.businessFields = businessFields;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="module_screen_id", nullable=false)
    public ModuleScreen getModuleScreen() {
        return this.moduleScreen;
    }
    
    public void setModuleScreen(ModuleScreen moduleScreen) {
        this.moduleScreen = moduleScreen;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="moduleScreenElement")
    public Set<UserRoleScreenElement> getUserRoleScreenElements() {
        return this.userRoleScreenElements;
    }
    
    public void setUserRoleScreenElements(Set<UserRoleScreenElement> userRoleScreenElements) {
        this.userRoleScreenElements = userRoleScreenElements;
    }




}


