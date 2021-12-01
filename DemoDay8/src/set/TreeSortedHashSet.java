package set;

import java.util.TreeSet;

public class TreeSortedHashSet {

	public static void main(String[] args) {
		// sorted  and ordered.
		TreeSet<Integer> treeSet = new TreeSet<>();
		int [] data= {12,34,45,12,22,-23,34,12};
		
		for(int i:data)
		{
			System.out.println(treeSet.add(i));
		}
		
		for(int i:treeSet)
		{
			System.out.print(i+" ");
		}
	}
}
