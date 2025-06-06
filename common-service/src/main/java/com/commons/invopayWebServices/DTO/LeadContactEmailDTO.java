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
public class LeadContactEmailDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       leadContactEmailId;
    private Integer       refLeadId;
    private Integer       primaryContact;
    private String        emailId;
    private String        contactPerson;
    private Integer       refDesignationId;
    private Integer       deleteStatus;
    private Integer       refUserId;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public LeadContactEmailDTO() {}

    public LeadContactEmailDTO(LeadContactEmailDTO value) {
        this.leadContactEmailId = value.leadContactEmailId;
        this.refLeadId = value.refLeadId;
        this.primaryContact = value.primaryContact;
        this.emailId = value.emailId;
        this.contactPerson = value.contactPerson;
        this.refDesignationId = value.refDesignationId;
        this.deleteStatus = value.deleteStatus;
        this.refUserId = value.refUserId;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public LeadContactEmailDTO(
        Integer       leadContactEmailId,
        Integer       refLeadId,
        Integer       primaryContact,
        String        emailId,
        String        contactPerson,
        Integer       refDesignationId,
        Integer       deleteStatus,
        Integer       refUserId,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.leadContactEmailId = leadContactEmailId;
        this.refLeadId = refLeadId;
        this.primaryContact = primaryContact;
        this.emailId = emailId;
        this.contactPerson = contactPerson;
        this.refDesignationId = refDesignationId;
        this.deleteStatus = deleteStatus;
        this.refUserId = refUserId;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.lead_contact_email.lead_contact_email_id</code>.
     */
    public Integer getLeadContactEmailId() {
        return this.leadContactEmailId;
    }

    /**
     * Setter for <code>invopay.lead_contact_email.lead_contact_email_id</code>.
     */
    public LeadContactEmailDTO setLeadContactEmailId(Integer leadContactEmailId) {
        this.leadContactEmailId = leadContactEmailId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_contact_email.ref_lead_id</code>.
     */
    public Integer getRefLeadId() {
        return this.refLeadId;
    }

    /**
     * Setter for <code>invopay.lead_contact_email.ref_lead_id</code>.
     */
    public LeadContactEmailDTO setRefLeadId(Integer refLeadId) {
        this.refLeadId = refLeadId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_contact_email.primary_contact</code>.
     */
    public Integer getPrimaryContact() {
        return this.primaryContact;
    }

    /**
     * Setter for <code>invopay.lead_contact_email.primary_contact</code>.
     */
    public LeadContactEmailDTO setPrimaryContact(Integer primaryContact) {
        this.primaryContact = primaryContact;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_contact_email.email_id</code>. Email
     */
    public String getEmailId() {
        return this.emailId;
    }

    /**
     * Setter for <code>invopay.lead_contact_email.email_id</code>. Email
     */
    public LeadContactEmailDTO setEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_contact_email.contact_person</code>.
     */
    public String getContactPerson() {
        return this.contactPerson;
    }

    /**
     * Setter for <code>invopay.lead_contact_email.contact_person</code>.
     */
    public LeadContactEmailDTO setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_contact_email.ref_designation_id</code>.
     */
    public Integer getRefDesignationId() {
        return this.refDesignationId;
    }

    /**
     * Setter for <code>invopay.lead_contact_email.ref_designation_id</code>.
     */
    public LeadContactEmailDTO setRefDesignationId(Integer refDesignationId) {
        this.refDesignationId = refDesignationId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_contact_email.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.lead_contact_email.delete_status</code>.
     */
    public LeadContactEmailDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_contact_email.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.lead_contact_email.ref_user_id</code>.
     */
    public LeadContactEmailDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_contact_email.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.lead_contact_email.transaction_id</code>.
     */
    public LeadContactEmailDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_contact_email.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.lead_contact_email.added_date</code>.
     */
    public LeadContactEmailDTO setAddedDate(LocalDateTime addedDate) {
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
        final LeadContactEmailDTO other = (LeadContactEmailDTO) obj;
        if (leadContactEmailId == null) {
            if (other.leadContactEmailId != null)
                return false;
        }
        else if (!leadContactEmailId.equals(other.leadContactEmailId))
            return false;
        if (refLeadId == null) {
            if (other.refLeadId != null)
                return false;
        }
        else if (!refLeadId.equals(other.refLeadId))
            return false;
        if (primaryContact == null) {
            if (other.primaryContact != null)
                return false;
        }
        else if (!primaryContact.equals(other.primaryContact))
            return false;
        if (emailId == null) {
            if (other.emailId != null)
                return false;
        }
        else if (!emailId.equals(other.emailId))
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
        result = prime * result + ((this.leadContactEmailId == null) ? 0 : this.leadContactEmailId.hashCode());
        result = prime * result + ((this.refLeadId == null) ? 0 : this.refLeadId.hashCode());
        result = prime * result + ((this.primaryContact == null) ? 0 : this.primaryContact.hashCode());
        result = prime * result + ((this.emailId == null) ? 0 : this.emailId.hashCode());
        result = prime * result + ((this.contactPerson == null) ? 0 : this.contactPerson.hashCode());
        result = prime * result + ((this.refDesignationId == null) ? 0 : this.refDesignationId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LeadContactEmail (");

        sb.append(leadContactEmailId);
        sb.append(", ").append(refLeadId);
        sb.append(", ").append(primaryContact);
        sb.append(", ").append(emailId);
        sb.append(", ").append(contactPerson);
        sb.append(", ").append(refDesignationId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
