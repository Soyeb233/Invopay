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
@Table(name = "payment_transction_history")
public class PaymentTransctionHistory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "payment_transction_history_id", nullable = false)
  private Integer paymentTransctionHistoryId;

  @Column(name = "payment_transction_history_name")
  private String paymentTransctionHistoryName;

  @Column(name = "ref_invoice_id", nullable = false)
  private Integer refInvoiceId;

  @Column(name = "ref_client_id", nullable = false)
  private Integer refClientId;

  @Column(name = "amount", nullable = false)
  private Float amount;

  @Column(name = "currency")
  private String currency;

  @Column(name = "paymentIntent")
  private String paymentIntent;

  @Column(name = "paymentIntentID", nullable = false)
  private String paymentIntentID;

  @Column(name = "customer")
  private String customer;

  @Column(name = "mode_of_payment")
  private String modeOfPayment;

  @Column(name = "card", nullable = false)
  private String card;

  @Column(name = "payment_source", nullable = false)
  private String paymentSource;

  @Column(name = "status", nullable = false)
  private Boolean status;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "ephemeralKey")
  private String ephemeralKey;

  @Column(name = "publishableKey")
  private String publishableKey;

}
