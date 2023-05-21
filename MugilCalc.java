package org.javaArray;

import java.util.Scanner;

public class MugilCalc {


	public static void main(String[] args) {
		int val = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First no : ");
		int f = sc.nextInt();
		System.out.println("Enter Second no : ");
		int s = sc.nextInt();
		System.out.println("For Add : press 1 ");
		System.out.println("For Sub: press 2 ");
		System.out.println("For Multiple : press 3 ");
		System.out.println("For Div : press 4 ");
		int input = sc.nextInt();
		if (input>4 || input ==0) {
			System.out.println("enter valid options");
			input = sc.nextInt();
		}
		for (int i = 0; i >= 0; i++) {
			if (input == 1) {
				val = f + s;
				System.out.println("addition of given number " + f + " + " + s + " = " + (f + s));

			} else if (input == 2) {
				val = f - s;
				System.out.println("Subtraction of given number " + f + " - " + s + " = " + (f - s));

			} else if (input == 3) {
				val = f * s;
				System.out.println("Multiplication of given number " + f + " * " + s + " =" + (f * s));

			} else if (input == 4) {
				val = f / s;
				System.out.println("Division of given number " + f + " / " + s + " = " + (f / s));

			}
			
			System.out.println("Do u want to proceed- if yes press 'y' or if terminate press any");
			// String t = sc.next();
			char c = sc.next().charAt(0);
			if (c == 'y') {
				System.out.println("enter new number: ");
				int newNum = sc.nextInt();
				System.out.println("For Add : press 1 ");
				System.out.println("For Sub: press 2 ");
				System.out.println("For Multiple : press 3 ");
				System.out.println("For Div : press 4");
				input = sc.nextInt();
				f = val; // storing previous operation value in first
				s = newNum; // storing new number value in second
							// for continue next operation
			} else {
				break;
			}
		}

	}
}
