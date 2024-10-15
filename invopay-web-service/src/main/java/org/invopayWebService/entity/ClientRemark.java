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
@Table(name = "client_remark")
public class ClientRemark {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "client_remark_id", nullable = false)
  private Integer clientRemarkId;

  @Column(name = "ref_client_id", nullable = false)
  private Integer refClientId;

  @Column(name = "client_remark_date_and_time", nullable = false)
  private Date clientRemarkDateAndTime;

  @Column(name = "client_remark_type", nullable = false)
  private String clientRemarkType;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "client_remark_details", nullable = false)
  private String clientRemarkDetails;

}
