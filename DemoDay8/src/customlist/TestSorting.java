package customlist;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

import static utils.CollectionsUtils.populateEmpList;

public class TestSorting {

	public static void main(String[] args) throws ParseException {
		
		ArrayList<Employee> emplist=  populateEmpList();
		
		System.out.println("List before sorting");
		for(Employee e:emplist)
		{
			System.out.println(e);
		}
		
		System.out.println("List after sorting");
		Collections.sort(emplist);// java comipler shows error :the generic type of list : is not comparable interface--> to solve this error we overridden the compareto method
		
		for(Employee e : emplist)
		{
			System.out.println(e);
		}
	}
	
}
