package collection;
import java.util.ArrayList;
import static customlist.Employee.sdf;
import java.util.Scanner;

import customlist.Department;
import customlist.Employee;

public class EmpManagementApp {

	public static void main(String[] args) {
		
		//create a suitable DS to store Employee  records
		try(Scanner sc = new Scanner(System.in))
		{
			
			ArrayList<Employee> empList = new ArrayList<>();//Initial capacity for this list is 10 and size = 0;
			
			boolean exit = false;
			
			while(!exit)
			{
				System.out.println("Menu:");
				System.out.println("1. Add Employee details");
				System.out.println("2.Display all Employees");
				System.out.println("3.Search Employee");
				System.out.println("10. Exit");
				
				try
				{
					System.out.println("Enter your choice");
					
					switch(sc.nextInt())
					{
						case 1:
							System.out.println("Enter employee details : id name salary,department,doj(dd-mm-yyyy)");
							empList.add(new Employee(sc.nextInt(), sc.next(), sc.nextDouble(), Department.valueOf(sc.next().toUpperCase()), sdf.parse(sc.next())));
							break;
						case 2:
							for(Employee e : empList)
							{
								System.out.println(e); //e.toString will be called from our overridedin method.
							}
							break;
						case 3:
							System.out.println("Enter employee id: ");
							int id = sc.nextInt();
							Employee e = new Employee(id);
							System.out.println(empList.contains(e));//Employee e //int ---->Integer
							//Contains internally call equals()
							// Campare Employee with Employee
							//this comparsion will be ref to your equal methods 
							//raher that content based.
							//using indexof(),get().
							int index = empList.indexOf(e);
							if(index==-1) {
								System.out.println("Empolyee not found in the list....");
							}
							System.out.println("Employee Details: "+empList.get(index));
							
							break;
						case 10:
							exit = true;
							break;
					}
				}
				catch(Exception e)
				{
					
				}
				
			}
			
			
			
		}
		
		

	}

}
