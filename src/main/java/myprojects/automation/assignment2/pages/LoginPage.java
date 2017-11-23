package myprojects.automation.assignment2.pages;

import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class LoginPage {

    private EventFiringWebDriver driver;

    private By email = By.id("email");
    private By pass = By.id("passwd");
    private String emailText = "webinar.test@gmail.com";
    private String passText = "Xcg7299bnSmMuRLp9ITw";
    private By loginBtn = By.name("submitLogin");


        // TODO Script to execute login and logout steps

    public LoginPage(EventFiringWebDriver driver) {
        this.driver = driver;
    }

    public void open() {
    driver.get(Properties.getBaseAdminUrl());
    }

    public void fillEmailInput() {
        driver.findElement(email).sendKeys("");
        driver.findElement(email).sendKeys(emailText);
    }

    public void fillPassword() {
        driver.findElement(pass).sendKeys("");
        driver.findElement(pass).sendKeys(passText);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }
}
