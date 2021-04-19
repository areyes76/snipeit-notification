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
@Table(name = "settings")
public class Settings implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "user_id")
    private Integer userId;
    @Basic(optional = false)
    @Column(name = "per_page")
    private int perPage;
    @Basic(optional = false)
    @Column(name = "site_name")
    private String siteName;
    @Column(name = "qr_code")
    private Integer qrCode;
    @Column(name = "qr_text")
    private String qrText;
    @Column(name = "display_asset_name")
    private Integer displayAssetName;
    @Column(name = "display_checkout_date")
    private Integer displayCheckoutDate;
    @Column(name = "display_eol")
    private Integer displayEol;
    @Basic(optional = false)
    @Column(name = "auto_increment_assets")
    private int autoIncrementAssets;
    @Column(name = "auto_increment_prefix")
    private String autoIncrementPrefix;
    @Basic(optional = false)
    @Column(name = "load_remote")
    private boolean loadRemote;
    @Column(name = "logo")
    private String logo;
    @Column(name = "header_color")
    private String headerColor;
    @Column(name = "alert_email")
    private String alertEmail;
    @Basic(optional = false)
    @Column(name = "alerts_enabled")
    private boolean alertsEnabled;
    @Lob
    @Column(name = "default_eula_text")
    private String defaultEulaText;
    @Column(name = "barcode_type")
    private String barcodeType;
    @Column(name = "slack_endpoint")
    private String slackEndpoint;
    @Column(name = "slack_channel")
    private String slackChannel;
    @Column(name = "slack_botname")
    private String slackBotname;
    @Column(name = "default_currency")
    private String defaultCurrency;
    @Lob
    @Column(name = "custom_css")
    private String customCss;
    @Basic(optional = false)
    @Column(name = "brand")
    private short brand;
    @Column(name = "ldap_enabled")
    private String ldapEnabled;
    @Column(name = "ldap_server")
    private String ldapServer;
    @Column(name = "ldap_uname")
    private String ldapUname;
    @Lob
    @Column(name = "ldap_pword")
    private String ldapPword;
    @Column(name = "ldap_basedn")
    private String ldapBasedn;
    @Lob
    @Column(name = "ldap_filter")
    private String ldapFilter;
    @Column(name = "ldap_username_field")
    private String ldapUsernameField;
    @Column(name = "ldap_lname_field")
    private String ldapLnameField;
    @Column(name = "ldap_fname_field")
    private String ldapFnameField;
    @Column(name = "ldap_auth_filter_query")
    private String ldapAuthFilterQuery;
    @Column(name = "ldap_version")
    private Integer ldapVersion;
    @Column(name = "ldap_active_flag")
    private String ldapActiveFlag;
    @Column(name = "ldap_emp_num")
    private String ldapEmpNum;
    @Column(name = "ldap_email")
    private String ldapEmail;
    @Basic(optional = false)
    @Column(name = "full_multiple_companies_support")
    private boolean fullMultipleCompaniesSupport;
    @Basic(optional = false)
    @Column(name = "ldap_server_cert_ignore")
    private boolean ldapServerCertIgnore;
    @Column(name = "locale")
    private String locale;
    @Basic(optional = false)
    @Column(name = "labels_per_page")
    private short labelsPerPage;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "labels_width")
    private BigDecimal labelsWidth;
    @Basic(optional = false)
    @Column(name = "labels_height")
    private BigDecimal labelsHeight;
    @Basic(optional = false)
    @Column(name = "labels_pmargin_left")
    private BigDecimal labelsPmarginLeft;
    @Basic(optional = false)
    @Column(name = "labels_pmargin_right")
    private BigDecimal labelsPmarginRight;
    @Basic(optional = false)
    @Column(name = "labels_pmargin_top")
    private BigDecimal labelsPmarginTop;
    @Basic(optional = false)
    @Column(name = "labels_pmargin_bottom")
    private BigDecimal labelsPmarginBottom;
    @Basic(optional = false)
    @Column(name = "labels_display_bgutter")
    private BigDecimal labelsDisplayBgutter;
    @Basic(optional = false)
    @Column(name = "labels_display_sgutter")
    private BigDecimal labelsDisplaySgutter;
    @Basic(optional = false)
    @Column(name = "labels_fontsize")
    private short labelsFontsize;
    @Basic(optional = false)
    @Column(name = "labels_pagewidth")
    private BigDecimal labelsPagewidth;
    @Basic(optional = false)
    @Column(name = "labels_pageheight")
    private BigDecimal labelsPageheight;
    @Basic(optional = false)
    @Column(name = "labels_display_name")
    private short labelsDisplayName;
    @Basic(optional = false)
    @Column(name = "labels_display_serial")
    private short labelsDisplaySerial;
    @Basic(optional = false)
    @Column(name = "labels_display_tag")
    private short labelsDisplayTag;
    @Column(name = "alt_barcode")
    private String altBarcode;
    @Column(name = "alt_barcode_enabled")
    private Boolean altBarcodeEnabled;
    @Column(name = "alert_interval")
    private Integer alertInterval;
    @Column(name = "alert_threshold")
    private Integer alertThreshold;
    @Column(name = "email_domain")
    private String emailDomain;
    @Column(name = "email_format")
    private String emailFormat;
    @Column(name = "username_format")
    private String usernameFormat;
    @Basic(optional = false)
    @Column(name = "is_ad")
    private boolean isAd;
    @Column(name = "ad_domain")
    private String adDomain;
    @Basic(optional = false)
    @Column(name = "ldap_port")
    private String ldapPort;
    @Basic(optional = false)
    @Column(name = "ldap_tls")
    private boolean ldapTls;
    @Basic(optional = false)
    @Column(name = "zerofill_count")
    private int zerofillCount;
    @Basic(optional = false)
    @Column(name = "ldap_pw_sync")
    private boolean ldapPwSync;
    @Column(name = "two_factor_enabled")
    private Short twoFactorEnabled;
    @Basic(optional = false)
    @Column(name = "require_accept_signature")
    private boolean requireAcceptSignature;
    @Basic(optional = false)
    @Column(name = "date_display_format")
    private String dateDisplayFormat;
    @Basic(optional = false)
    @Column(name = "time_display_format")
    private String timeDisplayFormat;
    @Basic(optional = false)
    @Column(name = "next_auto_tag_base")
    private long nextAutoTagBase;
    @Lob
    @Column(name = "login_note")
    private String loginNote;
    @Column(name = "thumbnail_max_h")
    private Integer thumbnailMaxH;
    @Basic(optional = false)
    @Column(name = "pwd_secure_uncommon")
    private boolean pwdSecureUncommon;
    @Column(name = "pwd_secure_complexity")
    private String pwdSecureComplexity;
    @Basic(optional = false)
    @Column(name = "pwd_secure_min")
    private int pwdSecureMin;
    @Column(name = "audit_interval")
    private Integer auditInterval;
    @Column(name = "audit_warning_days")
    private Integer auditWarningDays;
    @Basic(optional = false)
    @Column(name = "show_url_in_emails")
    private boolean showUrlInEmails;
    @Column(name = "custom_forgot_pass_url")
    private String customForgotPassUrl;
    @Basic(optional = false)
    @Column(name = "show_alerts_in_menu")
    private boolean showAlertsInMenu;
    @Basic(optional = false)
    @Column(name = "labels_display_company_name")
    private boolean labelsDisplayCompanyName;
    @Basic(optional = false)
    @Column(name = "show_archived_in_list")
    private boolean showArchivedInList;
    @Lob
    @Column(name = "dashboard_message")
    private String dashboardMessage;
    @Column(name = "support_footer")
    private String supportFooter;
    @Lob
    @Column(name = "footer_text")
    private String footerText;
    @Column(name = "modellist_displays")
    private String modellistDisplays;
    @Basic(optional = false)
    @Column(name = "login_remote_user_enabled")
    private boolean loginRemoteUserEnabled;
    @Basic(optional = false)
    @Column(name = "login_common_disabled")
    private boolean loginCommonDisabled;
    @Basic(optional = false)
    @Column(name = "login_remote_user_custom_logout_url")
    private String loginRemoteUserCustomLogoutUrl;
    @Column(name = "skin")
    private String skin;
    @Basic(optional = false)
    @Column(name = "show_images_in_email")
    private boolean showImagesInEmail;
    @Column(name = "admin_cc_email")
    private String adminCcEmail;
    @Basic(optional = false)
    @Column(name = "labels_display_model")
    private boolean labelsDisplayModel;
    @Column(name = "privacy_policy_link")
    private String privacyPolicyLink;
    @Column(name = "version_footer")
    private String versionFooter;
    @Basic(optional = false)
    @Column(name = "unique_serial")
    private boolean uniqueSerial;
    @Basic(optional = false)
    @Column(name = "logo_print_assets")
    private boolean logoPrintAssets;

    public Settings(Integer id) {
        this.id = id;
    }

    public Settings(Integer id, int perPage, String siteName, int autoIncrementAssets, boolean loadRemote, boolean alertsEnabled, short brand, boolean fullMultipleCompaniesSupport, boolean ldapServerCertIgnore, short labelsPerPage, BigDecimal labelsWidth, BigDecimal labelsHeight, BigDecimal labelsPmarginLeft, BigDecimal labelsPmarginRight, BigDecimal labelsPmarginTop, BigDecimal labelsPmarginBottom, BigDecimal labelsDisplayBgutter, BigDecimal labelsDisplaySgutter, short labelsFontsize, BigDecimal labelsPagewidth, BigDecimal labelsPageheight, short labelsDisplayName, short labelsDisplaySerial, short labelsDisplayTag, boolean isAd, String ldapPort, boolean ldapTls, int zerofillCount, boolean ldapPwSync, boolean requireAcceptSignature, String dateDisplayFormat, String timeDisplayFormat, long nextAutoTagBase, boolean pwdSecureUncommon, int pwdSecureMin, boolean showUrlInEmails, boolean showAlertsInMenu, boolean labelsDisplayCompanyName, boolean showArchivedInList, boolean loginRemoteUserEnabled, boolean loginCommonDisabled, String loginRemoteUserCustomLogoutUrl, boolean showImagesInEmail, boolean labelsDisplayModel, boolean uniqueSerial, boolean logoPrintAssets) {
        this.id = id;
        this.perPage = perPage;
        this.siteName = siteName;
        this.autoIncrementAssets = autoIncrementAssets;
        this.loadRemote = loadRemote;
        this.alertsEnabled = alertsEnabled;
        this.brand = brand;
        this.fullMultipleCompaniesSupport = fullMultipleCompaniesSupport;
        this.ldapServerCertIgnore = ldapServerCertIgnore;
        this.labelsPerPage = labelsPerPage;
        this.labelsWidth = labelsWidth;
        this.labelsHeight = labelsHeight;
        this.labelsPmarginLeft = labelsPmarginLeft;
        this.labelsPmarginRight = labelsPmarginRight;
        this.labelsPmarginTop = labelsPmarginTop;
        this.labelsPmarginBottom = labelsPmarginBottom;
        this.labelsDisplayBgutter = labelsDisplayBgutter;
        this.labelsDisplaySgutter = labelsDisplaySgutter;
        this.labelsFontsize = labelsFontsize;
        this.labelsPagewidth = labelsPagewidth;
        this.labelsPageheight = labelsPageheight;
        this.labelsDisplayName = labelsDisplayName;
        this.labelsDisplaySerial = labelsDisplaySerial;
        this.labelsDisplayTag = labelsDisplayTag;
        this.isAd = isAd;
        this.ldapPort = ldapPort;
        this.ldapTls = ldapTls;
        this.zerofillCount = zerofillCount;
        this.ldapPwSync = ldapPwSync;
        this.requireAcceptSignature = requireAcceptSignature;
        this.dateDisplayFormat = dateDisplayFormat;
        this.timeDisplayFormat = timeDisplayFormat;
        this.nextAutoTagBase = nextAutoTagBase;
        this.pwdSecureUncommon = pwdSecureUncommon;
        this.pwdSecureMin = pwdSecureMin;
        this.showUrlInEmails = showUrlInEmails;
        this.showAlertsInMenu = showAlertsInMenu;
        this.labelsDisplayCompanyName = labelsDisplayCompanyName;
        this.showArchivedInList = showArchivedInList;
        this.loginRemoteUserEnabled = loginRemoteUserEnabled;
        this.loginCommonDisabled = loginCommonDisabled;
        this.loginRemoteUserCustomLogoutUrl = loginRemoteUserCustomLogoutUrl;
        this.showImagesInEmail = showImagesInEmail;
        this.labelsDisplayModel = labelsDisplayModel;
        this.uniqueSerial = uniqueSerial;
        this.logoPrintAssets = logoPrintAssets;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public Integer getQrCode() {
        return qrCode;
    }

    public void setQrCode(Integer qrCode) {
        this.qrCode = qrCode;
    }

    public String getQrText() {
        return qrText;
    }

    public void setQrText(String qrText) {
        this.qrText = qrText;
    }

    public Integer getDisplayAssetName() {
        return displayAssetName;
    }

    public void setDisplayAssetName(Integer displayAssetName) {
        this.displayAssetName = displayAssetName;
    }

    public Integer getDisplayCheckoutDate() {
        return displayCheckoutDate;
    }

    public void setDisplayCheckoutDate(Integer displayCheckoutDate) {
        this.displayCheckoutDate = displayCheckoutDate;
    }

    public Integer getDisplayEol() {
        return displayEol;
    }

    public void setDisplayEol(Integer displayEol) {
        this.displayEol = displayEol;
    }

    public int getAutoIncrementAssets() {
        return autoIncrementAssets;
    }

    public void setAutoIncrementAssets(int autoIncrementAssets) {
        this.autoIncrementAssets = autoIncrementAssets;
    }

    public String getAutoIncrementPrefix() {
        return autoIncrementPrefix;
    }

    public void setAutoIncrementPrefix(String autoIncrementPrefix) {
        this.autoIncrementPrefix = autoIncrementPrefix;
    }

    public boolean getLoadRemote() {
        return loadRemote;
    }

    public void setLoadRemote(boolean loadRemote) {
        this.loadRemote = loadRemote;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getHeaderColor() {
        return headerColor;
    }

    public void setHeaderColor(String headerColor) {
        this.headerColor = headerColor;
    }

    public String getAlertEmail() {
        return alertEmail;
    }

    public void setAlertEmail(String alertEmail) {
        this.alertEmail = alertEmail;
    }

    public boolean getAlertsEnabled() {
        return alertsEnabled;
    }

    public void setAlertsEnabled(boolean alertsEnabled) {
        this.alertsEnabled = alertsEnabled;
    }

    public String getDefaultEulaText() {
        return defaultEulaText;
    }

    public void setDefaultEulaText(String defaultEulaText) {
        this.defaultEulaText = defaultEulaText;
    }

    public String getBarcodeType() {
        return barcodeType;
    }

    public void setBarcodeType(String barcodeType) {
        this.barcodeType = barcodeType;
    }

    public String getSlackEndpoint() {
        return slackEndpoint;
    }

    public void setSlackEndpoint(String slackEndpoint) {
        this.slackEndpoint = slackEndpoint;
    }

    public String getSlackChannel() {
        return slackChannel;
    }

    public void setSlackChannel(String slackChannel) {
        this.slackChannel = slackChannel;
    }

    public String getSlackBotname() {
        return slackBotname;
    }

    public void setSlackBotname(String slackBotname) {
        this.slackBotname = slackBotname;
    }

    public String getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public String getCustomCss() {
        return customCss;
    }

    public void setCustomCss(String customCss) {
        this.customCss = customCss;
    }

    public short getBrand() {
        return brand;
    }

    public void setBrand(short brand) {
        this.brand = brand;
    }

    public String getLdapEnabled() {
        return ldapEnabled;
    }

    public void setLdapEnabled(String ldapEnabled) {
        this.ldapEnabled = ldapEnabled;
    }

    public String getLdapServer() {
        return ldapServer;
    }

    public void setLdapServer(String ldapServer) {
        this.ldapServer = ldapServer;
    }

    public String getLdapUname() {
        return ldapUname;
    }

    public void setLdapUname(String ldapUname) {
        this.ldapUname = ldapUname;
    }

    public String getLdapPword() {
        return ldapPword;
    }

    public void setLdapPword(String ldapPword) {
        this.ldapPword = ldapPword;
    }

    public String getLdapBasedn() {
        return ldapBasedn;
    }

    public void setLdapBasedn(String ldapBasedn) {
        this.ldapBasedn = ldapBasedn;
    }

    public String getLdapFilter() {
        return ldapFilter;
    }

    public void setLdapFilter(String ldapFilter) {
        this.ldapFilter = ldapFilter;
    }

    public String getLdapUsernameField() {
        return ldapUsernameField;
    }

    public void setLdapUsernameField(String ldapUsernameField) {
        this.ldapUsernameField = ldapUsernameField;
    }

    public String getLdapLnameField() {
        return ldapLnameField;
    }

    public void setLdapLnameField(String ldapLnameField) {
        this.ldapLnameField = ldapLnameField;
    }

    public String getLdapFnameField() {
        return ldapFnameField;
    }

    public void setLdapFnameField(String ldapFnameField) {
        this.ldapFnameField = ldapFnameField;
    }

    public String getLdapAuthFilterQuery() {
        return ldapAuthFilterQuery;
    }

    public void setLdapAuthFilterQuery(String ldapAuthFilterQuery) {
        this.ldapAuthFilterQuery = ldapAuthFilterQuery;
    }

    public Integer getLdapVersion() {
        return ldapVersion;
    }

    public void setLdapVersion(Integer ldapVersion) {
        this.ldapVersion = ldapVersion;
    }

    public String getLdapActiveFlag() {
        return ldapActiveFlag;
    }

    public void setLdapActiveFlag(String ldapActiveFlag) {
        this.ldapActiveFlag = ldapActiveFlag;
    }

    public String getLdapEmpNum() {
        return ldapEmpNum;
    }

    public void setLdapEmpNum(String ldapEmpNum) {
        this.ldapEmpNum = ldapEmpNum;
    }

    public String getLdapEmail() {
        return ldapEmail;
    }

    public void setLdapEmail(String ldapEmail) {
        this.ldapEmail = ldapEmail;
    }

    public boolean getFullMultipleCompaniesSupport() {
        return fullMultipleCompaniesSupport;
    }

    public void setFullMultipleCompaniesSupport(boolean fullMultipleCompaniesSupport) {
        this.fullMultipleCompaniesSupport = fullMultipleCompaniesSupport;
    }

    public boolean getLdapServerCertIgnore() {
        return ldapServerCertIgnore;
    }

    public void setLdapServerCertIgnore(boolean ldapServerCertIgnore) {
        this.ldapServerCertIgnore = ldapServerCertIgnore;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public short getLabelsPerPage() {
        return labelsPerPage;
    }

    public void setLabelsPerPage(short labelsPerPage) {
        this.labelsPerPage = labelsPerPage;
    }

    public BigDecimal getLabelsWidth() {
        return labelsWidth;
    }

    public void setLabelsWidth(BigDecimal labelsWidth) {
        this.labelsWidth = labelsWidth;
    }

    public BigDecimal getLabelsHeight() {
        return labelsHeight;
    }

    public void setLabelsHeight(BigDecimal labelsHeight) {
        this.labelsHeight = labelsHeight;
    }

    public BigDecimal getLabelsPmarginLeft() {
        return labelsPmarginLeft;
    }

    public void setLabelsPmarginLeft(BigDecimal labelsPmarginLeft) {
        this.labelsPmarginLeft = labelsPmarginLeft;
    }

    public BigDecimal getLabelsPmarginRight() {
        return labelsPmarginRight;
    }

    public void setLabelsPmarginRight(BigDecimal labelsPmarginRight) {
        this.labelsPmarginRight = labelsPmarginRight;
    }

    public BigDecimal getLabelsPmarginTop() {
        return labelsPmarginTop;
    }

    public void setLabelsPmarginTop(BigDecimal labelsPmarginTop) {
        this.labelsPmarginTop = labelsPmarginTop;
    }

    public BigDecimal getLabelsPmarginBottom() {
        return labelsPmarginBottom;
    }

    public void setLabelsPmarginBottom(BigDecimal labelsPmarginBottom) {
        this.labelsPmarginBottom = labelsPmarginBottom;
    }

    public BigDecimal getLabelsDisplayBgutter() {
        return labelsDisplayBgutter;
    }

    public void setLabelsDisplayBgutter(BigDecimal labelsDisplayBgutter) {
        this.labelsDisplayBgutter = labelsDisplayBgutter;
    }

    public BigDecimal getLabelsDisplaySgutter() {
        return labelsDisplaySgutter;
    }

    public void setLabelsDisplaySgutter(BigDecimal labelsDisplaySgutter) {
        this.labelsDisplaySgutter = labelsDisplaySgutter;
    }

    public short getLabelsFontsize() {
        return labelsFontsize;
    }

    public void setLabelsFontsize(short labelsFontsize) {
        this.labelsFontsize = labelsFontsize;
    }

    public BigDecimal getLabelsPagewidth() {
        return labelsPagewidth;
    }

    public void setLabelsPagewidth(BigDecimal labelsPagewidth) {
        this.labelsPagewidth = labelsPagewidth;
    }

    public BigDecimal getLabelsPageheight() {
        return labelsPageheight;
    }

    public void setLabelsPageheight(BigDecimal labelsPageheight) {
        this.labelsPageheight = labelsPageheight;
    }

    public short getLabelsDisplayName() {
        return labelsDisplayName;
    }

    public void setLabelsDisplayName(short labelsDisplayName) {
        this.labelsDisplayName = labelsDisplayName;
    }

    public short getLabelsDisplaySerial() {
        return labelsDisplaySerial;
    }

    public void setLabelsDisplaySerial(short labelsDisplaySerial) {
        this.labelsDisplaySerial = labelsDisplaySerial;
    }

    public short getLabelsDisplayTag() {
        return labelsDisplayTag;
    }

    public void setLabelsDisplayTag(short labelsDisplayTag) {
        this.labelsDisplayTag = labelsDisplayTag;
    }

    public String getAltBarcode() {
        return altBarcode;
    }

    public void setAltBarcode(String altBarcode) {
        this.altBarcode = altBarcode;
    }

    public Boolean getAltBarcodeEnabled() {
        return altBarcodeEnabled;
    }

    public void setAltBarcodeEnabled(Boolean altBarcodeEnabled) {
        this.altBarcodeEnabled = altBarcodeEnabled;
    }

    public Integer getAlertInterval() {
        return alertInterval;
    }

    public void setAlertInterval(Integer alertInterval) {
        this.alertInterval = alertInterval;
    }

    public Integer getAlertThreshold() {
        return alertThreshold;
    }

    public void setAlertThreshold(Integer alertThreshold) {
        this.alertThreshold = alertThreshold;
    }

    public String getEmailDomain() {
        return emailDomain;
    }

    public void setEmailDomain(String emailDomain) {
        this.emailDomain = emailDomain;
    }

    public String getEmailFormat() {
        return emailFormat;
    }

    public void setEmailFormat(String emailFormat) {
        this.emailFormat = emailFormat;
    }

    public String getUsernameFormat() {
        return usernameFormat;
    }

    public void setUsernameFormat(String usernameFormat) {
        this.usernameFormat = usernameFormat;
    }

    public boolean getIsAd() {
        return isAd;
    }

    public void setIsAd(boolean isAd) {
        this.isAd = isAd;
    }

    public String getAdDomain() {
        return adDomain;
    }

    public void setAdDomain(String adDomain) {
        this.adDomain = adDomain;
    }

    public String getLdapPort() {
        return ldapPort;
    }

    public void setLdapPort(String ldapPort) {
        this.ldapPort = ldapPort;
    }

    public boolean getLdapTls() {
        return ldapTls;
    }

    public void setLdapTls(boolean ldapTls) {
        this.ldapTls = ldapTls;
    }

    public int getZerofillCount() {
        return zerofillCount;
    }

    public void setZerofillCount(int zerofillCount) {
        this.zerofillCount = zerofillCount;
    }

    public boolean getLdapPwSync() {
        return ldapPwSync;
    }

    public void setLdapPwSync(boolean ldapPwSync) {
        this.ldapPwSync = ldapPwSync;
    }

    public Short getTwoFactorEnabled() {
        return twoFactorEnabled;
    }

    public void setTwoFactorEnabled(Short twoFactorEnabled) {
        this.twoFactorEnabled = twoFactorEnabled;
    }

    public boolean getRequireAcceptSignature() {
        return requireAcceptSignature;
    }

    public void setRequireAcceptSignature(boolean requireAcceptSignature) {
        this.requireAcceptSignature = requireAcceptSignature;
    }

    public String getDateDisplayFormat() {
        return dateDisplayFormat;
    }

    public void setDateDisplayFormat(String dateDisplayFormat) {
        this.dateDisplayFormat = dateDisplayFormat;
    }

    public String getTimeDisplayFormat() {
        return timeDisplayFormat;
    }

    public void setTimeDisplayFormat(String timeDisplayFormat) {
        this.timeDisplayFormat = timeDisplayFormat;
    }

    public long getNextAutoTagBase() {
        return nextAutoTagBase;
    }

    public void setNextAutoTagBase(long nextAutoTagBase) {
        this.nextAutoTagBase = nextAutoTagBase;
    }

    public String getLoginNote() {
        return loginNote;
    }

    public void setLoginNote(String loginNote) {
        this.loginNote = loginNote;
    }

    public Integer getThumbnailMaxH() {
        return thumbnailMaxH;
    }

    public void setThumbnailMaxH(Integer thumbnailMaxH) {
        this.thumbnailMaxH = thumbnailMaxH;
    }

    public boolean getPwdSecureUncommon() {
        return pwdSecureUncommon;
    }

    public void setPwdSecureUncommon(boolean pwdSecureUncommon) {
        this.pwdSecureUncommon = pwdSecureUncommon;
    }

    public String getPwdSecureComplexity() {
        return pwdSecureComplexity;
    }

    public void setPwdSecureComplexity(String pwdSecureComplexity) {
        this.pwdSecureComplexity = pwdSecureComplexity;
    }

    public int getPwdSecureMin() {
        return pwdSecureMin;
    }

    public void setPwdSecureMin(int pwdSecureMin) {
        this.pwdSecureMin = pwdSecureMin;
    }

    public Integer getAuditInterval() {
        return auditInterval;
    }

    public void setAuditInterval(Integer auditInterval) {
        this.auditInterval = auditInterval;
    }

    public Integer getAuditWarningDays() {
        return auditWarningDays;
    }

    public void setAuditWarningDays(Integer auditWarningDays) {
        this.auditWarningDays = auditWarningDays;
    }

    public boolean getShowUrlInEmails() {
        return showUrlInEmails;
    }

    public void setShowUrlInEmails(boolean showUrlInEmails) {
        this.showUrlInEmails = showUrlInEmails;
    }

    public String getCustomForgotPassUrl() {
        return customForgotPassUrl;
    }

    public void setCustomForgotPassUrl(String customForgotPassUrl) {
        this.customForgotPassUrl = customForgotPassUrl;
    }

    public boolean getShowAlertsInMenu() {
        return showAlertsInMenu;
    }

    public void setShowAlertsInMenu(boolean showAlertsInMenu) {
        this.showAlertsInMenu = showAlertsInMenu;
    }

    public boolean getLabelsDisplayCompanyName() {
        return labelsDisplayCompanyName;
    }

    public void setLabelsDisplayCompanyName(boolean labelsDisplayCompanyName) {
        this.labelsDisplayCompanyName = labelsDisplayCompanyName;
    }

    public boolean getShowArchivedInList() {
        return showArchivedInList;
    }

    public void setShowArchivedInList(boolean showArchivedInList) {
        this.showArchivedInList = showArchivedInList;
    }

    public String getDashboardMessage() {
        return dashboardMessage;
    }

    public void setDashboardMessage(String dashboardMessage) {
        this.dashboardMessage = dashboardMessage;
    }

    public String getSupportFooter() {
        return supportFooter;
    }

    public void setSupportFooter(String supportFooter) {
        this.supportFooter = supportFooter;
    }

    public String getFooterText() {
        return footerText;
    }

    public void setFooterText(String footerText) {
        this.footerText = footerText;
    }

    public String getModellistDisplays() {
        return modellistDisplays;
    }

    public void setModellistDisplays(String modellistDisplays) {
        this.modellistDisplays = modellistDisplays;
    }

    public boolean getLoginRemoteUserEnabled() {
        return loginRemoteUserEnabled;
    }

    public void setLoginRemoteUserEnabled(boolean loginRemoteUserEnabled) {
        this.loginRemoteUserEnabled = loginRemoteUserEnabled;
    }

    public boolean getLoginCommonDisabled() {
        return loginCommonDisabled;
    }

    public void setLoginCommonDisabled(boolean loginCommonDisabled) {
        this.loginCommonDisabled = loginCommonDisabled;
    }

    public String getLoginRemoteUserCustomLogoutUrl() {
        return loginRemoteUserCustomLogoutUrl;
    }

    public void setLoginRemoteUserCustomLogoutUrl(String loginRemoteUserCustomLogoutUrl) {
        this.loginRemoteUserCustomLogoutUrl = loginRemoteUserCustomLogoutUrl;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public boolean getShowImagesInEmail() {
        return showImagesInEmail;
    }

    public void setShowImagesInEmail(boolean showImagesInEmail) {
        this.showImagesInEmail = showImagesInEmail;
    }

    public String getAdminCcEmail() {
        return adminCcEmail;
    }

    public void setAdminCcEmail(String adminCcEmail) {
        this.adminCcEmail = adminCcEmail;
    }

    public boolean getLabelsDisplayModel() {
        return labelsDisplayModel;
    }

    public void setLabelsDisplayModel(boolean labelsDisplayModel) {
        this.labelsDisplayModel = labelsDisplayModel;
    }

    public String getPrivacyPolicyLink() {
        return privacyPolicyLink;
    }

    public void setPrivacyPolicyLink(String privacyPolicyLink) {
        this.privacyPolicyLink = privacyPolicyLink;
    }

    public String getVersionFooter() {
        return versionFooter;
    }

    public void setVersionFooter(String versionFooter) {
        this.versionFooter = versionFooter;
    }

    public boolean getUniqueSerial() {
        return uniqueSerial;
    }

    public void setUniqueSerial(boolean uniqueSerial) {
        this.uniqueSerial = uniqueSerial;
    }

    public boolean getLogoPrintAssets() {
        return logoPrintAssets;
    }

    public void setLogoPrintAssets(boolean logoPrintAssets) {
        this.logoPrintAssets = logoPrintAssets;
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
        if (!(object instanceof Settings)) {
            return false;
        }
        Settings other = (Settings) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.argacme.snipeit.model.Settings[ id=" + id + " ]";
    }
    
}
