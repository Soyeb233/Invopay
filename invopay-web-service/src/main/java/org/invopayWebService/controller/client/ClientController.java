package org.invopayWebService.controller.client;

import java.util.List;

import com.commons.ResponceHandler;
import com.commons.invopayWebServices.DTO.CustomerDTO;
import org.invopayWebService.dto.client.ClientDTO;
import org.invopayWebService.service.client.ClientService;
import org.invopayWebService.service.exception.FieldNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invopay")
@CrossOrigin("*")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/getClient/{id}")
    public Object createClient(@PathVariable int id){
      return ResponceHandler.generateResponce(HttpStatus.OK , true ,clientService.findUserById(id));
    }
    
    @PutMapping("/deleteClients")
	public ResponseEntity<Object> deleteRow(@RequestBody List<Integer> data) throws FieldNotFoundException {

        return ResponceHandler.generateResponce(HttpStatus.OK , true ,clientService.changeDeleteStatus(data));
	}
    @GetMapping("/getAllClients")
    public ResponseEntity<List<ClientDTO>> getAllClients(){
    	return new ResponseEntity<>(clientService.findAllClients(),HttpStatus.OK);
    }



    @GetMapping("/findByClientId/{id}")
    public ResponseEntity<Object>  findByClientId(@PathVariable int id){
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,clientService.findByClientId(id));

    }

    @GetMapping("/findInvoiceByCustomerId/{id}")
    public ResponseEntity<Object> findInvoiceByCustomerId(@PathVariable int id){
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,clientService.findInvoiceByCustomerId(id));
    }



}
