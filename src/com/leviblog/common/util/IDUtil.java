package com.leviblog.common.util;

public class IDUtil {
	/*
	 * 这是生成id的算法
	 */
	public static String createId(){
		String datetime = DateUtil.getDateTime().replaceAll("-", "")
				.replaceAll(":", "")
				.replaceAll(" ", "");
		String t = (int) (Math.random()*1000)+"";
		datetime+=t;
		return datetime;
	}
}
