package com.mypractice.rest.cloud.events.consumer;

import com.mypractice.rest.cloud.events.event.MessageEvent;
import com.mypractice.rest.cloud.events.payload.OrderEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Slf4j
@Component
public class OrderConsumer {
    private final StreamBridge stream;

    @Autowired
    public OrderConsumer(StreamBridge stream) {
        this.stream = stream;
    }

    @Bean
    public Consumer<MessageEvent<String, OrderEvent>> ordersConsumer() {
        return event -> {
            log.info("Consuming message event created at {}",event);
            log.info("stream {}",stream);
            stream.send("order-approved", event);
        };
    }

   /* @Bean
    public Consumer<MessageEvent<String, OrderEvent>> approvedConsumer() {
        return event -> {
            log.info("approvedConsumer {}",event);
            log.info("stream {}",stream);
        };
    }*/
}
