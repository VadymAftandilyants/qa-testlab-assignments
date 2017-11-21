package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.pages.DashboardPage;
import myprojects.automation.assignment2.pages.LoginPage;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestLauncher extends BaseScript {
    public static void main(String[] args) throws Exception {
        EventFiringWebDriver driver = getConfiguredDriver();
        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = new DashboardPage(driver);

        loginPage.open();
        loginPage.fillEmailInput();
        loginPage.fillPassword();
        loginPage.clickLogin();

        dashboardPage.clickOnDashboard();
        dashboardPage.clickOnOrders();
        dashboardPage.clickOnCatalog();
        dashboardPage.clickOnClients();
        dashboardPage.clickOnSupport();
        dashboardPage.clickOnStatistics();
        dashboardPage.clickOnModules();
        dashboardPage.clickOnDesign();
        dashboardPage.clickOnShipping();
        dashboardPage.clickOnPayment();
        dashboardPage.clickOnInternational();
        dashboardPage.clickOnShopParams();
        dashboardPage.clickOnConfig();

        dashboardPage.countMenuElements();

        dashboardPage.scrollPageDown();
        dashboardPage.clickOnAvatar();
        dashboardPage.clickLogoutBtn();
//        dashboardPage.clickLogoutBtnWithJS();

        quitDriver(driver);
    }
}
