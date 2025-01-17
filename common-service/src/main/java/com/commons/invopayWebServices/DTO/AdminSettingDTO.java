/*
 * This file is generated by jOOQ.
 */
package com.commons.invopayWebServices.DTO;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdminSettingDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       adminSettingId;
    private Integer       type;
    private String        adminSettingKey;
    private String        adminSettingValue;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public AdminSettingDTO() {}

    public AdminSettingDTO(AdminSettingDTO value) {
        this.adminSettingId = value.adminSettingId;
        this.type = value.type;
        this.adminSettingKey = value.adminSettingKey;
        this.adminSettingValue = value.adminSettingValue;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public AdminSettingDTO(
        Integer       adminSettingId,
        Integer       type,
        String        adminSettingKey,
        String        adminSettingValue,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.adminSettingId = adminSettingId;
        this.type = type;
        this.adminSettingKey = adminSettingKey;
        this.adminSettingValue = adminSettingValue;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.admin_setting.admin_setting_id</code>.
     */
    public Integer getAdminSettingId() {
        return this.adminSettingId;
    }

    /**
     * Setter for <code>invopay.admin_setting.admin_setting_id</code>.
     */
    public AdminSettingDTO setAdminSettingId(Integer adminSettingId) {
        this.adminSettingId = adminSettingId;
        return this;
    }

    /**
     * Getter for <code>invopay.admin_setting.type</code>. 1-Admin,2-Client
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * Setter for <code>invopay.admin_setting.type</code>. 1-Admin,2-Client
     */
    public AdminSettingDTO setType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>invopay.admin_setting.admin_setting_key</code>.
     */
    public String getAdminSettingKey() {
        return this.adminSettingKey;
    }

    /**
     * Setter for <code>invopay.admin_setting.admin_setting_key</code>.
     */
    public AdminSettingDTO setAdminSettingKey(String adminSettingKey) {
        this.adminSettingKey = adminSettingKey;
        return this;
    }

    /**
     * Getter for <code>invopay.admin_setting.admin_setting_value</code>.
     */
    public String getAdminSettingValue() {
        return this.adminSettingValue;
    }

    /**
     * Setter for <code>invopay.admin_setting.admin_setting_value</code>.
     */
    public AdminSettingDTO setAdminSettingValue(String adminSettingValue) {
        this.adminSettingValue = adminSettingValue;
        return this;
    }

    /**
     * Getter for <code>invopay.admin_setting.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.admin_setting.ref_user_id</code>.
     */
    public AdminSettingDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.admin_setting.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.admin_setting.delete_status</code>.
     */
    public AdminSettingDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.admin_setting.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.admin_setting.transaction_id</code>.
     */
    public AdminSettingDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.admin_setting.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.admin_setting.added_date</code>.
     */
    public AdminSettingDTO setAddedDate(LocalDateTime addedDate) {
        this.addedDate = addedDate;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final AdminSettingDTO other = (AdminSettingDTO) obj;
        if (adminSettingId == null) {
            if (other.adminSettingId != null)
                return false;
        }
        else if (!adminSettingId.equals(other.adminSettingId))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        }
        else if (!type.equals(other.type))
            return false;
        if (adminSettingKey == null) {
            if (other.adminSettingKey != null)
                return false;
        }
        else if (!adminSettingKey.equals(other.adminSettingKey))
            return false;
        if (adminSettingValue == null) {
            if (other.adminSettingValue != null)
                return false;
        }
        else if (!adminSettingValue.equals(other.adminSettingValue))
            return false;
        if (refUserId == null) {
            if (other.refUserId != null)
                return false;
        }
        else if (!refUserId.equals(other.refUserId))
            return false;
        if (deleteStatus == null) {
            if (other.deleteStatus != null)
                return false;
        }
        else if (!deleteStatus.equals(other.deleteStatus))
            return false;
        if (transactionId == null) {
            if (other.transactionId != null)
                return false;
        }
        else if (!transactionId.equals(other.transactionId))
            return false;
        if (addedDate == null) {
            if (other.addedDate != null)
                return false;
        }
        else if (!addedDate.equals(other.addedDate))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.adminSettingId == null) ? 0 : this.adminSettingId.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.adminSettingKey == null) ? 0 : this.adminSettingKey.hashCode());
        result = prime * result + ((this.adminSettingValue == null) ? 0 : this.adminSettingValue.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AdminSetting (");

        sb.append(adminSettingId);
        sb.append(", ").append(type);
        sb.append(", ").append(adminSettingKey);
        sb.append(", ").append(adminSettingValue);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
