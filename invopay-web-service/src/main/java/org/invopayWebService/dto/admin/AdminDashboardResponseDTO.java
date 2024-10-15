package org.invopayWebService.dto.admin;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdminDashboardResponseDTO {
private Long merchantCount;
private Long clientCount;

private Long pendingInvoice;
private Long completedInvoice;

private Long cancelledInvoice;

}
