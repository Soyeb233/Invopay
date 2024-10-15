package org.invopayWebService.dto.admin;

public class AdminSettingDTO {

    private Integer adminSettingId;
    private String adminSettingKey;
    private String adminSettingValue;

    public Integer getAdminSettingId() {
        return adminSettingId;
    }

    public void setAdminSettingId(Integer adminSettingId) {
        this.adminSettingId = adminSettingId;
    }

    public String getAdminSettingKey() {
        return adminSettingKey;
    }

    public void setAdminSettingKey(String adminSettingKey) {
        this.adminSettingKey = adminSettingKey;
    }

    public String getAdminSettingValue() {
        return adminSettingValue;
    }

    public void setAdminSettingValue(String adminSettingValue) {
        this.adminSettingValue = adminSettingValue;
    }


    public AdminSettingDTO() {
    }

    public AdminSettingDTO(Integer adminSettingId, String adminSettingKey, String adminSettingValue) {
        this.adminSettingId = adminSettingId;
        this.adminSettingKey = adminSettingKey;
        this.adminSettingValue = adminSettingValue;
    }

    @Override
    public String toString() {
        return "AdminSettingDTO{" +
                " adminSettingId=" + adminSettingId +
                ", adminSettingKey='" + adminSettingKey + '\'' +
                ", adminSettingValue='" + adminSettingValue + '\'' +
                '}';
    }
}
