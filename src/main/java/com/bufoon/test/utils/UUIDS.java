package com.bufoon.test.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName: UUID8
 * @Description: 生成8位唯一编码（理论）
 * @author Billions039a
 * @date 2017年3月15日 上午10:50:30
 */
public class UUIDS {

	public static String[] chars = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
			"o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8",
			"9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
			"U", "V", "W", "X", "Y", "Z" };

	/**
	 * 短8位UUID思想其实借鉴微博短域名的生成方式，但是其重复概率过高，而且每次生成4个，需要随即选取一个。
	 * 
	 * 本算法利用62个可打印字符，通过随机生成32位UUID，由于UUID都为十六进制，所以将UUID分成8组，每4个为一组，然后通过模62操作，结果作为索引取出字符，
	 * 
	 * 这样重复率大大降低。
	 * 
	 * @return
	 */
	public static String generateUUID8() {
		StringBuffer shortBuffer = new StringBuffer();
		String uuid = UUID.randomUUID().toString().replace("-", "");
		for (int i = 0; i < 8; i++) {
			String str = uuid.substring(i * 4, i * 4 + 4);
			int x = Integer.parseInt(str, 16);
			shortBuffer.append(chars[x % 0x3E]);
		}
		return shortBuffer.toString();

	}
	/**
	 * 32位UUID
	 * @return
	 */
	public static String getUUID32(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		System.out.println("start==============");
		for (int i = 0; i <= 10000000; i++) {
			String uuid = UUIDS.generateUUID8();
			if (list.contains(uuid)) {
				System.out.println(uuid);
			} else {
				list.add(UUIDS.generateUUID8());
				if (i % 1000000 == 0) {
					System.out.println("add==============");
				}
			}
		}
		System.out.println("end==============");
	}
}
