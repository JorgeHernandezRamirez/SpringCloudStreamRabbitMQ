package com.jorgehernandezramirez.spring.springcloud.stream.rabbitmq.producer.configuration;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;

@Configuration
@EnableBinding(ItemSource.class)
@IntegrationComponentScan
public class IntegrationConfiguration {
}
