package com.bounter.mq.activemq.receiver;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

/**
 * Queue类型的消息监听器
 *
 * @author sheng.zhao
 */
@Component
public class JmsQueueListener {

    public void onQueueMessage(String message) {
        System.out.println("Receive msg (queue) : " + message);
    }

}
