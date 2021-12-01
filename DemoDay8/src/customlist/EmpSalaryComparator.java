package customlist;
import java.util.Comparator;

public class EmpSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
//		if(o1.getSalary()<o2.getSalary())
//		{
//			return-1;
//		}
//		if(o1.getSalary()==o2.getSalary())
//		{
//			return 0;
//		}
//		return 1;
		System.out.println("In comparator");
		return ((Double)o1.getSalary()).compareTo(o2.getSalary());
	}
	
	
}
