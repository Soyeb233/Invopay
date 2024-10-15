package org.invopayWebService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "po_intent")
public class PoIntent {

  @Id
  @Column(name = "po_intent_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer poIntentId;

  @Column(name = "sku", nullable = false)
  private String sku;

  @Column(name = "product_name", nullable = false)
  private String productName;

  @Column(name = "unit", nullable = false)
  private String unit;

  @Column(name = "schedule", nullable = false)
  private String schedule;

  @Column(name = "base_price", nullable = false)
  private Float basePrice;

  @Column(name = "mrp", nullable = false)
  private Float mrp;

}
