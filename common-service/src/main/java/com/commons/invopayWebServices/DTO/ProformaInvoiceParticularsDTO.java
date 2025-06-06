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
public class ProformaInvoiceParticularsDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       proformaInvoiceParticularsId;
    private Integer       refProductId;
    private Double        price;
    private Integer       qty;
    private String        basePl;
    private Double        basePrice;
    private LocalDate     scheduleDate;
    private Integer       discPerc;
    private Integer       asPerc;
    private Double        total;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public ProformaInvoiceParticularsDTO() {}

    public ProformaInvoiceParticularsDTO(ProformaInvoiceParticularsDTO value) {
        this.proformaInvoiceParticularsId = value.proformaInvoiceParticularsId;
        this.refProductId = value.refProductId;
        this.price = value.price;
        this.qty = value.qty;
        this.basePl = value.basePl;
        this.basePrice = value.basePrice;
        this.scheduleDate = value.scheduleDate;
        this.discPerc = value.discPerc;
        this.asPerc = value.asPerc;
        this.total = value.total;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public ProformaInvoiceParticularsDTO(
        Integer       proformaInvoiceParticularsId,
        Integer       refProductId,
        Double        price,
        Integer       qty,
        String        basePl,
        Double        basePrice,
        LocalDate     scheduleDate,
        Integer       discPerc,
        Integer       asPerc,
        Double        total,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.proformaInvoiceParticularsId = proformaInvoiceParticularsId;
        this.refProductId = refProductId;
        this.price = price;
        this.qty = qty;
        this.basePl = basePl;
        this.basePrice = basePrice;
        this.scheduleDate = scheduleDate;
        this.discPerc = discPerc;
        this.asPerc = asPerc;
        this.total = total;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.proforma_invoice_particulars.proforma_invoice_particulars_id</code>.
     */
    public Integer getProformaInvoiceParticularsId() {
        return this.proformaInvoiceParticularsId;
    }

    /**
     * Setter for <code>invopay.proforma_invoice_particulars.proforma_invoice_particulars_id</code>.
     */
    public ProformaInvoiceParticularsDTO setProformaInvoiceParticularsId(Integer proformaInvoiceParticularsId) {
        this.proformaInvoiceParticularsId = proformaInvoiceParticularsId;
        return this;
    }

    /**
     * Getter for <code>invopay.proforma_invoice_particulars.ref_product_id</code>.
     */
    public Integer getRefProductId() {
        return this.refProductId;
    }

    /**
     * Setter for <code>invopay.proforma_invoice_particulars.ref_product_id</code>.
     */
    public ProformaInvoiceParticularsDTO setRefProductId(Integer refProductId) {
        this.refProductId = refProductId;
        return this;
    }

    /**
     * Getter for <code>invopay.proforma_invoice_particulars.price</code>.
     */
    public Double getPrice() {
        return this.price;
    }

    /**
     * Setter for <code>invopay.proforma_invoice_particulars.price</code>.
     */
    public ProformaInvoiceParticularsDTO setPrice(Double price) {
        this.price = price;
        return this;
    }

    /**
     * Getter for <code>invopay.proforma_invoice_particulars.qty</code>.
     */
    public Integer getQty() {
        return this.qty;
    }

    /**
     * Setter for <code>invopay.proforma_invoice_particulars.qty</code>.
     */
    public ProformaInvoiceParticularsDTO setQty(Integer qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Getter for <code>invopay.proforma_invoice_particulars.base_pl</code>.
     */
    public String getBasePl() {
        return this.basePl;
    }

    /**
     * Setter for <code>invopay.proforma_invoice_particulars.base_pl</code>.
     */
    public ProformaInvoiceParticularsDTO setBasePl(String basePl) {
        this.basePl = basePl;
        return this;
    }

    /**
     * Getter for <code>invopay.proforma_invoice_particulars.base_price</code>.
     */
    public Double getBasePrice() {
        return this.basePrice;
    }

    /**
     * Setter for <code>invopay.proforma_invoice_particulars.base_price</code>.
     */
    public ProformaInvoiceParticularsDTO setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
        return this;
    }

    /**
     * Getter for <code>invopay.proforma_invoice_particulars.schedule_date</code>.
     */
    public LocalDate getScheduleDate() {
        return this.scheduleDate;
    }

    /**
     * Setter for <code>invopay.proforma_invoice_particulars.schedule_date</code>.
     */
    public ProformaInvoiceParticularsDTO setScheduleDate(LocalDate scheduleDate) {
        this.scheduleDate = scheduleDate;
        return this;
    }

    /**
     * Getter for <code>invopay.proforma_invoice_particulars.disc_perc</code>.
     */
    public Integer getDiscPerc() {
        return this.discPerc;
    }

    /**
     * Setter for <code>invopay.proforma_invoice_particulars.disc_perc</code>.
     */
    public ProformaInvoiceParticularsDTO setDiscPerc(Integer discPerc) {
        this.discPerc = discPerc;
        return this;
    }

    /**
     * Getter for <code>invopay.proforma_invoice_particulars.as_perc</code>.
     */
    public Integer getAsPerc() {
        return this.asPerc;
    }

    /**
     * Setter for <code>invopay.proforma_invoice_particulars.as_perc</code>.
     */
    public ProformaInvoiceParticularsDTO setAsPerc(Integer asPerc) {
        this.asPerc = asPerc;
        return this;
    }

    /**
     * Getter for <code>invopay.proforma_invoice_particulars.total</code>.
     */
    public Double getTotal() {
        return this.total;
    }

    /**
     * Setter for <code>invopay.proforma_invoice_particulars.total</code>.
     */
    public ProformaInvoiceParticularsDTO setTotal(Double total) {
        this.total = total;
        return this;
    }

    /**
     * Getter for <code>invopay.proforma_invoice_particulars.ref_user_id</code>. User
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.proforma_invoice_particulars.ref_user_id</code>. User
     */
    public ProformaInvoiceParticularsDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.proforma_invoice_particulars.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.proforma_invoice_particulars.delete_status</code>.
     */
    public ProformaInvoiceParticularsDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.proforma_invoice_particulars.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.proforma_invoice_particulars.transaction_id</code>.
     */
    public ProformaInvoiceParticularsDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.proforma_invoice_particulars.added_date</code>. Added Date
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.proforma_invoice_particulars.added_date</code>. Added Date
     */
    public ProformaInvoiceParticularsDTO setAddedDate(LocalDateTime addedDate) {
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
        final ProformaInvoiceParticularsDTO other = (ProformaInvoiceParticularsDTO) obj;
        if (proformaInvoiceParticularsId == null) {
            if (other.proformaInvoiceParticularsId != null)
                return false;
        }
        else if (!proformaInvoiceParticularsId.equals(other.proformaInvoiceParticularsId))
            return false;
        if (refProductId == null) {
            if (other.refProductId != null)
                return false;
        }
        else if (!refProductId.equals(other.refProductId))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        }
        else if (!price.equals(other.price))
            return false;
        if (qty == null) {
            if (other.qty != null)
                return false;
        }
        else if (!qty.equals(other.qty))
            return false;
        if (basePl == null) {
            if (other.basePl != null)
                return false;
        }
        else if (!basePl.equals(other.basePl))
            return false;
        if (basePrice == null) {
            if (other.basePrice != null)
                return false;
        }
        else if (!basePrice.equals(other.basePrice))
            return false;
        if (scheduleDate == null) {
            if (other.scheduleDate != null)
                return false;
        }
        else if (!scheduleDate.equals(other.scheduleDate))
            return false;
        if (discPerc == null) {
            if (other.discPerc != null)
                return false;
        }
        else if (!discPerc.equals(other.discPerc))
            return false;
        if (asPerc == null) {
            if (other.asPerc != null)
                return false;
        }
        else if (!asPerc.equals(other.asPerc))
            return false;
        if (total == null) {
            if (other.total != null)
                return false;
        }
        else if (!total.equals(other.total))
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
        result = prime * result + ((this.proformaInvoiceParticularsId == null) ? 0 : this.proformaInvoiceParticularsId.hashCode());
        result = prime * result + ((this.refProductId == null) ? 0 : this.refProductId.hashCode());
        result = prime * result + ((this.price == null) ? 0 : this.price.hashCode());
        result = prime * result + ((this.qty == null) ? 0 : this.qty.hashCode());
        result = prime * result + ((this.basePl == null) ? 0 : this.basePl.hashCode());
        result = prime * result + ((this.basePrice == null) ? 0 : this.basePrice.hashCode());
        result = prime * result + ((this.scheduleDate == null) ? 0 : this.scheduleDate.hashCode());
        result = prime * result + ((this.discPerc == null) ? 0 : this.discPerc.hashCode());
        result = prime * result + ((this.asPerc == null) ? 0 : this.asPerc.hashCode());
        result = prime * result + ((this.total == null) ? 0 : this.total.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProformaInvoiceParticulars (");

        sb.append(proformaInvoiceParticularsId);
        sb.append(", ").append(refProductId);
        sb.append(", ").append(price);
        sb.append(", ").append(qty);
        sb.append(", ").append(basePl);
        sb.append(", ").append(basePrice);
        sb.append(", ").append(scheduleDate);
        sb.append(", ").append(discPerc);
        sb.append(", ").append(asPerc);
        sb.append(", ").append(total);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
