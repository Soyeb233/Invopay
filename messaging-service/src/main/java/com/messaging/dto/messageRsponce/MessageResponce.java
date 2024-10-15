package com.messaging.dto.messageRsponce;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MessageResponce {
    public int http_code;
    public String response_code;
    public String response_msg;
    public Data data;
}
