package com.test;

import java.util.Arrays;

public class Practicearray {
	  static int [] b= {10,7,5,5,7};
	 public static void getDuplicate() {
		 
	
	 for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if( b[i]==b[j]) {
					System.out.println("duplicate value " +b[j]);
				}

	
	}
					
}
	 }
	 
 
	 public static void main(String[] args) {
		 getDuplicate();

}

}
