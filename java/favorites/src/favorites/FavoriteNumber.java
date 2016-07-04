package favorites;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FavoriteNumber {

	public static void main(String[] args) throws IOException {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("What is your favorite number?");
	String favoriteNumber = bufferedReader.readLine();
	System.out.println("Your favorite number is " + favoriteNumber + "? Me too!");
	}

}
