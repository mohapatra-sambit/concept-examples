package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCompareMain {
	
	public static void main(String[] args) {
		Student s1 = new Student("a", 1);
		Student s2 = new Student("b", 2);
		Student s3 = new Student("c", 3);
		Student s4 = new Student("d", 4);
		Student s5 = new Student("e", 5);
		Student s6 = new Student("f", 6);
		Student s7 = new Student("g", 7);
		Student s8 = new Student("h", 8);
		Student s9 = new Student("i", 9);
		Student s10 = new Student("j", 10);
		
		List<Student> list = new ArrayList<Student>();
		list.add(s10);
		list.add(s1);
		list.add(s4);
		list.add(s5);
		list.add(s8);
		list.add(s2);
		list.add(s9);
		list.add(s7);
		list.add(s3);
		list.add(s6);

		System.out.println("Initially.....");
		for (Student student : list) {
			System.out.println(student);
		}
		
		System.out.println();
		
		Collections.sort(list);
		
		System.out.println("After Sorting using Comparable...");
		for (Student student : list) {
			System.out.println(student);
		}
		
		System.out.println("Adding a new Student...");
		
		Student s11 = new Student("k", 11);
		list.add(4, s11);
		
		for (Student student : list) {
			System.out.println(student);
		}
		
		Collections.sort(list, new StudentComparator());

		System.out.println("After Sorting using Comparator...");
		for (Student student : list) {
			System.out.println(student);
		}
	}

}
