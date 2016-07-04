
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RatedR {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("How old are you?");
		String userAgeString = bufferedReader.readLine();
		Integer userAge = Integer.parseInt(userAgeString);
		
		if(userAge >= 17) {
			System.out.println("You can see the movie!");
		} else {
			System.out.println("I'm sorry. You're too young to see the movie");
		}
		
	}

}
