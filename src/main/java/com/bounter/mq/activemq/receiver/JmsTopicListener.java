package com.bounter.mq.activemq.receiver;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

/**
 * Topic类型的消息监听器
 * @author sheng.zhao
 *
 */
@Component
public class JmsTopicListener implements MessageListener {

	@Override
	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
			try {
				System.out.println("Receive msg : " + ((TextMessage) message).getText());
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
	}

}
