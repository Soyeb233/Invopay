/*
 * This file is generated by jOOQ.
 */
package com.commons.invopayWebServices.DTO;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CronHistoryDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       cronHistoryId;
    private String        cronHistoryName;
    private LocalDateTime date;
    private String        content;
    private Integer       refUserId;
    private Integer       deleteStatus;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public CronHistoryDTO() {}

    public CronHistoryDTO(CronHistoryDTO value) {
        this.cronHistoryId = value.cronHistoryId;
        this.cronHistoryName = value.cronHistoryName;
        this.date = value.date;
        this.content = value.content;
        this.refUserId = value.refUserId;
        this.deleteStatus = value.deleteStatus;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public CronHistoryDTO(
        Integer       cronHistoryId,
        String        cronHistoryName,
        LocalDateTime date,
        String        content,
        Integer       refUserId,
        Integer       deleteStatus,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.cronHistoryId = cronHistoryId;
        this.cronHistoryName = cronHistoryName;
        this.date = date;
        this.content = content;
        this.refUserId = refUserId;
        this.deleteStatus = deleteStatus;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.cron_history.cron_history_id</code>.
     */
    public Integer getCronHistoryId() {
        return this.cronHistoryId;
    }

    /**
     * Setter for <code>invopay.cron_history.cron_history_id</code>.
     */
    public CronHistoryDTO setCronHistoryId(Integer cronHistoryId) {
        this.cronHistoryId = cronHistoryId;
        return this;
    }

    /**
     * Getter for <code>invopay.cron_history.cron_history_name</code>.
     */
    public String getCronHistoryName() {
        return this.cronHistoryName;
    }

    /**
     * Setter for <code>invopay.cron_history.cron_history_name</code>.
     */
    public CronHistoryDTO setCronHistoryName(String cronHistoryName) {
        this.cronHistoryName = cronHistoryName;
        return this;
    }

    /**
     * Getter for <code>invopay.cron_history.date</code>.
     */
    public LocalDateTime getDate() {
        return this.date;
    }

    /**
     * Setter for <code>invopay.cron_history.date</code>.
     */
    public CronHistoryDTO setDate(LocalDateTime date) {
        this.date = date;
        return this;
    }

    /**
     * Getter for <code>invopay.cron_history.content</code>.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Setter for <code>invopay.cron_history.content</code>.
     */
    public CronHistoryDTO setContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Getter for <code>invopay.cron_history.ref_user_id</code>.
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.cron_history.ref_user_id</code>.
     */
    public CronHistoryDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.cron_history.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.cron_history.delete_status</code>.
     */
    public CronHistoryDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.cron_history.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.cron_history.transaction_id</code>.
     */
    public CronHistoryDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.cron_history.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.cron_history.added_date</code>.
     */
    public CronHistoryDTO setAddedDate(LocalDateTime addedDate) {
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
        final CronHistoryDTO other = (CronHistoryDTO) obj;
        if (cronHistoryId == null) {
            if (other.cronHistoryId != null)
                return false;
        }
        else if (!cronHistoryId.equals(other.cronHistoryId))
            return false;
        if (cronHistoryName == null) {
            if (other.cronHistoryName != null)
                return false;
        }
        else if (!cronHistoryName.equals(other.cronHistoryName))
            return false;
        if (date == null) {
            if (other.date != null)
                return false;
        }
        else if (!date.equals(other.date))
            return false;
        if (content == null) {
            if (other.content != null)
                return false;
        }
        else if (!content.equals(other.content))
            return false;
        if (refUserId == null) {
            if (other.refUserId != null)
                return false;
        }
        else if (!refUserId.equals(other.refUserId))
            return false;
        if (deleteStatus == null) {
            if (other.deleteStatus != null)
                return false;
        }
        else if (!deleteStatus.equals(other.deleteStatus))
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
        result = prime * result + ((this.cronHistoryId == null) ? 0 : this.cronHistoryId.hashCode());
        result = prime * result + ((this.cronHistoryName == null) ? 0 : this.cronHistoryName.hashCode());
        result = prime * result + ((this.date == null) ? 0 : this.date.hashCode());
        result = prime * result + ((this.content == null) ? 0 : this.content.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CronHistory (");

        sb.append(cronHistoryId);
        sb.append(", ").append(cronHistoryName);
        sb.append(", ").append(date);
        sb.append(", ").append(content);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}