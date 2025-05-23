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
public class ClientToEmployeeDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       clientToEmployeeId;
    private Integer       refClientId;
    private Integer       refEmployeeId;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public ClientToEmployeeDTO() {}

    public ClientToEmployeeDTO(ClientToEmployeeDTO value) {
        this.clientToEmployeeId = value.clientToEmployeeId;
        this.refClientId = value.refClientId;
        this.refEmployeeId = value.refEmployeeId;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public ClientToEmployeeDTO(
        Integer       clientToEmployeeId,
        Integer       refClientId,
        Integer       refEmployeeId,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.clientToEmployeeId = clientToEmployeeId;
        this.refClientId = refClientId;
        this.refEmployeeId = refEmployeeId;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.client_to_employee.client_to_employee_id</code>.
     */
    public Integer getClientToEmployeeId() {
        return this.clientToEmployeeId;
    }

    /**
     * Setter for <code>invopay.client_to_employee.client_to_employee_id</code>.
     */
    public ClientToEmployeeDTO setClientToEmployeeId(Integer clientToEmployeeId) {
        this.clientToEmployeeId = clientToEmployeeId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_to_employee.ref_client_id</code>.
     */
    public Integer getRefClientId() {
        return this.refClientId;
    }

    /**
     * Setter for <code>invopay.client_to_employee.ref_client_id</code>.
     */
    public ClientToEmployeeDTO setRefClientId(Integer refClientId) {
        this.refClientId = refClientId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_to_employee.ref_employee_id</code>.
     */
    public Integer getRefEmployeeId() {
        return this.refEmployeeId;
    }

    /**
     * Setter for <code>invopay.client_to_employee.ref_employee_id</code>.
     */
    public ClientToEmployeeDTO setRefEmployeeId(Integer refEmployeeId) {
        this.refEmployeeId = refEmployeeId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_to_employee.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.client_to_employee.ref_user_id</code>.
     */
    public ClientToEmployeeDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_to_employee.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.client_to_employee.delete_status</code>.
     */
    public ClientToEmployeeDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.client_to_employee.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.client_to_employee.transaction_id</code>.
     */
    public ClientToEmployeeDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.client_to_employee.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.client_to_employee.added_date</code>.
     */
    public ClientToEmployeeDTO setAddedDate(LocalDateTime addedDate) {
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
        final ClientToEmployeeDTO other = (ClientToEmployeeDTO) obj;
        if (clientToEmployeeId == null) {
            if (other.clientToEmployeeId != null)
                return false;
        }
        else if (!clientToEmployeeId.equals(other.clientToEmployeeId))
            return false;
        if (refClientId == null) {
            if (other.refClientId != null)
                return false;
        }
        else if (!refClientId.equals(other.refClientId))
            return false;
        if (refEmployeeId == null) {
            if (other.refEmployeeId != null)
                return false;
        }
        else if (!refEmployeeId.equals(other.refEmployeeId))
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
        result = prime * result + ((this.clientToEmployeeId == null) ? 0 : this.clientToEmployeeId.hashCode());
        result = prime * result + ((this.refClientId == null) ? 0 : this.refClientId.hashCode());
        result = prime * result + ((this.refEmployeeId == null) ? 0 : this.refEmployeeId.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ClientToEmployee (");

        sb.append(clientToEmployeeId);
        sb.append(", ").append(refClientId);
        sb.append(", ").append(refEmployeeId);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
