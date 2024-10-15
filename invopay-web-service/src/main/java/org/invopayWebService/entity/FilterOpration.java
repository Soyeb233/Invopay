package org.invopayWebService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "filter_opration")
public class FilterOpration {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "filter_opration_id", nullable = false)
  private Integer filterOprationId;

  @Column(name = "filter_operation_details", nullable = false)
  private String filterOperationDetails;

}
