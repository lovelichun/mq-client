package com.bounter.mq.rabbitmq.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by simon on 2017/5/13.
 */
@Component
public class AmqpDirectSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendDirect(String msg) {
        System.out.println("Sending msg (direct): " + msg);
        amqpTemplate.convertAndSend(msg);
    }
}
