package org.invopayWebService.service.admin;


import org.invopayWebService.config.ObjectMapperUtil;
import org.invopayWebService.dto.admin.AdminOtherSettingsDTO;
import org.invopayWebService.dto.admin.MenuOrderDTO;
import org.invopayWebService.dto.admin.AdminSettingDTO;
import org.invopayWebService.dto.backupList.TableBackupDTO;
import org.invopayWebService.dto.menu.MenuDTO;
import org.invopayWebService.entity.AdminSetting;
import org.invopayWebService.entity.Menu;
import org.invopayWebService.entity.TableBackup;
import org.invopayWebService.repository.UserToGroupRepository;
import org.invopayWebService.repository.admin.AdminRepository;
import org.invopayWebService.repository.admin.AdminSettingRepository;
import org.invopayWebService.repository.backupList.TableBackupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private UserToGroupRepository userToGroupRepository;

    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private TableBackupRepository tableBackupRepository;

    @Autowired
    private AdminSettingRepository adminSettingRepository;



    public Long getMerchantCount() {
        Long count = userToGroupRepository.countByRefUserGroupId(4);
        return count;
    }

    public Long getClientCount() {
        Long count = userToGroupRepository.countByRefUserGroupId(5);
        return count;
    }

    public Long getPendingInvoice() {

        return null;
    }

    public List<Menu> getAllCreateMenu() {
        return adminRepository.findAll();
    }

    public boolean changeDeleteStatus(int id) {
        Optional<Menu> supplierItem = adminRepository.findById(id);
        if (supplierItem.isPresent()) {
            adminRepository.deleteStaus(id, 1);
        } else {
           return false;
        }
        return true;
    }

    public Menu addNewMenu(MenuDTO menuDTO) {
//    Menu menu= ObjectMapperUtil.copyPropertiesByMapper(menuDTO,Menu.class);
//    System.out.println(menu);
//    return adminRepository.save(menu);
        return null;
    }

    public Menu findByIdAdminMenu(int id) {
        return adminRepository.findByIdAdmin(id);
    }

    public List<MenuOrderDTO> getChangeMenuOrder() {
        return adminRepository.getChangeMenuOrder();
    }

    public List<MenuOrderDTO> getChangeMasterOrder() {
        return adminRepository.getChangeMasterOrder();
    }

    public Object adminEditMenu(MenuDTO menuDTO, int id) {
        System.out.println(menuDTO);
        return null;
    }

    public List<TableBackupDTO> getBackupList() {
        List<TableBackup> backupList = tableBackupRepository.findAll();
        List<TableBackupDTO> tableBackupDTOS = ObjectMapperUtil.copyMapToObject(backupList, ArrayList.class);
        return tableBackupDTOS;
    }

    public List<AdminSettingDTO>  getAllSmsSetting() {
        return adminSettingRepository.AllSmsSetting();
    }

    public List<AdminSettingDTO> getAllEmailSetting(){
        return adminSettingRepository.allEmailSetting();
    }

    public List<AdminSettingDTO> getAllImageSetting(){
        return adminSettingRepository.allImageSetting();
    }

    public List<AdminSettingDTO> getAllTitleSetting(){
        return adminSettingRepository.allTitleSetting();
    }

    public List<AdminSettingDTO> getAllIdRefSetting(){
        return adminSettingRepository.allIdRefSetting();
    }

    public List<AdminSettingDTO> getAllOtherSetting(){
        return adminSettingRepository.allOtherSetting();
    }

    public Object saveData(List<AdminSettingDTO> adminSettingDTO) {

        List<AdminSetting> adminSettings=null;

        for(AdminSettingDTO adminSettingDTOData :adminSettingDTO){
             Optional<AdminSetting> adminSettingObj=adminSettingRepository.findById(adminSettingDTOData.getAdminSettingId());
             AdminSetting adminSetting = adminSettingObj.get();
             adminSetting.setAdminSettingKey(adminSettingDTOData.getAdminSettingKey());
             adminSetting.setAdminSettingValue(adminSettingDTOData.getAdminSettingValue());
             adminSetting.setAddedDate(java.sql.Date.valueOf(LocalDate.now()));
             adminSettingRepository.save(adminSetting);
        }

        return null;

    }
}
