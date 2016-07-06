import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Scrabble {
  public static void main(String[] args) {

  }
  public static Integer scrabble(String stringInput) {
    char[] charsInput= stringInput.toCharArray();
    Integer score = 0;
    for (Integer i = 0; i < stringInput.length(); i++) {
      if (Pattern.matches("[qzQZ]", Character.toString(charsInput[i]))) {
        score += 10;
      } else if ( charsInput[i] == 'j' || charsInput[i] == 'x' ) {
        score += 8;
      } else if ( charsInput[i] == 'k') {
        score += 5;
      } else if (Pattern.matches("[fhvwyFHVWY]", Character.toString(charsInput[i]))) {
        score += 4;
      } else if (Pattern.matches("[bcmpBCMP]", Character.toString(charsInput[i]))) {
        score += 3;
      } else if (Pattern.matches("[gdGD]", Character.toString(charsInput[i]))) {
        score += 2;
      } else {
        score += 1;
      }
    }
    return score;
  }
}
