package compare;

public class Student  implements Comparable<Student>  {

	private String name;
	
	private int rollNo;

	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj instanceof Student) {
			Student temp = (Student) obj;
			if (temp.name.equalsIgnoreCase(this.name) && temp.rollNo == this.rollNo) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int compareTo(Student o) {
		if (o.equals(this)) {
			return 0;
		}
		if (o.rollNo < this.rollNo) {
			return -1;
		}
		return 1;
	}

	@Override
	public String toString() {
		return name + ", " + rollNo +";";
	}

}
