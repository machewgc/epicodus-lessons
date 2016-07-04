
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartsWithZ {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("What's your name?");
		String userName = bufferedReader.readLine();
		
		if(userName.startsWith("Z")) {
			System.out.println("Your name starts with a Z!");
		} else {
			System.out.println("Your name doesn't start with a Z :(");
		}
		
	}

}
