package com.pratmodi.one;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DequeueExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> dq = new ArrayDeque<Integer>();
		HashSet<Integer> s = new HashSet<Integer>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max = 0;
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			dq.add(tmp);
			s.add(tmp);

			if (dq.size() == m) {
				max = Math.max(s.size(), max);
				int item = dq.remove();
				if (!dq.contains(item)) {
					s.remove(item);
				}
			}
		}
		System.out.println(max);
		sc.close();
	}

}
