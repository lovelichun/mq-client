package com.bounter.mq.activemq.sender;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

/**
 * Topic类型的消息发送器
 * @author sheng.zhao
 *
 */
@Component
public class JmsTopicSender {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	public void sendTopic(String msg) {
		System.out.println("Sending msg (topic): " + msg);
		jmsTemplate.convertAndSend(msg);
    }
}
