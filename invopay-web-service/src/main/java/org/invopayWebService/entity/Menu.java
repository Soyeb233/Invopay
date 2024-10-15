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
@Table(name = "menu")
public class Menu {

  @Id
  @Column(name = "menu_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer menuId;

  @Column(name = "menu_name", nullable = false)
  private String menuName;

  @Column(name = "menu_link", nullable = false)
  private String menuLink;

  @Column(name = "menu_access_key", nullable = false)
  private String menuAccessKey;

  @Column(name = "icon", nullable = false)
  private String icon;

  @Column(name = "alt_text", nullable = false)
  private String altText;

  @Column(name = "parent_id", nullable = false)
  private Integer parentId;

  @Column(name = "menu_alias_name", nullable = false)
  private String menuAliasName;

  @Column(name = "menu_table_name", nullable = false)
  private String menuTableName;

  @Column(name = "status_id", nullable = false)
  private Integer statusId;

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
