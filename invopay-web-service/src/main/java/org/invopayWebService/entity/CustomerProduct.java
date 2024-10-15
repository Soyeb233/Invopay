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
@Table(name = "customer_product")
public class CustomerProduct {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "customer_product_id", nullable = false)
  private Integer customerProductId;

  @Column(name = "order_id", nullable = false)
  private String orderId;

  @Column(name = "shipping_amount", nullable = false)
  private Integer shippingAmount;

  @Column(name = "ref_customer_id", nullable = false)
  private Integer refCustomerId;

  @Column(name = "payment_type", nullable = false)
  private String paymentType;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "products", nullable = false)
  private String products;

}
