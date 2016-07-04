package pingpong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PingPong {
	public static void main (String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a number.");
		String numberString = bufferedReader.readLine();
		Integer number = Integer.parseInt(numberString);
		
		pingPong(number);
	}
	public static void pingPong(Integer number) {
		for ( Integer i = 0 ; i <= number ; i++ ) {
			if ( i % 3 == 0 ) {
				System.out.println("ping"); 
			} else if ( i % 5 == 0) {
				System.out.println("pong");
			} else {
				System.out.println(i); 
			}
		}
	}
}
