package com.ims.dal.vo;
// Generated Dec 30, 2012 4:18:27 PM by Hibernate Tools 3.4.0.CR1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * BusinessDataReference generated by hbm2java
 */
public class BusinessDataReference  implements java.io.Serializable {


     private Long id;
     private Date createdDate;
     private Long createdBy;
     private Date lastUpdatedDate;
     private Long lastUpdatedBy;
     private String status;
     private String name;
     private Set<BusinessData> businessDatas = new HashSet<BusinessData>(0);

    public BusinessDataReference() {
    }

    public BusinessDataReference(Date createdDate, Long createdBy, Date lastUpdatedDate, Long lastUpdatedBy, String status, String name, Set<BusinessData> businessDatas) {
       this.createdDate = createdDate;
       this.createdBy = createdBy;
       this.lastUpdatedDate = lastUpdatedDate;
       this.lastUpdatedBy = lastUpdatedBy;
       this.status = status;
       this.name = name;
       this.businessDatas = businessDatas;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
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
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set<BusinessData> getBusinessDatas() {
        return this.businessDatas;
    }
    
    public void setBusinessDatas(Set<BusinessData> businessDatas) {
        this.businessDatas = businessDatas;
    }




}


