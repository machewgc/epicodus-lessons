package numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Doubleit {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Give me a number, and I'll double it");
		Integer number = Integer.parseInt(bufferedReader.readLine());
		Integer doubledNumber = number * 2;
		System.out.println("I doubled your number for you: " + doubledNumber);
	}

}
