package org.invopayWebService.dto.loginUserLogs;



import java.util.Date;


//


public class LoginUserLogsDTO {



    private String userName ;

    private String userGroupName;

    private  String ipAddress;

    private Date loggedInDate;

    private Date loggedOutDate;

    public LoginUserLogsDTO() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserGroupName() {
        return userGroupName;
    }

    public void setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Date getLoggedInDate() {
        return loggedInDate;
    }

    public void setLoggedInDate(Date loggedInDate) {
        this.loggedInDate = loggedInDate;
    }

    public Date getLoggedOutDate() {
        return loggedOutDate;
    }

    public void setLoggedOutDate(Date loggedOutDate) {
        this.loggedOutDate = loggedOutDate;
    }

    public LoginUserLogsDTO(String userName, String userGroupName, String ipAddress, Date loggedInDate, Date loggedOutDate) {
        this.userName = userName;
        this.userGroupName = userGroupName;
        this.ipAddress = ipAddress;
        this.loggedInDate = loggedInDate;
        this.loggedOutDate = loggedOutDate;
    }
}
