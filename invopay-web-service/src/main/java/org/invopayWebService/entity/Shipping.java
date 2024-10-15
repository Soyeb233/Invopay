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
@Table(name = "shipping")
public class Shipping {

  @Id
  @Column(name = "shipping_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer shippingId;

  @Column(name = "shipping_name", nullable = false)
  private String shippingName;

  @Column(name = "ref_supplier_id", nullable = false)
  private Integer refSupplierId;

  @Column(name = "rate", nullable = false)
  private Float rate;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
