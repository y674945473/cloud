package org.kafka;

import org.kafka.producter.KafkaSender;
import org.kafka.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class KafkaApplication 
{
	@Autowired
	KafkaSender kafkaSender;
	@Autowired
	KafkaConsumer kafkaConsumer;
	private static Logger Logger = LoggerFactory.getLogger(KafkaApplication.class);
    public static void main( String[] args )
    {
    	SpringApplication.run(KafkaApplication.class, args);
    	Logger.info("------kafka服务启动成功------------");
    }
    
    @Scheduled(cron = "0/2 * * * * ? ")
    public void sendMsg(){
      kafkaSender.sendTest();
    }
}
