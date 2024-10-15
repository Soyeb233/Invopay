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
@Table(name = "customer_order_product")
public class CustomerOrderProduct {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "customer_order_product_id", nullable = false)
  private Integer customerOrderProductId;

  @Column(name = "ref_product_id", nullable = false)
  private Integer refProductId;

  @Column(name = "ref_customer_order_id", nullable = false)
  private Integer refCustomerOrderId;

  @Column(name = "quantity", nullable = false)
  private Integer quantity;

  @Column(name = "price", nullable = false)
  private Float price;

  @Column(name = "product_total", nullable = false)
  private Float productTotal;

  @Column(name = "gst_percentage", nullable = false)
  private Float gstPercentage;

  @Column(name = "gst_amount", nullable = false)
  private Float gstAmount;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
