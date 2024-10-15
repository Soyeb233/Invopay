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
@Table(name = "enquiry")
public class Enquiry {

  @Id
  @Column(name = "enquiry_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer enquiryId;

  @Column(name = "enquiry_type", nullable = false)
  private String enquiryType;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "father_name", nullable = false)
  private String fatherName;

  @Column(name = "mobile", nullable = false)
  private Long mobile;

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "address", nullable = false)
  private String address;

  @Column(name = "course_interested", nullable = false)
  private String courseInterested;

  @Column(name = "subject", nullable = false)
  private String subject;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

  @Column(name = "message", nullable = false)
  private String message;

}
