package org.invopayWebService.entity;

import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "purchase_order")
public class PurchaseOrder {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "purchase_order_id", nullable = false)
  private Integer purchaseOrderId;

  @Column(name = "purchase_order_code", nullable = false)
  private String purchaseOrderCode;

  @Column(name = "purchase_order_no", nullable = false)
  private String purchaseOrderNo;

  @Column(name = "purchase_order_date", nullable = false)
  private Date purchaseOrderDate;

  @Column(name = "ref_client_id", nullable = false)
  private Integer refClientId;

  @Column(name = "ref_supplier_id", nullable = false)
  private Integer refSupplierId;

  @Column(name = "ref_delivery_point_id", nullable = false)
  private Integer refDeliveryPointId;

  @Column(name = "ref_despatch_mode_id", nullable = false)
  private Integer refDespatchModeId;

  @Column(name = "schedule_date", nullable = false)
  private Date scheduleDate;

  @Column(name = "mail_status", nullable = false)
  private Integer mailStatus;

  @Column(name = "purchase_order_file", nullable = false)
  private String purchaseOrderFile;

  @Column(name = "sub_total", nullable = false)
  private Float subTotal;

  @Column(name = "supp_discount_total", nullable = false)
  private BigDecimal suppDiscountTotal;

  @Column(name = "ref_discount_type_id", nullable = false)
  private Integer refDiscountTypeId;

  @Column(name = "discount_value", nullable = false)
  private Integer discountValue;

  @Column(name = "discount_total", nullable = false)
  private Float discountTotal;

  @Column(name = "gst_total", nullable = false)
  private Float gstTotal;

  @Column(name = "extra_total", nullable = false)
  private Integer extraTotal;

  @Column(name = "p_and_f_total", nullable = false)
  private Integer pAndFTotal;

  @Column(name = "round_off_type", nullable = false)
  private String roundOffType;

  @Column(name = "round_off", nullable = false)
  private BigDecimal roundOff;

  @Column(name = "grand_total", nullable = false)
  private Float grandTotal;

  @Column(name = "invoice_status", nullable = false)
  private Integer invoiceStatus;

  @Column(name = "invoice_date", nullable = false)
  private Date invoiceDate;

  @Column(name = "invoice_no", nullable = false)
  private String invoiceNo;

  @Column(name = "invoice_total", nullable = false)
  private Float invoiceTotal;

  @Column(name = "invoice_file", nullable = false)
  private String invoiceFile;

  @Column(name = "invoice_payment_status", nullable = false)
  private Integer invoicePaymentStatus;

  @Column(name = "invoice_payment_date", nullable = false)
  private Date invoicePaymentDate;

  @Column(name = "invoice_payment_details", nullable = false)
  private String invoicePaymentDetails;

  @Column(name = "invoice_commission_status", nullable = false)
  private Integer invoiceCommissionStatus;

  @Column(name = "invoice_commission_date", nullable = false)
  private Date invoiceCommissionDate;

  @Column(name = "invoice_commission_details", nullable = false)
  private String invoiceCommissionDetails;

  @Column(name = "purchase_order_name", nullable = false)
  private String purchaseOrderName;

  @Column(name = "ref_proforma_invoice_id", nullable = false)
  private Integer refProformaInvoiceId;

  @Column(name = "purchase_order_complete_status", nullable = false)
  private Integer purchaseOrderCompleteStatus;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Integer addedDate;

  @Column(name = "purchase_order_details", nullable = false)
  private String purchaseOrderDetails;

  @Column(name = "terms_and_conditions", nullable = false)
  private String termsAndConditions;

  @Column(name = "special_instruction", nullable = false)
  private String specialInstruction;

}
