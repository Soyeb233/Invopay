package org.invopayWebService.dto.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDTO {
    private Integer userId;
    private String userName;
    private String email;
    private String password;
    private String originalPassword;
    private int userGroupId;

}
