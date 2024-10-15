package org.invopayWebService.entity;

import java.time.LocalDate;
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
@Table(name = "product")
public class Product {

  @Id
  @Column(name = "product_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer productId;

  @Column(name = "seller_id", nullable = false)
  private Integer sellerId=0;

  @Column(name = "ref_supplier_id", nullable = false)
  private Integer refSupplierId=52;

  @Column(name = "product_name", nullable = false)
  private String productName;

  @Column(name = "price", nullable = false)
  private Float price;

  @Column(name = "stipepriceID", nullable = false)
  private String stipepriceID="price_1LcnZaCtAUePSQnjJJmI9i4a";

  @Column(name = "ref_quantity_type_id", nullable = false)
  private Integer refQuantityTypeId=10;

  @Column(name = "display_homepage", nullable = false)
  private Integer displayHomepage=0;

  @Column(name = "active_status", nullable = false)
  private Boolean activeStatus=true;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus=0;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId=0;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId=0;

  LocalDate localDate
          = LocalDate.now();
  @Column(name = "added_date", nullable = false)
  private Date addedDate=java.sql.Date.valueOf(localDate);;

  @Column(name = "description", nullable = false)
  private String description;

}
