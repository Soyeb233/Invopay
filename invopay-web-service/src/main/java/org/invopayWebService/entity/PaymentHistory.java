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
@Table(name = "payment_history")
public class PaymentHistory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "payment_history_id", nullable = false)
  private Integer paymentHistoryId;

  @Column(name = "payment_history_no", nullable = false)
  private String paymentHistoryNo;

  @Column(name = "payment_history_name", nullable = false)
  private String paymentHistoryName;

  @Column(name = "ref_invoice_id", nullable = false)
  private Integer refInvoiceId;

  @Column(name = "invoice_payment_date", nullable = false)
  private Date invoicePaymentDate;

  @Column(name = "ref_payment_type_id", nullable = false)
  private Integer refPaymentTypeId;

  @Column(name = "invoice_payment_amount", nullable = false)
  private Integer invoicePaymentAmount;

  @Column(name = "invoice_payment_details", nullable = false)
  private String invoicePaymentDetails;

  @Column(name = "receipt_currency")
  private String receiptCurrency;

  @Column(name = "receipt_link")
  private String receiptLink;

  @Column(name = "mode_of_payment")
  private String modeOfPayment;

  @Column(name = "status")
  private String status;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
