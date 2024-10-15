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
public class ClientCallsDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       clientCallId;
    private Integer       refClientId;
    private Integer       callType;
    private LocalDateTime clientCallDateAndTime;
    private String        contactNumber;
    private String        clientCallDuration;
    private Integer       refClientCallPurposeId;
    private Integer       refClientCallNotConnectedId;
    private Integer       refClientCallFeedbackId;
    private String        clientCallComments;
    private Integer       clientCallReminder;
    private LocalDateTime clientCallReminderDate;
    private Integer       deleteStatus;
    private Integer       refUserId;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public ClientCallsDTO() {}

    public ClientCallsDTO(ClientCallsDTO value) {
        this.clientCallId = value.clientCallId;
        this.refClientId = value.refClientId;
        this.callType = value.callType;
        this.clientCallDateAndTime = value.clientCallDateAndTime;
        this.contactNumber = value.contactNumber;
        this.clientCallDuration = value.clientCallDuration;
        this.refClientCallPurposeId = value.refClientCallPurposeId;
        this.refClientCallNotConnectedId = value.refClientCallNotConnectedId;
        this.refClientCallFeedbackId = value.refClientCallFeedbackId;
        this.clientCallComments = value.clientCallComments;
        this.clientCallReminder = value.clientCallReminder;
        this.clientCallReminderDate = value.clientCallReminderDate;
        this.deleteStatus = value.deleteStatus;
        this.refUserId = value.refUserId;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public ClientCallsDTO(
        Integer       clientCallId,
        Integer       refClientId,
        Integer       callType,
        LocalDateTime clientCallDateAndTime,
        String        contactNumber,
        String        clientCallDuration,
        Integer       refClientCallPurposeId,
        Integer       refClientCallNotConnectedId,
        Integer       refClientCallFeedbackId,
        String        clientCallComments,
        Integer       clientCallReminder,
        LocalDateTime clientCallReminderDate,
        Integer       deleteStatus,
        Integer       refUserId,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.clientCallId = clientCallId;
        this.refClientId = refClientId;
        this.callType = callType;
        this.clientCallDateAndTime = clientCallDateAndTime;
        this.contactNumber = contactNumber;
        this.clientCallDuration = clientCallDuration;
        this.refClientCallPurposeId = refClientCallPurposeId;
        this.refClientCallNotConnectedId = refClientCallNotConnectedId;
        this.refClientCallFeedbackId = refClientCallFeedbackId;
        this.clientCallComments = clientCallComments;
        this.clientCallReminder = clientCallReminder;
        this.clientCallReminderDate = clientCallReminderDate;
        this.deleteStatus = deleteStatus;
        this.refUserId = refUserId;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.client_calls.client_call_id</code>.
     */
    public Integer getClientCallId() {
        return this.clientCallId;
    }

    /**
     * Setter for <code>invopay.client_calls.client_call_id</code>.
     */
    public ClientCallsDTO setClientCallId(Integer clientCallId) {
        this.clientCallId = clientCallId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_calls.ref_client_id</code>. Client Name
     */
    public Integer getRefClientId() {
        return this.refClientId;
    }

    /**
     * Setter for <code>invopay.client_calls.ref_client_id</code>. Client Name
     */
    public ClientCallsDTO setRefClientId(Integer refClientId) {
        this.refClientId = refClientId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_calls.call_type</code>.
     */
    public Integer getCallType() {
        return this.callType;
    }

    /**
     * Setter for <code>invopay.client_calls.call_type</code>.
     */
    public ClientCallsDTO setCallType(Integer callType) {
        this.callType = callType;
        return this;
    }

    /**
     * Getter for <code>invopay.client_calls.client_call_date_and_time</code>.
     */
    public LocalDateTime getClientCallDateAndTime() {
        return this.clientCallDateAndTime;
    }

    /**
     * Setter for <code>invopay.client_calls.client_call_date_and_time</code>.
     */
    public ClientCallsDTO setClientCallDateAndTime(LocalDateTime clientCallDateAndTime) {
        this.clientCallDateAndTime = clientCallDateAndTime;
        return this;
    }

    /**
     * Getter for <code>invopay.client_calls.contact_number</code>.
     */
    public String getContactNumber() {
        return this.contactNumber;
    }

    /**
     * Setter for <code>invopay.client_calls.contact_number</code>.
     */
    public ClientCallsDTO setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }

    /**
     * Getter for <code>invopay.client_calls.client_call_duration</code>.
     */
    public String getClientCallDuration() {
        return this.clientCallDuration;
    }

    /**
     * Setter for <code>invopay.client_calls.client_call_duration</code>.
     */
    public ClientCallsDTO setClientCallDuration(String clientCallDuration) {
        this.clientCallDuration = clientCallDuration;
        return this;
    }

    /**
     * Getter for <code>invopay.client_calls.ref_client_call_purpose_id</code>. Call Purpose
     */
    public Integer getRefClientCallPurposeId() {
        return this.refClientCallPurposeId;
    }

    /**
     * Setter for <code>invopay.client_calls.ref_client_call_purpose_id</code>. Call Purpose
     */
    public ClientCallsDTO setRefClientCallPurposeId(Integer refClientCallPurposeId) {
        this.refClientCallPurposeId = refClientCallPurposeId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_calls.ref_client_call_not_connected_id</code>. Not Connect
     */
    public Integer getRefClientCallNotConnectedId() {
        return this.refClientCallNotConnectedId;
    }

    /**
     * Setter for <code>invopay.client_calls.ref_client_call_not_connected_id</code>. Not Connect
     */
    public ClientCallsDTO setRefClientCallNotConnectedId(Integer refClientCallNotConnectedId) {
        this.refClientCallNotConnectedId = refClientCallNotConnectedId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_calls.ref_client_call_feedback_id</code>. Feedback
     */
    public Integer getRefClientCallFeedbackId() {
        return this.refClientCallFeedbackId;
    }

    /**
     * Setter for <code>invopay.client_calls.ref_client_call_feedback_id</code>. Feedback
     */
    public ClientCallsDTO setRefClientCallFeedbackId(Integer refClientCallFeedbackId) {
        this.refClientCallFeedbackId = refClientCallFeedbackId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_calls.client_call_comments</code>.
     */
    public String getClientCallComments() {
        return this.clientCallComments;
    }

    /**
     * Setter for <code>invopay.client_calls.client_call_comments</code>.
     */
    public ClientCallsDTO setClientCallComments(String clientCallComments) {
        this.clientCallComments = clientCallComments;
        return this;
    }

    /**
     * Getter for <code>invopay.client_calls.client_call_reminder</code>.
     */
    public Integer getClientCallReminder() {
        return this.clientCallReminder;
    }

    /**
     * Setter for <code>invopay.client_calls.client_call_reminder</code>.
     */
    public ClientCallsDTO setClientCallReminder(Integer clientCallReminder) {
        this.clientCallReminder = clientCallReminder;
        return this;
    }

    /**
     * Getter for <code>invopay.client_calls.client_call_reminder_date</code>.
     */
    public LocalDateTime getClientCallReminderDate() {
        return this.clientCallReminderDate;
    }

    /**
     * Setter for <code>invopay.client_calls.client_call_reminder_date</code>.
     */
    public ClientCallsDTO setClientCallReminderDate(LocalDateTime clientCallReminderDate) {
        this.clientCallReminderDate = clientCallReminderDate;
        return this;
    }

    /**
     * Getter for <code>invopay.client_calls.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.client_calls.delete_status</code>.
     */
    public ClientCallsDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.client_calls.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.client_calls.ref_user_id</code>.
     */
    public ClientCallsDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_calls.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.client_calls.transaction_id</code>.
     */
    public ClientCallsDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_calls.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.client_calls.added_date</code>.
     */
    public ClientCallsDTO setAddedDate(LocalDateTime addedDate) {
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
        final ClientCallsDTO other = (ClientCallsDTO) obj;
        if (clientCallId == null) {
            if (other.clientCallId != null)
                return false;
        }
        else if (!clientCallId.equals(other.clientCallId))
            return false;
        if (refClientId == null) {
            if (other.refClientId != null)
                return false;
        }
        else if (!refClientId.equals(other.refClientId))
            return false;
        if (callType == null) {
            if (other.callType != null)
                return false;
        }
        else if (!callType.equals(other.callType))
            return false;
        if (clientCallDateAndTime == null) {
            if (other.clientCallDateAndTime != null)
                return false;
        }
        else if (!clientCallDateAndTime.equals(other.clientCallDateAndTime))
            return false;
        if (contactNumber == null) {
            if (other.contactNumber != null)
                return false;
        }
        else if (!contactNumber.equals(other.contactNumber))
            return false;
        if (clientCallDuration == null) {
            if (other.clientCallDuration != null)
                return false;
        }
        else if (!clientCallDuration.equals(other.clientCallDuration))
            return false;
        if (refClientCallPurposeId == null) {
            if (other.refClientCallPurposeId != null)
                return false;
        }
        else if (!refClientCallPurposeId.equals(other.refClientCallPurposeId))
            return false;
        if (refClientCallNotConnectedId == null) {
            if (other.refClientCallNotConnectedId != null)
                return false;
        }
        else if (!refClientCallNotConnectedId.equals(other.refClientCallNotConnectedId))
            return false;
        if (refClientCallFeedbackId == null) {
            if (other.refClientCallFeedbackId != null)
                return false;
        }
        else if (!refClientCallFeedbackId.equals(other.refClientCallFeedbackId))
            return false;
        if (clientCallComments == null) {
            if (other.clientCallComments != null)
                return false;
        }
        else if (!clientCallComments.equals(other.clientCallComments))
            return false;
        if (clientCallReminder == null) {
            if (other.clientCallReminder != null)
                return false;
        }
        else if (!clientCallReminder.equals(other.clientCallReminder))
            return false;
        if (clientCallReminderDate == null) {
            if (other.clientCallReminderDate != null)
                return false;
        }
        else if (!clientCallReminderDate.equals(other.clientCallReminderDate))
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
        result = prime * result + ((this.clientCallId == null) ? 0 : this.clientCallId.hashCode());
        result = prime * result + ((this.refClientId == null) ? 0 : this.refClientId.hashCode());
        result = prime * result + ((this.callType == null) ? 0 : this.callType.hashCode());
        result = prime * result + ((this.clientCallDateAndTime == null) ? 0 : this.clientCallDateAndTime.hashCode());
        result = prime * result + ((this.contactNumber == null) ? 0 : this.contactNumber.hashCode());
        result = prime * result + ((this.clientCallDuration == null) ? 0 : this.clientCallDuration.hashCode());
        result = prime * result + ((this.refClientCallPurposeId == null) ? 0 : this.refClientCallPurposeId.hashCode());
        result = prime * result + ((this.refClientCallNotConnectedId == null) ? 0 : this.refClientCallNotConnectedId.hashCode());
        result = prime * result + ((this.refClientCallFeedbackId == null) ? 0 : this.refClientCallFeedbackId.hashCode());
        result = prime * result + ((this.clientCallComments == null) ? 0 : this.clientCallComments.hashCode());
        result = prime * result + ((this.clientCallReminder == null) ? 0 : this.clientCallReminder.hashCode());
        result = prime * result + ((this.clientCallReminderDate == null) ? 0 : this.clientCallReminderDate.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ClientCalls (");

        sb.append(clientCallId);
        sb.append(", ").append(refClientId);
        sb.append(", ").append(callType);
        sb.append(", ").append(clientCallDateAndTime);
        sb.append(", ").append(contactNumber);
        sb.append(", ").append(clientCallDuration);
        sb.append(", ").append(refClientCallPurposeId);
        sb.append(", ").append(refClientCallNotConnectedId);
        sb.append(", ").append(refClientCallFeedbackId);
        sb.append(", ").append(clientCallComments);
        sb.append(", ").append(clientCallReminder);
        sb.append(", ").append(clientCallReminderDate);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
