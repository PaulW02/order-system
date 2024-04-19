package com.kth.ordersystem.service.consumer;

import com.kth.ordersystem.event.OrderEvent;
import com.kth.ordersystem.event.PaymentEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderEventConsumer {

    @KafkaListener(topics = "order_events", groupId = "order_group")
    public void handleOrderEvent(OrderEvent orderEvent) {
        // Process the order event, e.g., store it in the database
        System.out.println("Received Order Event: " + orderEvent);
        // Implement the logic for order processing and updating inventory
    }

    @KafkaListener(topics = "payment_events", groupId = "payment_group")
    public void handlePaymentEvent(PaymentEvent paymentEvent) {
        // Process the order event, e.g., store it in the database
        System.out.println("Received Payment Event ORDDERR: " + paymentEvent);
        // Implement the logic for order processing and updating inventory
    }
}
