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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author areyes
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "action_logs")
public class ActionLogs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "user_id")
    private Integer userId;
    @Basic(optional = false)
    @Column(name = "action_type")
    private String actionType;
    @Column(name = "target_id")
    private Integer targetId;
    @Column(name = "target_type")
    private String targetType;
    @Column(name = "location_id")
    private Integer locationId;
    @Lob
    @Column(name = "note")
    private String note;
    @Lob
    @Column(name = "filename")
    private String filename;
    @Basic(optional = false)
    @Column(name = "item_type")
    private String itemType;
    @Basic(optional = false)
    @Column(name = "item_id")
    private int itemId;
    @Column(name = "expected_checkin")
    @Temporal(TemporalType.DATE)
    private Date expectedCheckin;
    @Column(name = "accepted_id")
    private Integer acceptedId;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "deleted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;
    @Column(name = "thread_id")
    private Integer threadId;
    @Column(name = "company_id")
    private Integer companyId;
    @Column(name = "accept_signature")
    private String acceptSignature;
    @Lob
    @Column(name = "log_meta")
    private String logMeta;

    public ActionLogs(Integer id) {
        this.id = id;
    }

    public ActionLogs(Integer id, String actionType, String itemType, int itemId) {
        this.id = id;
        this.actionType = actionType;
        this.itemType = itemType;
        this.itemId = itemId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public Date getExpectedCheckin() {
        return expectedCheckin;
    }

    public void setExpectedCheckin(Date expectedCheckin) {
        this.expectedCheckin = expectedCheckin;
    }

    public Integer getAcceptedId() {
        return acceptedId;
    }

    public void setAcceptedId(Integer acceptedId) {
        this.acceptedId = acceptedId;
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

    public Integer getThreadId() {
        return threadId;
    }

    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getAcceptSignature() {
        return acceptSignature;
    }

    public void setAcceptSignature(String acceptSignature) {
        this.acceptSignature = acceptSignature;
    }

    public String getLogMeta() {
        return logMeta;
    }

    public void setLogMeta(String logMeta) {
        this.logMeta = logMeta;
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
        if (!(object instanceof ActionLogs)) {
            return false;
        }
        ActionLogs other = (ActionLogs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.argacme.snipeit.model.ActionLogs[ id=" + id + " ]";
    }
    
}
