package com.kth.ordersystem.event;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentEvent {
    private Long paymentId;
    private BigDecimal amount;
    // Other fields, constructors, getters, setters
}
