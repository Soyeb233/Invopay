package org.invopayWebService.dto.message;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder
public class MessageDTO {
    private String userName;
    private String clientEmail;
    private String clientNo;
    private String amount;
    private String description;
    private String invoiceNo;
    private String dueDate;
    private String date;
    private Type type;
    private String receiptLink;
    private int userId;
    private String forgetPasswordLink;
}
