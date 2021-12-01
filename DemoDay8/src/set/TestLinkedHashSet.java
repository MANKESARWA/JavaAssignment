package set;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {
	public static void main(String[] args) {
		// ordered but unsorted
		LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
int [] data= {12,34,45,12,22,-23,34,12};
		
		for(int i:data)
		{
			System.out.println(linkedSet.add(i));
		}
		
		for(int i :linkedSet)
		{
			System.out.print(i+" ");
		}
	}	
}
