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
@Table(name = "client_outstanding")
public class ClientOutstanding {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "client_outstanding_id", nullable = false)
  private Integer clientOutstandingId;

  @Column(name = "ref_company_id", nullable = false)
  private Integer refCompanyId;

  @Column(name = "ref_employee_id", nullable = false)
  private Integer refEmployeeId;

  @Column(name = "ref_supplier_id", nullable = false)
  private Integer refSupplierId;

  @Column(name = "ref_client_id", nullable = false)
  private Integer refClientId;

  @Column(name = "date", nullable = false)
  private Date date;

  @Column(name = "reference_no", nullable = false)
  private String referenceNo;

  @Column(name = "opening_amount", nullable = false)
  private Integer openingAmount;

  @Column(name = "pending_amount", nullable = false)
  private Integer pendingAmount;

  @Column(name = "overdue_by_days", nullable = false)
  private Integer overdueByDays;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
