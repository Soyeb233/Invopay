package com.messaging.dto.messageRsponce;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Currency {
    public String currency_name_short;
    public String currency_prefix_d;
    public String currency_prefix_c;
    public String currency_name_long;
}