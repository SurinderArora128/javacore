package com.rays.basics;

public class practice4 {
public static void main(String[] args) {
	
	int num = 371;
	int r = 0;
	int n = num;
	int sum = 0;
	
	while (n>0) {
		 r = n % 10;
		 sum= sum + (r*r*r);
		n = n / 10;
	}
	if (sum == num) {
			System.out.print("Number is armstrong");	
	}
	else {
		System.out.print("Number is not armstrong");
	}
		
			

}
}