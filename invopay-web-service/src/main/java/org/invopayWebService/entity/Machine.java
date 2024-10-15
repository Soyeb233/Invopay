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
@Table(name = "machine")
public class Machine {

  @Id
  @Column(name = "machine_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer machineId;

  @Column(name = "machine_name", nullable = false)
  private String machineName;

  @Column(name = "model_status", nullable = false)
  private Integer modelStatus;

  @Column(name = "make_status", nullable = false)
  private Integer makeStatus;

  @Column(name = "no_of_machine_status", nullable = false)
  private Integer noOfMachineStatus;

  @Column(name = "no_of_spindles_status", nullable = false)
  private Integer noOfSpindlesStatus;

  @Column(name = "no_of_drums_status", nullable = false)
  private Integer noOfDrumsStatus;

  @Column(name = "no_of_rotors_status", nullable = false)
  private Integer noOfRotorsStatus;

  @Column(name = "tape_size_status", nullable = false)
  private Integer tapeSizeStatus;

  @Column(name = "top_apron_status", nullable = false)
  private Integer topApronStatus;

  @Column(name = "bottom_apron_status", nullable = false)
  private Integer bottomApronStatus;

  @Column(name = "front_cot_status", nullable = false)
  private Integer frontCotStatus;

  @Column(name = "back_cot_status", nullable = false)
  private Integer backCotStatus;

  @Column(name = "compact_cot_small_status", nullable = false)
  private Integer compactCotSmallStatus;

  @Column(name = "compact_cot_big_status", nullable = false)
  private Integer compactCotBigStatus;

  @Column(name = "belt_status", nullable = false)
  private Integer beltStatus;

  @Column(name = "sort_order", nullable = false)
  private Integer sortOrder;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
