package Training;
import java.time.LocalDate;
import java.util.Scanner;

public class Days{
	 public static void main(String[] args)
	 {
		 System.out.println("Enter a Number");
		 Scanner sc = new Scanner(System.in);
		 String day = sc.next();
		 LocalDate date = LocalDate.of(Integer.parseInt(day), 1, 1);
		 System.out.println(date.getDayOfWeek());
		 System.out.println("Add the Number to find the day ");
		 date = date.plusDays(sc.nextLong());
		 sc.close();
		 System.out.println(date.getDayOfWeek());

	 }
 }