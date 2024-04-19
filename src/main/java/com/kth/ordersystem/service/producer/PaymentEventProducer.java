package com.kth.ordersystem.service.producer;

import com.kth.ordersystem.event.PaymentEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PaymentEventProducer {

    private static final String TOPIC = "payment_events";

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendPaymentEvent(PaymentEvent paymentEvent) {
        kafkaTemplate.send(TOPIC, paymentEvent);
    }
}