package com.exapmles;

public class AutomorphicNum {

	 public static boolean strong(int num){
	        int square = 0;
	        square = num * num;
	        if((square / num) == num){
	            return true;
	        }
	        return false;
	    }
	 
	public static void main(String[] args) {
		boolean result = strong(25);
		System.out.println(result);
		
		
	}

}
