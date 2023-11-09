import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

class WaitTest
{

    private WebDriver  driver;
    private String     baseUrl;
    private WebElement element;

    @BeforeAll
    public static void init()
    {
        String value = "C:\\1\\apps\\geckodriver-v0.25.0-win64\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", value);
    }

    @BeforeEach
    public void setUp()
    {
        driver = new FirefoxDriver();
        baseUrl = "http://www.yandex.ru";
        driver.manage()
              .timeouts()
              .implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    @Disabled
    public void testUntitled()
    {
        //        driver.get(baseUrl);
        //        element = driver.findElement(By.className("input__control"));
        //        System.out.println(1);
        //        element.sendKeys("Selenium WebDriver Interview questions");
        //        System.out.println(2);
        //        element.sendKeys(Keys.RETURN);
        //        List<WebElement> list = driver.findElements(By.className("_Rm"));
        //        System.out.println(3);
        //        System.out.println(list.size());
    }

    @AfterEach
    public void tearDown()
    {
        driver.quit();
    }
}
