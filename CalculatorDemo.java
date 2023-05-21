package org.javaArray;

import java.util.Scanner;

public class CalculatorDemo {
	public int result;
	
	public static void main(String[] args) {
		//boolean chk;
		int result = 0;//boolean chk = false;
		System.out.println("enter any two numbers for calculate");
		System.out.println("functions of addition,subtraction,multiplication and division");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st INTEGER number: ");
		int firstNum = sc.nextInt();
		// System.out.println(firstNum);
		System.out.println("enter 2nd INTEGER number: ");
		int secondNum = sc.nextInt();
		// System.out.println(secondNum);
		String[] functns = { "addition", "subtraction", "multiplication", "division" };
		int i = 0;
		while (i < functns.length) {
			System.out.println("for " + functns[i] + "  press " + (i + 1));
			i++;
		}
		int choosedNumber = sc.nextInt();
		
		
		while (choosedNumber!=0) {
			if (choosedNumber > functns.length) {
				System.out.println("choose the correct  option number: ");
				choosedNumber = sc.nextInt();
			}
			if (choosedNumber == 1) {
				result = firstNum + secondNum;
				System.out.println(
						"the addition of " + firstNum + " and " + secondNum + " is: " + (firstNum + secondNum));
				
			} else if (choosedNumber == 2) {
				result = firstNum - secondNum;
				System.out.println(
						"the subtraction of " + firstNum + " and " + secondNum + " is: " + (firstNum - secondNum));
				 //result = firstNum - secondNum;
			} else if (choosedNumber == 3) {
				result = firstNum * secondNum;
				System.out.println(
						"the multiplication of " + firstNum + " and " + secondNum + " is: " + (firstNum * secondNum));
				 //result = firstNum * secondNum;
			} else if (choosedNumber == 4) {
				result = firstNum / secondNum;
				System.out.println(
						"the division of " + firstNum + " and " + secondNum + " is: " + (firstNum / secondNum));
				 //result = firstNum / secondNum;
			}
			System.out.println("do you want to proceed with previous result: if yes press 1");
			int again_ = sc.nextInt();
			//int result = result;
			if (again_==1) {
				System.out.println("enter new INTEGER number to perform with previous result "  );
				int newNum = sc.nextInt();
				 firstNum=result;
				 secondNum=newNum;
				 
				 //i=0;
				//chk = true;
				
			} 
			//break;
			/*
			 * //after printing the correct condition we break the loop else it will check
			 *the condition again and again and its true so it prints same result infinitive time
			 */ }
		
	}

}
