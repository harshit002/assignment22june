package comparatoruse;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting  {

	public static void main(String[] args) {
		ArrayList<Person>pr=new ArrayList<>();
		pr.add(new Person("Harshit",21));
		pr.add(new Person("Akhil",12));
		pr.add(new Person("shubham",56));
		pr.add(new Person("sanchit",32));
		
		Compclass obj =new Compclass();
		Collections.sort(pr, obj);
		
		
		
	}

	

}
