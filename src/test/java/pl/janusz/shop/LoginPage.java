package pl.janusz.shop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    public void loginData(String email, String passwd) {
        WebElement loginMail = driver.findElement(By.name("email"));
        loginMail.click();
        loginMail.clear();
        loginMail.sendKeys(email);

        WebElement passwdData = driver.findElement(By.name("password"));
        passwdData.click();
        passwdData.clear();
        passwdData.sendKeys(passwd);

        WebElement signInButton = driver.findElement(By.id("submit-login"));
        signInButton.click();
    }

    public String returnUsername() {
        WebElement userLogin = driver.findElement(By.xpath("//a[@class='account']"));
        return userLogin.getText();
    }
}
