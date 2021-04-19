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
@Table(name = "status_labels")
public class StatusLabels implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "deleted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;
    @Basic(optional = false)
    @Column(name = "deployable")
    private boolean deployable;
    @Basic(optional = false)
    @Column(name = "pending")
    private boolean pending;
    @Basic(optional = false)
    @Column(name = "archived")
    private boolean archived;
    @Lob
    @Column(name = "notes")
    private String notes;
    @Column(name = "color")
    private String color;
    @Basic(optional = false)
    @Column(name = "show_in_nav")
    private boolean showInNav;
    @Basic(optional = false)
    @Column(name = "default_label")
    private boolean defaultLabel;

    public StatusLabels(Integer id) {
        this.id = id;
    }

    public StatusLabels(Integer id, boolean deployable, boolean pending, boolean archived, boolean showInNav, boolean defaultLabel) {
        this.id = id;
        this.deployable = deployable;
        this.pending = pending;
        this.archived = archived;
        this.showInNav = showInNav;
        this.defaultLabel = defaultLabel;
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

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public boolean getDeployable() {
        return deployable;
    }

    public void setDeployable(boolean deployable) {
        this.deployable = deployable;
    }

    public boolean getPending() {
        return pending;
    }

    public void setPending(boolean pending) {
        this.pending = pending;
    }

    public boolean getArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getShowInNav() {
        return showInNav;
    }

    public void setShowInNav(boolean showInNav) {
        this.showInNav = showInNav;
    }

    public boolean getDefaultLabel() {
        return defaultLabel;
    }

    public void setDefaultLabel(boolean defaultLabel) {
        this.defaultLabel = defaultLabel;
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
        if (!(object instanceof StatusLabels)) {
            return false;
        }
        StatusLabels other = (StatusLabels) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.argacme.snipeit.model.StatusLabels[ id=" + id + " ]";
    }
    
}
