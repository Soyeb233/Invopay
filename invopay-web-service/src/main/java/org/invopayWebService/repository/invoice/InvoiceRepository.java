package org.invopayWebService.repository.invoice;

import org.invopayWebService.dto.invoice.DueListDTO;
import org.invopayWebService.dto.invoice.DueListTomorrowDTO;
import org.invopayWebService.dto.invoice.InvoiceGeneratorDTO;
import org.invopayWebService.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer>,
        JpaSpecificationExecutor<Invoice> {

    @Query( value ="select new org.invopayWebService.dto.invoice.InvoiceGeneratorDTO(c.client_id,i.invoiceId,i.invoiceName, i.invoiceDate,c.client_fname,c.client_lname,c.client_name, s.supplierName, i.subTotal ,i.gstTotal, i.discountTotal, i.grandTotal, i.appFee, pt.paymentTypeName,i.invoiceDueDate, i.invoicePaymentStatus) FROM Invoice i INNER JOIN Client c ON c.client_id = i.refClientId INNER JOIN Supplier s ON s.supplierId = i.refSupplierId INNER JOIN PaymentType pt ON pt.paymentTypeId = i.refPaymentTypeId where i.deleteStatus = 0 AND i.invoiceId=?1")
    public InvoiceGeneratorDTO findInvoiceById(int id);
    @Query( value ="select new org.invopayWebService.dto.invoice.InvoiceGeneratorDTO(c.client_id,i.invoiceId,i.invoiceName, i.invoiceDate,c.client_fname,c.client_lname,c.client_name, s.supplierName, i.subTotal ,i.gstTotal, i.discountTotal, i.grandTotal, i.appFee, pt.paymentTypeName,i.invoiceDueDate, i.invoicePaymentStatus) FROM Invoice i INNER JOIN Client c ON c.client_id = i.refClientId INNER JOIN Supplier s ON s.supplierId = i.refSupplierId INNER JOIN PaymentType pt ON pt.paymentTypeId = i.refPaymentTypeId where i.deleteStatus = 0")
    public List<InvoiceGeneratorDTO> getAllInvoices();


    @Query( value ="select new org.invopayWebService.dto.invoice.InvoiceGeneratorDTO(c.client_id,i.invoiceId,i.invoiceName, i.invoiceDate,c.client_fname,c.client_lname,c.client_name, s.supplierName, i.subTotal ,i.gstTotal, i.discountTotal, i.grandTotal, i.appFee, pt.paymentTypeName,i.invoiceDueDate, i.invoicePaymentStatus) FROM Invoice i INNER JOIN Client c ON c.client_id = i.refClientId INNER JOIN Supplier s ON s.supplierId = i.refSupplierId INNER JOIN PaymentType pt ON pt.paymentTypeId = i.refPaymentTypeId where i.deleteStatus = 0 AND c.client_id=i.refClientId  AND c.client_id=?1")
    public List<InvoiceGeneratorDTO> getAllInvoicesById(int id);


    @Query( value ="select new org.invopayWebService.dto.invoice.InvoiceGeneratorDTO(i.invoiceId,i.invoiceName, i.invoiceDate,c.client_name, s.supplierName, i.subTotal ,i.gstTotal, i.discountTotal, i.grandTotal, i.appFee, pt.paymentTypeName,i.invoiceDueDate, i.invoicePaymentStatus) FROM Invoice i INNER JOIN Client c ON c.client_id = i.refClientId INNER JOIN Supplier s ON s.supplierId = i.refSupplierId INNER JOIN PaymentType pt ON pt.paymentTypeId = i.refPaymentTypeId where i.deleteStatus = 0 AND i.invoiceId=?1 ")
    InvoiceGeneratorDTO getInvoiceGenerator(@Param("id") int id);
    @Query("select td from Invoice  td where month(td.invoiceDate) = ?1")
    List<Invoice> getDetailsByMonth(int month);

    @Query( "SELECT td FROM Invoice td WHERE WEEKOFYEAR(td.invoiceDate)=WEEKOFYEAR(CURDATE())")
    List<Invoice> getOneWeekInvoiceCount();

    List<Invoice> findAllByInvoiceDateBetween(
            Date publicationTimeStart,
            Date publicationTimeEnd);


    @Query(value = "SELECT new org.invopayWebService.dto.invoice.DueListDTO (a.invoiceDate,a.invoiceDueDate,b.supplierName,c.client_lname,c.client_fname,a.invoiceNo) FROM Invoice a,Supplier b, Client c WHERE a.refSupplierId=b.supplierId AND a.refClientId=c.client_id  ORDER BY a.invoiceId ASC")
    List<DueListDTO> findAllRecentInvoice();
    @Query(value = "SELECT new org.invopayWebService.dto.invoice.DueListTomorrowDTO (a.invoiceDate,a.invoiceDueDate,b.supplierName,c.client_lname,c.client_fname,a.invoiceNo) FROM Invoice a,Supplier b, Client c WHERE a.refSupplierId=b.supplierId AND a.refClientId=c.client_id  AND   a.invoiceDate BETWEEN :startDate AND  :endDate  ORDER BY a.invoiceId ASC ")
    List<DueListTomorrowDTO> findByDateCreatedBetween(@Param("startDate")Date startDate,@Param("endDate") Date endDate);

    @Query(value = "SELECT new org.invopayWebService.dto.invoice.DueListDTO(a.invoiceDate,a.invoiceDueDate,b.supplierName,c.client_lname,c.client_fname,a.invoiceNo) FROM Invoice a,Supplier b, Client c WHERE a.refSupplierId=b.supplierId AND a.refClientId=c.client_id  AND   a.invoiceDate BETWEEN :startDate AND  :endDate  ORDER BY a.invoiceId ASC ")
    List<DueListDTO> findLastSevenDays(@Param("startDate")Date startDate,@Param("endDate") Date endDate);

    @Query(value = "SELECT new org.invopayWebService.dto.invoice.DueListDTO(a.invoiceDate,a.invoiceDueDate,b.supplierName,c.client_lname,c.client_fname,a.invoiceNo) FROM Invoice a,Supplier b, Client c WHERE a.refSupplierId=b.supplierId AND a.refClientId=c.client_id  AND  a.invoiceDate = :startDate  ORDER BY a.invoiceId ASC ")
    public List<DueListDTO> findByDate(@Param("startDate") Date startDate);

    @Query(value = "SELECT new org.invopayWebService.dto.invoice.DueListDTO(a.invoiceDate,a.invoiceDueDate,b.supplierName,c.client_lname,c.client_fname,a.invoiceNo) FROM Invoice a,Supplier b, Client c WHERE a.refSupplierId=b.supplierId AND a.refClientId=c.client_id  AND a.invoiceDate BETWEEN :startDate AND  :endDate  ORDER BY a.invoiceId ASC ")
    List<DueListDTO> findNextSevenDays(@Param("startDate")Date startDate,@Param("endDate") Date endDate);
    @Query(value = "SELECT new org.invopayWebService.dto.invoice.DueListDTO(a.invoiceDate,a.invoiceDueDate,b.supplierName,c.client_lname,c.client_fname,a.invoiceNo) FROM Invoice a,Supplier b, Client c WHERE a.refSupplierId=b.supplierId AND a.refClientId=c.client_id  AND a.invoiceDate BETWEEN :startDate AND  :endDate  ORDER BY a.invoiceId ASC ")
    List<DueListDTO> findNextMonth(@Param("startDate")Date startDate,@Param("endDate") Date endDate);

    @Query("SELECT  u.refClientId FROM Invoice u WHERE u.refSupplierId=?1")
    List<Integer> findAllClientById(int id);

    @Query(value = "SELECT Count(invoiceId) FROM Invoice WHERE commissionProcessed = 0 AND deleteStatus = 0")
    public Integer getCountPendingInvoice();

    @Query(value = "SELECT Count(invoiceId) FROM Invoice WHERE commissionProcessed = 1 AND deleteStatus = 0")
    public Integer getCountCompletedInvoice();

    @Query(value = "SELECT Count(invoiceId) FROM Invoice WHERE orderStatus = 3")
    public Integer getCountCancelledInvoice();

    @Query(value = "SELECT Sum(grandTotal) as iTotal FROM Invoice")
    public Integer getSumTotalAmount();


    //This is method is responsible for execute  generate pdf query
    @Query( value ="SELECT new org.invopayWebService.dto.invoice.InvoiceGeneratorDTO(i.invoiceId, i.invoiceName, i.invoiceDate, c.client_fname, c.client_lname, c.client_name, s.supplierName, i.subTotal, i.gstTotal, i.grandTotal, c.client_address_line1, c.client_address_line2, c.client_address_line3, c.client_city, c.client_state, c.client_pincode, s.supplierFname, s.supplierLname, s.supplierAddressLine1, s.supplierAddressLine2, s.supplierCity, s.supplierState, s.supplierPincode, i.balanceTotal, p.productName,  p.description, p.price, i.productQty ) FROM Invoice i LEFT JOIN Client c ON c.client_id = i.refClientId LEFT JOIN Supplier s ON s.supplierId = i.refSupplierId LEFT JOIN Product p on p.productId = i.refProductId   where i.deleteStatus = 0 AND i.invoiceId= :idIn")
    Optional<InvoiceGeneratorDTO> getInvoicePdfGenerator(@Param("idIn") int idIn);

    @Transactional
    @Modifying
    @Query(value="UPDATE Invoice s SET s.deleteStatus=?2 WHERE s.invoiceId =?1")
    public void deleteStaus(int data, int x);
}
