package com.rays.basics;

import java.util.*;


public class practice5 {
public static void main(String[] args) {
	Date  today = new  Date ();
	Calendar cal = Calendar.getInstance();
	cal.setTime(today);
	Date d = cal.getTime();
	System.out.println(d);
}
}
