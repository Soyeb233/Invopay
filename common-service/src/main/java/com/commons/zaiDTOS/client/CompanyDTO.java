package com.commons.zaiDTOS.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDTO {
    private int company_id;
    private String company_code;
    private int ref_data_source_id;
    private String company_name;
    private LocalDate company_from_date;
    private String company_address_line1;
    private String company_address_line2;
    private String company_address_line3;
    private int ref_district_id;
    private int ref_state_id;
    private int ref_country_id;
    private String company_pincode;
    private String company_gst_no;
    private String company_gst_file;
    private String company_pan_no;
    private String company_pan_file;
    private String company_description;
    private int delete_status;
    private int ref_user_id;
    private int transaction_id;
    private LocalDate added_date;
    private int tax_number;
    private int charge_tax;
}
