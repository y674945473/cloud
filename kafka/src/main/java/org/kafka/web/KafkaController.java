package org.kafka.web;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.kafka.entity.Message;
import org.kafka.producter.KafkaSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="test")
public class KafkaController {
	
	@Resource
    private KafkaSender kafkaProducer;
	
	@RequestMapping("create")
    @ResponseBody
	public Map<String, Object> test(){
		// 创建消息
        Message messageBean = new Message();
        String uuid = UUID.randomUUID().toString();
        messageBean.setId(uuid);
        messageBean.setSendTime(new Date());
        // 将消息发送到 kafka
        kafkaProducer.sendMessage(messageBean);
        Map<String, Object> model = new HashMap<>();
        // 返回成功信息
        model.put("resultCode", 1);
        model.put("resultMsg", "success");
        model.put("messageBean", messageBean);
        return model;
	}
}
