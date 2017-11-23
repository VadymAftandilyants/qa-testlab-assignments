package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.pages.DashboardPage;
import myprojects.automation.assignment2.pages.LoginPage;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class LoginLogoutTest extends BaseScript {
    public static void main(String[] args) throws Exception {

        EventFiringWebDriver driver = getConfiguredDriver();
        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = new DashboardPage(driver);

        loginPage.open();
        loginPage.fillEmailInput();
        loginPage.fillPassword();
        loginPage.clickLogin();

        dashboardPage.clickOnAvatar();
        dashboardPage.clickLogoutBtn();

        quitDriver(driver);
    }
}
