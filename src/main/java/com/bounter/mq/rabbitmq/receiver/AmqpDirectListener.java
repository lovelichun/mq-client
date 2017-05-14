package com.bounter.mq.rabbitmq.receiver;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;


/**
 * Created by simon on 2017/5/13.
 */
@Component
public class AmqpDirectListener {

    public void onDirectMessage(String msg) {
        System.out.println("Receive msg (direct) :" + msg);
    }
}
