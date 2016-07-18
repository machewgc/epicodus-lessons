import org.junit.*;
import static org.junit.Assert.*;
import java.math.BigDecimal;

public class MakeChangeTest {

  @Test
  public void countCoins_OneCent_OnePenny() {
    MakeChange testMakeChange = new MakeChange();
    BigDecimal change = new BigDecimal(0.01);
    assertEquals("1 penny", testMakeChange.countCoins(change));
  }

  @Test
  public void countCoins_ThreeCents_ThreePennies() {
    MakeChange testMakeChange = new MakeChange();
    BigDecimal change = new BigDecimal(0.03);
    assertEquals("3 pennies", testMakeChange.countCoins(change));
  }

}