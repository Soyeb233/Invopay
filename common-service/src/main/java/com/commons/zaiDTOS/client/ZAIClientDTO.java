package com.commons.zaiDTOS.client;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ZAIClientDTO {
    private String id;
    private String first_name;
    private String last_name;
    private String email;
    private String country;
    private String mobile;
    private String address_line1;
    private String address_line2;
    private String city;
    private String state;
    private String zip;
    private String dob;
    private String government_number;
    private String drivers_license_number;
    private String drivers_license_state;
    private String ip_address;
    private String logo_url;
    private String color_1;
    private String color_2;
    private String custom_descriptor;
    private ZAICompanyDTO company;

}
