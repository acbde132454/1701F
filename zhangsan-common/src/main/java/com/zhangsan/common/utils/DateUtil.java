package com.zhangsan.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	
	public static void main(String[] args) throws ParseException {
		String time = "2019-05-18 11:37:22";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = sdf.parse(time);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
	}
	
	//获取某月第一天日期
    public static Date getDateByInitMonth(Date src) throws ParseException{
    	
    	return null;
    }
}
