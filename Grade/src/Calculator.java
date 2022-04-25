import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first marks = ");
		int first = sc.nextInt();
		System.out.println("Enter your second marks = ");
		int second = sc.nextInt();
		
		int total=first+second;
		System.out.println(total);
	
 		int sub=first-second;
 		System.out.println(sub);
		
 		int mul=first*second;
		System.out.println(mul);
		
		int div=first/second;
		System.out.println(div);

	}

}
