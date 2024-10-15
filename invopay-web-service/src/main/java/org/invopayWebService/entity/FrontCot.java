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
@Table(name = "front_cot")
public class FrontCot {

  @Id
  @Column(name = "front_cot_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer frontCotId;

  @Column(name = "front_cot_name", nullable = false)
  private String frontCotName;

  @Column(name = "front_cot_quality", nullable = false)
  private String frontCotQuality;

  @Column(name = "front_cot_size", nullable = false)
  private Integer frontCotSize;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}