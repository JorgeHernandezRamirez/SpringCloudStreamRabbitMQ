package com.jorgehernandezramirez.spring.springcloud.stream.rabbitmq.producer.configuration;

import com.jorgehernandezramirez.spring.springcloud.stream.rabbitmq.producer.dto.ItemDto;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface ItemGateway {

    @Gateway(requestChannel = ItemSource.CHANNEL_NAME)
    void generate(ItemDto itemDto);
}
