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
public class DataSourceDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       dataSourceId;
    private String        dataSourceName;
    private Integer       deleteStatus;
    private Integer       refUserId;
    private Integer       transactionId;
    private LocalDateTime addedDate;

    public DataSourceDTO() {}

    public DataSourceDTO(DataSourceDTO value) {
        this.dataSourceId = value.dataSourceId;
        this.dataSourceName = value.dataSourceName;
        this.deleteStatus = value.deleteStatus;
        this.refUserId = value.refUserId;
        this.transactionId = value.transactionId;
        this.addedDate = value.addedDate;
    }

    public DataSourceDTO(
        Integer       dataSourceId,
        String        dataSourceName,
        Integer       deleteStatus,
        Integer       refUserId,
        Integer       transactionId,
        LocalDateTime addedDate
    ) {
        this.dataSourceId = dataSourceId;
        this.dataSourceName = dataSourceName;
        this.deleteStatus = deleteStatus;
        this.refUserId = refUserId;
        this.transactionId = transactionId;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.data_source.data_source_id</code>.
     */
    public Integer getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * Setter for <code>invopay.data_source.data_source_id</code>.
     */
    public DataSourceDTO setDataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * Getter for <code>invopay.data_source.data_source_name</code>. Data Source
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * Setter for <code>invopay.data_source.data_source_name</code>. Data Source
     */
    public DataSourceDTO setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }

    /**
     * Getter for <code>invopay.data_source.delete_status</code>.
     */
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    /**
     * Setter for <code>invopay.data_source.delete_status</code>.
     */
    public DataSourceDTO setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * Getter for <code>invopay.data_source.ref_user_id</code>. User Name
     */
    public Integer getRefUserId() {
        return this.refUserId;
    }

    /**
     * Setter for <code>invopay.data_source.ref_user_id</code>. User Name
     */
    public DataSourceDTO setRefUserId(Integer refUserId) {
        this.refUserId = refUserId;
        return this;
    }

    /**
     * Getter for <code>invopay.data_source.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    /**
     * Setter for <code>invopay.data_source.transaction_id</code>.
     */
    public DataSourceDTO setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Getter for <code>invopay.data_source.added_date</code>. Added Date
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.data_source.added_date</code>. Added Date
     */
    public DataSourceDTO setAddedDate(LocalDateTime addedDate) {
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
        final DataSourceDTO other = (DataSourceDTO) obj;
        if (dataSourceId == null) {
            if (other.dataSourceId != null)
                return false;
        }
        else if (!dataSourceId.equals(other.dataSourceId))
            return false;
        if (dataSourceName == null) {
            if (other.dataSourceName != null)
                return false;
        }
        else if (!dataSourceName.equals(other.dataSourceName))
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
        result = prime * result + ((this.dataSourceId == null) ? 0 : this.dataSourceId.hashCode());
        result = prime * result + ((this.dataSourceName == null) ? 0 : this.dataSourceName.hashCode());
        result = prime * result + ((this.deleteStatus == null) ? 0 : this.deleteStatus.hashCode());
        result = prime * result + ((this.refUserId == null) ? 0 : this.refUserId.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DataSource (");

        sb.append(dataSourceId);
        sb.append(", ").append(dataSourceName);
        sb.append(", ").append(deleteStatus);
        sb.append(", ").append(refUserId);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
