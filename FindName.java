package org.javaArray;

import java.util.Scanner;

public class FindName {
	public static void main(String[] args) {
		FindName fn = new FindName();
		fn.find_mid();
		
	}

	private void find_mid() {
		// TODO Auto-generated method stub
		//Scanner  sc  = new Scanner(System.in);
		System.out.println("enter your name: ");
		//String name=sc.next();
		//char[] pr = {'p','r','a','b','a','k','a','r'};
		char[] pr = {'m','u','g','i','l','a','n'};

		int mid = pr.length/2;//name.length()/2;
		System.out.println(mid);
		if (pr.length%2==0) {
			System.out.println(pr[mid-1]);
			System.out.println(pr[mid]);
		}else {
			System.out.println(pr[mid]);
		}
		
		
		
		/*if (name.length()%2==0) {
			System.out.print(name.charAt(mid-1));
			System.out.print(name.charAt(mid));

		*/}

		
		//char a = sc.next().charAt(1);
		//System.out.println(a);
	

}
