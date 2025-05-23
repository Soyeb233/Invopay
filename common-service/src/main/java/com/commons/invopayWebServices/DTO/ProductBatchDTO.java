/*
 * This file is generated by jOOQ.
 */
package com.commons.invopayWebServices.DTO;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProductBatchDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       productBatchId;
    private Integer       refPurchaseOrderId;
    private Integer       refProductId;
    private String        productBatchName;
    private Integer       quantity;
    private Integer       availQuantity;
    private Double        price;
    private LocalDate     manufactureDate;
    private LocalDate     expiryDate;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public ProductBatchDTO() {}

    public ProductBatchDTO(ProductBatchDTO value) {
        this.productBatchId = value.productBatchId;
        this.refPurchaseOrderId = value.refPurchaseOrderId;
        this.refProductId = value.refProductId;
        this.productBatchName = value.productBatchName;
        this.quantity = value.quantity;
        this.availQuantity = value.availQuantity;
        this.price = value.price;
        this.manufactureDate = value.manufactureDate;
        this.expiryDate = value.expiryDate;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public ProductBatchDTO(
        Integer       productBatchId,
        Integer       refPurchaseOrderId,
        Integer       refProductId,
        String        productBatchName,
        Integer       quantity,
        Integer       availQuantity,
        Double        price,
        LocalDate     manufactureDate,
        LocalDate     expiryDate,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.productBatchId = productBatchId;
        this.refPurchaseOrderId = refPurchaseOrderId;
        this.refProductId = refProductId;
        this.productBatchName = productBatchName;
        this.quantity = quantity;
        this.availQuantity = availQuantity;
        this.price = price;
        this.manufactureDate = manufactureDate;
        this.expiryDate = expiryDate;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.product_batch.product_batch_id</code>.
     */
    public Integer getProductBatchId() {
        return this.productBatchId;
    }

    /**
     * Setter for <code>invopay.product_batch.product_batch_id</code>.
     */
    public ProductBatchDTO setProductBatchId(Integer productBatchId) {
        this.productBatchId = productBatchId;
        return this;
    }

    /**
     * Getter for <code>invopay.product_batch.ref_purchase_order_id</code>.
     */
    public Integer getRefPurchaseOrderId() {
        return this.refPurchaseOrderId;
    }

    /**
     * Setter for <code>invopay.product_batch.ref_purchase_order_id</code>.
     */
    public ProductBatchDTO setRefPurchaseOrderId(Integer refPurchaseOrderId) {
        this.refPurchaseOrderId = refPurchaseOrderId;
        return this;
    }

    /**
     * Getter for <code>invopay.product_batch.ref_product_id</code>.
     */
    public Integer getRefProductId() {
        return this.refProductId;
    }

    /**
     * Setter for <code>invopay.product_batch.ref_product_id</code>.
     */
    public ProductBatchDTO setRefProductId(Integer refProductId) {
        this.refProductId = refProductId;
        return this;
    }

    /**
     * Getter for <code>invopay.product_batch.product_batch_name</code>.
     */
    public String getProductBatchName() {
        return this.productBatchName;
    }

    /**
     * Setter for <code>invopay.product_batch.product_batch_name</code>.
     */
    public ProductBatchDTO setProductBatchName(String productBatchName) {
        this.productBatchName = productBatchName;
        return this;
    }

    /**
     * Getter for <code>invopay.product_batch.quantity</code>.
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * Setter for <code>invopay.product_batch.quantity</code>.
     */
    public ProductBatchDTO setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Getter for <code>invopay.product_batch.avail_quantity</code>.
     */
    public Integer getAvailQuantity() {
        return this.availQuantity;
    }

    /**
     * Setter for <code>invopay.product_batch.avail_quantity</code>.
     */
    public ProductBatchDTO setAvailQuantity(Integer availQuantity) {
        this.availQuantity = availQuantity;
        return this;
    }

    /**
     * Getter for <code>invopay.product_batch.price</code>.
     */
    public Double getPrice() {
        return this.price;
    }

    /**
     * Setter for <code>invopay.product_batch.price</code>.
     */
    public ProductBatchDTO setPrice(Double price) {
        this.price = price;
        return this;
    }

    /**
     * Getter for <code>invopay.product_batch.manufacture_date</code>.
     */
    public LocalDate getManufactureDate() {
        return this.manufactureDate;
    }

    /**
     * Setter for <code>invopay.product_batch.manufacture_date</code>.
     */
    public ProductBatchDTO setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
        return this;
    }

    /**
     * Getter for <code>invopay.product_batch.expiry_date</code>.
     */
    public LocalDate getExpiryDate() {
        return this.expiryDate;
    }

    /**
     * Setter for <code>invopay.product_batch.expiry_date</code>.
     */
    public ProductBatchDTO setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * Getter for <code>invopay.product_batch.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.product_batch.ref_user_id</code>.
     */
    public ProductBatchDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.product_batch.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.product_batch.delete_status</code>.
     */
    public ProductBatchDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.product_batch.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.product_batch.transaction_id</code>.
     */
    public ProductBatchDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.product_batch.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.product_batch.added_date</code>.
     */
    public ProductBatchDTO setAddedDate(LocalDateTime addedDate) {
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
        final ProductBatchDTO other = (ProductBatchDTO) obj;
        if (productBatchId == null) {
            if (other.productBatchId != null)
                return false;
        }
        else if (!productBatchId.equals(other.productBatchId))
            return false;
        if (refPurchaseOrderId == null) {
            if (other.refPurchaseOrderId != null)
                return false;
        }
        else if (!refPurchaseOrderId.equals(other.refPurchaseOrderId))
            return false;
        if (refProductId == null) {
            if (other.refProductId != null)
                return false;
        }
        else if (!refProductId.equals(other.refProductId))
            return false;
        if (productBatchName == null) {
            if (other.productBatchName != null)
                return false;
        }
        else if (!productBatchName.equals(other.productBatchName))
            return false;
        if (quantity == null) {
            if (other.quantity != null)
                return false;
        }
        else if (!quantity.equals(other.quantity))
            return false;
        if (availQuantity == null) {
            if (other.availQuantity != null)
                return false;
        }
        else if (!availQuantity.equals(other.availQuantity))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        }
        else if (!price.equals(other.price))
            return false;
        if (manufactureDate == null) {
            if (other.manufactureDate != null)
                return false;
        }
        else if (!manufactureDate.equals(other.manufactureDate))
            return false;
        if (expiryDate == null) {
            if (other.expiryDate != null)
                return false;
        }
        else if (!expiryDate.equals(other.expiryDate))
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
        result = prime * result + ((this.productBatchId == null) ? 0 : this.productBatchId.hashCode());
        result = prime * result + ((this.refPurchaseOrderId == null) ? 0 : this.refPurchaseOrderId.hashCode());
        result = prime * result + ((this.refProductId == null) ? 0 : this.refProductId.hashCode());
        result = prime * result + ((this.productBatchName == null) ? 0 : this.productBatchName.hashCode());
        result = prime * result + ((this.quantity == null) ? 0 : this.quantity.hashCode());
        result = prime * result + ((this.availQuantity == null) ? 0 : this.availQuantity.hashCode());
        result = prime * result + ((this.price == null) ? 0 : this.price.hashCode());
        result = prime * result + ((this.manufactureDate == null) ? 0 : this.manufactureDate.hashCode());
        result = prime * result + ((this.expiryDate == null) ? 0 : this.expiryDate.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProductBatch (");

        sb.append(productBatchId);
        sb.append(", ").append(refPurchaseOrderId);
        sb.append(", ").append(refProductId);
        sb.append(", ").append(productBatchName);
        sb.append(", ").append(quantity);
        sb.append(", ").append(availQuantity);
        sb.append(", ").append(price);
        sb.append(", ").append(manufactureDate);
        sb.append(", ").append(expiryDate);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
