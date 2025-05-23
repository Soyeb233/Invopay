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
public class ApiRequestDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       id;
    private String        title;
    private String        description;
    private LocalDateTime addedDate;

    public ApiRequestDTO() {}

    public ApiRequestDTO(ApiRequestDTO value) {
        this.id = value.id;
        this.title = value.title;
        this.description = value.description;
        this.addedDate = value.addedDate;
    }

    public ApiRequestDTO(
        Integer       id,
        String        title,
        String        description,
        LocalDateTime addedDate
    ) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.addedDate = addedDate;
    }

    /**
     * Getter for <code>invopay.api_request.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>invopay.api_request.id</code>.
     */
    public ApiRequestDTO setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>invopay.api_request.title</code>.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>invopay.api_request.title</code>.
     */
    public ApiRequestDTO setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Getter for <code>invopay.api_request.description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>invopay.api_request.description</code>.
     */
    public ApiRequestDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Getter for <code>invopay.api_request.added_date</code>.
     */
    public LocalDateTime getAddedDate() {
        return this.addedDate;
    }

    /**
     * Setter for <code>invopay.api_request.added_date</code>.
     */
    public ApiRequestDTO setAddedDate(LocalDateTime addedDate) {
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
        final ApiRequestDTO other = (ApiRequestDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        }
        else if (!title.equals(other.title))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
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
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.addedDate == null) ? 0 : this.addedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ApiRequest (");

        sb.append(id);
        sb.append(", ").append(title);
        sb.append(", ").append(description);
        sb.append(", ").append(addedDate);

        sb.append(")");
        return sb.toString();
    }
}
