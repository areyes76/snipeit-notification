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
@Table(name = "categories")
public class Categories implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "deleted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;
    @Lob
    @Column(name = "eula_text")
    private String eulaText;
    @Basic(optional = false)
    @Column(name = "use_default_eula")
    private boolean useDefaultEula;
    @Basic(optional = false)
    @Column(name = "require_acceptance")
    private boolean requireAcceptance;
    @Column(name = "category_type")
    private String categoryType;
    @Basic(optional = false)
    @Column(name = "checkin_email")
    private boolean checkinEmail;
    @Column(name = "image")
    private String image;

    public Categories(Integer id) {
        this.id = id;
    }

    public Categories(Integer id, String name, boolean useDefaultEula, boolean requireAcceptance, boolean checkinEmail) {
        this.id = id;
        this.name = name;
        this.useDefaultEula = useDefaultEula;
        this.requireAcceptance = requireAcceptance;
        this.checkinEmail = checkinEmail;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getEulaText() {
        return eulaText;
    }

    public void setEulaText(String eulaText) {
        this.eulaText = eulaText;
    }

    public boolean getUseDefaultEula() {
        return useDefaultEula;
    }

    public void setUseDefaultEula(boolean useDefaultEula) {
        this.useDefaultEula = useDefaultEula;
    }

    public boolean getRequireAcceptance() {
        return requireAcceptance;
    }

    public void setRequireAcceptance(boolean requireAcceptance) {
        this.requireAcceptance = requireAcceptance;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public boolean getCheckinEmail() {
        return checkinEmail;
    }

    public void setCheckinEmail(boolean checkinEmail) {
        this.checkinEmail = checkinEmail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
        if (!(object instanceof Categories)) {
            return false;
        }
        Categories other = (Categories) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.argacme.snipeit.model.Categories[ id=" + id + " ]";
    }
    
}
