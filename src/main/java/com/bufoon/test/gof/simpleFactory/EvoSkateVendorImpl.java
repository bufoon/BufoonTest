package com.bufoon.test.gof.simpleFactory;

/**
 * 轮滑厂商实现类
* @ClassName: EvoSkateVendorImpl  
* @Description: Evo 轮滑厂商实现类  
* @author anling.song  
* @date 2017年7月6日 上午11:39:26
 */
public class EvoSkateVendorImpl implements SkateVendorI {

	@Override
	public void createSkate() {
		System.out.println("EVO轮滑：创建一双EVO轮滑");
	}

}
