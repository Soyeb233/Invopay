/*
 * This file is generated by jOOQ.
 */
package com.commons.invopayWebServices.DTO;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MasterDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String  name;
    private String  aliasName;

    public MasterDTO() {}

    public MasterDTO(MasterDTO value) {
        this.id = value.id;
        this.name = value.name;
        this.aliasName = value.aliasName;
    }

    public MasterDTO(
        Integer id,
        String  name,
        String  aliasName
    ) {
        this.id = id;
        this.name = name;
        this.aliasName = aliasName;
    }

    /**
     * Getter for <code>invopay.master.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>invopay.master.id</code>.
     */
    public MasterDTO setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>invopay.master.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>invopay.master.name</code>.
     */
    public MasterDTO setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>invopay.master.alias_name</code>.
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * Setter for <code>invopay.master.alias_name</code>.
     */
    public MasterDTO setAliasName(String aliasName) {
        this.aliasName = aliasName;
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
        final MasterDTO other = (MasterDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (aliasName == null) {
            if (other.aliasName != null)
                return false;
        }
        else if (!aliasName.equals(other.aliasName))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.aliasName == null) ? 0 : this.aliasName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Master (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(aliasName);

        sb.append(")");
        return sb.toString();
    }
}
