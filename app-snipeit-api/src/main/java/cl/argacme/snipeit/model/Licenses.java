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
@Table(name = "licenses")
public class Licenses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
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
    @Basic(optional = false)
    @Column(name = "seats")
    private int seats;
    @Lob
    @Column(name = "notes")
    private String notes;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "depreciation_id")
    private Integer depreciationId;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "deleted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;
    @Column(name = "license_name")
    private String licenseName;
    @Column(name = "license_email")
    private String licenseEmail;
    @Column(name = "depreciate")
    private Boolean depreciate;
    @Column(name = "supplier_id")
    private Integer supplierId;
    @Column(name = "expiration_date")
    @Temporal(TemporalType.DATE)
    private Date expirationDate;
    @Column(name = "purchase_order")
    private String purchaseOrder;
    @Column(name = "termination_date")
    @Temporal(TemporalType.DATE)
    private Date terminationDate;
    @Column(name = "maintained")
    private Boolean maintained;
    @Basic(optional = false)
    @Column(name = "reassignable")
    private boolean reassignable;
    @Column(name = "company_id")
    private Integer companyId;
    @Column(name = "manufacturer_id")
    private Integer manufacturerId;
    @Column(name = "category_id")
    private Integer categoryId;

    public Licenses() {
    }
    
    public Licenses(Integer id) {
        this.id = id;
    }

    public Licenses(Integer id, int seats, boolean reassignable) {
        this.id = id;
        this.seats = seats;
        this.reassignable = reassignable;
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

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDepreciationId() {
        return depreciationId;
    }

    public void setDepreciationId(Integer depreciationId) {
        this.depreciationId = depreciationId;
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

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getLicenseName() {
        return licenseName;
    }

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    public String getLicenseEmail() {
        return licenseEmail;
    }

    public void setLicenseEmail(String licenseEmail) {
        this.licenseEmail = licenseEmail;
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

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(String purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public Date getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(Date terminationDate) {
        this.terminationDate = terminationDate;
    }

    public Boolean getMaintained() {
        return maintained;
    }

    public void setMaintained(Boolean maintained) {
        this.maintained = maintained;
    }

    public boolean getReassignable() {
        return reassignable;
    }

    public void setReassignable(boolean reassignable) {
        this.reassignable = reassignable;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
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
        if (!(object instanceof Licenses)) {
            return false;
        }
        Licenses other = (Licenses) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.argacme.snipeit.model.Licenses[ id=" + id + " ]";
    }
    
}
