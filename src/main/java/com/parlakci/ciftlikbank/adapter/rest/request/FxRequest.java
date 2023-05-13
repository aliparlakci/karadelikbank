package com.parlakci.ciftlikbank.adapter.rest.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Getter
@RequiredArgsConstructor
public class FxRequest {
    String depositAccountUid;
    String withdrawAccountUid;
    BigDecimal amount;
    String ticket;
}
