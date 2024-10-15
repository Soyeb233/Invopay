package com.messaging.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
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
