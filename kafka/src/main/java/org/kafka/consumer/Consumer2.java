package org.kafka.consumer;

import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Consumer2 {

//	static Logger log = LoggerFactory.getLogger(Consumer2.class);
//	 
//    private static final String TOPIC = "milo2";
//    private static final String BROKER_LIST = "118.212.149.51:9092";
//    private static KafkaConsumer<String,String> consumer = null;
// 
//    static {
//        Properties configs = initConfig();
//        consumer = new KafkaConsumer<String, String>(configs);
//    }
// 
//    private static Properties initConfig(){
//        Properties properties = new Properties();
//        properties.put("bootstrap.servers",BROKER_LIST);
//        properties.put("group.id","0");
//        properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
//        properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
//        properties.setProperty("enable.auto.commit", "true");
//        properties.setProperty("auto.offset.reset", "earliest");
//        return properties;
//    }
// 
// 
//    public static void main(String[] args) {
//        while (true) {
//            ConsumerRecords<String, String> records = consumer.poll(10);
//            for (ConsumerRecord<String, String> record : records) {
//                log.info(record.topic());
//            }
//        }
//    }

}
