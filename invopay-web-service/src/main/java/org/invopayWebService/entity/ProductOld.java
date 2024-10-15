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
@Table(name = "product_old")
public class ProductOld {

  @Id
  @Column(name = "product_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer productId;

  @Column(name = "product_name", nullable = false)
  private String productName;

  @Column(name = "product_size", nullable = false)
  private Integer productSize;

  @Column(name = "unit", nullable = false)
  private String unit;

  @Column(name = "schedule", nullable = false)
  private String schedule;

  @Column(name = "ref_category_id", nullable = false)
  private Integer refCategoryId;

  @Column(name = "ref_gst_type_id", nullable = false)
  private Integer refGstTypeId;

  @Column(name = "product_price", nullable = false)
  private Float productPrice;

  @Column(name = "sku", nullable = false)
  private String sku;

  @Column(name = "ref_stock_room_id", nullable = false)
  private Integer refStockRoomId;

  @Column(name = "ref_stock_slot_id", nullable = false)
  private Integer refStockSlotId;

  @Column(name = "quantity", nullable = false)
  private Integer quantity;

  @Column(name = "ref_quantity_type_id", nullable = false)
  private Integer refQuantityTypeId;

  @Column(name = "product_image_file", nullable = false)
  private String productImageFile;

  @Column(name = "ref_star_rating_id", nullable = false)
  private Integer refStarRatingId;

  @Column(name = "expiry_date", nullable = false)
  private Date expiryDate;

  @Column(name = "reorder_level", nullable = false)
  private Integer reorderLevel;

  @Column(name = "reorder_status", nullable = false)
  private Integer reorderStatus;

  @Column(name = "featured_product", nullable = false)
  private Boolean featuredProduct;

  @Column(name = "display_homepage", nullable = false)
  private Integer displayHomepage;

  @Column(name = "supplier_comm_perc", nullable = false)
  private BigDecimal supplierCommPerc;

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
