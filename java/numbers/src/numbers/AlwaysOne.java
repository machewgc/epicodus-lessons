package numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlwaysOne {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Give me a number, and I'll magically turn it into 1!");
		Integer number = Integer.parseInt(bufferedReader.readLine());
		Integer numberOne = number / number;
		String stringNumberOne = Integer.toString(numberOne);
		System.out.println("Here it is: " + stringNumberOne);
	}

}