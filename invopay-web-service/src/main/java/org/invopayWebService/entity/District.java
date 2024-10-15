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
@Table(name = "district")
public class District {

  @Id
  @Column(name = "district_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer districtId;

  @Column(name = "district_name", nullable = false)
  private String districtName;

  @Column(name = "ref_state_id", nullable = false)
  private Integer refStateId;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
