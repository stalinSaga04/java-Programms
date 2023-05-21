package org.javaArray;
import java.util.Scanner;
public class BreakTheNumAndCompare {
	public static void main(String[] args) {
		BreakTheNumAndCompare br = new BreakTheNumAndCompare();
		br.find_the_marks();	
	}
	private void find_the_marks() {
		// TODO Auto-generated method stub
		int i=0,j=0;
		int rem1,rem2;
		int[] arr = new int[5];
		String[] sub = new String[5];//{"tamil","english","maths","science","social science"};
		int temp[] = new int[5];
		Scanner sc = new Scanner(System.in);
		while (i<arr.length) {
			System.out.println("Enter subject name ");
			sub[i]=sc.next();
			System.out.println("enter the " +sub[i]+"  marks :" );
			arr[i]=sc.nextInt();
			
			rem1=arr[i]%10;
			rem2=arr[i]/10;
			
			if (rem1>=rem2) {
				temp[i]=arr[i];	//store into an array in that particular index
				//System.out.println(sub[i]+" mark is "+arr[i]);
			}		
			i++;
		}
		System.out.println();
		while (j<temp.length) { 
			if (temp[j]!=0) { // we don`t need unallocated index and that value 
				
				System.out.println("subject is "+sub[j]+" mark is  "+temp[j]);
			}	
			j++;
		}
	
	}

}
