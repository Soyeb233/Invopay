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
@Table(name = "module_key")
public class ModuleKey {

  @Id
  @Column(name = "module_key_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer moduleKeyId;

  @Column(name = "module_key_name", nullable = false)
  private String moduleKeyName;

  @Column(name = "module_key_display_name", nullable = false)
  private String moduleKeyDisplayName;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
