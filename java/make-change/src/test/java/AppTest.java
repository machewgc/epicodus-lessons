import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
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
  public void userEntersFiftyCents() {
    goTo("http://localhost:4567");
    WebElement amount = webDriver.findElement(By.id("decimalNumber"));
    amount.sendKeys("0.50");
    submit(".btn");
    assertThat(pageSource()).contains("2 quarters");
  }

}
