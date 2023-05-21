package org.javaArray;
import java.lang.StackWalker.Option;
import java.util.Scanner;
public class Prabakar {
	public static void main(String[] args) {
	    // TODO Auto-generated method stub

	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter value a :");
	    int a = sc.nextInt();
	    System.out.println("Enter value b :");
	    int b = sc.nextInt();
	    System.out.println("Select operaton 1.add 2.sub 3.mul 4.div :");
while (true) {
	    int operation = sc.nextInt();
	     if(operation>4 || operation==0) {
			System.out.println(" enter the correct options");
			//operation = sc.nextInt(); 
		}
	     else if (operation==1) {
			System.out.println("add is "+a+b);
		}else if (operation==2) {
			System.out.println("sub is "+(a-b));
		}
		else if (operation==3) {
			System.out.println("mul is "+(a*b));
		}else if (operation==4) {
			System.out.println("div is "+(a/b));
		}
		  
} 
/*
	    switch (operation) {
	    case 1:
	      System.out.println(a + b);
	      break;

	    case 2:
	      System.out.println(a - b);
	      break;
	    case 3:
	      System.out.println(a * b);
	      break;
	    case 4:
	      System.out.println(a / b);
	      break;
	    case 5:*/
	     
	      
	  
	}
}
