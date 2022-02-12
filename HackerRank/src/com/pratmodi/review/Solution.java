package com.pratmodi.review;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {

	public static void main(String[] args) {

		int[] array1 = new int[10];
	
		for(int i=0;i<array1.length;i++) {
			array1[i] = i;	
		}
		
		for(int a:array1) {
			System.out.println(a);
		}
		
		List<Integer> list = new ArrayList<Integer>();
		for(int a:array1) {
			list.add(a);
			System.out.println(a);
		}
		
		Iterator i = list.iterator();
		
		while(i.hasNext()) {
			System.out.println("ITERARTOR VALUES: "+i.next());
		}
		
	}

}
