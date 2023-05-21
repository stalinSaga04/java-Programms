package org.javaArray;

import java.util.Iterator;

public class ArrayLeftShift {
	public static void main(String[] args) {
		int[] ar = { 80, 90, 30, 40 };
		System.out.println("before 1 left shift:  80, 90, 30, 40");
		int i=0;
		/*
		 * for (int i = 0; i < ar.length; i++) { System.out.print(ar[i]+" ");
		 * 
		 * }
		 * 
		 * System.out.println("\nafter 1 left shift"); for (int i = 0; i < 1; i++) {
		 * int first = ar[0]; //ar[i] = ar[ar.length-1]; for (int j = 0; j
		 * <=ar.length-2; j++) { ar[j] = ar[j +1]; } ar[ar.length-1]=first; } for (int i
		 * = 0; i < ar.length; i++) { System.out.print(ar[i]+" "); }
		 */
		//
		while (i>=0) {
			 int first = ar[0];
			
		while (i<ar.length-1) {
			ar[i]=ar[i+1];
			//System.out.print(ar[i]+" ");
			i++;
		}
		ar[ar.length-1]=first;
	break;
		}
		System.out.println("after 1 leftshift"); 
		for (int j = 0; j < ar.length; j++) {
			
			System.out.print(ar[j]+" ");
		}
		
	}
}
