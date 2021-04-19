/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.argacme.snipeit.model;

import java.io.Serializable;
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
@Table(name = "models")
public class Models implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "model_number")
    private String modelNumber;
    @Column(name = "manufacturer_id")
    private Integer manufacturerId;
    @Column(name = "category_id")
    private Integer categoryId;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "depreciation_id")
    private Integer depreciationId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "eol")
    private Integer eol;
    @Column(name = "image")
    private String image;
    @Basic(optional = false)
    @Column(name = "deprecated_mac_address")
    private boolean deprecatedMacAddress;
    @Column(name = "deleted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;
    @Column(name = "fieldset_id")
    private Integer fieldsetId;
    @Lob
    @Column(name = "notes")
    private String notes;
    @Basic(optional = false)
    @Column(name = "requestable")
    private short requestable;

    public Models(Integer id) {
        this.id = id;
    }

    public Models(Integer id, String name, boolean deprecatedMacAddress, short requestable) {
        this.id = id;
        this.name = name;
        this.deprecatedMacAddress = deprecatedMacAddress;
        this.requestable = requestable;
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

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
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

    public Integer getDepreciationId() {
        return depreciationId;
    }

    public void setDepreciationId(Integer depreciationId) {
        this.depreciationId = depreciationId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getEol() {
        return eol;
    }

    public void setEol(Integer eol) {
        this.eol = eol;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean getDeprecatedMacAddress() {
        return deprecatedMacAddress;
    }

    public void setDeprecatedMacAddress(boolean deprecatedMacAddress) {
        this.deprecatedMacAddress = deprecatedMacAddress;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Integer getFieldsetId() {
        return fieldsetId;
    }

    public void setFieldsetId(Integer fieldsetId) {
        this.fieldsetId = fieldsetId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public short getRequestable() {
        return requestable;
    }

    public void setRequestable(short requestable) {
        this.requestable = requestable;
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
        if (!(object instanceof Models)) {
            return false;
        }
        Models other = (Models) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.argacme.snipeit.model.Models[ id=" + id + " ]";
    }
    
}
