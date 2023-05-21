package org.javaArray;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		ArmstrongNumber arm = new ArmstrongNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numer to find armstrong: ");
		int num=sc.nextInt();
		int count=arm.find_count_of_digit(num);
		System.out.println(count);
		int result=arm.find_armstrong(num,count);
		System.out.println(result);
		if (num==result) {
			System.out.println(num + "is an armstrong numer");
		}else {
			System.out.println(num + "is NOT armstrong numer");
		}
		
	}

	private int find_count_of_digit(int num) {
		// TODO Auto-generated method stub
		int count = 0;
		while (num>0) {
			int rem = num%10;
			count++;
			num=num/10;
			
		}
		return count;
	}

	private int find_armstrong(int num,int count) {
		// TODO Auto-generated method stub
		int rem,base=0;
		while (num>0) {
			rem = num%10; // 1634%10=4 163%10=3 16%10=6 1%10=1
			base = base+pow(rem,count);//(4,4) (3,4) (6,4) (1,4)
			num=num/10; //1634/10=163  163/10=16  16/10=6  1/10=1
		}
		return base;
	}

	private int pow(int rem,int pow) { 
		// TODO Auto-generated method stub
		int result=1;
		while (pow>0) {
			//int rem = base%10;
			result=rem*result; //4*1 4*4 16*4 64*4=256 3*1 9 27=81 6*1 6*6 36*6 216*6=1296  1*1*1*1=1 256+81+1296+1=1634
			pow=pow-1; //3 2 1 
		}
		return result;
	}
}
