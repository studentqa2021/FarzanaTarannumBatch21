package com.test;

import java.util.Arrays;

public class Collectionpractice {
static int []array= {2,3,3,4,5,6,6};


public static void main(String[] args) {
	//System.out.println(Arrays.toString(a));
	//System.out.println(a[0]);
	//System.out.println("My array total no="+a.length);
	for(int i=0;i<array.length;i++) {
		for(int j=(i+1);j<array.length;j++) {
			if(array [i]==array[j]) {
				
		
			
		System.out.println(array[i]+array[j]);
		}
	}
}
}
}
