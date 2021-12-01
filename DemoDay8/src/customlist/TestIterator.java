package customlist;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;

import static utils.CollectionsUtils.populateEmpList;


public class TestIterator {

	public static void main(String[] args) throws ParseException {
		
		ArrayList<Employee> empList = populateEmpList();
		System.out.println("Total Elements in the list :" +empList.size());
		
		
		//iteratinf list using iterator()
		Iterator<Employee>itr = empList.iterator();
		System.out.println();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
			System.out.println();
		}
		System.out.println();
		System.out.println("End of list");
	}
}
