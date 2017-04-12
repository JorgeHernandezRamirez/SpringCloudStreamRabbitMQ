package com.jorgehernandezramirez.spring.springcloud.stream.rabbitmq.producer.configuration;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface ItemSource {

    String CHANNEL_NAME = "itemsChannel";

    @Output
    MessageChannel itemsChannel();
}
