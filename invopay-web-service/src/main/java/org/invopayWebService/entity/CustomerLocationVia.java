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
@Table(name = "customer_location_via")
public class CustomerLocationVia {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "customer_location_via_id", nullable = false)
  private Integer customerLocationViaId;

  @Column(name = "customer_location_id", nullable = false)
  private Integer customerLocationId;

  @Column(name = "ref_pincode_id", nullable = false)
  private Integer refPincodeId;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
