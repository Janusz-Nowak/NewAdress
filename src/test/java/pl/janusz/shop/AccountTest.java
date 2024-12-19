package pl.janusz.shop;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AccountTest {
    private static WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php");
    }

    @Test
    public void testLoginToAccount() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginData("jnqsboktevdkfdnkvx@nbmbb.com", "trelemorele");
        Assert.assertEquals("Janusz No", loginPage.returnUsername());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
