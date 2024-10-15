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
@Table(name = "despatch_mode")
public class DespatchMode {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "despatch_mode_id", nullable = false)
  private Integer despatchModeId;

  @Column(name = "despatch_mode_name", nullable = false)
  private String despatchModeName;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}