package com.bufoon.test.gof.singleton;

/**
 * 顾名思义，比较懈怠，就是需要的时候才会去创建实例，
 * 这是经典的延迟加载思想，还有缓存的实现思路；
 * 它会有线程安全问题，可以加锁，但是会影响效率，
 * 典型的时间换空间的策略；
* @ClassName: LazySingleton  
* @Description: 懒汉式单例  
* @author anling.song  
* @date 2017年7月6日 下午4:20:09
 */
public class LazySingleton {

	private static LazySingleton instance = null;
	
	//私有化构造方法
	private LazySingleton(){}
	/**
	 * 线程安全问题
	 * @return
	 */
	public static LazySingleton getInstance1(){
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
	
	/**
	 * 加锁能避免线程安全问题，但是效率有问题
	 * 因为每次调用都得先获取锁
	 * @return
	 */
	public synchronized static LazySingleton getInstance2(){
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
	
	/**
	 * 加锁的另外一种实现方式，只会在第一次生成实例的时候去获取锁
	 * 提高效率，双重判断加锁，如果通过反射还是会破坏单例模式
	 * @return
	 */
	public static LazySingleton getInstance3(){
		if (instance == null) {
			synchronized (LazySingleton.class) {
				if (instance == null) {
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
}
