package set_custom_type;

import java.util.HashSet;

public class TestStudentSet {
	public static void main(String[] args) {
		//HAsh set of student
		//unordered, unsorted not allow any duplicate or any null.
		
		HashSet<Student> stdset = new HashSet<>();
		
		Student s1 = new Student(100, "Rama", "pune");
		Student s2 = new Student(102, "Jaya", "mumbai");
		Student s3 = new Student(100, "Rama", "pune");
		
		System.out.println(stdset.add(s1));//true
		System.out.println(stdset.add(s2));//true
		System.out.println(stdset.add(s3));//false //not allowing duplicate :bcoz contract is followed hashcode, equlaity is used
		
		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
//		
//		System.out.println(s1.equals(s3));
		
		for(Student s :stdset)
		{
			System.out.println(s);
		}
	}

}
