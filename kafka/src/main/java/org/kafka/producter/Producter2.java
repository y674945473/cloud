package org.kafka.producter;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Producter2 {

//	static Logger log = LoggerFactory.getLogger(Producter2.class);
//	 
//    private static final String TOPIC = "milo2";
//    private static final String BROKER_LIST = "118.212.149.51:9092";
//    private static KafkaProducer<String,String> producer = null;
// 
//    /*
//    初始化生产者
//     */
//    static {
//        Properties configs = initConfig();
//        producer = new KafkaProducer<String, String>(configs);
//    }
// 
//    /*
//    初始化配置
//     */
//    private static Properties initConfig(){
//        Properties properties = new Properties();
//        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,BROKER_LIST);
//        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
//        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName());
//        return properties;
//    }
// 
//    public static void main(String[] args) throws InterruptedException {
//        //消息实体
//        ProducerRecord<String , String> record = null;
//        for (int i = 0; i < 1000; i++) {
//            record = new ProducerRecord<String, String>(TOPIC, "value"+(int)(10*(Math.random())));
//            //发送消息
//            producer.send(record);
//        }
//        producer.close();
//    }

}
