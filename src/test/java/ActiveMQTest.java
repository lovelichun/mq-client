

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bounter.mq.activemq.sender.JmsQueueSender;
import com.bounter.mq.activemq.sender.JmsTopicSender;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ActiveMQTest {

    @Autowired
    private JmsQueueSender jmsQueueSender;
    
    @Autowired
    private JmsTopicSender JmsTopicSender;

    @Test
    public void test() {
//    	jmsQueueSender.sendText("hello pretty!");
//    	jmsQueueSender.sendTextToDefaultDest("hello pretty!");
    	JmsTopicSender.publish("hello pretty!");
    }

}