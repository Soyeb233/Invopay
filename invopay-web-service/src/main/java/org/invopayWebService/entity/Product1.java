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
@Table(name = "product1")
public class Product1 {

  @Id
  @Column(name = "product_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer productId;

  @Column(name = "product_name", nullable = false)
  private String productName;

  @Column(name = "protocol", nullable = false)
  private String protocol;

  @Column(name = "manufacturer", nullable = false)
  private String manufacturer;

  @Column(name = "model", nullable = false)
  private String model;

  @Column(name = "build_month_year", nullable = false)
  private String buildMonthYear;

  @Column(name = "serial_number", nullable = false)
  private String serialNumber;

  @Column(name = "denomination", nullable = false)
  private String denomination;

  @Column(name = "cabinet_style", nullable = false)
  private String cabinetStyle;

  @Column(name = "screen_size", nullable = false)
  private String screenSize;

  @Column(name = "link_ready", nullable = false)
  private String linkReady;

  @Column(name = "tito_brand", nullable = false)
  private String titoBrand;

  @Column(name = "validator_brand", nullable = false)
  private String validatorBrand;

  @Column(name = "price", nullable = false)
  private Float price;

  @Column(name = "display_homepage", nullable = false)
  private Integer displayHomepage;

  @Column(name = "active_status", nullable = false)
  private Boolean activeStatus;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "description", nullable = false)
  private String description;

}
