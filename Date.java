package map;

import java.util.HashMap;
import java.util.Scanner;

public class Date {
	
	public static void dtformat(int d,int m,int y)
	{
		HashMap<Integer,String> hm1=new HashMap<>();
		HashMap<Integer,String> hm2=new HashMap<>();
		HashMap<Integer,String> hm3=new HashMap<>();
		hm1.put(1, "01");
		hm1.put(2, "02");
		hm1.put(3, "03");
		hm1.put(4, "04");
		hm1.put(5, "05");
		hm1.put(6, "06");
		hm1.put(7, "07");
		hm1.put(8, "08");
		hm1.put(9, "09");
		hm1.put(10, "10");
		hm1.put(11, "11");
		hm1.put(12, "12");
		hm1.put(13, "13");
		hm1.put(14, "14");
		hm1.put(15, "15");
		hm1.put(16, "16");
		hm1.put(17, "17");
		hm1.put(18, "18");
		hm1.put(19, "19");
		hm1.put(20, "20");
		hm1.put(21, "21");
		hm1.put(22, "22");
		hm1.put(23, "23");
		hm1.put(24, "24");
		hm1.put(25, "25");
		hm1.put(26, "26");
		hm1.put(27, "27");
		hm1.put(28, "28");
		hm1.put(29, "29");
		hm1.put(30, "30");
		hm1.put(31, "31");
		
		hm2.put(1, "01/");
		hm2.put(2, "02/");
		hm2.put(3, "03/");
		hm2.put(4, "04/");
		hm2.put(5, "05/");
		hm2.put(6, "06/");
		hm2.put(7, "07/");
		hm2.put(8, "08/");
		hm2.put(9, "09/");
		hm2.put(10, "10/");
		hm2.put(11, "11/");
		hm2.put(12, "12/");
		
		
		System.out.print(hm1.get(d)+"/"+hm2.get(m)+""+hm1.get((y/100))+""+hm1.get(y%100));
		
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter date");
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		
		dtformat(d,m,y);
		
		
		
		

	}

}
