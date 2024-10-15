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
@Table(name = "api_country")
public class ApiCountry {

  @Id
  @Column(name = "api_country_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long apiCountryId;

  @Column(name = "api_country_name", nullable = false)
  private String apiCountryName;

  @Column(name = "country_code", nullable = false)
  private String countryCode;

  @Column(name = "iso_country_code", nullable = false)
  private String isoCountryCode;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
