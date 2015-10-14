package com.leviblog.common.util;

import java.util.Calendar;

public class DateUtil {
	
	public static String getDateTime(){
			Calendar c = Calendar.getInstance();
			String month = c.get(Calendar.MONTH)+1+"";
			month = format(month);
			String year = c.get(Calendar.YEAR)+"";
			year = format(year);
			String day = c.get(Calendar.DAY_OF_MONTH)+"";
			day = format(day);
			String hour = c.get(Calendar.HOUR_OF_DAY)+"";
			hour = format(hour);
			String min = c.get(Calendar.MINUTE)+"";
			min = format(min);
			String sec = c.get(Calendar.SECOND)+"";
			sec = format(sec);
			String date = year+"-"+month+"-"+day+" "+hour+":"+min+":"+sec;
			return date;
	}
	
	public static String format(String s){
		if(s.length()<2){
			return "0"+s;
		}
		return s;
	}
	
}
