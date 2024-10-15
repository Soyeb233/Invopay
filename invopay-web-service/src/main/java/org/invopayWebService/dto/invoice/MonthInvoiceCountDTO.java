package org.invopayWebService.dto.invoice;

import java.util.Date;

public class MonthInvoiceCountDTO {
    private Integer day;
    private int data;
    private Date date;



    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public MonthInvoiceCountDTO() {
        super();
    }
    public MonthInvoiceCountDTO(Integer day, int data, Date date) {
        this.day = day;
        this.data = data;
        this.date = date;
    }


}
