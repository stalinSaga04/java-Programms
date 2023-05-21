package org.javaArray;

public class RightShiftPrynka {
	private int[] shift_rightarray(int[] arr) {
	    
	    // int n=3; //length
	    
	    int j,last; //stores the element
	      last=arr[arr.length-1];
	      
	      for(j=arr.length-1;j>0;j--) //logic for shift right
	      {
	        arr[j]=arr[j-1];
//	        System.out.print(arr[j]);
	      }
	      arr[0]=last;
	    
	  return arr;
	  }
	public static void main(String[] args) {
		RightShiftPrynka ar = new RightShiftPrynka();
		int[] arr= {10,20,30,40};
	    //original array displying
	        System.out.println("Before shift the numbers");
	        for(int i=0;i<arr.length;i++)
	        {
	            System.out.print(arr[i]+ " ");
	          }
	        System.out.println("\nArray after right shift");
	  for(int i=0;i<2;i++)
	  {
	        arr=ar.shift_rightarray(arr);
	        {
	          for(int j=0;j<arr.length;j++)
	          {
	            System.out.print(arr[j] +" ");
	          }
	          System.out.println("");
	          System.out.println("second shift ");
	        }
	    }
	}
}
