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
@Table(name = "country")
public class Country {

  @Id
  @Column(name = "country_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer countryId;

  @Column(name = "country_name", nullable = false)
  private String countryName;

  @Column(name = "iso_code_2", nullable = false)
  private String isoCode2;

  @Column(name = "iso_code_3", nullable = false)
  private String isoCode3;

  @Column(name = "flag_image")
  private String flagImage;

  @Column(name = "status", nullable = false)
  private Boolean status;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
