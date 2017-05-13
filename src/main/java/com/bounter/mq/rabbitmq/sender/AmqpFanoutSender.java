package com.bounter.mq.rabbitmq.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by simon on 2017/5/13.
 */
@Component
public class AmqpFanoutSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendFanout(String msg) {
        System.out.println("Sending msg (fanout): " + msg);
        amqpTemplate.convertAndSend(msg);
    }
}
