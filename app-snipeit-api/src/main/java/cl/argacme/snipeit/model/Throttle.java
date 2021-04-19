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
@Table(name = "throttle")
public class Throttle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "ip_address")
    private String ipAddress;
    @Basic(optional = false)
    @Column(name = "attempts")
    private int attempts;
    @Basic(optional = false)
    @Column(name = "suspended")
    private boolean suspended;
    @Basic(optional = false)
    @Column(name = "banned")
    private boolean banned;
    @Column(name = "last_attempt_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastAttemptAt;
    @Column(name = "suspended_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date suspendedAt;
    @Column(name = "banned_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bannedAt;

    public Throttle(Integer id) {
        this.id = id;
    }

    public Throttle(Integer id, int attempts, boolean suspended, boolean banned) {
        this.id = id;
        this.attempts = attempts;
        this.suspended = suspended;
        this.banned = banned;
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

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public boolean getSuspended() {
        return suspended;
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }

    public boolean getBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }

    public Date getLastAttemptAt() {
        return lastAttemptAt;
    }

    public void setLastAttemptAt(Date lastAttemptAt) {
        this.lastAttemptAt = lastAttemptAt;
    }

    public Date getSuspendedAt() {
        return suspendedAt;
    }

    public void setSuspendedAt(Date suspendedAt) {
        this.suspendedAt = suspendedAt;
    }

    public Date getBannedAt() {
        return bannedAt;
    }

    public void setBannedAt(Date bannedAt) {
        this.bannedAt = bannedAt;
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
        if (!(object instanceof Throttle)) {
            return false;
        }
        Throttle other = (Throttle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.argacme.snipeit.model.Throttle[ id=" + id + " ]";
    }
    
}
