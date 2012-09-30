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
 * Collection generated by hbm2java
 */
@Entity
@Table(name="collection"
    ,catalog="ims"
)
public class Collection  implements java.io.Serializable {


     private Long id;
     private DurationType durationType;
     private InstituteBranchTenureUser instituteBranchTenureUser;
     private CollectionSetupData collectionSetupData;
     private CollectionMode collectionMode;
     private CollectionStatus collectionStatus;
     private Date createdDate;
     private Long createdBy;
     private Date lastUpdatedDate;
     private Long lastUpdatedBy;
     private String status;
     private Set<Transaction> transactions = new HashSet<Transaction>(0);

    public Collection() {
    }

	
    public Collection(DurationType durationType, InstituteBranchTenureUser instituteBranchTenureUser, CollectionSetupData collectionSetupData, CollectionMode collectionMode, CollectionStatus collectionStatus) {
        this.durationType = durationType;
        this.instituteBranchTenureUser = instituteBranchTenureUser;
        this.collectionSetupData = collectionSetupData;
        this.collectionMode = collectionMode;
        this.collectionStatus = collectionStatus;
    }
    public Collection(DurationType durationType, InstituteBranchTenureUser instituteBranchTenureUser, CollectionSetupData collectionSetupData, CollectionMode collectionMode, CollectionStatus collectionStatus, Date createdDate, Long createdBy, Date lastUpdatedDate, Long lastUpdatedBy, String status, Set<Transaction> transactions) {
       this.durationType = durationType;
       this.instituteBranchTenureUser = instituteBranchTenureUser;
       this.collectionSetupData = collectionSetupData;
       this.collectionMode = collectionMode;
       this.collectionStatus = collectionStatus;
       this.createdDate = createdDate;
       this.createdBy = createdBy;
       this.lastUpdatedDate = lastUpdatedDate;
       this.lastUpdatedBy = lastUpdatedBy;
       this.status = status;
       this.transactions = transactions;
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
    @JoinColumn(name="duration_type_id", nullable=false)
    public DurationType getDurationType() {
        return this.durationType;
    }
    
    public void setDurationType(DurationType durationType) {
        this.durationType = durationType;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="institute_branch_tenure_user_id", nullable=false)
    public InstituteBranchTenureUser getInstituteBranchTenureUser() {
        return this.instituteBranchTenureUser;
    }
    
    public void setInstituteBranchTenureUser(InstituteBranchTenureUser instituteBranchTenureUser) {
        this.instituteBranchTenureUser = instituteBranchTenureUser;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="collection_setup_data_id", nullable=false)
    public CollectionSetupData getCollectionSetupData() {
        return this.collectionSetupData;
    }
    
    public void setCollectionSetupData(CollectionSetupData collectionSetupData) {
        this.collectionSetupData = collectionSetupData;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="collection_mode_id", nullable=false)
    public CollectionMode getCollectionMode() {
        return this.collectionMode;
    }
    
    public void setCollectionMode(CollectionMode collectionMode) {
        this.collectionMode = collectionMode;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="collection_status_id", nullable=false)
    public CollectionStatus getCollectionStatus() {
        return this.collectionStatus;
    }
    
    public void setCollectionStatus(CollectionStatus collectionStatus) {
        this.collectionStatus = collectionStatus;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="collection")
    public Set<Transaction> getTransactions() {
        return this.transactions;
    }
    
    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }




}


