package org.invopayWebService.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "temp_product")
public class TempProduct {

  @Id
  @Column(name = "temp_product_id", nullable = false)
  private Integer tempProductId;

  @Column(name = "product_id", nullable = false)
  private Integer productId;

  @Column(name = "quantity", nullable = false)
  private Integer quantity;

  @Column(name = "customer_id", nullable = false)
  private Integer customerId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
