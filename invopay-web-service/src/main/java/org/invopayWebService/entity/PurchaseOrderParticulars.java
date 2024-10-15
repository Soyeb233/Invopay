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
@Table(name = "purchase_order_particulars")
public class PurchaseOrderParticulars {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "order_particulars_id", nullable = false)
  private Integer orderParticularsId;

  @Column(name = "ref_purchase_order_id", nullable = false)
  private Integer refPurchaseOrderId;

  @Column(name = "ref_product_id", nullable = false)
  private Integer refProductId;

  @Column(name = "price", nullable = false)
  private Float price;

  @Column(name = "qty", nullable = false)
  private Integer qty;

  @Column(name = "full_qty", nullable = false)
  private Integer fullQty;

  @Column(name = "supplier_comm_perc", nullable = false)
  private BigDecimal supplierCommPerc;

  @Column(name = "supplier_comm_total", nullable = false)
  private BigDecimal supplierCommTotal;

  @Column(name = "sub_total", nullable = false)
  private Float subTotal;

  @Column(name = "gst_perc", nullable = false)
  private Float gstPerc;

  @Column(name = "gst", nullable = false)
  private Float gst;

  @Column(name = "total", nullable = false)
  private Float total;

  @Column(name = "delivered_qty", nullable = false)
  private Integer deliveredQty;

  @Column(name = "damaged_qty", nullable = false)
  private Integer damagedQty;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
