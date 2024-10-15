package com.messaging.dto.messageRsponce;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    public String direction;
    public int date;
    @JsonProperty("to")
    public String myto;
    public String body;
    public String from;
    public int schedule;
    public String message_id;
    public int message_parts;
    public String message_price;
    public Object from_email;
    public Object list_id;
    public String custom_string;
    public Object contact_id;
    public int user_id;
    public int subaccount_id;
    public String country;
    public String carrier;
    public String status;
}
