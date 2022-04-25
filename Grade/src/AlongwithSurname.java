import java.util.Arrays;
import java.util.List;

public class AlongwithSurname {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> mylist1 = Arrays.asList("Rajesh");
		List<String> mylist2 = Arrays.asList("Sharma");
		List<String> mylist3 = Arrays.asList("suraj");
		List<String> mylist4 = Arrays.asList("gowda");
		List<String> mylist5 = Arrays.asList("Tom");
		List<String> mylist6 = Arrays.asList("reddy");

		
		for(String i : mylist2) 
		{
		mylist1.stream().map(x -> x+" "+i).forEach(y -> System.out.println(y));

	}
		for(String i : mylist4) 
		{
		mylist3.stream().map(x -> x+" "+i).forEach(y -> System.out.println(y));

	}
		for(String i : mylist6) 
		{
		mylist5.stream().map(x -> x+" "+i).forEach(y -> System.out.println(y));

	}

}
}