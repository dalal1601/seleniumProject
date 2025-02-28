import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class conversionTemperatureTestParametree {
    private static WebDriver driver;
    @BeforeAll
    public static void setUpAll() { driver = new ChromeDriver();}
    @AfterAll
    public static void tearDown() { driver.quit(); }
    @ParameterizedTest
    @ValueSource(strings = {"33","41","19","25","-14","35845"})
    public void premiertest(String temp) {
        driver.get("http://www.onlineconversion.com/temperature.htm");
        driver.manage().window().setSize(new Dimension(1053, 799));
        { WebElement element = driver.findElement(By.name("Go"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();}
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement dropdown = driver.findElement(By.name("from"));
            dropdown.findElement(By.xpath("//option[. = 'degree Fahrenheit']")).click(); }

            driver.findElement(By.cssSelector("td:nth-child(1) option:nth-child(2)")).click();

            driver.findElement(By.cssSelector("tr:nth-child(1) > td")).click();
            driver.findElement(By.name("what")).sendKeys(temp);
            {
                WebElement dropdown = driver.findElement(By.name("to"));
                dropdown.findElement(By.xpath("//option[. = 'degree Rankine']")).click(); }

                driver.findElement(By.cssSelector("td:nth-child(2) option:nth-child(3)")).click();

                        driver.findElement(By.name("Go")).click();
                {
                    WebElement dropdown = driver.findElement(By.name("from"));
                    dropdown.findElement(By.xpath("//option[. = 'degree Rankine']")).click();
                }

                driver.findElement(By.cssSelector("td:nth-child(1) option:nth-child(3)")).click();

                {
                    WebElement dropdown = driver.findElement(By.name("to"));
                    dropdown.findElement(By.xpath("//option[. = 'degree Fahrenheit']")).click();
                }

                driver.findElement(By.cssSelector("td:nth-child(2) option:nth-child(2)")).click(); }


}
