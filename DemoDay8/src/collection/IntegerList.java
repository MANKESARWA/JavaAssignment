package collection;

import java.util.ArrayList;

public class IntegerList {

	public static void main(String[] args) {
		// create arrayList of Integer
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		System.out.println("Size : "+arrayList.size());
		System.out.println("Is Empty : "+arrayList.isEmpty());
		
		
		//populate data in list.
		
		int []data= {10,2,12,23,45,-100,10,23,45,10};
		for(int i :data)
		{
			arrayList.add(i);
		}
		System.out.println("Size : "+arrayList.size());
		System.out.println("Is Empty : "+arrayList.isEmpty());
		System.out.print("List data: ");
		for(int i:arrayList)
		{
			System.out.print(i+" ");
		}
		
		//Searching operation using contain.
		
		System.out.println(arrayList.contains(-100));
		
		//searching a variable where it present first.
		System.out.println(arrayList.indexOf(23));
		System.out.println(arrayList.lastIndexOf(10));
		
	}
	
}
