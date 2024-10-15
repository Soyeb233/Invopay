package org.invopayWebService.repository.supplier;

import org.hibernate.annotations.Where;
import org.invopayWebService.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier, Integer>,
        JpaSpecificationExecutor<Supplier> {
    @Query("select s from Supplier s where deleteStatus=0")
    public List<Supplier> getAllSupplier();
    @Query("select s from Supplier s where s.supplierId = (select i.refSupplierId from Invoice i where i.invoiceId=?1)")
    Supplier getSupplierDataByInvoiceId(int invoiceId);

    @Query(value="Select Count(supplierId) from Supplier Where deleteStatus = 0 ")
    public Integer getMerchantCount();

    public Supplier findFirstByOrderBySupplierIdDesc();;



    @Transactional
    @Modifying
    @Query(value="UPDATE Supplier s SET s.deleteStatus=?2 WHERE s.supplierId =?1")
    public void deleteStaus(int data, int x);

    @Query("SELECT u from Supplier u WHERE u.supplierId=?1")
    Supplier findBySupplierId(Integer item);

//    @Query("SELECT s from Supplier s where s.deleteStatus=?1")
//    List<Supplier> findNotDeletedData(int deleteStatus);
}
