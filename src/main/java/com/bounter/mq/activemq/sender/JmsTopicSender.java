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
	
	@Autowired
	private Topic topic;
	
	/**
	 * 向指定的topic发送消息
	 * @param topic
	 * @param msg
	 */
	public void publish(String msg) {
		jmsTemplate.send(topic, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
            	System.out.println("Sending msg to topic: " + topic.getTopicName());
                return session.createTextMessage(msg);
            }
        });
    }
}
