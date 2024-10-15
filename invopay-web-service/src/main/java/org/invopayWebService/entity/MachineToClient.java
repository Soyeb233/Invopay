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
@Table(name = "machine_to_client")
public class MachineToClient {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "machine_to_client_id", nullable = false)
  private Integer machineToClientId;

  @Column(name = "ref_client_id", nullable = false)
  private Integer refClientId;

  @Column(name = "ref_machine_id", nullable = false)
  private Integer refMachineId;

  @Column(name = "ref_make_id", nullable = false)
  private Integer refMakeId;

  @Column(name = "ref_model_id", nullable = false)
  private Integer refModelId;

  @Column(name = "no_of_machine", nullable = false)
  private Integer noOfMachine;

  @Column(name = "no_of_spindles", nullable = false)
  private Integer noOfSpindles;

  @Column(name = "no_of_drums", nullable = false)
  private Integer noOfDrums;

  @Column(name = "no_of_rotors", nullable = false)
  private Integer noOfRotors;

  @Column(name = "belt_id", nullable = false)
  private String beltId;

  @Column(name = "ref_tape_size_id", nullable = false)
  private Integer refTapeSizeId;

  @Column(name = "ref_top_apron_id", nullable = false)
  private Integer refTopApronId;

  @Column(name = "ref_bottom_apron_id", nullable = false)
  private Integer refBottomApronId;

  @Column(name = "ref_front_cot_id", nullable = false)
  private Integer refFrontCotId;

  @Column(name = "ref_back_cot_id", nullable = false)
  private Integer refBackCotId;

  @Column(name = "ref_compact_cot_small_id", nullable = false)
  private Integer refCompactCotSmallId;

  @Column(name = "ref_compact_cot_big_id", nullable = false)
  private Integer refCompactCotBigId;

  @Column(name = "total_spindles", nullable = false)
  private Integer totalSpindles;

  @Column(name = "total_drums", nullable = false)
  private Integer totalDrums;

  @Column(name = "total_rotors", nullable = false)
  private Integer totalRotors;

  @Column(name = "ref_user_id", nullable = false)
  private Integer refUserId;

  @Column(name = "delete_status", nullable = false)
  private Integer deleteStatus;

  @Column(name = "transaction_id", nullable = false)
  private Integer transactionId;

  @Column(name = "added_date", nullable = false)
  private Date addedDate;

}
