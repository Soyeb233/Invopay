package org.invopayWebService.dto.invoice;

import java.util.Date;

public class WeekInvoiceCountDTO {
    private String week;
    private Date date;
    private Integer data;

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public WeekInvoiceCountDTO() {
        super();
    }

    public WeekInvoiceCountDTO(String week, Date date, Integer data) {
        this.week = week;
        this.date = date;
        this.data = data;
    }
}
