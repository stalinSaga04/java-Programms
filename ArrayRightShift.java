package org.javaArray;

public class ArrayRightShift {
public static void main(String[] args) {
	//ArrayRightShift r_shift = new ArrayRightShift();
	int[] arr = {10,20,30,40,50};
	
	for (int i = 0; i < 1; i++) {
		int last = arr[arr.length-1];
		for (int j = arr.length-1; j >0; j--) {
			arr[j]=arr[j-1]; //chagne (last index) value is (index before the last index)  value
		}
		arr[0] =last;
	}
	System.out.println("after 1 right rotation ");
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}
}
