package com.ims.dal.vo;
// Generated Dec 30, 2012 4:18:27 PM by Hibernate Tools 3.4.0.CR1


import java.util.Date;

/**
 * BusinessData generated by hbm2java
 */
public class BusinessData  implements java.io.Serializable {


     private Long id;
     private BusinessDataReference businessDataReference;
     private UserRoleScreenElement userRoleScreenElement;
     private Date createdDate;
     private Long createdBy;
     private Date lastUpdatedDate;
     private Long lastUpdatedBy;
     private String status;
     private String value;

    public BusinessData() {
    }

	
    public BusinessData(BusinessDataReference businessDataReference, UserRoleScreenElement userRoleScreenElement) {
        this.businessDataReference = businessDataReference;
        this.userRoleScreenElement = userRoleScreenElement;
    }
    public BusinessData(BusinessDataReference businessDataReference, UserRoleScreenElement userRoleScreenElement, Date createdDate, Long createdBy, Date lastUpdatedDate, Long lastUpdatedBy, String status, String value) {
       this.businessDataReference = businessDataReference;
       this.userRoleScreenElement = userRoleScreenElement;
       this.createdDate = createdDate;
       this.createdBy = createdBy;
       this.lastUpdatedDate = lastUpdatedDate;
       this.lastUpdatedBy = lastUpdatedBy;
       this.status = status;
       this.value = value;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public BusinessDataReference getBusinessDataReference() {
        return this.businessDataReference;
    }
    
    public void setBusinessDataReference(BusinessDataReference businessDataReference) {
        this.businessDataReference = businessDataReference;
    }
    public UserRoleScreenElement getUserRoleScreenElement() {
        return this.userRoleScreenElement;
    }
    
    public void setUserRoleScreenElement(UserRoleScreenElement userRoleScreenElement) {
        this.userRoleScreenElement = userRoleScreenElement;
    }
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public Long getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }
    public Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    
    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }
    public Long getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }
    
    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }




}

