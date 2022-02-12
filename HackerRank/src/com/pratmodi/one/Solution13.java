package com.pratmodi.one;

import java.util.Scanner;
import java.util.Stack;

public class Solution13 {

//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		while (sc.hasNext()) {
//			String input = sc.next();
//			String[] strArray = input.split("");
//			Stack<String> stack = new Stack<String>();
//			if (input.equalsIgnoreCase(""))
//				System.out.println("true");
//			;
//			stack.push(input);
//			for (int i = 0; i < strArray.length; i++) {
//				stack.pop();
//				if(stack.isEmpty()) {
//					System.out.println("true");
//					break;
//				}else {
//					System.out.println("false");
//				}
//			}
//			
//		}
//
//	}

	private static boolean matchParenthisis(String str) {
		Stack<Character> st = new Stack<Character>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (c == '{' || c == '[' || c == '(') {
				st.push(c);
			} else {
				if (c == ']' && !st.isEmpty() && st.pop() == '[') {
					continue;
				} else if (c == '}' && !st.isEmpty() && st.pop() == '{') {
					continue;
				} else if (c == ')' && !st.isEmpty() && st.pop() == '(') {
					continue;
				} else {
					return false;
				}
			}
		}

		return st.isEmpty();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String s = in.next();
			System.out.println(matchParenthisis(s));
		}
		in.close();
	}
	
}
