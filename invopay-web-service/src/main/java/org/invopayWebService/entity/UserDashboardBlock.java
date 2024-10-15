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
@Table(name = "user_dashboard_block")
public class UserDashboardBlock {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_dashboard_block_id", nullable = false)
  private Integer userDashboardBlockId;

  @Column(name = "ref_dashboard_block_id", nullable = false)
  private Integer refDashboardBlockId;

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
