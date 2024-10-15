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
@Table(name = "quantity_type")
public class QuantityType {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "quantity_type_id", nullable = false)
  private Integer quantityTypeId;

  @Column(name = "ref_supplier_id", nullable = false)
  private Integer refSupplierId;

  @Column(name = "quantity_type_name", nullable = false)
  private String quantityTypeName;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
