package com.exapmles;

public class SpyNum {

	public static boolean isSpy(int num) {
		int sum = 0;
		int product = 1;
		while(num!=0) {
			int rem = num % 10;
			sum += rem;
			product *= rem;
			num /= 10;
		}
		return sum == product;
	}
	public static void main(String[] args) {
		boolean result = isSpy(123);
		System.out.println(result);
	}

}
