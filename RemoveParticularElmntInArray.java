package org.javaArray;

import java.util.Scanner;

public class RemoveParticularElmntInArray {
	public static void main(String[] args) {
		
	
	RemoveParticularElmntInArray re= new RemoveParticularElmntInArray();
	re.find_mid();
	
	}

	private void find_mid() {
		// TODO Auto-generated method stub
		//Scanner sc  = new Scanner(System.in);
		//System.out.println("enter your name: ");
		int mid;
		char[] name = {'s','t','a','l','i','n'};//sc.next().toCharArray();
		int i = 0;
		mid = name.length/2;
		//while (i<name.length) {
			 if (name.length%2==0) {
					System.out.println(name[mid-1]);
					System.out.println(name[mid]);
					
				}
				else {
					System.out.println(name[mid]);
				}
			//i++;
		//}
	}

}
