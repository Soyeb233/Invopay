/*
 * This file is generated by jOOQ.
 */
package com.commons.invopayWebServices.DTO;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MillDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String  name;
    private String  gstNo;
    private Integer sno;

    public MillDTO() {}

    public MillDTO(MillDTO value) {
        this.id = value.id;
        this.name = value.name;
        this.gstNo = value.gstNo;
        this.sno = value.sno;
    }

    public MillDTO(
        Integer id,
        String  name,
        String  gstNo,
        Integer sno
    ) {
        this.id = id;
        this.name = name;
        this.gstNo = gstNo;
        this.sno = sno;
    }

    /**
     * Getter for <code>invopay.mill.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>invopay.mill.id</code>.
     */
    public MillDTO setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>invopay.mill.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>invopay.mill.name</code>.
     */
    public MillDTO setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>invopay.mill.gst_no</code>.
     */
    public String getGstNo() {
        return this.gstNo;
    }

    /**
     * Setter for <code>invopay.mill.gst_no</code>.
     */
    public MillDTO setGstNo(String gstNo) {
        this.gstNo = gstNo;
        return this;
    }

    /**
     * Getter for <code>invopay.mill.sno</code>.
     */
    public Integer getSno() {
        return this.sno;
    }

    /**
     * Setter for <code>invopay.mill.sno</code>.
     */
    public MillDTO setSno(Integer sno) {
        this.sno = sno;
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
        final MillDTO other = (MillDTO) obj;
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
        if (gstNo == null) {
            if (other.gstNo != null)
                return false;
        }
        else if (!gstNo.equals(other.gstNo))
            return false;
        if (sno == null) {
            if (other.sno != null)
                return false;
        }
        else if (!sno.equals(other.sno))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.gstNo == null) ? 0 : this.gstNo.hashCode());
        result = prime * result + ((this.sno == null) ? 0 : this.sno.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Mill (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(gstNo);
        sb.append(", ").append(sno);

        sb.append(")");
        return sb.toString();
    }
}
