/*
 * This file is generated by jOOQ.
 */
package com.commons.invopayWebServices.DTO;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerLocationDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       customerLocationId;
    private Integer       refCustomerId;
    private Integer       fromLocation;
    private Integer       toLocation;
    private LocalTime     fromTime;
    private LocalTime     toTime;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public CustomerLocationDTO() {}

    public CustomerLocationDTO(CustomerLocationDTO value) {
        this.customerLocationId = value.customerLocationId;
        this.refCustomerId = value.refCustomerId;
        this.fromLocation = value.fromLocation;
        this.toLocation = value.toLocation;
        this.fromTime = value.fromTime;
        this.toTime = value.toTime;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public CustomerLocationDTO(
        Integer       customerLocationId,
        Integer       refCustomerId,
        Integer       fromLocation,
        Integer       toLocation,
        LocalTime     fromTime,
        LocalTime     toTime,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.customerLocationId = customerLocationId;
        this.refCustomerId = refCustomerId;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.customer_location.customer_location_id</code>.
     */
    public Integer getCustomerLocationId() {
        return this.customerLocationId;
    }

    /**
     * Setter for <code>invopay.customer_location.customer_location_id</code>.
     */
    public CustomerLocationDTO setCustomerLocationId(Integer customerLocationId) {
        this.customerLocationId = customerLocationId;
        return this;
    }

    /**
     * Getter for <code>invopay.customer_location.ref_customer_id</code>.
     */
    public Integer getRefCustomerId() {
        return this.refCustomerId;
    }

    /**
     * Setter for <code>invopay.customer_location.ref_customer_id</code>.
     */
    public CustomerLocationDTO setRefCustomerId(Integer refCustomerId) {
        this.refCustomerId = refCustomerId;
        return this;
    }

    /**
     * Getter for <code>invopay.customer_location.from_location</code>.
     */
    public Integer getFromLocation() {
        return this.fromLocation;
    }

    /**
     * Setter for <code>invopay.customer_location.from_location</code>.
     */
    public CustomerLocationDTO setFromLocation(Integer fromLocation) {
        this.fromLocation = fromLocation;
        return this;
    }

    /**
     * Getter for <code>invopay.customer_location.to_location</code>.
     */
    public Integer getToLocation() {
        return this.toLocation;
    }

    /**
     * Setter for <code>invopay.customer_location.to_location</code>.
     */
    public CustomerLocationDTO setToLocation(Integer toLocation) {
        this.toLocation = toLocation;
        return this;
    }

    /**
     * Getter for <code>invopay.customer_location.from_time</code>.
     */
    public LocalTime getFromTime() {
        return this.fromTime;
    }

    /**
     * Setter for <code>invopay.customer_location.from_time</code>.
     */
    public CustomerLocationDTO setFromTime(LocalTime fromTime) {
        this.fromTime = fromTime;
        return this;
    }

    /**
     * Getter for <code>invopay.customer_location.to_time</code>.
     */
    public LocalTime getToTime() {
        return this.toTime;
    }

    /**
     * Setter for <code>invopay.customer_location.to_time</code>.
     */
    public CustomerLocationDTO setToTime(LocalTime toTime) {
        this.toTime = toTime;
        return this;
    }

    /**
     * Getter for <code>invopay.customer_location.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.customer_location.ref_user_id</code>.
     */
    public CustomerLocationDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.customer_location.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.customer_location.delete_status</code>.
     */
    public CustomerLocationDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.customer_location.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.customer_location.transaction_id</code>.
     */
    public CustomerLocationDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.customer_location.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.customer_location.added_date</code>.
     */
    public CustomerLocationDTO setAddedDate(LocalDateTime addedDate) {
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
        final CustomerLocationDTO other = (CustomerLocationDTO) obj;
        if (customerLocationId == null) {
            if (other.customerLocationId != null)
                return false;
        }
        else if (!customerLocationId.equals(other.customerLocationId))
            return false;
        if (refCustomerId == null) {
            if (other.refCustomerId != null)
                return false;
        }
        else if (!refCustomerId.equals(other.refCustomerId))
            return false;
        if (fromLocation == null) {
            if (other.fromLocation != null)
                return false;
        }
        else if (!fromLocation.equals(other.fromLocation))
            return false;
        if (toLocation == null) {
            if (other.toLocation != null)
                return false;
        }
        else if (!toLocation.equals(other.toLocation))
            return false;
        if (fromTime == null) {
            if (other.fromTime != null)
                return false;
        }
        else if (!fromTime.equals(other.fromTime))
            return false;
        if (toTime == null) {
            if (other.toTime != null)
                return false;
        }
        else if (!toTime.equals(other.toTime))
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
        result = prime * result + ((this.customerLocationId == null) ? 0 : this.customerLocationId.hashCode());
        result = prime * result + ((this.refCustomerId == null) ? 0 : this.refCustomerId.hashCode());
        result = prime * result + ((this.fromLocation == null) ? 0 : this.fromLocation.hashCode());
        result = prime * result + ((this.toLocation == null) ? 0 : this.toLocation.hashCode());
        result = prime * result + ((this.fromTime == null) ? 0 : this.fromTime.hashCode());
        result = prime * result + ((this.toTime == null) ? 0 : this.toTime.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CustomerLocation (");

        sb.append(customerLocationId);
        sb.append(", ").append(refCustomerId);
        sb.append(", ").append(fromLocation);
        sb.append(", ").append(toLocation);
        sb.append(", ").append(fromTime);
        sb.append(", ").append(toTime);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
