package org.kafka.producter;

import javax.annotation.Resource;

import org.kafka.entity.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Component
public class KafkaSender {

	private Logger log = LoggerFactory.getLogger(KafkaSender.class);
	@Resource
    private KafkaTemplate<String, String> kafkaTemplate;
 
//    @Value("${kafka.topic.order}")
    private String topicOrder = "topic-order";
 
    /**
     * 发送消息
     *
     * @param messageBean 消息实例
     */
    public void sendMessage(Message messageBean) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        builder.setDateFormat("yyyy-MM-dd HH:mm:ss");
        Gson gson = builder.create();
        // 将消息实例序列化为json格式的字符串
        String message = gson.toJson(messageBean);
        // 发送消息
        kafkaTemplate.send(topicOrder, "123456");
        // 打印消息
        log.info("\nminiooc send message：\n" + message);
    }
//	private static final String path = "118.190.97.96:9092";
//	private static final String topic = "hello";
//	public static void main(String[] args) {
//		Properties pro = new Properties();
//		//设置key序列化器
//		pro.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
//		//设置重试次数
//		pro.put(ProducerConfig.RETRIES_CONFIG,10);
//		//设置值序列化器
//		pro.put("value.serializer","org.apache.kafka.common.serialization.StringSerializer");
//		//集群地址
//		pro.put("boottatrap.servers",path);
//		
//		KafkaProducer<String, String> producer = new KafkaProducer<>(pro);
//		
//		ProducerRecord<String, String> record = new ProducerRecord<String, String>(topic, "kafka-demo","hello,kafka!");
//		
//		try {
//			producer.send(record);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		producer.close();
//		
//	}
//    #============== kafka ===================
//    		# \u6307\u5B9Akafka \u4EE3\u7406\u5730\u5740\uFF0C\u53EF\u4EE5\u591A\u4E2A
//    		spring.kafka.bootstrap-servers=118.190.97.96:9092
//
//    		#=============== provider  =======================
//
//    		spring.kafka.producer.retries=0
//    		# \u6BCF\u6B21\u6279\u91CF\u53D1\u9001\u6D88\u606F\u7684\u6570\u91CF
//    		spring.kafka.producer.batch-size=16384
//    		spring.kafka.producer.buffer-memory=33554432
//
//    		# \u6307\u5B9A\u6D88\u606Fkey\u548C\u6D88\u606F\u4F53\u7684\u7F16\u89E3\u7801\u65B9\u5F0F
//    		spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
//    		spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer
//
//    		#=============== consumer  =======================
//    		# \u6307\u5B9A\u9ED8\u8BA4\u6D88\u8D39\u8005group id
//    		spring.kafka.consumer.group-id=test-consumer-group
//
//    		spring.kafka.consumer.auto-offset-reset=earliest
//    		spring.kafka.consumer.enable-auto-commit=true
//    		spring.kafka.consumer.auto-commit-interval=100
//
//    		# \u6307\u5B9A\u6D88\u606Fkey\u548C\u6D88\u606F\u4F53\u7684\u7F16\u89E3\u7801\u65B9\u5F0F
//    		spring.kafka.consumer.key-deserializer=org.apache.kafka.common.serialization.StringDeserializer
//    		spring.kafka.consumer.value-deserializer=org.apache.kafka.common.serialization.StringDeserializer
//
//
//    		eureka:
//    		  enable-self-preservation: false # 设置为false表示关闭保护模式
//    		  eviction-interval-timer-in-ms: 60000 # 设置清理的间隔时间，而后这个时间使用的是毫秒单位（默认是60秒）
//    		  client: # 客户端进行Eureka注册的配置
//    		    service-url:
//    		      defaultZone: http://localhost:18000/eureka
//    		  instance:
//    		    instance-id: kafka  # 在信息列表时显示主机名称
//    		    prefer-ip-address: true
}
