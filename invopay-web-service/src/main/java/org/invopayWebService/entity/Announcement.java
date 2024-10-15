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
@Table(name = "announcement")
public class Announcement {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "announcement_id", nullable = false)
  private Integer announcementId;

  @Column(name = "announcement_from_date", nullable = false)
  private Date announcementFromDate;

  @Column(name = "announcement_to_date", nullable = false)
  private Date announcementToDate;

  @Column(name = "announcement_details", nullable = false)
  private String announcementDetails;

  @Column(name = "announcement_visible_status", nullable = false)
  private Integer announcementVisibleStatus;

  @Column(name = "announcement_public", nullable = false)
  private Integer announcementPublic;

  @Column(name = "announcement_to_employee", nullable = false)
  private String announcementToEmployee;

  @Column(name = "ref_active_status_id", nullable = false)
  private Integer refActiveStatusId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
