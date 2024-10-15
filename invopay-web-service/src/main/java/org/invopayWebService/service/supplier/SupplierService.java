package org.invopayWebService.service.supplier;

import org.invopayWebService.config.ObjectMapperUtil;
import org.invopayWebService.dto.client.ClientDTO;
import org.invopayWebService.dto.login.ResetPassword;
import org.invopayWebService.dto.supplier.SupplierDTO;
import org.invopayWebService.entity.Client;
import org.invopayWebService.entity.Supplier;
import org.invopayWebService.entity.User;
import org.invopayWebService.repository.client.ClientRepository;
import org.invopayWebService.repository.invoice.InvoiceRepository;
import org.invopayWebService.repository.supplier.SupplierRepository;
import org.invopayWebService.repository.user.UserRepository;
import org.invopayWebService.service.exception.FieldNotFoundException;
import org.invopayWebService.util.PasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private SupplierRepository supplierRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Supplier> getAllSupplier() {

        return supplierRepository.getAllSupplier();
    }
    public Supplier addNewSupplier(SupplierDTO supplierDTO)
    {
        // getting last Record Inserted Details
        User user=userRepository.findFirstByOrderByUserIdDesc();

        supplierDTO.setSupplierName(supplierDTO.getSupplierFname()+" "+supplierDTO.getSupplierLname());

        System.out.println(supplierDTO);
        Supplier supplier= ObjectMapperUtil.copyPropertiesByMapper(supplierDTO,Supplier.class);
        supplier.setRefUserId(user.getUserId()+1);



           supplierRepository.save(supplier);

           Supplier supplier1=supplierRepository.findFirstByOrderBySupplierIdDesc();

           User userDetails=new User();

           userDetails.setUserName(supplier.getContactEmail());
           userDetails.setFullName(supplier.getSupplierName());
           userDetails.setNickName(supplier.getSupplierFname());
           userDetails.setCompanyName(supplier.getCompanyName());
           userDetails.setStreet(supplier.getSupplierCity()+" "+supplier.getSupplierAddressLine1());
           userDetails.setState(supplier.getSupplierState());
           userDetails.setPostcode(supplier.getSupplierPincode().toString());
           userDetails.setSuburb(supplier.getSupplierCity());
           userDetails.setRefCountryId(supplier.getRefCountryId());
           userDetails.setPhone(supplier.getContactMobile());
           userDetails.setEmail(supplier.getContactEmail());
           userDetails.setPassword("");
           userDetails.setOriginalPassword("");
           userDetails.setRefSupplierId(supplier1.getSupplierId());

           userDetails.setWebsite(supplier.getWebsite());
           userDetails.setDeleteStatus(supplier.getDeleteStatus());
           userDetails.setTransactionId(supplier.getTransactionId());
           userDetails.setAddedDate(supplier.getAddedDate());

           userRepository.save(userDetails);


        return supplier;



    }

    public Optional<Supplier> getSupplierDetails(int id) {
        return supplierRepository.findById(id);
    }

    public List<ClientDTO> findAllClientById(long id){
        List<ClientDTO> getAllClient=clientRepository.getClientById(id);
        for(ClientDTO c:getAllClient){
            c.setClient_name(c.getClient_fname()+" "+c.getClient_lname());
        }
        return getAllClient;
    }

    public boolean changeDeleteStatus(List<Integer> data) {
        for (Integer item : data) {
            Optional<Supplier> supplierItem = supplierRepository.findById(item);
            if (supplierItem.isPresent()) {
                supplierRepository.deleteStaus(item,1);
            } else {
               return false;
            }
        }
        return true;
    }

    public Supplier findSupplierById(int id) {
        Optional<Supplier> supplier=supplierRepository.findById(id);
        if(supplier.isPresent()){
            return supplier.get();
        }
        return null;
    }

    public String updateSupplier(SupplierDTO supplierDTO, int id) {
        Supplier supplier=ObjectMapperUtil.copyPropertiesByMapper(supplierDTO,Supplier.class);
        supplier.setSupplierId(id);
        try{
            Optional<Supplier> supplierOptional=supplierRepository.findById(id);
            if(supplierOptional.isPresent()){
                supplierRepository.save(supplier);
            }else{
                throw  new ArithmeticException("Data Not Found!");
            }
        }
        catch (Exception e){
        }
        return "Record Inserted Succesfully";
    }

    public String updatePassword(ResetPassword resetPassword) {
        String encryptedPassword = PasswordEncryptor.getMd5(resetPassword.getOriginalPassword());
        int newUserId = userRepository.getUserId(resetPassword.getSupplierId());
        userRepository.resetPassword(resetPassword.getOriginalPassword(),encryptedPassword,newUserId);
        return null;
    }

}