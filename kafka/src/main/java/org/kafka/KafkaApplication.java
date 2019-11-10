package org.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class KafkaApplication 
{
//	@Autowired
//	KafkaSender kafkaSender;
//	@Autowired
//	KafkaConsumer kafkaConsumer;
	private static Logger Logger = LoggerFactory.getLogger(KafkaApplication.class);
    public static void main( String[] args )
    {
    	 SpringApplication.run(KafkaApplication.class, args);
    	Logger.info("------kafka服务启动成功------------");
    	//ConfigurableApplicationContext context =
//    	KafkaSender sender = context.getBean(KafkaSender.class);
//
//        for (int i = 0; i < 3; i++) {
//            //调用消息发送类中的消息发送方法
//            sender.sendTest();
//
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }
    
}
