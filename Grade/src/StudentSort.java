import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentSort {
	
	private static final List<Student> Collections = null;
	public static void main(String[] args) { 
		Student st1 = new Student(104, "Nisarga");
	Student st2 = new Student(103, "punya");
	Student st3 = new Student(102, "Supriya"); 
	List<Student> stList = new ArrayList<>(); stList.add(st1);
	stList.add(st2);
	stList.add(st3); 
	System.out.println("----Before Sorting----"); 
	for (Student st : stList) {
	System.out.println(st);
	} 
	
	
	
	System.out.println("----After Sorting----");
	for (Student st : stList) {
	System.out.println(st);
	} 
	}

}

