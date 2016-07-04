package wordplay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EncryptPhrase {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a phrase to encrypt");
		String phraseToEncrypt = bufferedReader.readLine();
		String encryptedPhrase = phraseToEncrypt.replaceAll("e", "friendly hippo");
		
		System.out.println(encryptedPhrase);
		
	}

}
