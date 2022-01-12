package com.test;

import org.openqa.selenium.WebDriver;

public class Swappractise {
	
		
	
	public void getSalary(int a, int b) {
		System.out.println("before swap="+a);
		System.out.println("before swap="+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swap="+a);
	System.out.println("after swap="+b);
	}
		public static void main(String[] args) {
			new Swappractise().getSalary(5,10);
		
		}
	}
	
	

