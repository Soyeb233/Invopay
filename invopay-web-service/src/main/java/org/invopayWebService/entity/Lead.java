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
@Table(name = "lead")
public class Lead {

  @Id
  @Column(name = "lead_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer leadId;

  @Column(name = "lead_name", nullable = false)
  private String leadName;

  @Column(name = "lead_data_collection_date_and_time", nullable = false)
  private Date leadDataCollectionDateAndTime;

  @Column(name = "ref_data_source_id", nullable = false)
  private Integer refDataSourceId;

  @Column(name = "lead_data_source_others", nullable = false)
  private String leadDataSourceOthers;

  @Column(name = "ref_business_category_id", nullable = false)
  private Integer refBusinessCategoryId;

  @Column(name = "ref_salutation_id", nullable = false)
  private String refSalutationId;

  @Column(name = "lead_address_line1", nullable = false)
  private String leadAddressLine1;

  @Column(name = "lead_address_line2", nullable = false)
  private String leadAddressLine2;

  @Column(name = "lead_address_line3", nullable = false)
  private String leadAddressLine3;

  @Column(name = "ref_area_id", nullable = false)
  private Integer refAreaId;

  @Column(name = "ref_city_id", nullable = false)
  private Integer refCityId;

  @Column(name = "ref_district_id", nullable = false)
  private Integer refDistrictId;

  @Column(name = "ref_state_id", nullable = false)
  private Integer refStateId;

  @Column(name = "ref_country_id", nullable = false)
  private Integer refCountryId;

  @Column(name = "lead_pincode", nullable = false)
  private String leadPincode;

  @Column(name = "lead_referred_date", nullable = false)
  private Date leadReferredDate;

  @Column(name = "lead_referred_by", nullable = false)
  private String leadReferredBy;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "lead_data_source_link", nullable = false)
  private String leadDataSourceLink;

}
