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
@Table(name = "proforma_invoice_particulars")
public class ProformaInvoiceParticulars {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "proforma_invoice_particulars_id", nullable = false)
  private Integer proformaInvoiceParticularsId;

  @Column(name = "ref_product_id", nullable = false)
  private Integer refProductId;

  @Column(name = "price", nullable = false)
  private Float price;

  @Column(name = "qty", nullable = false)
  private Integer qty;

  @Column(name = "base_pl", nullable = false)
  private String basePl;

  @Column(name = "base_price", nullable = false)
  private Float basePrice;

  @Column(name = "schedule_date", nullable = false)
  private Date scheduleDate;

  @Column(name = "disc_perc", nullable = false)
  private Integer discPerc;

  @Column(name = "as_perc", nullable = false)
  private Integer asPerc;

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

}
