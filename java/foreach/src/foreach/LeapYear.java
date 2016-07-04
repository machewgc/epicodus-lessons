package foreach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("What year were you born?");
		String userBirthYearString = bufferedReader.readLine();
		Integer userBirthYear = Integer.parseInt(userBirthYearString);
		
		
		System.out.println("You were alive during these leap years:");
		for ( Integer year = userBirthYear ; year <= 2016 ; year++ ) {
			if ( year % 4 == 0) {
				System.out.println(year);
			}
		}
	}
}
