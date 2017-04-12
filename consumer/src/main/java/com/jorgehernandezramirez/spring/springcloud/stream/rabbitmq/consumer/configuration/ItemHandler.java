package com.jorgehernandezramirez.spring.springcloud.stream.rabbitmq.consumer.configuration;

import com.jorgehernandezramirez.spring.springcloud.stream.rabbitmq.consumer.dto.ItemDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
public class ItemHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(ItemHandler.class);

    @StreamListener(ItemSink.CHANNEL_NAME)
    public void process(ItemDto itemDto) {
        LOGGER.info("{}, {}", itemDto.getId(), itemDto.getName());
    }
}
