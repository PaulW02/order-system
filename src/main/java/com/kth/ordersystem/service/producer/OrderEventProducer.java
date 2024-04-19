package com.kth.ordersystem.service.producer;

import com.kth.ordersystem.event.OrderEvent;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrderEventProducer {

    private static final String TOPIC = "order_events";

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;
    public void sendOrderEvent(OrderEvent orderEvent) {
        kafkaTemplate.send(TOPIC, orderEvent);
    }
}