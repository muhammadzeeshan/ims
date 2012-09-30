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
 * CollectionSetupData generated by hbm2java
 */
@Entity
@Table(name="collection_setup_data"
    ,catalog="ims"
)
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
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="collection_reference_id", nullable=false)
    public CollectionReference getCollectionReference() {
        return this.collectionReference;
    }
    
    public void setCollectionReference(CollectionReference collectionReference) {
        this.collectionReference = collectionReference;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="duration_type_id", nullable=false)
    public DurationType getDurationType() {
        return this.durationType;
    }
    
    public void setDurationType(DurationType durationType) {
        this.durationType = durationType;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="collection_type_id", nullable=false)
    public CollectionType getCollectionType() {
        return this.collectionType;
    }
    
    public void setCollectionType(CollectionType collectionType) {
        this.collectionType = collectionType;
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

    
    @Column(name="collection_reference_field_id")
    public Long getCollectionReferenceFieldId() {
        return this.collectionReferenceFieldId;
    }
    
    public void setCollectionReferenceFieldId(Long collectionReferenceFieldId) {
        this.collectionReferenceFieldId = collectionReferenceFieldId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="start_date", length=10)
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="last_date", length=10)
    public Date getLastDate() {
        return this.lastDate;
    }
    
    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    
    @Column(name="amount")
    public Long getAmount() {
        return this.amount;
    }
    
    public void setAmount(Long amount) {
        this.amount = amount;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="collectionSetupData")
    public Set<Collection> getCollections() {
        return this.collections;
    }
    
    public void setCollections(Set<Collection> collections) {
        this.collections = collections;
    }




}


