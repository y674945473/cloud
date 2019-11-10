package org.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

	private static Logger log = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@KafkaListener(topics = {"topic-order"})
    public void consumer(String data) {
        log.info("+++++++++++++++++++++  message = {}", data);
    }
}
