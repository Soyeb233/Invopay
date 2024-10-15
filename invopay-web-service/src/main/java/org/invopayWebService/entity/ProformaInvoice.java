package org.invopayWebService.entity;

import java.math.BigDecimal;
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
@Table(name = "proforma_invoice")
public class ProformaInvoice {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "proforma_invoice_id", nullable = false)
  private Integer proformaInvoiceId;

  @Column(name = "proforma_invoice_name", nullable = false)
  private String proformaInvoiceName;

  @Column(name = "ref_client_id", nullable = false)
  private Integer refClientId;

  @Column(name = "ref_supplier_id", nullable = false)
  private Integer refSupplierId;

  @Column(name = "proforma_invoice_date", nullable = false)
  private Date proformaInvoiceDate;

  @Column(name = "proforma_invoice_no", nullable = false)
  private String proformaInvoiceNo;

  @Column(name = "proforma_invoice_code", nullable = false)
  private String proformaInvoiceCode;

  @Column(name = "proforma_invoice_file", nullable = false)
  private String proformaInvoiceFile;

  @Column(name = "sub_total", nullable = false)
  private Float subTotal;

  @Column(name = "ref_discount_type_id", nullable = false)
  private Integer refDiscountTypeId;

  @Column(name = "discount_value", nullable = false)
  private Integer discountValue;

  @Column(name = "discount_total", nullable = false)
  private Float discountTotal;

  @Column(name = "extra_total", nullable = false)
  private Integer extraTotal;

  @Column(name = "p_and_f_total", nullable = false)
  private Float pAndFTotal;

  @Column(name = "gst_total", nullable = false)
  private BigDecimal gstTotal;

  @Column(name = "round_off_type", nullable = false)
  private String roundOffType;

  @Column(name = "round_off", nullable = false)
  private BigDecimal roundOff;

  @Column(name = "grand_total", nullable = false)
  private Float grandTotal;

  @Column(name = "display_discount_to_customer", nullable = false)
  private Integer displayDiscountToCustomer;

  @Column(name = "mail_status", nullable = false)
  private Integer mailStatus;

  @Column(name = "email_subject", nullable = false)
  private String emailSubject;

  @Column(name = "purchase_order_create_status", nullable = false)
  private Integer purchaseOrderCreateStatus;

  @Column(name = "ref_proforma_invoice_status_id", nullable = false)
  private Integer refProformaInvoiceStatusId;

  @Column(name = "invoice_date", nullable = false)
  private Date invoiceDate;

  @Column(name = "invoice_no", nullable = false)
  private String invoiceNo;

  @Column(name = "company_proforma", nullable = false)
  private Integer companyProforma;

  @Column(name = "notebook", nullable = false)
  private String notebook;

  @Column(name = "company_proforma_file", nullable = false)
  private String companyProformaFile;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "proforma_invoice_details", nullable = false)
  private String proformaInvoiceDetails;

  @Column(name = "proforma_invoice_reference", nullable = false)
  private String proformaInvoiceReference;

  @Column(name = "proforma_invoice_additional_details", nullable = false)
  private String proformaInvoiceAdditionalDetails;

  @Column(name = "terms_and_conditions", nullable = false)
  private String termsAndConditions;

  @Column(name = "client_email", nullable = false)
  private String clientEmail;

  @Column(name = "email_additional", nullable = false)
  private String emailAdditional;

  @Column(name = "details", nullable = false)
  private String details;

}
