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
@Table(name = "invoice_commission_history")
public class InvoiceCommissionHistory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "invoice_commission_history_id", nullable = false)
  private Integer invoiceCommissionHistoryId;

  @Column(name = "ref_invoice_id", nullable = false)
  private Integer refInvoiceId;

  @Column(name = "invoice_commission_date", nullable = false)
  private Date invoiceCommissionDate;

  @Column(name = "invoice_commission_amount", nullable = false)
  private Integer invoiceCommissionAmount;

  @Column(name = "invoice_commission_details", nullable = false)
  private String invoiceCommissionDetails;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
