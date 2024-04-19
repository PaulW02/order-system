package com.kth.ordersystem.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OrderEvent {
    private int orderId;
    private String name;
    // Other fields, constructors, getters, setters

}