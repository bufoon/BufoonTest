package com.bufoon.test.mq.send;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.bufoon.test.App;
import com.bufoon.test.config.mq.RMQSenderException;
import com.bufoon.test.config.mq.rabbit.prop.MqProperties;
import com.bufoon.test.mq.model.CashCustomerOpt;
import com.bufoon.test.mq.model.CashCustomerOptVO;
import com.bufoon.test.mq.model.GDPMessage;
import com.bufoon.test.utils.UUIDS;

@SpringBootTest(classes={App.class})
@RunWith(SpringRunner.class)
public class CashCustomerOptSendTest {

	@Autowired
	private MqProperties properties;
	@Autowired
	private CashCustomerOptSend cashCustomerOptSend;
	
	@Test
	public void testSend() {
		for (int i = 0; i < 2; i++) {
			GDPMessage<List<CashCustomerOptVO>> messageModel = getData(i);
			System.out.println(JSON.toJSONString(messageModel));
			try {
				cashCustomerOptSend.send(properties.getGdpVhost().getTestGdp().getUniqueKey(), messageModel);
			} catch (RMQSenderException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	// id_persion, data_source，offer_stages这三个不能为空
	private GDPMessage<List<CashCustomerOptVO>> getData(int i){
		Date date = new Date();
		List<CashCustomerOptVO> list = new ArrayList<CashCustomerOptVO>();
		for (int j = 0; j < 1000; j++) {
			CashCustomerOptVO vo = new CashCustomerOptVO();
			vo.setId_person(UUIDS.generateUUID8());
			vo.setCertid("Certid" + i);
			vo.setCreate_time(date);
			vo.setData_source("1");
			vo.setOffer_stages("1");
			list.add(vo);
		}
		GDPMessage<List<CashCustomerOptVO>> messageModel = new GDPMessage<>();
		messageModel.setBusinessDate(date);
		messageModel.setSize(1000);
		messageModel.setSystemTime(date);
		messageModel.setData(list);;
		return messageModel;
	}
}
