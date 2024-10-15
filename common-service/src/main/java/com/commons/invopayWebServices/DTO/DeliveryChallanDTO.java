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
public class DeliveryChallanDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       deliveryChallanId;
    private String        deliveryChallanName;
    private Integer       refProductSampleRequestId;
    private Integer       refClientId;
    private Integer       refSupplierId;
    private LocalDate     deliveryChallanDate;
    private String        deliveryChallanNo;
    private String        deliveryChallanCode;
    private Integer       refDespatchModeId;
    private Integer       refDeliveryPointId;
    private String        deliveryChallanFile;
    private String        deliveryChallanDetails;
    private String        deliveryChallanAdditionalDetails;
    private String        emailSubject;
    private String        supplierEmail;
    private String        emailAdditional;
    private Integer       customerDeliveryChallan;
    private LocalDate     customerDeliveryChallanDate;
    private String        customerDeliveryChallanCode;
    private Integer       customerDespatchModeId;
    private Integer       customerDeliveryPointId;
    private String        customerDeliveryChallanFile;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public DeliveryChallanDTO() {}

    public DeliveryChallanDTO(DeliveryChallanDTO value) {
        this.deliveryChallanId = value.deliveryChallanId;
        this.deliveryChallanName = value.deliveryChallanName;
        this.refProductSampleRequestId = value.refProductSampleRequestId;
        this.refClientId = value.refClientId;
        this.refSupplierId = value.refSupplierId;
        this.deliveryChallanDate = value.deliveryChallanDate;
        this.deliveryChallanNo = value.deliveryChallanNo;
        this.deliveryChallanCode = value.deliveryChallanCode;
        this.refDespatchModeId = value.refDespatchModeId;
        this.refDeliveryPointId = value.refDeliveryPointId;
        this.deliveryChallanFile = value.deliveryChallanFile;
        this.deliveryChallanDetails = value.deliveryChallanDetails;
        this.deliveryChallanAdditionalDetails = value.deliveryChallanAdditionalDetails;
        this.emailSubject = value.emailSubject;
        this.supplierEmail = value.supplierEmail;
        this.emailAdditional = value.emailAdditional;
        this.customerDeliveryChallan = value.customerDeliveryChallan;
        this.customerDeliveryChallanDate = value.customerDeliveryChallanDate;
        this.customerDeliveryChallanCode = value.customerDeliveryChallanCode;
        this.customerDespatchModeId = value.customerDespatchModeId;
        this.customerDeliveryPointId = value.customerDeliveryPointId;
        this.customerDeliveryChallanFile = value.customerDeliveryChallanFile;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public DeliveryChallanDTO(
        Integer       deliveryChallanId,
        String        deliveryChallanName,
        Integer       refProductSampleRequestId,
        Integer       refClientId,
        Integer       refSupplierId,
        LocalDate     deliveryChallanDate,
        String        deliveryChallanNo,
        String        deliveryChallanCode,
        Integer       refDespatchModeId,
        Integer       refDeliveryPointId,
        String        deliveryChallanFile,
        String        deliveryChallanDetails,
        String        deliveryChallanAdditionalDetails,
        String        emailSubject,
        String        supplierEmail,
        String        emailAdditional,
        Integer       customerDeliveryChallan,
        LocalDate     customerDeliveryChallanDate,
        String        customerDeliveryChallanCode,
        Integer       customerDespatchModeId,
        Integer       customerDeliveryPointId,
        String        customerDeliveryChallanFile,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.deliveryChallanId = deliveryChallanId;
        this.deliveryChallanName = deliveryChallanName;
        this.refProductSampleRequestId = refProductSampleRequestId;
        this.refClientId = refClientId;
        this.refSupplierId = refSupplierId;
        this.deliveryChallanDate = deliveryChallanDate;
        this.deliveryChallanNo = deliveryChallanNo;
        this.deliveryChallanCode = deliveryChallanCode;
        this.refDespatchModeId = refDespatchModeId;
        this.refDeliveryPointId = refDeliveryPointId;
        this.deliveryChallanFile = deliveryChallanFile;
        this.deliveryChallanDetails = deliveryChallanDetails;
        this.deliveryChallanAdditionalDetails = deliveryChallanAdditionalDetails;
        this.emailSubject = emailSubject;
        this.supplierEmail = supplierEmail;
        this.emailAdditional = emailAdditional;
        this.customerDeliveryChallan = customerDeliveryChallan;
        this.customerDeliveryChallanDate = customerDeliveryChallanDate;
        this.customerDeliveryChallanCode = customerDeliveryChallanCode;
        this.customerDespatchModeId = customerDespatchModeId;
        this.customerDeliveryPointId = customerDeliveryPointId;
        this.customerDeliveryChallanFile = customerDeliveryChallanFile;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.delivery_challan.delivery_challan_id</code>.
     */
    public Integer getDeliveryChallanId() {
        return this.deliveryChallanId;
    }

    /**
     * Setter for <code>invopay.delivery_challan.delivery_challan_id</code>.
     */
    public DeliveryChallanDTO setDeliveryChallanId(Integer deliveryChallanId) {
        this.deliveryChallanId = deliveryChallanId;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.delivery_challan_name</code>.
     */
    public String getDeliveryChallanName() {
        return this.deliveryChallanName;
    }

    /**
     * Setter for <code>invopay.delivery_challan.delivery_challan_name</code>.
     */
    public DeliveryChallanDTO setDeliveryChallanName(String deliveryChallanName) {
        this.deliveryChallanName = deliveryChallanName;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.ref_product_sample_request_id</code>.
     */
    public Integer getRefProductSampleRequestId() {
        return this.refProductSampleRequestId;
    }

    /**
     * Setter for <code>invopay.delivery_challan.ref_product_sample_request_id</code>.
     */
    public DeliveryChallanDTO setRefProductSampleRequestId(Integer refProductSampleRequestId) {
        this.refProductSampleRequestId = refProductSampleRequestId;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.ref_client_id</code>. Client
     */
    public Integer getRefClientId() {
        return this.refClientId;
    }

    /**
     * Setter for <code>invopay.delivery_challan.ref_client_id</code>. Client
     */
    public DeliveryChallanDTO setRefClientId(Integer refClientId) {
        this.refClientId = refClientId;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.ref_supplier_id</code>. Supplier
     */
    public Integer getRefSupplierId() {
        return this.refSupplierId;
    }

    /**
     * Setter for <code>invopay.delivery_challan.ref_supplier_id</code>. Supplier
     */
    public DeliveryChallanDTO setRefSupplierId(Integer refSupplierId) {
        this.refSupplierId = refSupplierId;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.delivery_challan_date</code>. Date
     */
    public LocalDate getDeliveryChallanDate() {
        return this.deliveryChallanDate;
    }

    /**
     * Setter for <code>invopay.delivery_challan.delivery_challan_date</code>. Date
     */
    public DeliveryChallanDTO setDeliveryChallanDate(LocalDate deliveryChallanDate) {
        this.deliveryChallanDate = deliveryChallanDate;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.delivery_challan_no</code>.
     */
    public String getDeliveryChallanNo() {
        return this.deliveryChallanNo;
    }

    /**
     * Setter for <code>invopay.delivery_challan.delivery_challan_no</code>.
     */
    public DeliveryChallanDTO setDeliveryChallanNo(String deliveryChallanNo) {
        this.deliveryChallanNo = deliveryChallanNo;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.delivery_challan_code</code>. DC No
     */
    public String getDeliveryChallanCode() {
        return this.deliveryChallanCode;
    }

    /**
     * Setter for <code>invopay.delivery_challan.delivery_challan_code</code>. DC No
     */
    public DeliveryChallanDTO setDeliveryChallanCode(String deliveryChallanCode) {
        this.deliveryChallanCode = deliveryChallanCode;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.ref_despatch_mode_id</code>. Despatch
     */
    public Integer getRefDespatchModeId() {
        return this.refDespatchModeId;
    }

    /**
     * Setter for <code>invopay.delivery_challan.ref_despatch_mode_id</code>. Despatch
     */
    public DeliveryChallanDTO setRefDespatchModeId(Integer refDespatchModeId) {
        this.refDespatchModeId = refDespatchModeId;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.ref_delivery_point_id</code>. Delivery To
     */
    public Integer getRefDeliveryPointId() {
        return this.refDeliveryPointId;
    }

    /**
     * Setter for <code>invopay.delivery_challan.ref_delivery_point_id</code>. Delivery To
     */
    public DeliveryChallanDTO setRefDeliveryPointId(Integer refDeliveryPointId) {
        this.refDeliveryPointId = refDeliveryPointId;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.delivery_challan_file</code>.
     */
    public String getDeliveryChallanFile() {
        return this.deliveryChallanFile;
    }

    /**
     * Setter for <code>invopay.delivery_challan.delivery_challan_file</code>.
     */
    public DeliveryChallanDTO setDeliveryChallanFile(String deliveryChallanFile) {
        this.deliveryChallanFile = deliveryChallanFile;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.delivery_challan_details</code>.
     */
    public String getDeliveryChallanDetails() {
        return this.deliveryChallanDetails;
    }

    /**
     * Setter for <code>invopay.delivery_challan.delivery_challan_details</code>.
     */
    public DeliveryChallanDTO setDeliveryChallanDetails(String deliveryChallanDetails) {
        this.deliveryChallanDetails = deliveryChallanDetails;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.delivery_challan_additional_details</code>.
     */
    public String getDeliveryChallanAdditionalDetails() {
        return this.deliveryChallanAdditionalDetails;
    }

    /**
     * Setter for <code>invopay.delivery_challan.delivery_challan_additional_details</code>.
     */
    public DeliveryChallanDTO setDeliveryChallanAdditionalDetails(String deliveryChallanAdditionalDetails) {
        this.deliveryChallanAdditionalDetails = deliveryChallanAdditionalDetails;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.email_subject</code>.
     */
    public String getEmailSubject() {
        return this.emailSubject;
    }

    /**
     * Setter for <code>invopay.delivery_challan.email_subject</code>.
     */
    public DeliveryChallanDTO setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.supplier_email</code>.
     */
    public String getSupplierEmail() {
        return this.supplierEmail;
    }

    /**
     * Setter for <code>invopay.delivery_challan.supplier_email</code>.
     */
    public DeliveryChallanDTO setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.email_additional</code>.
     */
    public String getEmailAdditional() {
        return this.emailAdditional;
    }

    /**
     * Setter for <code>invopay.delivery_challan.email_additional</code>.
     */
    public DeliveryChallanDTO setEmailAdditional(String emailAdditional) {
        this.emailAdditional = emailAdditional;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.customer_delivery_challan</code>.
     */
    public Integer getCustomerDeliveryChallan() {
        return this.customerDeliveryChallan;
    }

    /**
     * Setter for <code>invopay.delivery_challan.customer_delivery_challan</code>.
     */
    public DeliveryChallanDTO setCustomerDeliveryChallan(Integer customerDeliveryChallan) {
        this.customerDeliveryChallan = customerDeliveryChallan;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.customer_delivery_challan_date</code>.
     */
    public LocalDate getCustomerDeliveryChallanDate() {
        return this.customerDeliveryChallanDate;
    }

    /**
     * Setter for <code>invopay.delivery_challan.customer_delivery_challan_date</code>.
     */
    public DeliveryChallanDTO setCustomerDeliveryChallanDate(LocalDate customerDeliveryChallanDate) {
        this.customerDeliveryChallanDate = customerDeliveryChallanDate;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.customer_delivery_challan_code</code>.
     */
    public String getCustomerDeliveryChallanCode() {
        return this.customerDeliveryChallanCode;
    }

    /**
     * Setter for <code>invopay.delivery_challan.customer_delivery_challan_code</code>.
     */
    public DeliveryChallanDTO setCustomerDeliveryChallanCode(String customerDeliveryChallanCode) {
        this.customerDeliveryChallanCode = customerDeliveryChallanCode;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.customer_despatch_mode_id</code>.
     */
    public Integer getCustomerDespatchModeId() {
        return this.customerDespatchModeId;
    }

    /**
     * Setter for <code>invopay.delivery_challan.customer_despatch_mode_id</code>.
     */
    public DeliveryChallanDTO setCustomerDespatchModeId(Integer customerDespatchModeId) {
        this.customerDespatchModeId = customerDespatchModeId;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.customer_delivery_point_id</code>.
     */
    public Integer getCustomerDeliveryPointId() {
        return this.customerDeliveryPointId;
    }

    /**
     * Setter for <code>invopay.delivery_challan.customer_delivery_point_id</code>.
     */
    public DeliveryChallanDTO setCustomerDeliveryPointId(Integer customerDeliveryPointId) {
        this.customerDeliveryPointId = customerDeliveryPointId;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.customer_delivery_challan_file</code>.
     */
    public String getCustomerDeliveryChallanFile() {
        return this.customerDeliveryChallanFile;
    }

    /**
     * Setter for <code>invopay.delivery_challan.customer_delivery_challan_file</code>.
     */
    public DeliveryChallanDTO setCustomerDeliveryChallanFile(String customerDeliveryChallanFile) {
        this.customerDeliveryChallanFile = customerDeliveryChallanFile;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.delivery_challan.ref_user_id</code>.
     */
    public DeliveryChallanDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.delivery_challan.delete_status</code>.
     */
    public DeliveryChallanDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.delivery_challan.transaction_id</code>.
     */
    public DeliveryChallanDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.delivery_challan.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.delivery_challan.added_date</code>.
     */
    public DeliveryChallanDTO setAddedDate(LocalDateTime addedDate) {
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
        final DeliveryChallanDTO other = (DeliveryChallanDTO) obj;
        if (deliveryChallanId == null) {
            if (other.deliveryChallanId != null)
                return false;
        }
        else if (!deliveryChallanId.equals(other.deliveryChallanId))
            return false;
        if (deliveryChallanName == null) {
            if (other.deliveryChallanName != null)
                return false;
        }
        else if (!deliveryChallanName.equals(other.deliveryChallanName))
            return false;
        if (refProductSampleRequestId == null) {
            if (other.refProductSampleRequestId != null)
                return false;
        }
        else if (!refProductSampleRequestId.equals(other.refProductSampleRequestId))
            return false;
        if (refClientId == null) {
            if (other.refClientId != null)
                return false;
        }
        else if (!refClientId.equals(other.refClientId))
            return false;
        if (refSupplierId == null) {
            if (other.refSupplierId != null)
                return false;
        }
        else if (!refSupplierId.equals(other.refSupplierId))
            return false;
        if (deliveryChallanDate == null) {
            if (other.deliveryChallanDate != null)
                return false;
        }
        else if (!deliveryChallanDate.equals(other.deliveryChallanDate))
            return false;
        if (deliveryChallanNo == null) {
            if (other.deliveryChallanNo != null)
                return false;
        }
        else if (!deliveryChallanNo.equals(other.deliveryChallanNo))
            return false;
        if (deliveryChallanCode == null) {
            if (other.deliveryChallanCode != null)
                return false;
        }
        else if (!deliveryChallanCode.equals(other.deliveryChallanCode))
            return false;
        if (refDespatchModeId == null) {
            if (other.refDespatchModeId != null)
                return false;
        }
        else if (!refDespatchModeId.equals(other.refDespatchModeId))
            return false;
        if (refDeliveryPointId == null) {
            if (other.refDeliveryPointId != null)
                return false;
        }
        else if (!refDeliveryPointId.equals(other.refDeliveryPointId))
            return false;
        if (deliveryChallanFile == null) {
            if (other.deliveryChallanFile != null)
                return false;
        }
        else if (!deliveryChallanFile.equals(other.deliveryChallanFile))
            return false;
        if (deliveryChallanDetails == null) {
            if (other.deliveryChallanDetails != null)
                return false;
        }
        else if (!deliveryChallanDetails.equals(other.deliveryChallanDetails))
            return false;
        if (deliveryChallanAdditionalDetails == null) {
            if (other.deliveryChallanAdditionalDetails != null)
                return false;
        }
        else if (!deliveryChallanAdditionalDetails.equals(other.deliveryChallanAdditionalDetails))
            return false;
        if (emailSubject == null) {
            if (other.emailSubject != null)
                return false;
        }
        else if (!emailSubject.equals(other.emailSubject))
            return false;
        if (supplierEmail == null) {
            if (other.supplierEmail != null)
                return false;
        }
        else if (!supplierEmail.equals(other.supplierEmail))
            return false;
        if (emailAdditional == null) {
            if (other.emailAdditional != null)
                return false;
        }
        else if (!emailAdditional.equals(other.emailAdditional))
            return false;
        if (customerDeliveryChallan == null) {
            if (other.customerDeliveryChallan != null)
                return false;
        }
        else if (!customerDeliveryChallan.equals(other.customerDeliveryChallan))
            return false;
        if (customerDeliveryChallanDate == null) {
            if (other.customerDeliveryChallanDate != null)
                return false;
        }
        else if (!customerDeliveryChallanDate.equals(other.customerDeliveryChallanDate))
            return false;
        if (customerDeliveryChallanCode == null) {
            if (other.customerDeliveryChallanCode != null)
                return false;
        }
        else if (!customerDeliveryChallanCode.equals(other.customerDeliveryChallanCode))
            return false;
        if (customerDespatchModeId == null) {
            if (other.customerDespatchModeId != null)
                return false;
        }
        else if (!customerDespatchModeId.equals(other.customerDespatchModeId))
            return false;
        if (customerDeliveryPointId == null) {
            if (other.customerDeliveryPointId != null)
                return false;
        }
        else if (!customerDeliveryPointId.equals(other.customerDeliveryPointId))
            return false;
        if (customerDeliveryChallanFile == null) {
            if (other.customerDeliveryChallanFile != null)
                return false;
        }
        else if (!customerDeliveryChallanFile.equals(other.customerDeliveryChallanFile))
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
        result = prime * result + ((this.deliveryChallanId == null) ? 0 : this.deliveryChallanId.hashCode());
        result = prime * result + ((this.deliveryChallanName == null) ? 0 : this.deliveryChallanName.hashCode());
        result = prime * result + ((this.refProductSampleRequestId == null) ? 0 : this.refProductSampleRequestId.hashCode());
        result = prime * result + ((this.refClientId == null) ? 0 : this.refClientId.hashCode());
        result = prime * result + ((this.refSupplierId == null) ? 0 : this.refSupplierId.hashCode());
        result = prime * result + ((this.deliveryChallanDate == null) ? 0 : this.deliveryChallanDate.hashCode());
        result = prime * result + ((this.deliveryChallanNo == null) ? 0 : this.deliveryChallanNo.hashCode());
        result = prime * result + ((this.deliveryChallanCode == null) ? 0 : this.deliveryChallanCode.hashCode());
        result = prime * result + ((this.refDespatchModeId == null) ? 0 : this.refDespatchModeId.hashCode());
        result = prime * result + ((this.refDeliveryPointId == null) ? 0 : this.refDeliveryPointId.hashCode());
        result = prime * result + ((this.deliveryChallanFile == null) ? 0 : this.deliveryChallanFile.hashCode());
        result = prime * result + ((this.deliveryChallanDetails == null) ? 0 : this.deliveryChallanDetails.hashCode());
        result = prime * result + ((this.deliveryChallanAdditionalDetails == null) ? 0 : this.deliveryChallanAdditionalDetails.hashCode());
        result = prime * result + ((this.emailSubject == null) ? 0 : this.emailSubject.hashCode());
        result = prime * result + ((this.supplierEmail == null) ? 0 : this.supplierEmail.hashCode());
        result = prime * result + ((this.emailAdditional == null) ? 0 : this.emailAdditional.hashCode());
        result = prime * result + ((this.customerDeliveryChallan == null) ? 0 : this.customerDeliveryChallan.hashCode());
        result = prime * result + ((this.customerDeliveryChallanDate == null) ? 0 : this.customerDeliveryChallanDate.hashCode());
        result = prime * result + ((this.customerDeliveryChallanCode == null) ? 0 : this.customerDeliveryChallanCode.hashCode());
        result = prime * result + ((this.customerDespatchModeId == null) ? 0 : this.customerDespatchModeId.hashCode());
        result = prime * result + ((this.customerDeliveryPointId == null) ? 0 : this.customerDeliveryPointId.hashCode());
        result = prime * result + ((this.customerDeliveryChallanFile == null) ? 0 : this.customerDeliveryChallanFile.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DeliveryChallan (");

        sb.append(deliveryChallanId);
        sb.append(", ").append(deliveryChallanName);
        sb.append(", ").append(refProductSampleRequestId);
        sb.append(", ").append(refClientId);
        sb.append(", ").append(refSupplierId);
        sb.append(", ").append(deliveryChallanDate);
        sb.append(", ").append(deliveryChallanNo);
        sb.append(", ").append(deliveryChallanCode);
        sb.append(", ").append(refDespatchModeId);
        sb.append(", ").append(refDeliveryPointId);
        sb.append(", ").append(deliveryChallanFile);
        sb.append(", ").append(deliveryChallanDetails);
        sb.append(", ").append(deliveryChallanAdditionalDetails);
        sb.append(", ").append(emailSubject);
        sb.append(", ").append(supplierEmail);
        sb.append(", ").append(emailAdditional);
        sb.append(", ").append(customerDeliveryChallan);
        sb.append(", ").append(customerDeliveryChallanDate);
        sb.append(", ").append(customerDeliveryChallanCode);
        sb.append(", ").append(customerDespatchModeId);
        sb.append(", ").append(customerDeliveryPointId);
        sb.append(", ").append(customerDeliveryChallanFile);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}