package com.pratmodi.one;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Result {

	public static void main(String[] args) {

	}

	public static String findDay(int month, int day, int year) {
		String str = "";
		LocalDate dt = LocalDate.of(year, month, day);
		dt.getDayOfWeek();

		
		return dt.getDayOfWeek().name();
	}

}
