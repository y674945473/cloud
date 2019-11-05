package org.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

	private static Logger Logger = LoggerFactory.getLogger(KafkaConsumer.class);
	@KafkaListener(topics = {"hello"})
    public void consumer(String message) {
		Logger.info("c1 消费了hello topic messge:{}", message);
    }
}
