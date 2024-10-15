package org.invopayWebService.repository.client;

import java.util.List;

import javax.transaction.Transactional;

import org.invopayWebService.dto.client.ClientDTO;
import org.invopayWebService.dto.client.ClientInvoiceDTO;
import org.invopayWebService.dto.client.ClientSupplierDTO;
import org.invopayWebService.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

@EnableJpaRepositories
public interface ClientRepository extends JpaRepository<Client,Integer>, JpaSpecificationExecutor<Client> {

    @Query("select c from Client c where c.client_id = (select i.refClientId from Invoice i where i.invoiceId=?1)")
    Client getClientDataByInvoiceId(int invoiceId);
    
    @Query("select new org.invopayWebService.dto.client.ClientDTO(c.client_id,c.client_type,c.client_fname,c.client_lname,c.client_mobile,c.client_email,c.archive_status,s.supplierName) from Client c INNER JOIN Supplier s on c.ref_supplier_id=s.supplierId WHERE c.delete_status=0")
    List<ClientDTO> findAllClents();
    
    @Transactional
	@Modifying
	@Query("update Client c set delete_status=1 where c.client_id=:data")
	public void deleteStaus(Integer data);

    @Query(value = "SELECT new org.invopayWebService.dto.client.ClientDTO(c.client_id, c.client_type,c.client_fname,c.client_lname,c.client_mobile,c.client_email,c.delete_status,s.supplierName) FROM Client c, Supplier s WHERE s.supplierId=c.ref_supplier_id AND  c.ref_supplier_id=?1")
    List<ClientDTO> getClientById(long id);

    @Query(value = "SELECT new org.invopayWebService.dto.client.ClientInvoiceDTO(c.client_id,c.client_fname,c.client_lname,s.supplierName,i.invoiceName) FROM Client c, Supplier s,Invoice i  WHERE c.client_id=i.refClientId AND  c.client_id=?1")
    List<ClientInvoiceDTO> getClientInvoice(int id);

    @Query(value = "SELECT new org.invopayWebService.dto.client.ClientInvoiceDTO(c.client_id,c.client_fname,c.client_lname,s.supplierName,i.invoiceName) FROM Client c, Supplier s,Invoice i  WHERE c.client_id=i.refClientId AND  c.client_id = :id AND i.invoiceId = :invoiceId")
    List<ClientInvoiceDTO> getClientInvoiceByInvoiceAndCliendId(@Param("id") int id,@Param("invoiceId") int invoiceId);

    @Query(value="Select Count(client_id) from Client Where delete_status = 0 ")
    public Integer getClientCount();

    @Query(value = "SELECT new org.invopayWebService.dto.client.ClientSupplierDTO( c.client_type,c.client_fname,c.client_lname,c.client_company_name,c.client_mobile,c.client_email, c.client_website,cr.currencyName,l.languageName,c.client_address_line1,c.client_city,c.client_state,s.supplierName)  FROM Client c, Supplier s,Currency cr,Language l WHERE s.supplierId=c.ref_supplier_id AND c.ref_currency_id=cr.currencyId AND c.ref_language_id=l.languageId   AND c.client_id = :client_id")
    public ClientSupplierDTO findByClientId(@Param("client_id") int id);
}
