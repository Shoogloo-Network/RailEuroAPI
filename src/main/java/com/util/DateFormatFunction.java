package com.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateFormatFunction {
	
	static String pattern = "yyyy-MM-dd'T'hh:m:ss.sss'Z'";
	static String patternMini = "yyyy-MM-dd";
	static String pattern2 = "yyyy-MM-dd'T'HH:mm:ss";
	static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);

	public static Date getDate(String dateStr) throws ParseException {

		Date date = simpleDateFormat2.parse(dateStr);
		return date;
	}
	public static Date getDateLongPattern(String dateStr) throws ParseException {

				Date date = simpleDateFormat.parse(dateStr);
				return date;
			}

	public static String getCurrentDateStr() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, 4);
		String date = simpleDateFormat.format(new Date());

		return date;
	}

	public static String getCurrentDateStr(Date date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patternMini);

		String dateStr = simpleDateFormat.format(date);
		return dateStr;
	}

	public static List<String> getGivenDateStr(int i) {
		List<String> list = new ArrayList<String>();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Calendar calendar = Calendar.getInstance();
		for (int j = 0; j <= i; j++) {
			calendar.add(Calendar.DAY_OF_YEAR, 1);
			calendar.set(Calendar.HOUR_OF_DAY, 1);
			String date = simpleDateFormat.format(calendar.getTime());
			list.add(date);
		}

		return list;
	}
	public static List<String> getGivenDateStr(String dateStr,int i) throws ParseException {
		List<String> list = new ArrayList<String>();
		Date date=DateFormatFunction.getDateLongPattern(dateStr);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int p=Math.abs(i);
		for (int j = 0; j <= p; j++) {
			
			//calendar.set(Calendar.HOUR_OF_DAY, 1);
			String dates = simpleDateFormat.format(calendar.getTime());
			list.add(dates);
			if(i>0)
			calendar.add(Calendar.DAY_OF_YEAR, 1);
			else
				calendar.add(Calendar.DAY_OF_YEAR, -1);
			System.out.println("date="+dates);
		
		}
		

		return list;
	}

	public static void main(String ass[]) {
		try {
		//	static String pattern = "yyyy-MM-ddTHH:mm:ss.sss'Z'";
			System.out.println("" + DateFormatFunction.getDateLongPattern("2024-02-13T17:11:56.651Z"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
