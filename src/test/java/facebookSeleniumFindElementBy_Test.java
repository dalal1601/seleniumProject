import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class facebookSeleniumFindElementBy_Test {
    private WebDriver driver;
    @BeforeEach
    public void setUp() {driver = new ChromeDriver(); }
    @AfterEach
    public void tearDown() { driver.quit(); }
    @Test
    public void premiertest() {
        String baseUrl = "http://www.facebook.com" ;
        driver.get(baseUrl);String texte;
        texte = driver.findElement(By.partialLinkText("nect")).getText();
        System.out.println("\n===1==="+texte);
        texte = driver.findElement(By.tagName("div")).getText();
        System.out.println("\n===2==="+texte);
        texte = driver.findElement(By.linkText("Se connecter")).getTagName();
                System.out.println("\n===3==="+texte);
        texte= driver.findElement(By.id("email")).getTagName();
        System.out.println("\n===4==="+texte);
        texte=
                driver.findElement(By.cssSelector("input#email")).getTagName();
        System.out.println("\n===5==="+texte);}
}
