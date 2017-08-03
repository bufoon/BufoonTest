package com.bufoon.test.gof.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 在高效Java第二版上提到的一种实现方式，
 * 因为枚举的一个属性就是代表枚举类自己，
 * 所以用来实现单例模式非常简便和通俗易懂；
* @ClassName: EnumSingleton  
* @Description: 枚举单例类  
* @author anling.song  
* @date 2017年7月6日 下午4:33:10
 */
public enum EnumSingleton {

	enumInstance;
	
	// 存花式刹停动作分数
	private Map<String, Integer> map = null;
	
	/**
	 * Enum构造方法，JVM会保证只初始化一次
	 */
	private EnumSingleton(){
		System.out.println("初始化数据............");
		if (map == null) {
			map = new HashMap<String, Integer>();
		}
		map.put("V_TOE_TOE", 10);
		map.put("EIGHT_CROSS", 9);
		map.put("EAGLE", 8);
		map.put("BACKSLIDE", 6);
		map.put("PARRAL", 4);
	}
	
	public int getScore(String action){
		if ("".equals(action) || null == action || map == null) {
			return -1;
		}
		return map.get(action);
	}
	
	public static void main(String[] args) {
		EnumSingleton e1 = EnumSingleton.enumInstance;
		EnumSingleton e2 = EnumSingleton.enumInstance;
		// 确认枚举是否只初始化了一次构造方法
		System.out.println((e1 == e2) + "|" + (e1 == enumInstance) + "|" + (e2 == enumInstance));
		System.out.println("V_TOE_TOE 动作的评分为：" + enumInstance.getScore("V_TOE_TOE") + "分");
	}
}
