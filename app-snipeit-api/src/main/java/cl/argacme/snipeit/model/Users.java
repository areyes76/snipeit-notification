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
@Table(name = "users")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Lob
    @Column(name = "permissions")
    private String permissions;
    @Basic(optional = false)
    @Column(name = "activated")
    private boolean activated;
    @Column(name = "activation_code")
    private String activationCode;
    @Column(name = "activated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date activatedAt;
    @Column(name = "last_login")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;
    @Column(name = "persist_code")
    private String persistCode;
    @Column(name = "reset_password_code")
    private String resetPasswordCode;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "deleted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;
    @Column(name = "website")
    private String website;
    @Column(name = "country")
    private String country;
    @Column(name = "gravatar")
    private String gravatar;
    @Column(name = "location_id")
    private Integer locationId;
    @Column(name = "phone")
    private String phone;
    @Column(name = "jobtitle")
    private String jobtitle;
    @Column(name = "manager_id")
    private Integer managerId;
    @Lob
    @Column(name = "employee_num")
    private String employeeNum;
    @Column(name = "avatar")
    private String avatar;
    @Column(name = "username")
    private String username;
    @Lob
    @Column(name = "notes")
    private String notes;
    @Column(name = "company_id")
    private Integer companyId;
    @Lob
    @Column(name = "remember_token")
    private String rememberToken;
    @Basic(optional = false)
    @Column(name = "ldap_import")
    private boolean ldapImport;
    @Column(name = "locale")
    private String locale;
    @Basic(optional = false)
    @Column(name = "show_in_list")
    private boolean showInList;
    @Column(name = "two_factor_secret")
    private String twoFactorSecret;
    @Basic(optional = false)
    @Column(name = "two_factor_enrolled")
    private boolean twoFactorEnrolled;
    @Basic(optional = false)
    @Column(name = "two_factor_optin")
    private boolean twoFactorOptin;
    @Column(name = "department_id")
    private Integer departmentId;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zip")
    private String zip;

    public Users(Integer id) {
        this.id = id;
    }

    public Users(Integer id, String password, boolean activated, boolean ldapImport, boolean showInList, boolean twoFactorEnrolled, boolean twoFactorOptin) {
        this.id = id;
        this.password = password;
        this.activated = activated;
        this.ldapImport = ldapImport;
        this.showInList = showInList;
        this.twoFactorEnrolled = twoFactorEnrolled;
        this.twoFactorOptin = twoFactorOptin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public boolean getActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public Date getActivatedAt() {
        return activatedAt;
    }

    public void setActivatedAt(Date activatedAt) {
        this.activatedAt = activatedAt;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getPersistCode() {
        return persistCode;
    }

    public void setPersistCode(String persistCode) {
        this.persistCode = persistCode;
    }

    public String getResetPasswordCode() {
        return resetPasswordCode;
    }

    public void setResetPasswordCode(String resetPasswordCode) {
        this.resetPasswordCode = resetPasswordCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGravatar() {
        return gravatar;
    }

    public void setGravatar(String gravatar) {
        this.gravatar = gravatar;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken;
    }

    public boolean getLdapImport() {
        return ldapImport;
    }

    public void setLdapImport(boolean ldapImport) {
        this.ldapImport = ldapImport;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public boolean getShowInList() {
        return showInList;
    }

    public void setShowInList(boolean showInList) {
        this.showInList = showInList;
    }

    public String getTwoFactorSecret() {
        return twoFactorSecret;
    }

    public void setTwoFactorSecret(String twoFactorSecret) {
        this.twoFactorSecret = twoFactorSecret;
    }

    public boolean getTwoFactorEnrolled() {
        return twoFactorEnrolled;
    }

    public void setTwoFactorEnrolled(boolean twoFactorEnrolled) {
        this.twoFactorEnrolled = twoFactorEnrolled;
    }

    public boolean getTwoFactorOptin() {
        return twoFactorOptin;
    }

    public void setTwoFactorOptin(boolean twoFactorOptin) {
        this.twoFactorOptin = twoFactorOptin;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
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
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.argacme.snipeit.model.Users[ id=" + id + " ]";
    }
    
}
