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
@Table(name = "invoice_setting")
public class InvoiceSetting {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "invoice_setting_id", nullable = false)
  private Integer invoiceSettingId;

  @Column(name = "invoice_setting_name")
  private String invoiceSettingName;

  @Column(name = "ref_supplier_id", nullable = false)
  private Integer refSupplierId;

  @Column(name = "auto_payment_reminder", nullable = false)
  private Boolean autoPaymentReminder;

  @Column(name = "partial_payment", nullable = false)
  private Boolean partialPayment;

  @Column(name = "auto_payment_receipt", nullable = false)
  private Boolean autoPaymentReceipt;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
