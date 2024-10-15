package org.invopayWebService.dto.user;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
public class UserDTO {
    private Integer userId;
    private String fullName;

    private String nickName;

    private String userName;

    private String originalPassword;

    private String userGroupName;

    private Integer status;

    public UserDTO() {
    }

    public UserDTO(String fullName, String nickName, String userName, String originalPassword, String userGroupName, Integer status) {
        this.fullName = fullName;
        this.nickName = nickName;
        this.userName = userName;
        this.originalPassword = originalPassword;
        this.userGroupName = userGroupName;
        this.status = status;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOriginalPassword() {
        return originalPassword;
    }

    public void setOriginalPassword(String originalPassword) {
        this.originalPassword = originalPassword;
    }

    public String getUserGroupName() {
        return userGroupName;
    }

    public void setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
