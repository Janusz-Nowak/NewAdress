package pl.janusz.shop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private final WebDriver driver;

    String mailAccount = "jnqsboktevdkfdnkvx@nbmbb.com";
    String passwdAccount = "trelemorele";

    public LoginPage(WebDriver driver) {
        this.driver = driver;


    }

    public void loginData(String mailAccount, String passwdAccount) {
        WebElement loginMail = driver.findElement(By.name("email"));
        loginMail.click();
        loginMail.clear();
        loginMail.sendKeys(mailAccount);

        WebElement passwdData = driver.findElement(By.name("password"));
        passwdData.click();
        passwdData.clear();
        passwdData.sendKeys(passwdAccount);

        WebElement signInButton = driver.findElement(By.id("submit-login"));
        signInButton.click();
    }

    public String returnUsername() {
        WebElement userLogin = driver.findElement(By.xpath("//a[@class='account']"));
        return userLogin.getText();
    }
}
