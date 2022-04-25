
public class Student {
	public class StudentSort implements Comparable<Student> {



		private int number;
		private String name;



		public StudentSort(int number, String name) {
		super();
		this.number = number;
		this.name = name;
		}



		public int getNumber() {
		return number;
		}



		public void setNumber(int number) {
		this.number = number;
		}



		public String getName() {
		return name;
		}



		public void setName(String name) {
		this.name = name;
		}



		@Override
		public String toString() {
		return " [number=" + number + ", name=" + name + "]";
		}

		@Override
		public int compareTo(Student sus) {
		int compareRollNo = ((Student) sus).getNumber();
		return this.getNumber() - compareRollNo;



		}



		}

	public Student(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public int getNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

}
