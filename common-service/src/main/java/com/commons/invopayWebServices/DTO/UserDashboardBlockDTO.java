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
public class UserDashboardBlockDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       userDashboardBlockId;
    private Integer       refDashboardBlockId;
    private Integer       columnWidth;
    private Integer       sortOrder;
    private Integer       refActiveStatusId;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public UserDashboardBlockDTO() {}

    public UserDashboardBlockDTO(UserDashboardBlockDTO value) {
        this.userDashboardBlockId = value.userDashboardBlockId;
        this.refDashboardBlockId = value.refDashboardBlockId;
        this.columnWidth = value.columnWidth;
        this.sortOrder = value.sortOrder;
        this.refActiveStatusId = value.refActiveStatusId;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public UserDashboardBlockDTO(
        Integer       userDashboardBlockId,
        Integer       refDashboardBlockId,
        Integer       columnWidth,
        Integer       sortOrder,
        Integer       refActiveStatusId,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.userDashboardBlockId = userDashboardBlockId;
        this.refDashboardBlockId = refDashboardBlockId;
        this.columnWidth = columnWidth;
        this.sortOrder = sortOrder;
        this.refActiveStatusId = refActiveStatusId;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.user_dashboard_block.user_dashboard_block_id</code>.
     */
    public Integer getUserDashboardBlockId() {
        return this.userDashboardBlockId;
    }

    /**
     * Setter for <code>invopay.user_dashboard_block.user_dashboard_block_id</code>.
     */
    public UserDashboardBlockDTO setUserDashboardBlockId(Integer userDashboardBlockId) {
        this.userDashboardBlockId = userDashboardBlockId;
        return this;
    }

    /**
     * Getter for <code>invopay.user_dashboard_block.ref_dashboard_block_id</code>.
     */
    public Integer getRefDashboardBlockId() {
        return this.refDashboardBlockId;
    }

    /**
     * Setter for <code>invopay.user_dashboard_block.ref_dashboard_block_id</code>.
     */
    public UserDashboardBlockDTO setRefDashboardBlockId(Integer refDashboardBlockId) {
        this.refDashboardBlockId = refDashboardBlockId;
        return this;
    }

    /**
     * Getter for <code>invopay.user_dashboard_block.column_width</code>.
     */
    public Integer getColumnWidth() {
        return this.columnWidth;
    }

    /**
     * Setter for <code>invopay.user_dashboard_block.column_width</code>.
     */
    public UserDashboardBlockDTO setColumnWidth(Integer columnWidth) {
        this.columnWidth = columnWidth;
        return this;
    }

    /**
     * Getter for <code>invopay.user_dashboard_block.sort_order</code>.
     */
    public Integer getSortOrder() {
        return this.sortOrder;
    }

    /**
     * Setter for <code>invopay.user_dashboard_block.sort_order</code>.
     */
    public UserDashboardBlockDTO setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * Getter for <code>invopay.user_dashboard_block.ref_active_status_id</code>.
     */
    public Integer getRefActiveStatusId() {
        return this.refActiveStatusId;
    }

    /**
     * Setter for <code>invopay.user_dashboard_block.ref_active_status_id</code>.
     */
    public UserDashboardBlockDTO setRefActiveStatusId(Integer refActiveStatusId) {
        this.refActiveStatusId = refActiveStatusId;
        return this;
    }

    /**
     * Getter for <code>invopay.user_dashboard_block.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.user_dashboard_block.ref_user_id</code>.
     */
    public UserDashboardBlockDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.user_dashboard_block.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.user_dashboard_block.delete_status</code>.
     */
    public UserDashboardBlockDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.user_dashboard_block.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.user_dashboard_block.transaction_id</code>.
     */
    public UserDashboardBlockDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.user_dashboard_block.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.user_dashboard_block.added_date</code>.
     */
    public UserDashboardBlockDTO setAddedDate(LocalDateTime addedDate) {
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
        final UserDashboardBlockDTO other = (UserDashboardBlockDTO) obj;
        if (userDashboardBlockId == null) {
            if (other.userDashboardBlockId != null)
                return false;
        }
        else if (!userDashboardBlockId.equals(other.userDashboardBlockId))
            return false;
        if (refDashboardBlockId == null) {
            if (other.refDashboardBlockId != null)
                return false;
        }
        else if (!refDashboardBlockId.equals(other.refDashboardBlockId))
            return false;
        if (columnWidth == null) {
            if (other.columnWidth != null)
                return false;
        }
        else if (!columnWidth.equals(other.columnWidth))
            return false;
        if (sortOrder == null) {
            if (other.sortOrder != null)
                return false;
        }
        else if (!sortOrder.equals(other.sortOrder))
            return false;
        if (refActiveStatusId == null) {
            if (other.refActiveStatusId != null)
                return false;
        }
        else if (!refActiveStatusId.equals(other.refActiveStatusId))
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
        result = prime * result + ((this.userDashboardBlockId == null) ? 0 : this.userDashboardBlockId.hashCode());
        result = prime * result + ((this.refDashboardBlockId == null) ? 0 : this.refDashboardBlockId.hashCode());
        result = prime * result + ((this.columnWidth == null) ? 0 : this.columnWidth.hashCode());
        result = prime * result + ((this.sortOrder == null) ? 0 : this.sortOrder.hashCode());
        result = prime * result + ((this.refActiveStatusId == null) ? 0 : this.refActiveStatusId.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserDashboardBlock (");

        sb.append(userDashboardBlockId);
        sb.append(", ").append(refDashboardBlockId);
        sb.append(", ").append(columnWidth);
        sb.append(", ").append(sortOrder);
        sb.append(", ").append(refActiveStatusId);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}