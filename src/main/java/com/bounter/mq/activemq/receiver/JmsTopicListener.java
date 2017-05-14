package com.bounter.mq.activemq.receiver;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

/**
 * Topic类型的消息监听器
 *
 * @author sheng.zhao
 */
@Component
public class JmsTopicListener {

    public void onTopicMessage(String message) {
        System.out.println("Receive msg (topic): " + message);
    }

}
