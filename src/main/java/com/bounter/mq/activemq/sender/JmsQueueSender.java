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
	
	@Autowired
	private Queue queue;
	
	public void sendText(String msg) {
        jmsTemplate.send(queue, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
            	System.out.println("Sending text to queue: " + queue.getQueueName());
                return session.createTextMessage(msg);
            }
        });
    }
	
	public void sendTextToDefaultDest(String msg) {
        jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
            	System.out.println("Sending text to defalut destination");
                return session.createTextMessage(msg);
            }
        });
    }
}
