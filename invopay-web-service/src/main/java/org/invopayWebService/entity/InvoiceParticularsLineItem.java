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
@Table(name = "invoice_particulars_line_item")
public class InvoiceParticularsLineItem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "invoice_particulars_line_item_id", nullable = false)
  private Integer invoiceParticularsLineItemId;

  @Column(name = "invoice_particulars_line_item_name")
  private String invoiceParticularsLineItemName;

  @Column(name = "ref_invoice_particulars_id", nullable = false)
  private Integer refInvoiceParticularsId;

  @Column(name = "file")
  private String file;

  @Column(name = "line_item_date", nullable = false)
  private Date lineItemDate;

  @Column(name = "link_title")
  private String linkTitle;

  @Column(name = "link_url", nullable = false)
  private String linkUrl;

  @Column(name = "ref_tag_id", nullable = false)
  private Integer refTagId;

  @Column(name = "ref_vat_id", nullable = false)
  private Integer refVatId;

  @Column(name = "ref_discount_id", nullable = false)
  private Integer refDiscountId;

  @Column(name = "ref_shipping_id", nullable = false)
  private Integer refShippingId;

  @Column(name = "vat_total", nullable = false)
  private Float vatTotal;

  @Column(name = "discount_total", nullable = false)
  private Float discountTotal;

  @Column(name = "shipping_total", nullable = false)
  private Float shippingTotal;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
