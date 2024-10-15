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
@Table(name = "dashboard_block")
public class DashboardBlock {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "dashboard_block_id", nullable = false)
  private Integer dashboardBlockId;

  @Column(name = "dashboard_block_name", nullable = false)
  private String dashboardBlockName;

  @Column(name = "dashboard_block_key", nullable = false)
  private String dashboardBlockKey;

  @Column(name = "column_width", nullable = false)
  private Integer columnWidth;

  @Column(name = "sort_order", nullable = false)
  private Integer sortOrder;

  @Column(name = "ref_active_status_id", nullable = false)
  private Integer refActiveStatusId;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
