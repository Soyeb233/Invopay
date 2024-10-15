package org.invopayWebService.dto.userActivity;

import java.util.Date;

//import java.sql.Date;

//@Data
//@NoArgsConstructor
public class UserActivityDTO {

    private String userName;
    private String userActivityKey;
    private Date loggedInDate;

    public UserActivityDTO() {
    }

    public UserActivityDTO(String userName, String userActivityKey, Date loggedInDate) {
        this.userName = userName;
        this.userActivityKey = userActivityKey;
        this.loggedInDate = loggedInDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserActivityKey() {
        return userActivityKey;
    }

    public void setUserActivityKey(String userActivityKey) {
        this.userActivityKey = userActivityKey;
    }

    public Date getLoggedInDate() {
        return loggedInDate;
    }

    public void setLoggedInDate(Date loggedInDate) {
        this.loggedInDate = loggedInDate;
    }

}
