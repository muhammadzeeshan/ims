package com.ims.dal.vo;
// Generated Dec 30, 2012 4:18:27 PM by Hibernate Tools 3.4.0.CR1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CollectionSetupData generated by hbm2java
 */
public class CollectionSetupData  implements java.io.Serializable {


     private Long id;
     private CollectionReference collectionReference;
     private DurationType durationType;
     private CollectionType collectionType;
     private Date createdDate;
     private Long createdBy;
     private Date lastUpdatedDate;
     private Long lastUpdatedBy;
     private String status;
     private Long collectionReferenceFieldId;
     private Date startDate;
     private Date lastDate;
     private Long amount;
     private Set<Collection> collections = new HashSet<Collection>(0);

    public CollectionSetupData() {
    }

	
    public CollectionSetupData(CollectionReference collectionReference, DurationType durationType, CollectionType collectionType) {
        this.collectionReference = collectionReference;
        this.durationType = durationType;
        this.collectionType = collectionType;
    }
    public CollectionSetupData(CollectionReference collectionReference, DurationType durationType, CollectionType collectionType, Date createdDate, Long createdBy, Date lastUpdatedDate, Long lastUpdatedBy, String status, Long collectionReferenceFieldId, Date startDate, Date lastDate, Long amount, Set<Collection> collections) {
       this.collectionReference = collectionReference;
       this.durationType = durationType;
       this.collectionType = collectionType;
       this.createdDate = createdDate;
       this.createdBy = createdBy;
       this.lastUpdatedDate = lastUpdatedDate;
       this.lastUpdatedBy = lastUpdatedBy;
       this.status = status;
       this.collectionReferenceFieldId = collectionReferenceFieldId;
       this.startDate = startDate;
       this.lastDate = lastDate;
       this.amount = amount;
       this.collections = collections;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public CollectionReference getCollectionReference() {
        return this.collectionReference;
    }
    
    public void setCollectionReference(CollectionReference collectionReference) {
        this.collectionReference = collectionReference;
    }
    public DurationType getDurationType() {
        return this.durationType;
    }
    
    public void setDurationType(DurationType durationType) {
        this.durationType = durationType;
    }
    public CollectionType getCollectionType() {
        return this.collectionType;
    }
    
    public void setCollectionType(CollectionType collectionType) {
        this.collectionType = collectionType;
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
    public Long getCollectionReferenceFieldId() {
        return this.collectionReferenceFieldId;
    }
    
    public void setCollectionReferenceFieldId(Long collectionReferenceFieldId) {
        this.collectionReferenceFieldId = collectionReferenceFieldId;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getLastDate() {
        return this.lastDate;
    }
    
    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }
    public Long getAmount() {
        return this.amount;
    }
    
    public void setAmount(Long amount) {
        this.amount = amount;
    }
    public Set<Collection> getCollections() {
        return this.collections;
    }
    
    public void setCollections(Set<Collection> collections) {
        this.collections = collections;
    }




}


