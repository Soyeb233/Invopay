package org.invopayWebService.dto.invoice;

import java.util.Date;

public class YearInvoiceCountDTO {
    private String month;
    private  Integer data;
    private Date date;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public YearInvoiceCountDTO() {
        super();
    }

    public YearInvoiceCountDTO(String month, Integer data, Date date) {
        this.month = month;
        this.data = data;
        this.date = date;
    }
}
