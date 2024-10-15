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
@Table(name = "user")
public class User {

  @Id
  @Column(name = "user_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer userId;

  @Column(name = "user_name", nullable = false)
  private String userName;

  @Column(name = "full_name", nullable = false)
  private String fullName;

  @Column(name = "nick_name", nullable = false)
  private String nickName;

  @Column(name = "company_name")
  private String companyName;

  @Column(name = "street")
  private String street;

  @Column(name = "state")
  private String state;

  @Column(name = "postcode")
  private String postcode="";

  @Column(name = "suburb")
  private String suburb="";

  @Column(name = "ref_country_id", nullable = false)
  private Integer refCountryId=0;

  @Column(name = "phone")
  private String phone="";

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "password", nullable = false)
  private String password="";

  @Column(name = "original_password", nullable = false)
  private String originalPassword="";

  @Column(name = "imei_no", nullable = false)
  private String imeiNo="";

  @Column(name = "ref_user_group_id", nullable = false)
  private Integer refUserGroupId=0;

  @Column(name = "ref_client_id", nullable = false)
  private Integer refClientId=0;

  @Column(name = "ref_supplier_id", nullable = false)
  private Integer refSupplierId=0;

  @Column(name = "audit_record", nullable = false)
  private Integer auditRecord=0;

  @Column(name = "session_time_limit", nullable = false)
  private Integer sessionTimeLimit=0;

  @Column(name = "reminder_interval_time", nullable = false)
  private Integer reminderIntervalTime=0;

  @Column(name = "user_image", nullable = false)
  private String userImage="";

  @Column(name = "login_time", nullable = false)
  private Date loginTime= java.sql.Date.valueOf(LocalDate.now());

  @Column(name = "last_login_time", nullable = false)
  private Date lastLoginTime= java.sql.Date.valueOf(LocalDate.now());

  @Column(name = "status", nullable = false)
  private Integer status=0;

  @Column(name = "website")
  private String website="";

  @Column(name = "vat_number")
  private String vatNumber="";

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId=0;

  @Column(name = "added_date", nullable = false)
  private Date addedDate=java.sql.Date.valueOf(LocalDate.now());

}
