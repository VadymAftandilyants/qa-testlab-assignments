package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginTest extends BaseScript {

    public void loginCheck() throws InterruptedException {
        // TODO Script to execute login and logout steps

        WebDriver driver = getDriver();

        Properties properties = new Properties();

        driver.get(properties.getBaseAdminUrl());

        By email = By.id("email");
        By pass = By.id("passwd");
        By loginBtn = By.name("submitLogin");
        By avatarPic = By.className("employee_avatar_small");
        By logoutBtn = By.id("header_logout");

        WebElement login = driver.findElement(email);
        login.clear();
        login.sendKeys("webinar.test@gmail.com");

        WebElement password = driver.findElement(pass);
        password.clear();
        password.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement button = driver.findElement(loginBtn);
        button.click();
        Thread.sleep(3000);

        WebElement avatar = driver.findElement(avatarPic);
        avatar.click();
        Thread.sleep(1000);

        WebElement logout = driver.findElement(logoutBtn);
        logout.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
