import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
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
  public void browserDisplaysPuzzledPhraseCorrectAnswerFromUser() {
    goTo("http://localhost:4567");
    WebElement phraseToTest = webDriver.findElement(By.id("wordOrPhrase"));
    phraseToTest.sendKeys("cucumber SOCKS");
    submit(".btn");
    assertThat(pageSource()).contains("c-c-mb-r S-CKS");
    WebElement guess = webDriver.findElement(By.id("guess"));
    guess.sendKeys("cucumber SOCKS");
    submit(".btn");
    assertThat(pageSource()).contains("Congrats!");
  }

  @Test
  public void wrongAnswerFromUser() {
    goTo("http://localhost:4567");
    WebElement phraseToTest = webDriver.findElement(By.id("wordOrPhrase"));
    phraseToTest.sendKeys("cucumber SOCKS");
    submit(".btn");

    WebElement guess = webDriver.findElement(By.id("guess"));
    guess.sendKeys("cucumber OCKS");
    submit(".btn");
    assertThat(pageSource()).contains("Sorry!");
  }

}
