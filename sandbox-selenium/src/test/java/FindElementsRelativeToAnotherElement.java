import com.github.ivan.kopylove.sandbox.selenium.util.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * To find cells of table, relatively of already found element, please use dot. E.g. .//td, not //td.
 *
 * @author Ivan Kopylov
 */
public class FindElementsRelativeToAnotherElement
{

    @BeforeAll
    public static void init()
    {
        System.setProperty("webdriver.gecko.driver", "C:\\1\\apps\\geckodriver-v0.25.0-win64\\geckodriver.exe");
    }

    @Test
    public void mistake()
    {
        String url = Utils.convertClassPathToAbsolutePath("FindElementsRelevantToAnother.html");
        if (url != null)
        {
            System.setProperty("webdriver.gecko.driver", "C:\\1\\apps\\geckodriver-v0.25.0-win64\\geckodriver.exe");

            WebDriver webDriver = new FirefoxDriver();
            webDriver.get(url);

            List<WebElement> rows = webDriver.findElements(By.xpath("//table//tr"));
            for (WebElement row : rows)
            {
                List<WebElement> elements = row.findElements(By.xpath("//td"));
                Assertions.assertEquals(6, elements.size());
            }

            webDriver.quit();
        }
        else
        {
            Assertions.fail();
        }
    }

    @Test
    public void fixed_mistake()
    {
        String url = Utils.convertClassPathToAbsolutePath("FindElementsRelevantToAnother.html");
        if (url != null)
        {
            WebDriver webDriver = new FirefoxDriver();
            webDriver.get(url);

            List<WebElement> rows = webDriver.findElements(By.xpath("//table//tr"));
            List<WebElement> elements = rows.get(1)
                                            .findElements(By.xpath(".//td"));
            Assertions.assertEquals(3, elements.size());
            webDriver.quit();
        }
        else
        {
            Assertions.fail();
        }
    }
}
