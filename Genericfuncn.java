package generics;

import java.util.Scanner;

public class Genericfuncn {
	
	public static <G> void print(G [] arr)
	{
		for( int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
					
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter array elements");
		Integer a[]= {12,56,54,89};
		String b[]= {"abc","hjk","tyu"};
		print(a);
		print (b);
  
	}

}
