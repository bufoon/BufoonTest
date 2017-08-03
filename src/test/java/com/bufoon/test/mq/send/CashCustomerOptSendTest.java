//package com.bufoon.test.mq.send;
//
//import java.util.Date;
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.alibaba.fastjson.JSON;
//import com.bufoon.test.App;
//import com.bufoon.test.mq.model.CashCustomerOpt;
//import com.bufoon.test.mq.model.MessageModel;
//
//@SpringBootTest(classes={App.class})
//@RunWith(SpringRunner.class)
//public class CashCustomerOptSendTest {
//
//	@Resource
//	private CashCustomerOptSend cashCustomerOptSend;
//	
//	@Test
//	public void testSend() {
//		for (int i = 0; i < 10; i++) {
//			MessageModel messageModel = getData(i);
//			System.out.println(JSON.toJSONString(messageModel));
//			cashCustomerOptSend.send(messageModel);
////			cashCustomerOptSend.sendString(JSON.toJSONString(messageModel));
////			try {
////				Thread.currentThread().sleep(2000);
////			} catch (InterruptedException e) {
////				e.printStackTrace();
////			}
//		}
//		
//	}
//	
//	// id_persion, data_source，offer_stages这三个不能为空
//	private MessageModel getData(int i){
//		MessageModel messageModel = new MessageModel();
//		Date date = new Date();
//		messageModel.setBusinessDate(date);
//		messageModel.setSize(1);
//		messageModel.setSystemTime(date);
//		CashCustomerOpt vo = new CashCustomerOpt();
//		vo.setIdPerson("IdPerson" + i);
//		vo.setCertid("Certid" + i);
//		vo.setCreateTime(date);
//		vo.setDataSource("DataSource" + i);
//		vo.setOfferStages("OfferStages" + i);
//		messageModel.getData().add(vo);
//		return messageModel;
//	}
//}
