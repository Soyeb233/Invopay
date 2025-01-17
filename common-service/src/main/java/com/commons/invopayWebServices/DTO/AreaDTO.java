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
public class AreaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       areaId;
    private String        areaName;
    private Integer       deleteStatus;
    private Integer       userId;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public AreaDTO() {}

    public AreaDTO(AreaDTO value) {
        this.areaId = value.areaId;
        this.areaName = value.areaName;
        this.deleteStatus = value.deleteStatus;
        this.userId = value.userId;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public AreaDTO(
        Integer       areaId,
        String        areaName,
        Integer       deleteStatus,
        Integer       userId,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.areaId = areaId;
        this.areaName = areaName;
        this.deleteStatus = deleteStatus;
        this.userId = userId;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.area.area_id</code>.
     */
    public Integer getAreaId() {
        return this.areaId;
    }

    /**
     * Setter for <code>invopay.area.area_id</code>.
     */
    public AreaDTO setAreaId(Integer areaId) {
        this.areaId = areaId;
        return this;
    }

    /**
     * Getter for <code>invopay.area.area_name</code>.
     */
    public String getAreaName() {
        return this.areaName;
    }

    /**
     * Setter for <code>invopay.area.area_name</code>.
     */
    public AreaDTO setAreaName(String areaName) {
        this.areaName = areaName;
        return this;
    }

    /**
     * Getter for <code>invopay.area.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.area.delete_status</code>.
     */
    public AreaDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.area.user_id</code>.
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>invopay.area.user_id</code>.
     */
    public AreaDTO setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Getter for <code>invopay.area.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.area.transaction_id</code>.
     */
    public AreaDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.area.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.area.added_date</code>.
     */
    public AreaDTO setAddedDate(LocalDateTime addedDate) {
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
        final AreaDTO other = (AreaDTO) obj;
        if (areaId == null) {
            if (other.areaId != null)
                return false;
        }
        else if (!areaId.equals(other.areaId))
            return false;
        if (areaName == null) {
            if (other.areaName != null)
                return false;
        }
        else if (!areaName.equals(other.areaName))
            return false;
        if (deleteStatus == null) {
            if (other.deleteStatus != null)
                return false;
        }
        else if (!deleteStatus.equals(other.deleteStatus))
            return false;
        if (userId == null) {
            if (other.userId != null)
                return false;
        }
        else if (!userId.equals(other.userId))
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
        result = prime * result + ((this.areaId == null) ? 0 : this.areaId.hashCode());
        result = prime * result + ((this.areaName == null) ? 0 : this.areaName.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Area (");

        sb.append(areaId);
        sb.append(", ").append(areaName);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(userId);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
