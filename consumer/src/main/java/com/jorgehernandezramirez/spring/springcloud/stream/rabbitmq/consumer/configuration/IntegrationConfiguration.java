package com.jorgehernandezramirez.spring.springcloud.stream.rabbitmq.consumer.configuration;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(ItemSink.class)
public class IntegrationConfiguration {
}
