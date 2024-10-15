package org.invopayWebService.entity;

import java.time.LocalDate;
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
@Table(name = "admin_setting")
public class AdminSetting {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "admin_setting_id", nullable = false)
  private Integer adminSettingId;

  @Column(name = "type", nullable = false)
  private Integer type;

  @Column(name = "admin_setting_key", nullable = false)
  private String adminSettingKey;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate = java.sql.Date.valueOf(LocalDate.now());

  @Column(name = "admin_setting_value", nullable = false)
  private String adminSettingValue;

}
