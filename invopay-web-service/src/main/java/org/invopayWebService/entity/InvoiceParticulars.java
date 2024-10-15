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
@Table(name = "invoice_particulars")
public class InvoiceParticulars {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "invoice_particulars_id", nullable = false)
  private Integer invoiceParticularsId;

  @Column(name = "invoice_particulars_name")
  private String invoiceParticularsName;

  @Column(name = "ref_invoice_id", nullable = false)
  private Integer refInvoiceId;

  @Column(name = "ref_product_id", nullable = false)
  private Integer refProductId;

  @Column(name = "product_name", nullable = false)
  private String productName;

  @Column(name = "product_description", nullable = false)
  private String productDescription;

  @Column(name = "ref_product_batch_id", nullable = false)
  private Integer refProductBatchId;

  @Column(name = "price", nullable = false)
  private Float price;

  @Column(name = "ref_discount_type_id", nullable = false)
  private Integer refDiscountTypeId;

  @Column(name = "discount_value", nullable = false)
  private BigDecimal discountValue;

  @Column(name = "discount_total", nullable = false)
  private Float discountTotal;

  @Column(name = "qty", nullable = false)
  private Integer qty;

  @Column(name = "ref_quantity_type_id", nullable = false)
  private Integer refQuantityTypeId;

  @Column(name = "gst_perc", nullable = false)
  private Float gstPerc;

  @Column(name = "sub_total", nullable = false)
  private Float subTotal;

  @Column(name = "gst", nullable = false)
  private Float gst;

  @Column(name = "total", nullable = false)
  private Float total;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "supplier_comm_perc", nullable = false)
  private BigDecimal supplierCommPerc;

  @Column(name = "supplier_comm_total", nullable = false)
  private BigDecimal supplierCommTotal;

}
