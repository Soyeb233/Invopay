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
public class ProductEnquiryDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       productEnquiryId;
    private Integer       refProductId;
    private String        name;
    private String        venue;
    private String        state;
    private String        email;
    private String        phone;
    private String        message;
    private Integer       productQuantity;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public ProductEnquiryDTO() {}

    public ProductEnquiryDTO(ProductEnquiryDTO value) {
        this.productEnquiryId = value.productEnquiryId;
        this.refProductId = value.refProductId;
        this.name = value.name;
        this.venue = value.venue;
        this.state = value.state;
        this.email = value.email;
        this.phone = value.phone;
        this.message = value.message;
        this.productQuantity = value.productQuantity;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public ProductEnquiryDTO(
        Integer       productEnquiryId,
        Integer       refProductId,
        String        name,
        String        venue,
        String        state,
        String        email,
        String        phone,
        String        message,
        Integer       productQuantity,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.productEnquiryId = productEnquiryId;
        this.refProductId = refProductId;
        this.name = name;
        this.venue = venue;
        this.state = state;
        this.email = email;
        this.phone = phone;
        this.message = message;
        this.productQuantity = productQuantity;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.product_enquiry.product_enquiry_id</code>.
     */
    public Integer getProductEnquiryId() {
        return this.productEnquiryId;
    }

    /**
     * Setter for <code>invopay.product_enquiry.product_enquiry_id</code>.
     */
    public ProductEnquiryDTO setProductEnquiryId(Integer productEnquiryId) {
        this.productEnquiryId = productEnquiryId;
        return this;
    }

    /**
     * Getter for <code>invopay.product_enquiry.ref_product_id</code>.
     */
    public Integer getRefProductId() {
        return this.refProductId;
    }

    /**
     * Setter for <code>invopay.product_enquiry.ref_product_id</code>.
     */
    public ProductEnquiryDTO setRefProductId(Integer refProductId) {
        this.refProductId = refProductId;
        return this;
    }

    /**
     * Getter for <code>invopay.product_enquiry.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>invopay.product_enquiry.name</code>.
     */
    public ProductEnquiryDTO setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>invopay.product_enquiry.venue</code>.
     */
    public String getVenue() {
        return this.venue;
    }

    /**
     * Setter for <code>invopay.product_enquiry.venue</code>.
     */
    public ProductEnquiryDTO setVenue(String venue) {
        this.venue = venue;
        return this;
    }

    /**
     * Getter for <code>invopay.product_enquiry.state</code>.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Setter for <code>invopay.product_enquiry.state</code>.
     */
    public ProductEnquiryDTO setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Getter for <code>invopay.product_enquiry.email</code>.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>invopay.product_enquiry.email</code>.
     */
    public ProductEnquiryDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Getter for <code>invopay.product_enquiry.phone</code>.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Setter for <code>invopay.product_enquiry.phone</code>.
     */
    public ProductEnquiryDTO setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Getter for <code>invopay.product_enquiry.message</code>.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for <code>invopay.product_enquiry.message</code>.
     */
    public ProductEnquiryDTO setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Getter for <code>invopay.product_enquiry.product_quantity</code>.
     */
    public Integer getProductQuantity() {
        return this.productQuantity;
    }

    /**
     * Setter for <code>invopay.product_enquiry.product_quantity</code>.
     */
    public ProductEnquiryDTO setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
        return this;
    }

    /**
     * Getter for <code>invopay.product_enquiry.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.product_enquiry.ref_user_id</code>.
     */
    public ProductEnquiryDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.product_enquiry.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.product_enquiry.delete_status</code>.
     */
    public ProductEnquiryDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.product_enquiry.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.product_enquiry.transaction_id</code>.
     */
    public ProductEnquiryDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.product_enquiry.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.product_enquiry.added_date</code>.
     */
    public ProductEnquiryDTO setAddedDate(LocalDateTime addedDate) {
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
        final ProductEnquiryDTO other = (ProductEnquiryDTO) obj;
        if (productEnquiryId == null) {
            if (other.productEnquiryId != null)
                return false;
        }
        else if (!productEnquiryId.equals(other.productEnquiryId))
            return false;
        if (refProductId == null) {
            if (other.refProductId != null)
                return false;
        }
        else if (!refProductId.equals(other.refProductId))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (venue == null) {
            if (other.venue != null)
                return false;
        }
        else if (!venue.equals(other.venue))
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
        }
        else if (!state.equals(other.state))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        }
        else if (!email.equals(other.email))
            return false;
        if (phone == null) {
            if (other.phone != null)
                return false;
        }
        else if (!phone.equals(other.phone))
            return false;
        if (message == null) {
            if (other.message != null)
                return false;
        }
        else if (!message.equals(other.message))
            return false;
        if (productQuantity == null) {
            if (other.productQuantity != null)
                return false;
        }
        else if (!productQuantity.equals(other.productQuantity))
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
        result = prime * result + ((this.productEnquiryId == null) ? 0 : this.productEnquiryId.hashCode());
        result = prime * result + ((this.refProductId == null) ? 0 : this.refProductId.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.venue == null) ? 0 : this.venue.hashCode());
        result = prime * result + ((this.state == null) ? 0 : this.state.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.phone == null) ? 0 : this.phone.hashCode());
        result = prime * result + ((this.message == null) ? 0 : this.message.hashCode());
        result = prime * result + ((this.productQuantity == null) ? 0 : this.productQuantity.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProductEnquiry (");

        sb.append(productEnquiryId);
        sb.append(", ").append(refProductId);
        sb.append(", ").append(name);
        sb.append(", ").append(venue);
        sb.append(", ").append(state);
        sb.append(", ").append(email);
        sb.append(", ").append(phone);
        sb.append(", ").append(message);
        sb.append(", ").append(productQuantity);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
