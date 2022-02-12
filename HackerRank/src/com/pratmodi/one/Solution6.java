package com.pratmodi.one;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) throws IOException {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = null;
		try {
		int counter =0;
		sc = new Scanner(new File("C:\\Karumanchi workspace\\HackerRank\\doc\\first.txt"));
		
		while(sc.hasNextLine()) {
			
				String str = sc.nextLine();
				counter++;
				System.out.println(counter+" "+str.toString());
				
			
		}
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
