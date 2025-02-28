import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class exempleTest_assertEqualsFireFox {

    private static WebDriver driver;
    @BeforeAll
    public static void setUpAll() {
        driver=new FirefoxDriver(); }
    @AfterAll
    public static void tearDown() {driver.quit();}
    @Test
    public void fonctionTest1() {
        String baseUrl = "http://google.com";
        String expectedTitle = "Googlefr";
        String actualTitle;
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        assertEquals(actualTitle, expectedTitle);
        driver.close();
    }

}
//so here need to install GeckoDriver
//ChromeDriver for Google Chrome.
//
//GeckoDriver for Firefox.
//
//EdgeDriver for Microsoft Edge.
