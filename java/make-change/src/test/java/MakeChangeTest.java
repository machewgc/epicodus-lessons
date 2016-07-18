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

  @Test
  public void countCoins_EightCents_OneNickelThreePennies() {
    MakeChange testMakeChange = new MakeChange();
    BigDecimal change = new BigDecimal(0.08);
    assertEquals("1 nickel, 3 pennies", testMakeChange.countCoins(change));
  }

  @Test
  public void countCoins_SixteenCents_OneDimeOneNickelOnePenny() {
    MakeChange testMakeChange = new MakeChange();
    BigDecimal change = new BigDecimal(0.16);
    assertEquals("1 dime, 1 nickel, 1 penny", testMakeChange.countCoins(change));
  }

  @Test
  public void countCoins_TwentyThreeCents_TwoDimesThreePennies() {
    MakeChange testMakeChange = new MakeChange();
    BigDecimal change = new BigDecimal(0.23);
    assertEquals("2 dimes, 3 pennies", testMakeChange.countCoins(change));
  }

  @Test
  public void countCoins_FortyNineCents_OneQuarterTwoDimesFourPennies() {
    MakeChange testMakeChange = new MakeChange();
    BigDecimal change = new BigDecimal(0.49);
    assertEquals("1 quarter, 2 dimes, 4 pennies", testMakeChange.countCoins(change));
  }

  @Test
  public void countCoins_FiftyFiveCents_TwoQuartersOneNickel() {
    MakeChange testMakeChange = new MakeChange();
    BigDecimal change = new BigDecimal(0.55);
    assertEquals("2 quarters, 1 nickel", testMakeChange.countCoins(change));
  }

}
