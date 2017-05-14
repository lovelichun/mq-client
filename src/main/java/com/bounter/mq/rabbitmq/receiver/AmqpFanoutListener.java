package com.bounter.mq.rabbitmq.receiver;


import org.springframework.stereotype.Component;

/**
 * Created by simon on 2017/5/13.
 */
@Component
public class AmqpFanoutListener {

    public void onFanoutMessage(String msg) {
        System.out.println("Receive msg (fanout) :" + msg);
    }
}
