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
public class LeadCallsDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       leadCallId;
    private Integer       refLeadId;
    private String        callType;
    private LocalDateTime leadCallDateAndTime;
    private String        contactNumber;
    private String        leadCallDuration;
    private Integer       refLeadCallNotConnectedId;
    private Integer       refLeadCallFeedbackId;
    private String        leadCallComments;
    private Integer       leadCallReminder;
    private LocalDateTime leadCallReminderDate;
    private Integer       deleteStatus;
    private Integer       refUserId;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public LeadCallsDTO() {}

    public LeadCallsDTO(LeadCallsDTO value) {
        this.leadCallId = value.leadCallId;
        this.refLeadId = value.refLeadId;
        this.callType = value.callType;
        this.leadCallDateAndTime = value.leadCallDateAndTime;
        this.contactNumber = value.contactNumber;
        this.leadCallDuration = value.leadCallDuration;
        this.refLeadCallNotConnectedId = value.refLeadCallNotConnectedId;
        this.refLeadCallFeedbackId = value.refLeadCallFeedbackId;
        this.leadCallComments = value.leadCallComments;
        this.leadCallReminder = value.leadCallReminder;
        this.leadCallReminderDate = value.leadCallReminderDate;
        this.deleteStatus = value.deleteStatus;
        this.refUserId = value.refUserId;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public LeadCallsDTO(
        Integer       leadCallId,
        Integer       refLeadId,
        String        callType,
        LocalDateTime leadCallDateAndTime,
        String        contactNumber,
        String        leadCallDuration,
        Integer       refLeadCallNotConnectedId,
        Integer       refLeadCallFeedbackId,
        String        leadCallComments,
        Integer       leadCallReminder,
        LocalDateTime leadCallReminderDate,
        Integer       deleteStatus,
        Integer       refUserId,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.leadCallId = leadCallId;
        this.refLeadId = refLeadId;
        this.callType = callType;
        this.leadCallDateAndTime = leadCallDateAndTime;
        this.contactNumber = contactNumber;
        this.leadCallDuration = leadCallDuration;
        this.refLeadCallNotConnectedId = refLeadCallNotConnectedId;
        this.refLeadCallFeedbackId = refLeadCallFeedbackId;
        this.leadCallComments = leadCallComments;
        this.leadCallReminder = leadCallReminder;
        this.leadCallReminderDate = leadCallReminderDate;
        this.deleteStatus = deleteStatus;
        this.refUserId = refUserId;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.lead_calls.lead_call_id</code>.
     */
    public Integer getLeadCallId() {
        return this.leadCallId;
    }

    /**
     * Setter for <code>invopay.lead_calls.lead_call_id</code>.
     */
    public LeadCallsDTO setLeadCallId(Integer leadCallId) {
        this.leadCallId = leadCallId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_calls.ref_lead_id</code>. Lead Name
     */
    public Integer getRefLeadId() {
        return this.refLeadId;
    }

    /**
     * Setter for <code>invopay.lead_calls.ref_lead_id</code>. Lead Name
     */
    public LeadCallsDTO setRefLeadId(Integer refLeadId) {
        this.refLeadId = refLeadId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_calls.call_type</code>.
     */
    public String getCallType() {
        return this.callType;
    }

    /**
     * Setter for <code>invopay.lead_calls.call_type</code>.
     */
    public LeadCallsDTO setCallType(String callType) {
        this.callType = callType;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_calls.lead_call_date_and_time</code>.
     */
    public LocalDateTime getLeadCallDateAndTime() {
        return this.leadCallDateAndTime;
    }

    /**
     * Setter for <code>invopay.lead_calls.lead_call_date_and_time</code>.
     */
    public LeadCallsDTO setLeadCallDateAndTime(LocalDateTime leadCallDateAndTime) {
        this.leadCallDateAndTime = leadCallDateAndTime;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_calls.contact_number</code>.
     */
    public String getContactNumber() {
        return this.contactNumber;
    }

    /**
     * Setter for <code>invopay.lead_calls.contact_number</code>.
     */
    public LeadCallsDTO setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_calls.lead_call_duration</code>.
     */
    public String getLeadCallDuration() {
        return this.leadCallDuration;
    }

    /**
     * Setter for <code>invopay.lead_calls.lead_call_duration</code>.
     */
    public LeadCallsDTO setLeadCallDuration(String leadCallDuration) {
        this.leadCallDuration = leadCallDuration;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_calls.ref_lead_call_not_connected_id</code>.
     */
    public Integer getRefLeadCallNotConnectedId() {
        return this.refLeadCallNotConnectedId;
    }

    /**
     * Setter for <code>invopay.lead_calls.ref_lead_call_not_connected_id</code>.
     */
    public LeadCallsDTO setRefLeadCallNotConnectedId(Integer refLeadCallNotConnectedId) {
        this.refLeadCallNotConnectedId = refLeadCallNotConnectedId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_calls.ref_lead_call_feedback_id</code>. Feedback
     */
    public Integer getRefLeadCallFeedbackId() {
        return this.refLeadCallFeedbackId;
    }

    /**
     * Setter for <code>invopay.lead_calls.ref_lead_call_feedback_id</code>. Feedback
     */
    public LeadCallsDTO setRefLeadCallFeedbackId(Integer refLeadCallFeedbackId) {
        this.refLeadCallFeedbackId = refLeadCallFeedbackId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_calls.lead_call_comments</code>.
     */
    public String getLeadCallComments() {
        return this.leadCallComments;
    }

    /**
     * Setter for <code>invopay.lead_calls.lead_call_comments</code>.
     */
    public LeadCallsDTO setLeadCallComments(String leadCallComments) {
        this.leadCallComments = leadCallComments;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_calls.lead_call_reminder</code>. Call Reminder
     */
    public Integer getLeadCallReminder() {
        return this.leadCallReminder;
    }

    /**
     * Setter for <code>invopay.lead_calls.lead_call_reminder</code>. Call Reminder
     */
    public LeadCallsDTO setLeadCallReminder(Integer leadCallReminder) {
        this.leadCallReminder = leadCallReminder;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_calls.lead_call_reminder_date</code>. Reminder Date
     */
    public LocalDateTime getLeadCallReminderDate() {
        return this.leadCallReminderDate;
    }

    /**
     * Setter for <code>invopay.lead_calls.lead_call_reminder_date</code>. Reminder Date
     */
    public LeadCallsDTO setLeadCallReminderDate(LocalDateTime leadCallReminderDate) {
        this.leadCallReminderDate = leadCallReminderDate;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_calls.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.lead_calls.delete_status</code>.
     */
    public LeadCallsDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_calls.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.lead_calls.ref_user_id</code>.
     */
    public LeadCallsDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_calls.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.lead_calls.transaction_id</code>.
     */
    public LeadCallsDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.lead_calls.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.lead_calls.added_date</code>.
     */
    public LeadCallsDTO setAddedDate(LocalDateTime addedDate) {
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
        final LeadCallsDTO other = (LeadCallsDTO) obj;
        if (leadCallId == null) {
            if (other.leadCallId != null)
                return false;
        }
        else if (!leadCallId.equals(other.leadCallId))
            return false;
        if (refLeadId == null) {
            if (other.refLeadId != null)
                return false;
        }
        else if (!refLeadId.equals(other.refLeadId))
            return false;
        if (callType == null) {
            if (other.callType != null)
                return false;
        }
        else if (!callType.equals(other.callType))
            return false;
        if (leadCallDateAndTime == null) {
            if (other.leadCallDateAndTime != null)
                return false;
        }
        else if (!leadCallDateAndTime.equals(other.leadCallDateAndTime))
            return false;
        if (contactNumber == null) {
            if (other.contactNumber != null)
                return false;
        }
        else if (!contactNumber.equals(other.contactNumber))
            return false;
        if (leadCallDuration == null) {
            if (other.leadCallDuration != null)
                return false;
        }
        else if (!leadCallDuration.equals(other.leadCallDuration))
            return false;
        if (refLeadCallNotConnectedId == null) {
            if (other.refLeadCallNotConnectedId != null)
                return false;
        }
        else if (!refLeadCallNotConnectedId.equals(other.refLeadCallNotConnectedId))
            return false;
        if (refLeadCallFeedbackId == null) {
            if (other.refLeadCallFeedbackId != null)
                return false;
        }
        else if (!refLeadCallFeedbackId.equals(other.refLeadCallFeedbackId))
            return false;
        if (leadCallComments == null) {
            if (other.leadCallComments != null)
                return false;
        }
        else if (!leadCallComments.equals(other.leadCallComments))
            return false;
        if (leadCallReminder == null) {
            if (other.leadCallReminder != null)
                return false;
        }
        else if (!leadCallReminder.equals(other.leadCallReminder))
            return false;
        if (leadCallReminderDate == null) {
            if (other.leadCallReminderDate != null)
                return false;
        }
        else if (!leadCallReminderDate.equals(other.leadCallReminderDate))
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
        result = prime * result + ((this.leadCallId == null) ? 0 : this.leadCallId.hashCode());
        result = prime * result + ((this.refLeadId == null) ? 0 : this.refLeadId.hashCode());
        result = prime * result + ((this.callType == null) ? 0 : this.callType.hashCode());
        result = prime * result + ((this.leadCallDateAndTime == null) ? 0 : this.leadCallDateAndTime.hashCode());
        result = prime * result + ((this.contactNumber == null) ? 0 : this.contactNumber.hashCode());
        result = prime * result + ((this.leadCallDuration == null) ? 0 : this.leadCallDuration.hashCode());
        result = prime * result + ((this.refLeadCallNotConnectedId == null) ? 0 : this.refLeadCallNotConnectedId.hashCode());
        result = prime * result + ((this.refLeadCallFeedbackId == null) ? 0 : this.refLeadCallFeedbackId.hashCode());
        result = prime * result + ((this.leadCallComments == null) ? 0 : this.leadCallComments.hashCode());
        result = prime * result + ((this.leadCallReminder == null) ? 0 : this.leadCallReminder.hashCode());
        result = prime * result + ((this.leadCallReminderDate == null) ? 0 : this.leadCallReminderDate.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LeadCalls (");

        sb.append(leadCallId);
        sb.append(", ").append(refLeadId);
        sb.append(", ").append(callType);
        sb.append(", ").append(leadCallDateAndTime);
        sb.append(", ").append(contactNumber);
        sb.append(", ").append(leadCallDuration);
        sb.append(", ").append(refLeadCallNotConnectedId);
        sb.append(", ").append(refLeadCallFeedbackId);
        sb.append(", ").append(leadCallComments);
        sb.append(", ").append(leadCallReminder);
        sb.append(", ").append(leadCallReminderDate);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}