package org.invopayWebService.controller.admin;


import com.commons.ResponceHandler;
import org.invopayWebService.dto.admin.AdminOtherSettingsDTO;
//import org.invopayWebService.dto.admin.EmailSettingDTO;
import org.invopayWebService.dto.admin.AdminIdReferenceDTO;
import org.invopayWebService.dto.admin.AdminSettingDTO;
import org.invopayWebService.dto.menu.MenuDTO;
import org.invopayWebService.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/invopay")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/createMenuList")
    public ResponseEntity<Object> createMenuAllList() {
        return ResponceHandler.generateResponce(HttpStatus.OK, true, adminService.getAllCreateMenu());
    }

    @PutMapping("/deleteCreateMenu")
    public ResponseEntity<Object> deleteCreateMenu(@RequestBody int id) {
        return ResponceHandler.generateResponce(HttpStatus.OK, true, adminService.changeDeleteStatus(id));
    }

    @PostMapping("/addNewMenu")
    public ResponseEntity<Object> addNewMenu(@RequestBody MenuDTO menuDTO) {
        System.out.println(menuDTO);
        return ResponceHandler.generateResponce(HttpStatus.OK, true, adminService.addNewMenu(menuDTO));
    }

    @GetMapping("/findByIdAdminMenuUser/{id}")
    public ResponseEntity<Object> findByIdOfAdminMenu(@PathVariable int id) {
        System.out.println(id);
        return ResponceHandler.generateResponce(HttpStatus.OK, true, adminService.findByIdAdminMenu(id));
    }

    @PostMapping("/smsSetting")
    public ResponseEntity<Object> changeSMSSetting(@RequestBody AdminSettingDTO adminSettingDTO) {
        System.out.println(adminSettingDTO.toString());
        return ResponceHandler.generateResponce(HttpStatus.OK, true, "");
    }

    @GetMapping("/getAllSmsSetting")
    public ResponseEntity<Object> getAllSmsSetting() {
        return ResponceHandler.generateResponce(HttpStatus.OK, true, adminService.getAllSmsSetting());
    }

    @GetMapping("/getAllEmailSetting")
    public ResponseEntity<Object> getAllEmailSetting() {
        return ResponceHandler.generateResponce(HttpStatus.OK, true, adminService.getAllEmailSetting());
    }

    @GetMapping("/getAllImageSetting")
    public ResponseEntity<Object> getAllImageSetting() {
        return ResponceHandler.generateResponce(HttpStatus.OK, true, adminService.getAllImageSetting());
    }

    @GetMapping("/getAllTitleSetting")
    public ResponseEntity<Object> getAllTitleSetting() {
        return ResponceHandler.generateResponce(HttpStatus.OK, true, adminService.getAllTitleSetting());
    }

    @GetMapping("/getAllIdRefSetting")
    public ResponseEntity<Object> getAllIdRefSetting() {
        return ResponceHandler.generateResponce(HttpStatus.OK, true, adminService.getAllIdRefSetting());
    }

    @GetMapping("/getAllOtherSetting")
    public ResponseEntity<Object> getAllOtherSetting() {
        return ResponceHandler.generateResponce(HttpStatus.OK, true, adminService.getAllOtherSetting());
    }

    @PostMapping("/postAllSmsSetting")
    public ResponseEntity<Object> setAllSmsSetting(@RequestBody List<AdminSettingDTO> adminSettingDTO) {
        System.out.println(adminSettingDTO);
        return ResponceHandler.generateResponce(HttpStatus.OK, true,  adminService.saveData(adminSettingDTO));
    }

    @PostMapping("/postAllEmailSetting")
    public ResponseEntity<Object> setAllEmailSetting(@RequestBody List<AdminSettingDTO> adminSettingDTO) {
        System.out.println(adminSettingDTO);
        return ResponceHandler.generateResponce(HttpStatus.OK, true,  adminService.saveData(adminSettingDTO));
    }

    @PostMapping("/postAllImageSetting")
    public ResponseEntity<Object> setAllImageSetting(@RequestBody List<AdminSettingDTO> adminSettingDTO) {
        System.out.println(adminSettingDTO);
        return ResponceHandler.generateResponce(HttpStatus.OK, true,  adminService.saveData(adminSettingDTO));
    }

    @PostMapping("/postAllAppSetting")
    public ResponseEntity<Object> setAllAppSetting(@RequestBody List<AdminSettingDTO> adminSettingDTO) {
        System.out.println(adminSettingDTO);
        return ResponceHandler.generateResponce(HttpStatus.OK, true,  adminService.saveData(adminSettingDTO));
    }

    @PostMapping("/postAllIdRefSetting")
    public ResponseEntity<Object> setAllIdRefSetting(@RequestBody List<AdminSettingDTO> adminSettingDTO) {
        System.out.println(adminSettingDTO);
        return ResponceHandler.generateResponce(HttpStatus.OK, true,  adminService.saveData(adminSettingDTO));
    }

    @PostMapping("/postAllOtherSetting")
    public ResponseEntity<Object> setAdminOtherSetting(@RequestBody List<AdminSettingDTO> adminSettingDTO) {
        System.out.println(adminSettingDTO);
        return ResponceHandler.generateResponce(HttpStatus.OK, true,  adminService.saveData(adminSettingDTO));
    }

    @GetMapping("/getChangeMenuOrder")
    public ResponseEntity<Object> getChangeMenuOrder() {
        return ResponceHandler.generateResponce(HttpStatus.OK, true, adminService.getChangeMenuOrder());
    }

    @GetMapping("/getChangeMasterOrder")
    public ResponseEntity<Object> getChangeMasterOrder() {
        return ResponceHandler.generateResponce(HttpStatus.OK, true, adminService.getChangeMasterOrder());
    }

    @PutMapping("/editCreateMenu/{id}")
    public ResponseEntity<Object> adminEditMenu(@RequestBody MenuDTO menuDTO,@PathVariable int id){
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,adminService.adminEditMenu(menuDTO,id));
    }


    @GetMapping("/getBackupList")
    public ResponseEntity<Object> getBackupList() {
        return ResponceHandler.generateResponce(HttpStatus.OK, true, adminService.getBackupList());
    }
}
