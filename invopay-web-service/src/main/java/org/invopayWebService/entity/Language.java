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
@Table(name = "language")
public class Language {

  @Id
  @Column(name = "language_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer languageId;

  @Column(name = "language_name")
  private String languageName;

  @Column(name = "short_name", nullable = false)
  private String shortName;

  @Column(name = "flag_image")
  private String flagImage;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
