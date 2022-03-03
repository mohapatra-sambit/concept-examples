package compare;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.equals(o2)) {
			return 0;
		}
		if (o1.getRollNo() < o2.getRollNo()) {
			return -1;
		}
		return 1;
	}

}
