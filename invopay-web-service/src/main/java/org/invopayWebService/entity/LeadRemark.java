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
@Table(name = "lead_remark")
public class LeadRemark {

  @Id
  @Column(name = "lead_remark_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer leadRemarkId;

  @Column(name = "ref_lead_id", nullable = false)
  private Integer refLeadId;

  @Column(name = "lead_remark_date_and_time", nullable = false)
  private Date leadRemarkDateAndTime;

  @Column(name = "lead_remark_type", nullable = false)
  private String leadRemarkType;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "lead_remark_details", nullable = false)
  private String leadRemarkDetails;

}
