package favorites;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FavoriteColor {
  public static void main(String[] args) throws IOException {
	    
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("What is your favorite color?");
	String favoriteColor = bufferedReader.readLine();
    System.out.println("Your favorite color is " + favoriteColor + "? Me too!");

  }
}
