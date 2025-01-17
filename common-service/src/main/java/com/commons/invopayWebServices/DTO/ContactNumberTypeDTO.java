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
public class ContactNumberTypeDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       contactNumberTypeId;
    private String        contactNumberTypeName;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public ContactNumberTypeDTO() {}

    public ContactNumberTypeDTO(ContactNumberTypeDTO value) {
        this.contactNumberTypeId = value.contactNumberTypeId;
        this.contactNumberTypeName = value.contactNumberTypeName;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public ContactNumberTypeDTO(
        Integer       contactNumberTypeId,
        String        contactNumberTypeName,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.contactNumberTypeId = contactNumberTypeId;
        this.contactNumberTypeName = contactNumberTypeName;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.contact_number_type.contact_number_type_id</code>.
     */
    public Integer getContactNumberTypeId() {
        return this.contactNumberTypeId;
    }

    /**
     * Setter for <code>invopay.contact_number_type.contact_number_type_id</code>.
     */
    public ContactNumberTypeDTO setContactNumberTypeId(Integer contactNumberTypeId) {
        this.contactNumberTypeId = contactNumberTypeId;
        return this;
    }

    /**
     * Getter for <code>invopay.contact_number_type.contact_number_type_name</code>.
     */
    public String getContactNumberTypeName() {
        return this.contactNumberTypeName;
    }

    /**
     * Setter for <code>invopay.contact_number_type.contact_number_type_name</code>.
     */
    public ContactNumberTypeDTO setContactNumberTypeName(String contactNumberTypeName) {
        this.contactNumberTypeName = contactNumberTypeName;
        return this;
    }

    /**
     * Getter for <code>invopay.contact_number_type.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.contact_number_type.ref_user_id</code>.
     */
    public ContactNumberTypeDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.contact_number_type.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.contact_number_type.delete_status</code>.
     */
    public ContactNumberTypeDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.contact_number_type.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.contact_number_type.transaction_id</code>.
     */
    public ContactNumberTypeDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.contact_number_type.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.contact_number_type.added_date</code>.
     */
    public ContactNumberTypeDTO setAddedDate(LocalDateTime addedDate) {
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
        final ContactNumberTypeDTO other = (ContactNumberTypeDTO) obj;
        if (contactNumberTypeId == null) {
            if (other.contactNumberTypeId != null)
                return false;
        }
        else if (!contactNumberTypeId.equals(other.contactNumberTypeId))
            return false;
        if (contactNumberTypeName == null) {
            if (other.contactNumberTypeName != null)
                return false;
        }
        else if (!contactNumberTypeName.equals(other.contactNumberTypeName))
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
        result = prime * result + ((this.contactNumberTypeId == null) ? 0 : this.contactNumberTypeId.hashCode());
        result = prime * result + ((this.contactNumberTypeName == null) ? 0 : this.contactNumberTypeName.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ContactNumberType (");

        sb.append(contactNumberTypeId);
        sb.append(", ").append(contactNumberTypeName);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
