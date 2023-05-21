package org.javaArray;

public class RverseArrayInSameArray {
	public static void main(String[] args) {
		RverseArrayInSameArray rev_Ar = new RverseArrayInSameArray();
		rev_Ar.reverse_name();
	}
	private void reverse_name() {
	    // TODO Auto-generated method stub
	
	    char[] name = {'s','t','a','l','i','n'}; 
	    int i = 0, j = name.length-1; 

	    while(i<j)
	    {
	    char temp = name[i]; 
	    name[i] = name[j]; 
	    name[j] = temp; 
	    i++; 
	    j--; 
	    }

	    for(int k=0; k<name.length; k++)
	    {
	    System.out.print(name[k]+" "); 
	    }
	    
	
	}}

