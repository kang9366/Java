package Lec;

import java.util.Calendar;

public class CalendarClass {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		String[] strWeek = {"��", "��", "ȭ", "��", "��", "��", "��"};
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int date = now.get(Calendar.DATE);
		int week = now.get(Calendar.DAY_OF_WEEK);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year + "�� " + month + "�� " + date + "�� " + strWeek[week-1] + "����");
		System.out.println(hour + "�� " + minute + "�� " + second + "��");
	}
}
