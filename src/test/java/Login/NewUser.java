package Login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

@RunWith(JUnit4.class)

    public class NewUser {
    private WebDriver driver;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marialine.campos\\Documents\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

    }

    @After
    public void tchau() {
        driver.close();
    }

    @Test
    public void testUserBeleza() {
        driver.get("https://www.belezanaweb.com.br");
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//div[2]/div[3]/div/div[3]/a"));
        action.moveToElement(we).build().perform();
        driver.findElement(By.linkText("Comece aqui")).click();
        driver.findElement(By.className("btn-outline-primary")).click();
        driver.findElement(By.id("givenName")).sendKeys("Teste Lodi");
        driver.findElement(By.id("familyName")).sendKeys("Teste");
        driver.findElement(By.id("nickName")).sendKeys("Lodi");
        driver.findElement(By.id("cpf")).sendKeys("519.528.650-77");
        driver.findElement((By.id("birthDate"))).sendKeys("01011980");
        driver.findElement((By.id("telephone"))).sendKeys("11988787878");
        driver.findElement((By.id("email"))).sendKeys("lodi@mailinator.com");
        driver.findElement((By.id("password"))).sendKeys("123456");
        driver.findElement(By.id("female")).click();
        driver.findElement(By.className("btn-primary"));

    }
}

