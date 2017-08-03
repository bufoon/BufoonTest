package com.bufoon.test.gof.simpleFactory;

/**
 * 工厂类
* @ClassName: SkateFactory  
* @Description: 用于创建轮滑厂商实例  
* @author anling.song  
* @date 2017年7月6日 下午1:36:03
 */
public class SkateFactory {

	/**
	 * 创建轮滑厂商实例
	 * @param cause
	 * @return
	 */
	public static SkateVendorI newSkateVendor(int cause){
		SkateVendorI skateVendor = null;
		switch (cause) {
		case 1:
			skateVendor = new SebaSkateVendorImpl();
			break;
		case 2:
			skateVendor = new EvoSkateVendorImpl();
			break;
		default:
			skateVendor = new SebaSkateVendorImpl();
		}
		return skateVendor;
	}
}
