package org.invopayWebService.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "invoice")
public class Invoice {

  @Id
  @Column(name = "invoice_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer invoiceId;

  @Column(name = "financial_year", nullable = false)
  private String financialYear;

  @Column(name = "invoice_no", nullable = false)
  private String invoiceNo;

  @Column(name = "invoice_name", nullable = false)
  private String invoiceName;

  @Column(name = "ref_supplier_id", nullable = false)
  private Integer refSupplierId;

  @Column(name = "ref_client_id", nullable = false)
  private Integer refClientId;

  @Column(name = "status", nullable = false)
  private Integer status;

  @Column(name = "title", nullable = false)
  private String title;

  @Column(name = "description", nullable = false)
  private String description;

  @Column(name = "ref_language_id", nullable = false)
  private Integer refLanguageId;

  @Column(name = "ref_currency_id", nullable = false)
  private Integer refCurrencyId;

  @Column(name = "invoice_date", nullable = false)
  private Date invoiceDate;

  @Column(name = "ref_due_type_id", nullable = false)
  private Integer refDueTypeId;

  @Column(name = "invoice_due_date")
  private Date invoiceDueDate;

  @Column(name = "purchase_order_no")
  private String purchaseOrderNo;

  @Column(name = "sub_total", nullable = false)
  private Float subTotal;

  @Column(name = "ref_vat_id", nullable = false)
  private Integer refVatId;

  @Column(name = "gst_total", nullable = false)
  private Float gstTotal;

  @Column(name = "ref_discount_id", nullable = false)
  private Integer refDiscountId;

  @Column(name = "discount_total", nullable = false)
  private Float discountTotal;

  @Column(name = "ref_shipping_id", nullable = false)
  private Integer refShippingId;

  @Column(name = "shipping_total", nullable = false)
  private Float shippingTotal;

  @Column(name = "grand_total", nullable = false)
  private Float grandTotal;

  @Column(name = "balance_total", nullable = false)
  private Float balanceTotal;

  @Column(name = "ref_product_id", nullable = false)
  private Integer refProductId;

  @Column(name = "product_qty", nullable = false)
  private Integer productQty;

  @Column(name = "order_status", nullable = false)
  private String orderStatus;

  @Column(name = "product_enquiry_id", nullable = false)
  private Integer productEnquiryId;

  @Column(name = "ref_purchase_order_id", nullable = false)
  private Integer refPurchaseOrderId;

  @Column(name = "ref_employee_id", nullable = false)
  private Integer refEmployeeId;

  @Column(name = "ref_customer_id", nullable = false)
  private Integer refCustomerId;

  @Column(name = "ref_discount_type_id", nullable = false)
  private Integer refDiscountTypeId;

  @Column(name = "discount_value", nullable = false)
  private Integer discountValue;

  @Column(name = "itemwise_discount", nullable = false)
  private Boolean itemwiseDiscount;

  @Column(name = "gst_5_total", nullable = false)
  private Float gst5Total;

  @Column(name = "gst_12_total", nullable = false)
  private Float gst12Total;

  @Column(name = "gst_18_total", nullable = false)
  private Float gst18Total;

  @Column(name = "extra_total", nullable = false)
  private Integer extraTotal;

  @Column(name = "p_and_f_total", nullable = false)
  private Integer pAndFTotal;

  @Column(name = "round_off_type", nullable = false)
  private String roundOffType;

  @Column(name = "round_off", nullable = false)
  private Float roundOff;

  @Column(name = "invoice_total", nullable = false)
  private Float invoiceTotal;

  @Column(name = "app_fee")
  private Float appFee;

  @Column(name = "invoice_file", nullable = false)
  private String invoiceFile;

  @Column(name = "invoice_payment_status", nullable = false)
  private Integer invoicePaymentStatus;

  @Column(name = "home_delivery", nullable = false)
  private Boolean homeDelivery;

  @Column(name = "ref_payment_type_id", nullable = false)
  private Integer refPaymentTypeId;

  @Column(name = "cancelled_date_time", nullable = false)
  private Date cancelledDateTime;

  @Column(name = "cancelled_reason", nullable = false)
  private String cancelledReason;

  @Column(name = "cancelled_by", nullable = false)
  private Integer cancelledBy;

  @Column(name = "archive_status", nullable = false)
  private Integer archiveStatus;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id")
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "commission_percentage", nullable = false)
  private Float commissionPercentage;

  @Column(name = "commission_amount", nullable = false)
  private Float commissionAmount;

  @Column(name = "is_commission_processed", nullable = false)
  private Boolean commissionProcessed;

  @Column(name = "payment_link", nullable = false)
  private String paymentLink;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "note")
  private String note;

  @Column(name = "message", nullable = false)
  private String message;

  @Column(name = "invoice_details", nullable = false)
  private String invoiceDetails;

  @Column(name = "invoice_terms_and_condition", nullable = false)
  private String invoiceTermsAndCondition;

}
