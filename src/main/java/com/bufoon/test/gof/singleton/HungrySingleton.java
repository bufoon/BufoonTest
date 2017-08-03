package com.bufoon.test.gof.singleton;

/**
 * 饿汉式就是比较着急，所以会在类加载的时候就创建实例，
 * 由于它是在类加载的时候就创建了，所以没有线程安全的问题，
 * 但是浪费资源，空间换时间；
* @ClassName: HungrySingleton  
* @Description: 饿汉式单例 
* @author anling.song  
* @date 2017年7月6日 下午4:17:37
 */
public class HungrySingleton {

	private static HungrySingleton instance = new HungrySingleton();
	
	//私有化构造方法
	private HungrySingleton(){}
	
	public static HungrySingleton getInstance(){
		return instance;
	}
}
