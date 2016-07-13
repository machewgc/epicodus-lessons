import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void playerOneWinsAgainstHuman() {
    goTo("http://localhost:4567");
    Select choiceOne = new Select(webDriver.findElement(By.id("choiceOne")));
    Select choiceTwo = new Select(webDriver.findElement(By.id("choiceTwo")));
    Select opponent = new Select(webDriver.findElement(By.id("opponent")));
    choiceOne.selectByValue("rock");
    choiceTwo.selectByValue("scissors");
    opponent.selectByValue("human");
    submit(".btn");
    assertThat(pageSource()).contains("Player 1 wins with rock");
  }

  /*@Test
  public void playerTwoWins() {
    goTo("http://localhost:4567");
    Select choiceOne = new Select(webDriver.findElement(By.id("choiceOne")));
    Select choiceTwo = new Select(webDriver.findElement(By.id("choiceTwo")));
    choiceOne.selectByValue("rock");
    choiceTwo.selectByValue("paper");
    submit(".btn");
    assertThat(pageSource()).contains("Player 2 wins with paper");
  }

  @Test
  public void nobodyWins() {
    goTo("http://localhost:4567");
    Select choiceOne = new Select(webDriver.findElement(By.id("choiceOne")));
    Select choiceTwo = new Select(webDriver.findElement(By.id("choiceTwo")));
    choiceOne.selectByValue("paper");
    choiceTwo.selectByValue("paper");
    submit(".btn");
    assertThat(pageSource()).contains("Both chose paper");
  }*/

}
