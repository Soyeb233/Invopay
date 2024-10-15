package org.invopayWebService.dto.admin;

public class AdminIdReferenceDTO {
    private String superAdmin;
    private String admin;
    private String adminUserGroupId;
    private String habasitSupplierId;

    public String getSuperAdmin() {
        return superAdmin;
    }

    public void setSuperAdmin(String superAdmin) {
        this.superAdmin = superAdmin;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getAdminUserGroupId() {
        return adminUserGroupId;
    }

    public void setAdminUserGroupId(String adminUserGroupId) {
        this.adminUserGroupId = adminUserGroupId;
    }

    public String getHabasitSupplierId() {
        return habasitSupplierId;
    }

    public void setHabasitSupplierId(String habasitSupplierId) {
        this.habasitSupplierId = habasitSupplierId;
    }

    public AdminIdReferenceDTO() {
        super();
    }

    public AdminIdReferenceDTO(String superAdmin, String admin, String adminUserGroupId, String habasitSupplierId) {
        this.superAdmin = superAdmin;
        this.admin = admin;
        this.adminUserGroupId = adminUserGroupId;
        this.habasitSupplierId = habasitSupplierId;
    }
}
