package set;

import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
		//unordered unsorted
		HashSet<Integer> intset = new HashSet<>();
		
		int [] data= {12,34,45,12,22,-23,34,12};
		
		for(int i:data)
		{
			System.out.println(intset.add(i));
		}
		
		for(int i :intset)
		{
			System.out.print(i+" ");
		}
			
	}

}
