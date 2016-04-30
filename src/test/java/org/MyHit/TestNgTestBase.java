package org.MyHit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import ru.stqa.selenium.factory.WebDriverFactory;
import org.MyHit.util.PropertyLoader;

/*
 * Base class for all the TestNG-based test classes
 */

public class TestNgTestBase {

  protected WebDriver driver;
  protected String gridHubUrl;
  protected String baseUrl;

  @BeforeClass
  public void init() throws IOException {
    baseUrl = PropertyLoader.loadProperty("site.url");
    gridHubUrl = PropertyLoader.loadProperty("grid2.hub");

    Capabilities capabilities = PropertyLoader.loadCapabilities();

    driver = WebDriverFactory.getDriver(gridHubUrl, capabilities);
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterSuite(alwaysRun = true)
  public void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

}
