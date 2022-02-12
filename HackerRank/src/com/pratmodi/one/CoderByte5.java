package com.pratmodi.one;

import java.util.Scanner;

public class CoderByte5 {
	public static String QuestionsMarks(String str) {
		int n1 = 0, n2 = 0, count = 0, tens = 0;
		char[] chars = str.replaceAll("[^?0-9]", "").toCharArray();
		for (char c : chars) {
			if (Character.isDigit(c) && n1 == 0)
				n1 = (int) (c - '0');
			else if (c == '?' && n1 != 0)
				count++;
			else if (Character.isDigit(c) && n1 != 0) {
				n2 = (int) (c - '0');
				if (n1 + n2 == 10) {
					if (count != 3)
						return "false";
					tens++;
					n1 = 0;
					n2 = 0;
					count = 0;
				}
			}
		}
		System.out.println("TENS: "+tens);
		return (tens > 0) ? "true" : "false";
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(QuestionsMarks(s.nextLine()));
	}
}
