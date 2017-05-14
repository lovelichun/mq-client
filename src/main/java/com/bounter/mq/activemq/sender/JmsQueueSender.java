package com.bounter.mq.activemq.sender;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

/**
 * Queue类型的消息发送器
 * @author sheng.zhao
 *
 */
@Component
public class JmsQueueSender {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	public void sendQueue(String msg) {
        System.out.println("Sending msg (queue): " + msg);
        jmsTemplate.convertAndSend(msg);
    }

}
