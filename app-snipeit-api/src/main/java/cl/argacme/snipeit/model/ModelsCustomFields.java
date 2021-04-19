/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.argacme.snipeit.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

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
@Table(name = "models_custom_fields")
public class ModelsCustomFields implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "asset_model_id")
    private int assetModelId;
    @Basic(optional = false)
    @Column(name = "custom_field_id")
    private int customFieldId;
    @Lob
    @Column(name = "default_value")
    private String defaultValue;

    public ModelsCustomFields(Integer id) {
        this.id = id;
    }

    public ModelsCustomFields(Integer id, int assetModelId, int customFieldId) {
        this.id = id;
        this.assetModelId = assetModelId;
        this.customFieldId = customFieldId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAssetModelId() {
        return assetModelId;
    }

    public void setAssetModelId(int assetModelId) {
        this.assetModelId = assetModelId;
    }

    public int getCustomFieldId() {
        return customFieldId;
    }

    public void setCustomFieldId(int customFieldId) {
        this.customFieldId = customFieldId;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
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
        if (!(object instanceof ModelsCustomFields)) {
            return false;
        }
        ModelsCustomFields other = (ModelsCustomFields) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.argacme.snipeit.model.ModelsCustomFields[ id=" + id + " ]";
    }
    
}
