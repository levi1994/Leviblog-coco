package com.leviblog.common.util;

public class IDUtil {
	/*
	 * ��������id���㷨
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
