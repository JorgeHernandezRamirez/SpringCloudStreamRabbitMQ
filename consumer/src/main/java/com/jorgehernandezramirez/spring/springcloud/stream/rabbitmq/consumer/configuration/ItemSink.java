package com.jorgehernandezramirez.spring.springcloud.stream.rabbitmq.consumer.configuration;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ItemSink {

    String CHANNEL_NAME = "itemsChannel";

    @Input
    SubscribableChannel itemsChannel();
}
