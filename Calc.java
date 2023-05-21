package org.javaArray;

import java.util.Scanner;

public class Calc {
	
	int storageno;

	public static void main(String[] args) {
		int num1,num2;boolean permission_=false;
		Calc obj = new Calc();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i >= 0; i++) {
			//System.out.println("Choose your option");
			System.out.println("choose your option\n"+"1.Addition" + "2.Subtraction" + "3.Multiplication" + "4.Division");
			int input = sc.nextInt();
			 if (input>4 || input==0) {
				System.out.println("entered option is invalid: ");
				input=sc.nextInt();
			}

			if (input == 1) {
				obj.addition(permission_,input);
				/*System.out.println("Do you want to proceed");
				char in = sc.next().charAt(0);
				if (!(in == 'Y'))
					//i++;
			}*/}
				else if (input == 2) {
				obj.subtraction(permission_,input);
				/*System.out.println("Do you want to proceed");
				char in = sc.next().charAt(0);
				if (in == 'Y')
					//i++;
*/
			}
				else if (input == 3) {
				obj.multiplication(permission_,input);
				/*System.out.println("Do you want to proceed");
				char in = sc.next().charAt(0);
				if (in == 'Y')
					//i++;
*/
			}
				else if (input == 4) {
				obj.dividion(permission_,input);
			}
			System.out.println("Do you want to proceed with PREVIOUS RESULT press 'y'\n else start with NEW VALUE press 'n'\n else to CLOSE press 'c'");
			char in = sc.next().charAt(0);
			if (in == 'y') {
				permission_=true;
			}
			else if (in == 'n') {
				permission_=false;
			}
			else if (in == 'c') {
				break;
			}
		}
		

	}

	private void dividion(boolean permission_, int input) {
		int storageno;
		Scanner sc = new Scanner(System.in);
		
		if (permission_) {
			/*
			 * System.out.println("Choose your option"); System.out.println("1.Addition" +
			 * "2.Subtraction" + "3.Multiplication" + "4.Division");
			 */
			input = sc.nextInt();
			System.out.println("Enter your second number");
			int scn = sc.nextInt();
				
			System.out.println("Division of "+this.storageno+"/"+scn +" is: " + this.storageno/scn);
		}else {
			System.out.println("Enter your first number");
			int num1 = sc.nextInt();
			System.out.println("Enter your second number");
			int num2 = sc.nextInt();
			storageno = num1 / num2;
			this.storageno=storageno;
			System.out.println("Division of "+num1+"/"+num2 +" is: " + storageno);
		}
		

	}

	private void multiplication(boolean permission_,int input) {
		int storageno;
		Scanner sc = new Scanner(System.in);
		if (permission_) {
			System.out.println("Enter your second number");
			int scn = sc.nextInt();
			
			System.out.println("Multiplication of "+this.storageno+"*"+scn +" is: "+ (this.storageno*scn));
		}else {
			System.out.println("Enter your first number");
			int num1 = sc.nextInt();
			System.out.println("Enter your second number");
			int num2 = sc.nextInt();
			storageno = num1 * num2;
			this.storageno=storageno;
			System.out.println("Multiplication of "+num1+ "*" +num2+ "is:" + storageno);
		}
		
		//System.out.println("Multiplication of two numbers: " + storageno);

	}

	private void subtraction(boolean permission_,int input) {
		int storageno;
		Scanner sc = new Scanner(System.in);
		
		if (permission_) {
			System.out.println("Enter your second number");
			int scn = sc.nextInt();
			System.out.println("subtraction  of "+this.storageno +"-"+ scn+ " is:" + (this.storageno-scn));
		}else {
			System.out.println("Enter your first number");
			int num1 = sc.nextInt();
			System.out.println("Enter your second number");
			int num2 = sc.nextInt();
			
			storageno = num1 - num2;
			this.storageno=storageno;
			System.out.println("subraction of "+num1+" - "+num2 +" is: "+ storageno);
		}
		
	}

	private void addition(boolean permission_,int input) {
		int storageno;
		Scanner sc = new Scanner(System.in);
		if (permission_) {
			System.out.println("Enter your second number");
			int scn = sc.nextInt();
			System.out.println("addition  of" +this.storageno +" + " +scn +" is:" + (this.storageno+scn));
		}else {
			System.out.println("Enter your first number");
			 int num1 = sc.nextInt();
			System.out.println("Enter your second number");
			int num2 = sc.nextInt();
			storageno = num1 + num2;
			this.storageno=storageno;
			System.out.println("addition of "+num1+" + "+ num2 +" is: " + storageno);
		}
		
	}

}
