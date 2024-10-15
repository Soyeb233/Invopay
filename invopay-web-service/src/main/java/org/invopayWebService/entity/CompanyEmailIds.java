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
@Table(name = "company_email_ids")
public class CompanyEmailIds {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "company_email_id", nullable = false)
  private Integer companyEmailId;

  @Column(name = "ref_company_id", nullable = false)
  private Integer refCompanyId;

  @Column(name = "primary_contact", nullable = false)
  private Integer primaryContact;

  @Column(name = "email_id", nullable = false)
  private String emailId;

  @Column(name = "contact_person", nullable = false)
  private String contactPerson;

  @Column(name = "ref_designation_id", nullable = false)
  private Integer refDesignationId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
