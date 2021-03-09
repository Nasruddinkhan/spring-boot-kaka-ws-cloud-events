package com.mypractice.rest.cloud.events.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mypractice.rest.cloud.events.event.EventType;
import com.mypractice.rest.cloud.events.event.MessageEvent;
import com.mypractice.rest.cloud.events.payload.OrderEvent;

import java.util.UUID;

public class Test {
    public static void main(String[] args) throws JsonProcessingException {
        // Send CREATE event
        OrderEvent orderPayload = OrderEvent.builder().firstName("Nasruddin").lastName("khan").email("Nasruddin@gmail.com").orderId(UUID.randomUUID().toString()).build();
        System.out.println(new ObjectMapper().writeValueAsString( MessageEvent.builder()
                .eventType(EventType.APPROVED)
                .data(orderPayload).key(null).build()));;
    }
}
