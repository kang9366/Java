package Lec;

import java.util.Calendar;

public class CalendarClass {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		String[] strWeek = {"일", "월", "화", "수", "목", "금", "토"};
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int date = now.get(Calendar.DATE);
		int week = now.get(Calendar.DAY_OF_WEEK);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year + "년 " + month + "월 " + date + "일 " + strWeek[week-1] + "요일");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
}
