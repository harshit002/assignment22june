package generics;

public class Genericsort {
	
	
	public static <T extends Comparable<T>> void sort(T arr[])
	{
		T s;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
				   s=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=s;
				}
			}
		
	}
		
		for(int i=0;i<arr.length;i++)
		{
			
				System.out.println(arr[i]);
		}
}

	public static void main(String[] args) {
		Integer a[]= {45,89,10,5,34};
		String e[]= {"yuyu","hjuy","hj"};
		sort(a);
		sort(e);

	}

}
