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
public class ProductImageDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       productImageId;
    private Integer       refProductId;
    private String        productImageName;
    private Integer       refUserId;
    private Integer       transactionId;
    private Integer       deleteStatus;
    private LocalDateTime addedDate;

    public ProductImageDTO() {}

    public ProductImageDTO(ProductImageDTO value) {
        this.productImageId = value.productImageId;
        this.refProductId = value.refProductId;
        this.productImageName = value.productImageName;
        this.refUserId = value.refUserId;
        this.transactionId = value.transactionId;
        this.deleteStatus = value.deleteStatus;
        this.addedDate = value.addedDate;
    }

    public ProductImageDTO(
        Integer       productImageId,
        Integer       refProductId,
        String        productImageName,
        Integer       refUserId,
        Integer       transactionId,
        Integer       deleteStatus,
        LocalDateTime addedDate
    ) {
        this.productImageId = productImageId;
        this.refProductId = refProductId;
        this.productImageName = productImageName;
        this.refUserId = refUserId;
        this.transactionId = transactionId;
        this.deleteStatus = deleteStatus;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.product_image.product_image_id</code>.
     */
    public Integer getProductImageId() {
        return this.productImageId;
    }

    /**
     * Setter for <code>invopay.product_image.product_image_id</code>.
     */
    public ProductImageDTO setProductImageId(Integer productImageId) {
        this.productImageId = productImageId;
        return this;
    }

    /**
     * Getter for <code>invopay.product_image.ref_product_id</code>.
     */
    public Integer getRefProductId() {
        return this.refProductId;
    }

    /**
     * Setter for <code>invopay.product_image.ref_product_id</code>.
     */
    public ProductImageDTO setRefProductId(Integer refProductId) {
        this.refProductId = refProductId;
        return this;
    }

    /**
     * Getter for <code>invopay.product_image.product_image_name</code>.
     */
    public String getProductImageName() {
        return this.productImageName;
    }

    /**
     * Setter for <code>invopay.product_image.product_image_name</code>.
     */
    public ProductImageDTO setProductImageName(String productImageName) {
        this.productImageName = productImageName;
        return this;
    }

    /**
     * Getter for <code>invopay.product_image.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.product_image.ref_user_id</code>.
     */
    public ProductImageDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.product_image.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.product_image.transaction_id</code>.
     */
    public ProductImageDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.product_image.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.product_image.delete_status</code>.
     */
    public ProductImageDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.product_image.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.product_image.added_date</code>.
     */
    public ProductImageDTO setAddedDate(LocalDateTime addedDate) {
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
        final ProductImageDTO other = (ProductImageDTO) obj;
        if (productImageId == null) {
            if (other.productImageId != null)
                return false;
        }
        else if (!productImageId.equals(other.productImageId))
            return false;
        if (refProductId == null) {
            if (other.refProductId != null)
                return false;
        }
        else if (!refProductId.equals(other.refProductId))
            return false;
        if (productImageName == null) {
            if (other.productImageName != null)
                return false;
        }
        else if (!productImageName.equals(other.productImageName))
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
        if (deleteStatus == null) {
            if (other.deleteStatus != null)
                return false;
        }
        else if (!deleteStatus.equals(other.deleteStatus))
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
        result = prime * result + ((this.productImageId == null) ? 0 : this.productImageId.hashCode());
        result = prime * result + ((this.refProductId == null) ? 0 : this.refProductId.hashCode());
        result = prime * result + ((this.productImageName == null) ? 0 : this.productImageName.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProductImage (");

        sb.append(productImageId);
        sb.append(", ").append(refProductId);
        sb.append(", ").append(productImageName);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
