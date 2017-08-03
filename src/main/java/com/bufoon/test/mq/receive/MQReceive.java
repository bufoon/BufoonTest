//package com.bufoon.test.mq.receive;
//
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.amqp.support.AmqpHeaders;
//import org.springframework.messaging.handler.annotation.Header;
//import org.springframework.stereotype.Service;
//
//import com.alibaba.fastjson.JSON;
//import com.bufoon.test.mq.model.MessageModel;
//
//@Service
//
//public class MQReceive {
//
//	@RabbitListener(queues = "queue_file_upload")
//	public void receive1(String hello){
//		System.out.println("111111111111111111111111111111111111111" + hello);
//	}
//	@RabbitListener(queues = "GDP_TO_CLF_cash_customer_opt_QUEUE", containerFactory="rabbitListenerContainerFactory")
//	public void receive2(MessageModel messageModel){
//		System.out.println("messageModel: " + JSON.toJSONString(messageModel));
//	}
//	@RabbitListener(queues = "queue_file_upload")
//	public void receive3(String hello){
//		System.out.println("333333333333333333333333333333333333333 " + hello);
//	}
//}
