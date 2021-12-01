package utils;

import java.text.ParseException;
import java.util.ArrayList;

import customlist.Employee;
import static customlist.Department.*;
import static customlist.Employee.sdf;

public class CollectionsUtils {
	//helper method to populate sample data for testing functional of list
	public static ArrayList<Employee> populateEmpList() throws ParseException{
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(15, "Rama", 10000, FINANCE, sdf.parse("01-01-2021")));
		list.add(new Employee(35, "king", 10200, HR, sdf.parse("01-01-2021")));
		list.add(new Employee(45, "jaya", 1000, RND, sdf.parse("11-01-2021")));
		list.add(new Employee(13, "ganash", 10020, FINANCE, sdf.parse("21-01-2021")));
		
		return list;
		
	}
}
