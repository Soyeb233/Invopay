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
public class ClientContactNumbersDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       clientContactId;
    private Integer       refClientId;
    private Integer       primaryContact;
    private String        contactPerson;
    private Integer       refDesignationId;
    private Integer       refContactNumberTypeId;
    private String        stdCode;
    private String        contactNumber;
    private Integer       contactExtension;
    private String        contactTimingFrom;
    private String        contactTimingTo;
    private Integer       deleteStatus;
    private Integer       refUserId;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public ClientContactNumbersDTO() {}

    public ClientContactNumbersDTO(ClientContactNumbersDTO value) {
        this.clientContactId = value.clientContactId;
        this.refClientId = value.refClientId;
        this.primaryContact = value.primaryContact;
        this.contactPerson = value.contactPerson;
        this.refDesignationId = value.refDesignationId;
        this.refContactNumberTypeId = value.refContactNumberTypeId;
        this.stdCode = value.stdCode;
        this.contactNumber = value.contactNumber;
        this.contactExtension = value.contactExtension;
        this.contactTimingFrom = value.contactTimingFrom;
        this.contactTimingTo = value.contactTimingTo;
        this.deleteStatus = value.deleteStatus;
        this.refUserId = value.refUserId;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public ClientContactNumbersDTO(
        Integer       clientContactId,
        Integer       refClientId,
        Integer       primaryContact,
        String        contactPerson,
        Integer       refDesignationId,
        Integer       refContactNumberTypeId,
        String        stdCode,
        String        contactNumber,
        Integer       contactExtension,
        String        contactTimingFrom,
        String        contactTimingTo,
        Integer       deleteStatus,
        Integer       refUserId,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.clientContactId = clientContactId;
        this.refClientId = refClientId;
        this.primaryContact = primaryContact;
        this.contactPerson = contactPerson;
        this.refDesignationId = refDesignationId;
        this.refContactNumberTypeId = refContactNumberTypeId;
        this.stdCode = stdCode;
        this.contactNumber = contactNumber;
        this.contactExtension = contactExtension;
        this.contactTimingFrom = contactTimingFrom;
        this.contactTimingTo = contactTimingTo;
        this.deleteStatus = deleteStatus;
        this.refUserId = refUserId;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.client_contact_numbers.client_contact_id</code>.
     */
    public Integer getClientContactId() {
        return this.clientContactId;
    }

    /**
     * Setter for <code>invopay.client_contact_numbers.client_contact_id</code>.
     */
    public ClientContactNumbersDTO setClientContactId(Integer clientContactId) {
        this.clientContactId = clientContactId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_contact_numbers.ref_client_id</code>.
     */
    public Integer getRefClientId() {
        return this.refClientId;
    }

    /**
     * Setter for <code>invopay.client_contact_numbers.ref_client_id</code>.
     */
    public ClientContactNumbersDTO setRefClientId(Integer refClientId) {
        this.refClientId = refClientId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_contact_numbers.primary_contact</code>.
     */
    public Integer getPrimaryContact() {
        return this.primaryContact;
    }

    /**
     * Setter for <code>invopay.client_contact_numbers.primary_contact</code>.
     */
    public ClientContactNumbersDTO setPrimaryContact(Integer primaryContact) {
        this.primaryContact = primaryContact;
        return this;
    }

    /**
     * Getter for <code>invopay.client_contact_numbers.contact_person</code>.
     */
    public String getContactPerson() {
        return this.contactPerson;
    }

    /**
     * Setter for <code>invopay.client_contact_numbers.contact_person</code>.
     */
    public ClientContactNumbersDTO setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
        return this;
    }

    /**
     * Getter for <code>invopay.client_contact_numbers.ref_designation_id</code>.
     */
    public Integer getRefDesignationId() {
        return this.refDesignationId;
    }

    /**
     * Setter for <code>invopay.client_contact_numbers.ref_designation_id</code>.
     */
    public ClientContactNumbersDTO setRefDesignationId(Integer refDesignationId) {
        this.refDesignationId = refDesignationId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_contact_numbers.ref_contact_number_type_id</code>.
     */
    public Integer getRefContactNumberTypeId() {
        return this.refContactNumberTypeId;
    }

    /**
     * Setter for <code>invopay.client_contact_numbers.ref_contact_number_type_id</code>.
     */
    public ClientContactNumbersDTO setRefContactNumberTypeId(Integer refContactNumberTypeId) {
        this.refContactNumberTypeId = refContactNumberTypeId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_contact_numbers.std_code</code>.
     */
    public String getStdCode() {
        return this.stdCode;
    }

    /**
     * Setter for <code>invopay.client_contact_numbers.std_code</code>.
     */
    public ClientContactNumbersDTO setStdCode(String stdCode) {
        this.stdCode = stdCode;
        return this;
    }

    /**
     * Getter for <code>invopay.client_contact_numbers.contact_number</code>. Mobile Number
     */
    public String getContactNumber() {
        return this.contactNumber;
    }

    /**
     * Setter for <code>invopay.client_contact_numbers.contact_number</code>. Mobile Number
     */
    public ClientContactNumbersDTO setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }

    /**
     * Getter for <code>invopay.client_contact_numbers.contact_extension</code>.
     */
    public Integer getContactExtension() {
        return this.contactExtension;
    }

    /**
     * Setter for <code>invopay.client_contact_numbers.contact_extension</code>.
     */
    public ClientContactNumbersDTO setContactExtension(Integer contactExtension) {
        this.contactExtension = contactExtension;
        return this;
    }

    /**
     * Getter for <code>invopay.client_contact_numbers.contact_timing_from</code>.
     */
    public String getContactTimingFrom() {
        return this.contactTimingFrom;
    }

    /**
     * Setter for <code>invopay.client_contact_numbers.contact_timing_from</code>.
     */
    public ClientContactNumbersDTO setContactTimingFrom(String contactTimingFrom) {
        this.contactTimingFrom = contactTimingFrom;
        return this;
    }

    /**
     * Getter for <code>invopay.client_contact_numbers.contact_timing_to</code>.
     */
    public String getContactTimingTo() {
        return this.contactTimingTo;
    }

    /**
     * Setter for <code>invopay.client_contact_numbers.contact_timing_to</code>.
     */
    public ClientContactNumbersDTO setContactTimingTo(String contactTimingTo) {
        this.contactTimingTo = contactTimingTo;
        return this;
    }

    /**
     * Getter for <code>invopay.client_contact_numbers.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.client_contact_numbers.delete_status</code>.
     */
    public ClientContactNumbersDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.client_contact_numbers.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.client_contact_numbers.ref_user_id</code>.
     */
    public ClientContactNumbersDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_contact_numbers.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.client_contact_numbers.transaction_id</code>.
     */
    public ClientContactNumbersDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_contact_numbers.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.client_contact_numbers.added_date</code>.
     */
    public ClientContactNumbersDTO setAddedDate(LocalDateTime addedDate) {
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
        final ClientContactNumbersDTO other = (ClientContactNumbersDTO) obj;
        if (clientContactId == null) {
            if (other.clientContactId != null)
                return false;
        }
        else if (!clientContactId.equals(other.clientContactId))
            return false;
        if (refClientId == null) {
            if (other.refClientId != null)
                return false;
        }
        else if (!refClientId.equals(other.refClientId))
            return false;
        if (primaryContact == null) {
            if (other.primaryContact != null)
                return false;
        }
        else if (!primaryContact.equals(other.primaryContact))
            return false;
        if (contactPerson == null) {
            if (other.contactPerson != null)
                return false;
        }
        else if (!contactPerson.equals(other.contactPerson))
            return false;
        if (refDesignationId == null) {
            if (other.refDesignationId != null)
                return false;
        }
        else if (!refDesignationId.equals(other.refDesignationId))
            return false;
        if (refContactNumberTypeId == null) {
            if (other.refContactNumberTypeId != null)
                return false;
        }
        else if (!refContactNumberTypeId.equals(other.refContactNumberTypeId))
            return false;
        if (stdCode == null) {
            if (other.stdCode != null)
                return false;
        }
        else if (!stdCode.equals(other.stdCode))
            return false;
        if (contactNumber == null) {
            if (other.contactNumber != null)
                return false;
        }
        else if (!contactNumber.equals(other.contactNumber))
            return false;
        if (contactExtension == null) {
            if (other.contactExtension != null)
                return false;
        }
        else if (!contactExtension.equals(other.contactExtension))
            return false;
        if (contactTimingFrom == null) {
            if (other.contactTimingFrom != null)
                return false;
        }
        else if (!contactTimingFrom.equals(other.contactTimingFrom))
            return false;
        if (contactTimingTo == null) {
            if (other.contactTimingTo != null)
                return false;
        }
        else if (!contactTimingTo.equals(other.contactTimingTo))
            return false;
        if (deleteStatus == null) {
            if (other.deleteStatus != null)
                return false;
        }
        else if (!deleteStatus.equals(other.deleteStatus))
            return false;
        if (refUserId == null) {
            if (other.refUserId != null)
                return false;
        }
        else if (!refUserId.equals(other.refUserId))
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
        result = prime * result + ((this.clientContactId == null) ? 0 : this.clientContactId.hashCode());
        result = prime * result + ((this.refClientId == null) ? 0 : this.refClientId.hashCode());
        result = prime * result + ((this.primaryContact == null) ? 0 : this.primaryContact.hashCode());
        result = prime * result + ((this.contactPerson == null) ? 0 : this.contactPerson.hashCode());
        result = prime * result + ((this.refDesignationId == null) ? 0 : this.refDesignationId.hashCode());
        result = prime * result + ((this.refContactNumberTypeId == null) ? 0 : this.refContactNumberTypeId.hashCode());
        result = prime * result + ((this.stdCode == null) ? 0 : this.stdCode.hashCode());
        result = prime * result + ((this.contactNumber == null) ? 0 : this.contactNumber.hashCode());
        result = prime * result + ((this.contactExtension == null) ? 0 : this.contactExtension.hashCode());
        result = prime * result + ((this.contactTimingFrom == null) ? 0 : this.contactTimingFrom.hashCode());
        result = prime * result + ((this.contactTimingTo == null) ? 0 : this.contactTimingTo.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ClientContactNumbers (");

        sb.append(clientContactId);
        sb.append(", ").append(refClientId);
        sb.append(", ").append(primaryContact);
        sb.append(", ").append(contactPerson);
        sb.append(", ").append(refDesignationId);
        sb.append(", ").append(refContactNumberTypeId);
        sb.append(", ").append(stdCode);
        sb.append(", ").append(contactNumber);
        sb.append(", ").append(contactExtension);
        sb.append(", ").append(contactTimingFrom);
        sb.append(", ").append(contactTimingTo);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
