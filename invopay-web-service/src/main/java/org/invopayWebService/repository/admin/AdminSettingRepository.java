package org.invopayWebService.repository.admin;


import org.invopayWebService.dto.admin.AdminSettingDTO;
import org.invopayWebService.entity.AdminSetting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminSettingRepository extends JpaRepository<AdminSetting,Integer> {
    @Query("SELECT new org.invopayWebService.dto.admin.AdminSettingDTO(u.adminSettingId,u.adminSettingKey,u.adminSettingValue) FROM AdminSetting u WHERE u.adminSettingId BETWEEN 3842 AND 3850")
    List<AdminSettingDTO> AllSmsSetting();

    @Query("SELECT new org.invopayWebService.dto.admin.AdminSettingDTO(u.adminSettingId,u.adminSettingKey,u.adminSettingValue) FROM AdminSetting u WHERE u.adminSettingId BETWEEN 3851 AND 3861")
    List<AdminSettingDTO> allEmailSetting();

    @Query("SELECT new org.invopayWebService.dto.admin.AdminSettingDTO(u.adminSettingId,u.adminSettingKey,u.adminSettingValue) FROM AdminSetting u WHERE u.adminSettingId BETWEEN 3862 AND 3863")
    List<AdminSettingDTO> allImageSetting();

    @Query("SELECT new org.invopayWebService.dto.admin.AdminSettingDTO(u.adminSettingId,u.adminSettingKey,u.adminSettingValue) FROM AdminSetting u WHERE u.adminSettingId = 3880")
    List<AdminSettingDTO> allTitleSetting();

    @Query("SELECT new org.invopayWebService.dto.admin.AdminSettingDTO(u.adminSettingId,u.adminSettingKey,u.adminSettingValue) FROM AdminSetting u WHERE u.adminSettingId BETWEEN 3881 AND 3884")
    List<AdminSettingDTO> allIdRefSetting();

    @Query("SELECT new org.invopayWebService.dto.admin.AdminSettingDTO(u.adminSettingId,u.adminSettingKey,u.adminSettingValue) FROM AdminSetting u WHERE u.adminSettingId BETWEEN 3864 AND 3879")
    List<AdminSettingDTO> allOtherSetting();

}
