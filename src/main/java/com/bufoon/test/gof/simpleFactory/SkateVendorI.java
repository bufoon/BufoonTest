package com.bufoon.test.gof.simpleFactory;

/**
 * 轮滑厂商接口
* @ClassName: SkateVendorI  
* @Description: 轮滑厂商接口，定义了一个创建轮滑鞋的方法  
* @author anling.song  
* @date 2017年7月6日 上午11:35:22
 */
public interface SkateVendorI {

	/**
	 * 创建轮滑鞋
	 */
	public void createSkate();
}
