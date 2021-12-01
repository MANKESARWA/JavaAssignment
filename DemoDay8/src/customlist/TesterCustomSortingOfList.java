package customlist;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

import static utils.CollectionsUtils.populateEmpList;


public class TesterCustomSortingOfList  {
	public static void main(String[] args) throws ParseException {
		
ArrayList<Employee> empList=  populateEmpList();
		
		System.out.println("List before sorting");
		for(Employee e:empList)
		{
			System.out.println(e);
		}
		
		System.out.println("List after sorting");
		
		Collections.sort(empList, new EmpSalaryComparator());
		for(Employee e :empList)
		{
			System.out.println(e);
		}
	}
}
