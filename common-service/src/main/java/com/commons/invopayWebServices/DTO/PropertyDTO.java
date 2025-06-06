/*
 * This file is generated by jOOQ.
 */
package com.commons.invopayWebServices.DTO;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PropertyDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       propertyId;
    private String        propertyName;
    private LocalDate     propertyInstallationDate;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;
    private Integer       refPropertyObjectId;

    public PropertyDTO() {}

    public PropertyDTO(PropertyDTO value) {
        this.propertyId = value.propertyId;
        this.propertyName = value.propertyName;
        this.propertyInstallationDate = value.propertyInstallationDate;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
        this.refPropertyObjectId = value.refPropertyObjectId;
    }

    public PropertyDTO(
        Integer       propertyId,
        String        propertyName,
        LocalDate     propertyInstallationDate,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate,
        Integer       refPropertyObjectId
    ) {
        this.propertyId = propertyId;
        this.propertyName = propertyName;
        this.propertyInstallationDate = propertyInstallationDate;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
        this.refPropertyObjectId = refPropertyObjectId;
    }

    /**
     * Getter for <code>invopay.property.property_id</code>.
     */
    public Integer getPropertyId() {
        return this.propertyId;
    }

    /**
     * Setter for <code>invopay.property.property_id</code>.
     */
    public PropertyDTO setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    /**
     * Getter for <code>invopay.property.property_name</code>. Property Name
     */
    public String getPropertyName() {
        return this.propertyName;
    }

    /**
     * Setter for <code>invopay.property.property_name</code>. Property Name
     */
    public PropertyDTO setPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    /**
     * Getter for <code>invopay.property.property_installation_date</code>.
     */
    public LocalDate getPropertyInstallationDate() {
        return this.propertyInstallationDate;
    }

    /**
     * Setter for <code>invopay.property.property_installation_date</code>.
     */
    public PropertyDTO setPropertyInstallationDate(LocalDate propertyInstallationDate) {
        this.propertyInstallationDate = propertyInstallationDate;
        return this;
    }

    /**
     * Getter for <code>invopay.property.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.property.ref_user_id</code>.
     */
    public PropertyDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.property.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.property.delete_status</code>.
     */
    public PropertyDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.property.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.property.transaction_id</code>.
     */
    public PropertyDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.property.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.property.added_date</code>.
     */
    public PropertyDTO setAddedDate(LocalDateTime addedDate) {
        this.addedDate = addedDate;
        return this;
    }

    /**
     * Getter for <code>invopay.property.ref_property_object_id</code>.
     */
    public Integer getRefPropertyObjectId() {
        return this.refPropertyObjectId;
    }

    /**
     * Setter for <code>invopay.property.ref_property_object_id</code>.
     */
    public PropertyDTO setRefPropertyObjectId(Integer refPropertyObjectId) {
        this.refPropertyObjectId = refPropertyObjectId;
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
        final PropertyDTO other = (PropertyDTO) obj;
        if (propertyId == null) {
            if (other.propertyId != null)
                return false;
        }
        else if (!propertyId.equals(other.propertyId))
            return false;
        if (propertyName == null) {
            if (other.propertyName != null)
                return false;
        }
        else if (!propertyName.equals(other.propertyName))
            return false;
        if (propertyInstallationDate == null) {
            if (other.propertyInstallationDate != null)
                return false;
        }
        else if (!propertyInstallationDate.equals(other.propertyInstallationDate))
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
        if (refPropertyObjectId == null) {
            if (other.refPropertyObjectId != null)
                return false;
        }
        else if (!refPropertyObjectId.equals(other.refPropertyObjectId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.propertyId == null) ? 0 : this.propertyId.hashCode());
        result = prime * result + ((this.propertyName == null) ? 0 : this.propertyName.hashCode());
        result = prime * result + ((this.propertyInstallationDate == null) ? 0 : this.propertyInstallationDate.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        result = prime * result + ((this.refPropertyObjectId == null) ? 0 : this.refPropertyObjectId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Property (");

        sb.append(propertyId);
        sb.append(", ").append(propertyName);
        sb.append(", ").append(propertyInstallationDate);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);
        sb.append(", ").append(refPropertyObjectId);

        sb.append(")");
        return sb.toString();
    }
}
