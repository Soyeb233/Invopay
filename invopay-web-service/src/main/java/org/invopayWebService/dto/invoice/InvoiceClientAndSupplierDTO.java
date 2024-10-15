package org.invopayWebService.dto.invoice;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InvoiceClientAndSupplierDTO {
    private int client_id;
    private String client_email;
    private String client_fname;
    private String client_lname;
    private int supplierId;
    private String supplierName;
    private String clientMobileNo;
}
