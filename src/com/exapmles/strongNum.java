package com.exapmles;

public class strongNum {
	public static boolean strong(int num){
        int temp = num;
        int sum = 0;
        while(num != 0){
            int last = num % 10;
            int fact  = 1;
            for(int i=1;i<=last;i++){
                fact *= i;
                
            }
            sum += fact;
            num = num / 10;
        }
        return sum == temp;
    }

	public static void main(String[] args) {
		 boolean result = strong(145);
	     System.out.println(result);
	}

}
