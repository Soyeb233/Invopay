package org.invopayWebService.service.client;

import java.util.List;
import java.util.Optional;

import org.invopayWebService.dto.client.ClientDTO;
import org.invopayWebService.dto.client.ClientInvoiceDTO;
import org.invopayWebService.dto.client.ClientSupplierDTO;
import org.invopayWebService.dto.invoice.InvoiceGeneratorDTO;
import org.invopayWebService.entity.Client;
import org.invopayWebService.repository.client.ClientRepository;
import org.invopayWebService.repository.invoice.InvoiceRepository;
import org.invopayWebService.service.exception.FieldNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	@Autowired
    private InvoiceRepository invoiceRepository;
	public Object findUserById(int id) {
		return clientRepository.findById(id).get();
	}

	public boolean changeDeleteStatus(List<Integer> data)  {
		for (Integer item : data) {
			Optional<Client> clientItem = clientRepository.findById(item);
			if (clientItem.isPresent()) {
				clientRepository.deleteStaus(item);
			} else {
				return false;
			}
		}
		return true;
	}
	public List<ClientDTO> findAllClients() {
		return clientRepository.findAllClents();
	}

	public List<ClientInvoiceDTO> getClientInvoicesById(int id) {

        List<ClientInvoiceDTO> clientInvoiceDTO=clientRepository.getClientInvoice(id);
		for(ClientInvoiceDTO clientInvoice :clientInvoiceDTO){
			clientInvoice.setClient_name(clientInvoice.getClient_fname()+" "+clientInvoice.getClient_lname());
		}
		return clientInvoiceDTO;

	}

	public ClientSupplierDTO findByClientId(int id){

		return clientRepository.findByClientId(id);
	}

	public List<InvoiceGeneratorDTO> findInvoiceByCustomerId(int id) {
	    	return invoiceRepository.getAllInvoicesById(id);
	}
}
