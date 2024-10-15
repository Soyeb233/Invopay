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
@Table(name = "compact_cot_small")
public class CompactCotSmall {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "compact_cot_small_id", nullable = false)
  private Integer compactCotSmallId;

  @Column(name = "compact_cot_small_name", nullable = false)
  private String compactCotSmallName;

  @Column(name = "compact_cot_quality", nullable = false)
  private String compactCotQuality;

  @Column(name = "compact_cot_size", nullable = false)
  private Integer compactCotSize;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
