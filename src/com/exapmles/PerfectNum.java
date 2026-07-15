package com.exapmles;

public class PerfectNum {

	public static boolean isPerfect(int num) {
		int sum = 0;
		for(int i=1;i<=num/2;i++) {
			if(num % i == 0) {
				sum += i;
				
			}
		}
		return sum == num;
	}
	public static void main(String[] args) {

		boolean result = isPerfect(28);
		System.out.println(result);
	}

}
