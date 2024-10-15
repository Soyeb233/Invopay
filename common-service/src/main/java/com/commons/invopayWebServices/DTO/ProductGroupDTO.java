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
public class ProductGroupDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       productGroupId;
    private String        productGroupName;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public ProductGroupDTO() {}

    public ProductGroupDTO(ProductGroupDTO value) {
        this.productGroupId = value.productGroupId;
        this.productGroupName = value.productGroupName;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public ProductGroupDTO(
        Integer       productGroupId,
        String        productGroupName,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.productGroupId = productGroupId;
        this.productGroupName = productGroupName;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.product_group.product_group_id</code>.
     */
    public Integer getProductGroupId() {
        return this.productGroupId;
    }

    /**
     * Setter for <code>invopay.product_group.product_group_id</code>.
     */
    public ProductGroupDTO setProductGroupId(Integer productGroupId) {
        this.productGroupId = productGroupId;
        return this;
    }

    /**
     * Getter for <code>invopay.product_group.product_group_name</code>. Product Group
     */
    public String getProductGroupName() {
        return this.productGroupName;
    }

    /**
     * Setter for <code>invopay.product_group.product_group_name</code>. Product Group
     */
    public ProductGroupDTO setProductGroupName(String productGroupName) {
        this.productGroupName = productGroupName;
        return this;
    }

    /**
     * Getter for <code>invopay.product_group.ref_user_id</code>. User
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.product_group.ref_user_id</code>. User
     */
    public ProductGroupDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.product_group.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.product_group.delete_status</code>.
     */
    public ProductGroupDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.product_group.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.product_group.transaction_id</code>.
     */
    public ProductGroupDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.product_group.added_date</code>. Date
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.product_group.added_date</code>. Date
     */
    public ProductGroupDTO setAddedDate(LocalDateTime addedDate) {
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
        final ProductGroupDTO other = (ProductGroupDTO) obj;
        if (productGroupId == null) {
            if (other.productGroupId != null)
                return false;
        }
        else if (!productGroupId.equals(other.productGroupId))
            return false;
        if (productGroupName == null) {
            if (other.productGroupName != null)
                return false;
        }
        else if (!productGroupName.equals(other.productGroupName))
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
        result = prime * result + ((this.productGroupId == null) ? 0 : this.productGroupId.hashCode());
        result = prime * result + ((this.productGroupName == null) ? 0 : this.productGroupName.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProductGroup (");

        sb.append(productGroupId);
        sb.append(", ").append(productGroupName);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}