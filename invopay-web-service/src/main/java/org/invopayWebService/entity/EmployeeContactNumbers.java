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
@Table(name = "employee_contact_numbers")
public class EmployeeContactNumbers {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "client_contact_id", nullable = false)
  private Integer clientContactId;

  @Column(name = "ref_employee_id", nullable = false)
  private Integer refEmployeeId;

  @Column(name = "primary_contact", nullable = false)
  private Integer primaryContact;

  @Column(name = "contact_person", nullable = false)
  private String contactPerson;

  @Column(name = "ref_designation_id", nullable = false)
  private Integer refDesignationId;

  @Column(name = "ref_contact_number_type_id", nullable = false)
  private Integer refContactNumberTypeId;

  @Column(name = "std_code", nullable = false)
  private String stdCode;

  @Column(name = "contact_number", nullable = false)
  private String contactNumber;

  @Column(name = "contact_extension", nullable = false)
  private Integer contactExtension;

  @Column(name = "contact_timing_from", nullable = false)
  private String contactTimingFrom;

  @Column(name = "contact_timing_to", nullable = false)
  private String contactTimingTo;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
