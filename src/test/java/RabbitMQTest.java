import com.bounter.mq.rabbitmq.sender.AmqpDirectSender;
import com.bounter.mq.rabbitmq.sender.AmqpFanoutSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class RabbitMQTest {

    @Autowired
    private AmqpDirectSender amqpDirectSender;
    
    @Autowired
    private AmqpFanoutSender amqpFanoutSender;

    @Test
    public void test() {
//        amqpDirectSender.sendDirect("hello pretty!");
        amqpFanoutSender.sendFanout("hello,pretty!");
    }

}
