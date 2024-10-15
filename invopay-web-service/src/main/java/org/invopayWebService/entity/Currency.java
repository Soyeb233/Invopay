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
@Table(name = "currency")
public class Currency {

  @Id
  @Column(name = "currency_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer currencyId;

  @Column(name = "currency_name", nullable = false)
  private String currencyName;

  @Column(name = "currency_code", nullable = false)
  private String currencyCode;

  @Column(name = "country_name", nullable = false)
  private String countryName;

  @Column(name = "country_code", nullable = false)
  private String countryCode;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
