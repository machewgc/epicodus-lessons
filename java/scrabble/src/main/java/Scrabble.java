import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Scrabble {
  public static void main(String[] args) {

  }
  public static Integer scrabble(String stringInput) {
    char[] charsInput= stringInput.toCharArray();
    Integer score = 0;
    for (Integer i = 0; i < stringInput.length(); i++) {
      if ( charsInput[i] == 'k') {
        score += 5;
      } else if (Pattern.matches("[fhvwy]", Character.toString(charsInput[i]))) {
        score += 4;
      } else if (Pattern.matches("[bcmp]", Character.toString(charsInput[i]))) {
        score += 3;
      } else if (Pattern.matches("[gd]", Character.toString(charsInput[i]))) {
        score += 2;
      } else {
        score += 1;
      }
    }
    return score;
  }
}
