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
public class CustomerProductDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       customerProductId;
    private String        products;
    private String        orderId;
    private Integer       shippingAmount;
    private Integer       refCustomerId;
    private String        paymentType;
    private LocalDateTime addedDate;
    private Integer       transactionId;
    private Integer       deleteStatus;

    public CustomerProductDTO() {}

    public CustomerProductDTO(CustomerProductDTO value) {
        this.customerProductId = value.customerProductId;
        this.products = value.products;
        this.orderId = value.orderId;
        this.shippingAmount = value.shippingAmount;
        this.refCustomerId = value.refCustomerId;
        this.paymentType = value.paymentType;
        this.addedDate = value.addedDate;
        this.transactionId = value.transactionId;
        this.deleteStatus = value.deleteStatus;
    }

    public CustomerProductDTO(
        Integer       customerProductId,
        String        products,
        String        orderId,
        Integer       shippingAmount,
        Integer       refCustomerId,
        String        paymentType,
        LocalDateTime addedDate,
        Integer       transactionId,
        Integer       deleteStatus
    ) {
        this.customerProductId = customerProductId;
        this.products = products;
        this.orderId = orderId;
        this.shippingAmount = shippingAmount;
        this.refCustomerId = refCustomerId;
        this.paymentType = paymentType;
        this.addedDate = addedDate;
        this.transactionId = transactionId;
        this.deleteStatus = deleteStatus;
    }

    /**
     * Getter for <code>invopay.customer_product.customer_product_id</code>.
     */
    public Integer getCustomerProductId() {
        return this.customerProductId;
    }

    /**
     * Setter for <code>invopay.customer_product.customer_product_id</code>.
     */
    public CustomerProductDTO setCustomerProductId(Integer customerProductId) {
        this.customerProductId = customerProductId;
        return this;
    }

    /**
     * Getter for <code>invopay.customer_product.products</code>.
     */
    public String getProducts() {
        return this.products;
    }

    /**
     * Setter for <code>invopay.customer_product.products</code>.
     */
    public CustomerProductDTO setProducts(String products) {
        this.products = products;
        return this;
    }

    /**
     * Getter for <code>invopay.customer_product.order_id</code>.
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * Setter for <code>invopay.customer_product.order_id</code>.
     */
    public CustomerProductDTO setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Getter for <code>invopay.customer_product.shipping_amount</code>.
     */
    public Integer getShippingAmount() {
        return this.shippingAmount;
    }

    /**
     * Setter for <code>invopay.customer_product.shipping_amount</code>.
     */
    public CustomerProductDTO setShippingAmount(Integer shippingAmount) {
        this.shippingAmount = shippingAmount;
        return this;
    }

    /**
     * Getter for <code>invopay.customer_product.ref_customer_id</code>.
     */
    public Integer getRefCustomerId() {
        return this.refCustomerId;
    }

    /**
     * Setter for <code>invopay.customer_product.ref_customer_id</code>.
     */
    public CustomerProductDTO setRefCustomerId(Integer refCustomerId) {
        this.refCustomerId = refCustomerId;
        return this;
    }

    /**
     * Getter for <code>invopay.customer_product.payment_type</code>.
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * Setter for <code>invopay.customer_product.payment_type</code>.
     */
    public CustomerProductDTO setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    /**
     * Getter for <code>invopay.customer_product.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.customer_product.added_date</code>.
     */
    public CustomerProductDTO setAddedDate(LocalDateTime addedDate) {
        this.addedDate = addedDate;
        return this;
    }

    /**
     * Getter for <code>invopay.customer_product.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.customer_product.transaction_id</code>.
     */
    public CustomerProductDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.customer_product.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.customer_product.delete_status</code>.
     */
    public CustomerProductDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
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
        final CustomerProductDTO other = (CustomerProductDTO) obj;
        if (customerProductId == null) {
            if (other.customerProductId != null)
                return false;
        }
        else if (!customerProductId.equals(other.customerProductId))
            return false;
        if (products == null) {
            if (other.products != null)
                return false;
        }
        else if (!products.equals(other.products))
            return false;
        if (orderId == null) {
            if (other.orderId != null)
                return false;
        }
        else if (!orderId.equals(other.orderId))
            return false;
        if (shippingAmount == null) {
            if (other.shippingAmount != null)
                return false;
        }
        else if (!shippingAmount.equals(other.shippingAmount))
            return false;
        if (refCustomerId == null) {
            if (other.refCustomerId != null)
                return false;
        }
        else if (!refCustomerId.equals(other.refCustomerId))
            return false;
        if (paymentType == null) {
            if (other.paymentType != null)
                return false;
        }
        else if (!paymentType.equals(other.paymentType))
            return false;
        if (addedDate == null) {
            if (other.addedDate != null)
                return false;
        }
        else if (!addedDate.equals(other.addedDate))
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.customerProductId == null) ? 0 : this.customerProductId.hashCode());
        result = prime * result + ((this.products == null) ? 0 : this.products.hashCode());
        result = prime * result + ((this.orderId == null) ? 0 : this.orderId.hashCode());
        result = prime * result + ((this.shippingAmount == null) ? 0 : this.shippingAmount.hashCode());
        result = prime * result + ((this.refCustomerId == null) ? 0 : this.refCustomerId.hashCode());
        result = prime * result + ((this.paymentType == null) ? 0 : this.paymentType.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CustomerProduct (");

        sb.append(customerProductId);
        sb.append(", ").append(products);
        sb.append(", ").append(orderId);
        sb.append(", ").append(shippingAmount);
        sb.append(", ").append(refCustomerId);
        sb.append(", ").append(paymentType);
        sb.append(", ").append(addedDate);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(deleteStatus);

        sb.append(")");
        return sb.toString();
    }
}