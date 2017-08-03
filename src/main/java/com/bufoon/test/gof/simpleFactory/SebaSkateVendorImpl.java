package com.bufoon.test.gof.simpleFactory;

/**
 * 轮滑厂商实现类
* @ClassName: SebaSkateVendorImpl  
* @Description: 实现类圣巴轮滑厂商  
* @author anling.song  
* @date 2017年7月6日 上午11:36:53
 */
public class SebaSkateVendorImpl implements SkateVendorI {

	@Override
	public void createSkate() {
		System.out.println("圣巴轮滑：创建一双SEBA轮滑");
	}

}
