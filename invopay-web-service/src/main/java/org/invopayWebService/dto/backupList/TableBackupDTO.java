/*
 * This file is generated by jOOQ.
 */
package org.invopayWebService.dto.backupList;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TableBackupDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       tableBackupId;
    private String        tableBackupName;
    private Integer       deleteStatus;
    private Integer       refUserId;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public TableBackupDTO() {}

    public TableBackupDTO(TableBackupDTO value) {
        this.tableBackupId = value.tableBackupId;
        this.tableBackupName = value.tableBackupName;
        this.deleteStatus = value.deleteStatus;
        this.refUserId = value.refUserId;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public TableBackupDTO(
        Integer       tableBackupId,
        String        tableBackupName,
        Integer       deleteStatus,
        Integer       refUserId,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.tableBackupId = tableBackupId;
        this.tableBackupName = tableBackupName;
        this.deleteStatus = deleteStatus;
        this.refUserId = refUserId;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.table_backup.table_backup_id</code>.
     */
    public Integer getTableBackupId() {
        return this.tableBackupId;
    }

    /**
     * Setter for <code>invopay.table_backup.table_backup_id</code>.
     */
    public TableBackupDTO setTableBackupId(Integer tableBackupId) {
        this.tableBackupId = tableBackupId;
        return this;
    }

    /**
     * Getter for <code>invopay.table_backup.table_backup_name</code>. File Name
     */
    public String getTableBackupName() {
        return this.tableBackupName;
    }

    /**
     * Setter for <code>invopay.table_backup.table_backup_name</code>. File Name
     */
    public TableBackupDTO setTableBackupName(String tableBackupName) {
        this.tableBackupName = tableBackupName;
        return this;
    }

    /**
     * Getter for <code>invopay.table_backup.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.table_backup.delete_status</code>.
     */
    public TableBackupDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.table_backup.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.table_backup.ref_user_id</code>.
     */
    public TableBackupDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.table_backup.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.table_backup.transaction_id</code>.
     */
    public TableBackupDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.table_backup.added_date</code>. Date
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.table_backup.added_date</code>. Date
     */
    public TableBackupDTO setAddedDate(LocalDateTime addedDate) {
        this.addedDate = addedDate;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final TableBackupDTO other = (TableBackupDTO) obj;
        if (tableBackupId == null) {
            if (other.tableBackupId != null)
                return false;
        }
        else if (!tableBackupId.equals(other.tableBackupId))
            return false;
        if (tableBackupName == null) {
            if (other.tableBackupName != null)
                return false;
        }
        else if (!tableBackupName.equals(other.tableBackupName))
            return false;
        if (deleteStatus == null) {
            if (other.deleteStatus != null)
                return false;
        }
        else if (!deleteStatus.equals(other.deleteStatus))
            return false;
        if (refUserId == null) {
            if (other.refUserId != null)
                return false;
        }
        else if (!refUserId.equals(other.refUserId))
            return false;
        if (transactionId == null) {
            if (other.transactionId != null)
                return false;
        }
        else if (!transactionId.equals(other.transactionId))
            return false;
        if (addedDate == null) {
            if (other.addedDate != null)
                return false;
        }
        else if (!addedDate.equals(other.addedDate))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.tableBackupId == null) ? 0 : this.tableBackupId.hashCode());
        result = prime * result + ((this.tableBackupName == null) ? 0 : this.tableBackupName.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TableBackup (");

        sb.append(tableBackupId);
        sb.append(", ").append(tableBackupName);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
