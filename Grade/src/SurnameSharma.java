import java.util.Arrays;
import java.util.List;

public class SurnameSharma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mylist = Arrays.asList("Rajesh","Suraj","Tom");
		mylist.stream().map(x -> x+" Sharma").forEach(y -> System.out.println(y));



		

	}

}
