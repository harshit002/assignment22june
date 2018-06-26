package comparatoruse;

import java.util.ArrayList;
import java.util.Comparator;

public class Compclass implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		ArrayList<Person>arr=new ArrayList<>();
		if(p1.age>p2.age&&p1.name.compareTo(p2.name)>0)
		{
			arr.add(new Person(p1.name,p1.age));
			
		}
		
		
		for(int i=0;i<arr.size();i++) {
			
			System.out.println(arr);
			
		}
		
		return 0;
	}
	

}
