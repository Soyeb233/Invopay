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
@Table(name = "general_reminder")
public class GeneralReminder {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "general_reminder_id", nullable = false)
  private Integer generalReminderId;

  @Column(name = "general_reminder_name", nullable = false)
  private String generalReminderName;

  @Column(name = "general_reminder_details", nullable = false)
  private String generalReminderDetails;

  @Column(name = "assigned_user_id", nullable = false)
  private Integer assignedUserId;

  @Column(name = "ref_priority_id", nullable = false)
  private Integer refPriorityId;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "ref_status_id", nullable = false)
  private Integer refStatusId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "assigned_date", nullable = false)
  private Date assignedDate;

  @Column(name = "completed_date", nullable = false)
  private Date completedDate;

  @Column(name = "reference_link", nullable = false)
  private String referenceLink;

  @Column(name = "reference_file", nullable = false)
  private String referenceFile;

  @Column(name = "file_update_status", nullable = false)
  private String fileUpdateStatus;

  @Column(name = "view_status", nullable = false)
  private Integer viewStatus;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

}
