package com.jorgehernandezramirez.spring.springcloud.stream.rabbitmq.producer.controller;

import com.jorgehernandezramirez.spring.springcloud.stream.rabbitmq.producer.configuration.ItemGateway;
import com.jorgehernandezramirez.spring.springcloud.stream.rabbitmq.producer.dto.ItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ItemController {

    @Autowired
    private ItemGateway itemGateway;

    @RequestMapping("/generateItem")
    @ResponseBody
    public ItemDto generateWork(@RequestParam("name") String name) {
        final ItemDto itemDto = new ItemDto(UUID.randomUUID().toString(), name);
        itemGateway.generate(itemDto);
        return itemDto;
    }
}
