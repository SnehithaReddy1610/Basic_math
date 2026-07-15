package com.exapmles;

public class HarshadNum {
	public static boolean isHarshad(int num) {
		int sum = 0;
		int temp = num;
		while(num != 0) {
			int rem = num % 10;
			sum += rem;
			num /= 10;
		}
		if(temp % sum == 0) {return true;}
		return false;
	}

	public static void main(String[] args) {
		boolean result = isHarshad(21);
		System.out.println(result);
	}

}
