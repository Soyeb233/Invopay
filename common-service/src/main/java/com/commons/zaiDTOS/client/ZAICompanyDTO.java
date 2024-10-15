package com.commons.zaiDTOS.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ZAICompanyDTO {
    private String name;
    private String legal_name;
    private String tax_number;
    private boolean charge_tax;
    private String address_line1;
    private String address_line2;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String phone;
}
