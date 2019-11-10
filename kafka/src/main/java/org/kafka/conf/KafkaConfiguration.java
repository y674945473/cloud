package org.kafka.conf;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;


@Configuration
@EnableKafka
public class KafkaConfiguration {

//	//ConcurrentKafkaListenerContainerFactory为创建Kafka监听器的工程类，这里只配置了消费者
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory<Integer, String> kafkaListenerContainerFactory() {
//        ConcurrentKafkaListenerContainerFactory<Integer, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(consumerFactory());
//        return factory;
//    }
// 
//    //根据consumerProps填写的参数创建消费者工厂
//    @Bean
//    public ConsumerFactory<Integer, String> consumerFactory() {
//        return new DefaultKafkaConsumerFactory<>(consumerProps());
//    }
// 
//    //根据senderProps填写的参数创建生产者工厂
//    @Bean
//    public ProducerFactory<Integer, String> producerFactory() {
//        return new DefaultKafkaProducerFactory<>(senderProps());
//    }
// 
//    //kafkaTemplate实现了Kafka发送接收等功能
//    @Bean
//    public KafkaTemplate<Integer, String> kafkaTemplate() {
//        KafkaTemplate template = new KafkaTemplate<Integer, String>(producerFactory());
//        return template;
//    }
// 
//    //消费者配置参数
//    private Map<String, Object> consumerProps() {
//        Map<String, Object> props = new HashMap<>();
//        //连接地址
//        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "118.190.97.96:9092");
//        //GroupID
//        props.put(ConsumerConfig.GROUP_ID_CONFIG, "bootKafka");
//        //是否自动提交
//        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);
//        //自动提交的频率
//        props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "100");
//        //Session超时设置
//        props.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, "15000");
//        //键的反序列化方式
//        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, IntegerDeserializer.class);
//        //值的反序列化方式
//        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        return props;
//    }
// 
//    //生产者配置
//    private Map<String, Object> senderProps (){
//        Map<String, Object> props = new HashMap<>();
//        //连接地址
//        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "118.190.97.96:9092");
//        //重试，0为不启用重试机制
//        props.put(ProducerConfig.RETRIES_CONFIG, 1);
//        //控制批处理大小，单位为字节
//        props.put(ProducerConfig.BATCH_SIZE_CONFIG, 16384);
//        //批量发送，延迟为1毫秒，启用该功能能有效减少生产者发送消息次数，从而提高并发量
//        props.put(ProducerConfig.LINGER_MS_CONFIG, 1);
//        //生产者可以使用的总内存字节来缓冲等待发送到服务器的记录
//        props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 1024000);
//        //键的序列化方式
//        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class);
//        //值的序列化方式
//        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        return props;
//    }
	
	
//	@Value("${kafka.bootstrap.servers}")
    private String BOOTSTRAP_SERVERS_CONFIG = "118.190.97.96:9092";
 
    @Bean
    public KafkaTemplate<String, String> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }
 
    public ProducerFactory<String, String> producerFactory() {
        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS_CONFIG);
        props.put(ProducerConfig.RETRIES_CONFIG, 0);
        props.put(ProducerConfig.BATCH_SIZE_CONFIG, 4096);
        props.put(ProducerConfig.LINGER_MS_CONFIG, 1);
        props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 40960);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        return new DefaultKafkaProducerFactory<>(props);
    }
    
    public ConsumerFactory<String, String> consumerFactory() {
        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS_CONFIG);
        props.put(ProducerConfig.RETRIES_CONFIG, 0);
        props.put(ProducerConfig.BATCH_SIZE_CONFIG, 4096);
        props.put(ProducerConfig.LINGER_MS_CONFIG, 1);
        props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 40960);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        return new DefaultKafkaConsumerFactory<>(props);
    }

}
