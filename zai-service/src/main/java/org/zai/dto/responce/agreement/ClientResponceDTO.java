package org.zai.dto.responce.agreement;

import lombok.*;

import java.util.HashMap;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientResponceDTO {
    private int zaiUserId;
    private String id;
    private String phone;
    private String mobile;
    private String color_2;
    private String first_name;
    private String last_name;
    private String updated_at;
    private String held_state;
    private String location;
    //    private String roles;
    private String drivers_license;
    private String color_1;
    private String full_name;
    private String verification_state;
    private String custom_descriptor;
    private String logo_url;
    private String dob;
    private String created_at;
    private String government_number;
    private String email;
    private List<String> roles;
    private HashMap flags;
    private HashMap related;
    private HashMap links;
}
