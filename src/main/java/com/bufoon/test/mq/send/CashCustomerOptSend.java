//package com.bufoon.test.mq.send;
//
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.bufoon.test.mq.model.MessageModel;
//
//@Service
//public class CashCustomerOptSend {
//
//	@Autowired
//	private RabbitTemplate customeRabbitTemplate;
//	
//	public void send(MessageModel messageModel){
//		customeRabbitTemplate.convertAndSend("GDP_TO_CLF_EXCHANGE", 
//				"GDP_TO_CLF_cash_customer_opt_QUEUE_RK", messageModel);
//	}
//	
//	public void sendString(String str){
//		customeRabbitTemplate.convertAndSend("GDP_TO_CLF_EXCHANGE", 
//				"GDP_TO_CLF_cash_customer_opt_QUEUE_RK", str);
//	}
//}
