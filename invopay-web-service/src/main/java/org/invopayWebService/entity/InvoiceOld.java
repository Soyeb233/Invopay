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
@Table(name = "invoice_old")
public class InvoiceOld {

  @Id
  @Column(name = "invoice_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer invoiceId;

  @Column(name = "financial_year", nullable = false)
  private String financialYear;

  @Column(name = "ref_patient_visit_id", nullable = false)
  private Integer refPatientVisitId;

  @Column(name = "invoice_no", nullable = false)
  private String invoiceNo;

  @Column(name = "invoice_name", nullable = false)
  private String invoiceName;

  @Column(name = "ref_purchase_order_id", nullable = false)
  private Integer refPurchaseOrderId;

  @Column(name = "invoice_date", nullable = false)
  private Date invoiceDate;

  @Column(name = "ref_employee_id", nullable = false)
  private Integer refEmployeeId;

  @Column(name = "ref_customer_id", nullable = false)
  private Integer refCustomerId;

  @Column(name = "ref_patient_id", nullable = false)
  private Integer refPatientId;

  @Column(name = "sub_total", nullable = false)
  private Float subTotal;

  @Column(name = "ref_discount_type_id", nullable = false)
  private Integer refDiscountTypeId;

  @Column(name = "discount_value", nullable = false)
  private Integer discountValue;

  @Column(name = "discount_total", nullable = false)
  private Float discountTotal;

  @Column(name = "itemwise_discount", nullable = false)
  private Boolean itemwiseDiscount;

  @Column(name = "gst_total", nullable = false)
  private Float gstTotal;

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

  @Column(name = "grand_total", nullable = false)
  private Float grandTotal;

  @Column(name = "invoice_total", nullable = false)
  private Float invoiceTotal;

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

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "invoice_details", nullable = false)
  private String invoiceDetails;

  @Column(name = "invoice_terms_and_condition", nullable = false)
  private String invoiceTermsAndCondition;

}
