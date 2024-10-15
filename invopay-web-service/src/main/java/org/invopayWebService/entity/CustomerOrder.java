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
@Table(name = "customer_order")
public class CustomerOrder {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "customer_order_id", nullable = false)
  private Integer customerOrderId;

  @Column(name = "customer_order_name", nullable = false)
  private String customerOrderName;

  @Column(name = "ref_customer_id", nullable = false)
  private Integer refCustomerId;

  @Column(name = "sub_total", nullable = false)
  private Float subTotal;

  @Column(name = "gst", nullable = false)
  private Float gst;

  @Column(name = "shipping_charge", nullable = false)
  private Float shippingCharge;

  @Column(name = "convenience_fees", nullable = false)
  private Float convenienceFees;

  @Column(name = "final_total", nullable = false)
  private Float finalTotal;

  @Column(name = "payment_method", nullable = false)
  private String paymentMethod;

  @Column(name = "ref_status_id", nullable = false)
  private Integer refStatusId;

  @Column(name = "shipping_method")
  private Integer shippingMethod;

  @Column(name = "ref_invoice_id", nullable = false)
  private Integer refInvoiceId;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
