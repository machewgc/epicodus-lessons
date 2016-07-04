package numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Give me a number");
		Integer number1 = Integer.parseInt(bufferedReader.readLine());
		System.out.println("Give me another number");
		Integer number2 = Integer.parseInt(bufferedReader.readLine());
		
		Integer numberSum = sumNumbers(number1, number2);
		String numberSumString = Integer.toString(numberSum);
		
		System.out.println("The sum of your two numbers is: " + numberSumString);
	}
	public static Integer sumNumbers(Integer number1, Integer number2) {
		Integer numberSum = number1 + number2;
		return numberSum;
	}
}
