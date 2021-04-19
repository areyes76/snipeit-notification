/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.argacme.snipeit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author areyes
 */
@Entity
@Table(name = "assets")
public class Assets implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "asset_tag")
    private String assetTag;
    @Column(name = "model_id")
    private Integer modelId;
    @Column(name = "serial")
    private String serial;
    @Column(name = "purchase_date")
    @Temporal(TemporalType.DATE)
    private Date purchaseDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "purchase_cost")
    private BigDecimal purchaseCost;
    @Column(name = "order_number")
    private String orderNumber;
    @Column(name = "assigned_to")
    private Integer assignedTo;
    @Lob
    @Column(name = "notes")
    private String notes;
    @Lob
    @Column(name = "image")
    private String image;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Basic(optional = false)
    @Column(name = "physical")
    private boolean physical;
    @Column(name = "deleted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;
    @Column(name = "status_id")
    private Integer statusId;
    @Column(name = "archived")
    private Boolean archived;
    @Column(name = "warranty_months")
    private Integer warrantyMonths;
    @Column(name = "depreciate")
    private Boolean depreciate;
    @Column(name = "supplier_id")
    private Integer supplierId;
    @Basic(optional = false)
    @Column(name = "requestable")
    private short requestable;
    @Column(name = "rtd_location_id")
    private Integer rtdLocationId;
    @Column(name = "_snipeit_mac_address_1")
    private String snipeitMacAddress1;
    @Column(name = "accepted")
    private String accepted;
    @Column(name = "last_checkout")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastCheckout;
    @Column(name = "expected_checkin")
    @Temporal(TemporalType.DATE)
    private Date expectedCheckin;
    @Column(name = "company_id")
    private Integer companyId;
    @Column(name = "assigned_type")
    private String assignedType;
    @Column(name = "last_audit_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastAuditDate;
    @Column(name = "next_audit_date")
    @Temporal(TemporalType.DATE)
    private Date nextAuditDate;
    @Column(name = "location_id")
    private Integer locationId;
    @Basic(optional = false)
    @Column(name = "checkin_counter")
    private int checkinCounter;
    @Basic(optional = false)
    @Column(name = "checkout_counter")
    private int checkoutCounter;
    @Basic(optional = false)
    @Column(name = "requests_counter")
    private int requestsCounter;

    public Assets() {
    }
    
    public Assets(Integer id) {
        this.id = id;
    }

    public Assets(Integer id, boolean physical, short requestable, int checkinCounter, int checkoutCounter, int requestsCounter) {
        this.id = id;
        this.physical = physical;
        this.requestable = requestable;
        this.checkinCounter = checkinCounter;
        this.checkoutCounter = checkoutCounter;
        this.requestsCounter = requestsCounter;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssetTag() {
        return assetTag;
    }

    public void setAssetTag(String assetTag) {
        this.assetTag = assetTag;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public BigDecimal getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(BigDecimal purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Integer assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean getPhysical() {
        return physical;
    }

    public void setPhysical(boolean physical) {
        this.physical = physical;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Integer getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(Integer warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    public Boolean getDepreciate() {
        return depreciate;
    }

    public void setDepreciate(Boolean depreciate) {
        this.depreciate = depreciate;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public short getRequestable() {
        return requestable;
    }

    public void setRequestable(short requestable) {
        this.requestable = requestable;
    }

    public Integer getRtdLocationId() {
        return rtdLocationId;
    }

    public void setRtdLocationId(Integer rtdLocationId) {
        this.rtdLocationId = rtdLocationId;
    }

    public String getSnipeitMacAddress1() {
        return snipeitMacAddress1;
    }

    public void setSnipeitMacAddress1(String snipeitMacAddress1) {
        this.snipeitMacAddress1 = snipeitMacAddress1;
    }

    public String getAccepted() {
        return accepted;
    }

    public void setAccepted(String accepted) {
        this.accepted = accepted;
    }

    public Date getLastCheckout() {
        return lastCheckout;
    }

    public void setLastCheckout(Date lastCheckout) {
        this.lastCheckout = lastCheckout;
    }

    public Date getExpectedCheckin() {
        return expectedCheckin;
    }

    public void setExpectedCheckin(Date expectedCheckin) {
        this.expectedCheckin = expectedCheckin;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getAssignedType() {
        return assignedType;
    }

    public void setAssignedType(String assignedType) {
        this.assignedType = assignedType;
    }

    public Date getLastAuditDate() {
        return lastAuditDate;
    }

    public void setLastAuditDate(Date lastAuditDate) {
        this.lastAuditDate = lastAuditDate;
    }

    public Date getNextAuditDate() {
        return nextAuditDate;
    }

    public void setNextAuditDate(Date nextAuditDate) {
        this.nextAuditDate = nextAuditDate;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public int getCheckinCounter() {
        return checkinCounter;
    }

    public void setCheckinCounter(int checkinCounter) {
        this.checkinCounter = checkinCounter;
    }

    public int getCheckoutCounter() {
        return checkoutCounter;
    }

    public void setCheckoutCounter(int checkoutCounter) {
        this.checkoutCounter = checkoutCounter;
    }

    public int getRequestsCounter() {
        return requestsCounter;
    }

    public void setRequestsCounter(int requestsCounter) {
        this.requestsCounter = requestsCounter;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Assets)) {
            return false;
        }
        Assets other = (Assets) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.argacme.snipeit.model.Assets[ id=" + id + " ]";
    }
    
}
