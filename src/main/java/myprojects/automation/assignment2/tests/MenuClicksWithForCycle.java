package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.pages.DashboardPage;
import myprojects.automation.assignment2.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.Optional;

public class MenuClicksWithForCycle extends BaseScript {
    public static void main(String[] args) {

        EventFiringWebDriver driver = getConfiguredDriver();
        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = new DashboardPage(driver);

        loginPage.open();
        loginPage.fillEmailInput();
        loginPage.fillPassword();
        loginPage.clickLogin();


        String[] mainMenuItems = {"Dashboard", "Заказы", "Каталог", "Клиенты", "Служба поддержки", "Статистика", "Modules",
                "Design", "Доставка", "Способ оплаты", "International", "Shop Parameters", "Конфигурация"};
        for (String menuItemText: mainMenuItems) {
            Optional<WebElement> item = driver.findElements(
                    By.linkText(menuItemText)).stream()
                    .filter(WebElement::isDisplayed).findFirst();
            // if the element is not found then write warning message and proceed to the next menu item
            if (!item.isPresent()) {
                System.out.printf("Menu item '%s' is not found!\n", menuItemText);
                continue;
            }
            // click on the item when it is found
            item.get().click();
            // continue script logic
            String beforeReload = driver.getTitle();
            driver.navigate().refresh();
            if (driver.getTitle().equals(beforeReload)) {
                System.out.println("\n*** Page titles are equal ***\n");
            } else System.out.println("\n!!! Something went wrong !!!\n");
        }

        dashboardPage.clickLogoutBtnWithJS();

        quitDriver(driver);
    }
}