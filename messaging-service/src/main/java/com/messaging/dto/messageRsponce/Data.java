package com.messaging.dto.messageRsponce;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Data {
    public double total_price;
    public int total_count;
    public int queued_count;
    public ArrayList<Message> messages;
    public Currency _currency;
}
