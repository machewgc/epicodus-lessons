package wordplay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sentence {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Give me a noun:");
		String noun = bufferedReader.readLine();
		System.out.println("Give me an adjective:");
		String adjective = bufferedReader.readLine();
		System.out.println(noun + " makes you " + adjective);
	}

}
