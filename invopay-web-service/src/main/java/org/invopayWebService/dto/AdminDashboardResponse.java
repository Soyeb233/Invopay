package org.invopayWebService.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdminDashboardResponse {
private Long merchantCount;
private Long clientCount;

private Long pendingInvoice;
private Long completedInvoice;

private Long cancelledInvoice;

}
