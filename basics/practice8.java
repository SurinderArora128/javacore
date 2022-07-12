package com.rays.basics;

public class practice8 {
public static void main(String[] args) {
	int a = 123456, b =0;
	for(;a !=0; a=a/10) {
		
	int remainder= a %10;
	b = b*10 + remainder;
	}
	System.out.println("The reverse of the given number is:"+b);
}
}
