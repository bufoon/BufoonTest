package com.bufoon.test.gof.singleton;

/**
 * 结合懒汉饿汉两种实现都会有点小小的缺陷，
 * 能不能解决既能延迟加载，又不会有安全问题呢？
 * 因为static是由jvm去控制线同步的，所以能解决线程安全问题；
 * 在单例类内添加一个静态内部类，静态内部类初始化类实例；
* @ClassName: InnerStaticClassSingleton  
* @Description: 静态内部类单例  
* @author anling.song  
* @date 2017年7月6日 下午4:29:14
 */
public class InnerStaticClassSingleton {

	private InnerStaticClassSingleton(){}
	
	/**
	 * 在真正调用的时候才会初始化，实现了延迟加载
	 * 线程安全由jvm底层控制，所以是线程安全的
	* @ClassName: InnerSingletonHolder  
	* @Description: 静态内部类  
	* @author anling.song  
	* @date 2017年7月6日 下午4:30:36
	 */
	private static class InnerSingletonHolder{
		private static InnerStaticClassSingleton instance = new InnerStaticClassSingleton();
	}
	
	public static InnerStaticClassSingleton getInstance(){
		return InnerSingletonHolder.instance;
	}
}
