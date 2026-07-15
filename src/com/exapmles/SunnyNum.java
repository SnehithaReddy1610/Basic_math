package com.exapmles;

public class SunnyNum {
	public static boolean isSunny(int num) {
		int i = 1;
		while(i * i < num + 1) {
			i++;
		}
		if(i * i == num + 1) {
			return true;
		}
		return false;
	}
	

	public static void main(String[] args) {

		boolean result = isSunny(8);
		System.out.println(result);
	}

}
