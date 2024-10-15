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
@Table(name = "product_batch")
public class ProductBatch {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_batch_id", nullable = false)
  private Integer productBatchId;

  @Column(name = "ref_purchase_order_id", nullable = false)
  private Integer refPurchaseOrderId;

  @Column(name = "ref_product_id", nullable = false)
  private Integer refProductId;

  @Column(name = "product_batch_name", nullable = false)
  private String productBatchName;

  @Column(name = "quantity", nullable = false)
  private Integer quantity;

  @Column(name = "avail_quantity", nullable = false)
  private Integer availQuantity;

  @Column(name = "price", nullable = false)
  private Float price;

  @Column(name = "manufacture_date", nullable = false)
  private Date manufactureDate;

  @Column(name = "expiry_date", nullable = false)
  private Date expiryDate;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
