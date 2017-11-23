package myprojects.automation.assignment2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class DashboardPage {

//        TODO Script to check Main Menu items

    private EventFiringWebDriver driver;

    private By avatarPic = By.className("employee_avatar_small");
    private By logoutBtn = By.id("header_logout");
    private By dashboard = By.xpath("//*[@id='tab-AdminDashboard']/a/span");
    private By orders = By.id("subtab-AdminParentOrders");
    private By catalog = By.xpath("//*[@id='subtab-AdminCatalog']/a/span");
    private By clients = By.xpath("/html/body/nav/ul/li[5]/a/span");
    private By support = By.id("subtab-AdminParentCustomerThreads");
    private By statistics = By.id("subtab-AdminStats");
    private By modules = By.id("subtab-AdminParentModulesSf");
    private By design = By.xpath("/html/body/nav/ul/li[10]/a/span");
    private By shipping = By.xpath("//*[@id='subtab-AdminParentShipping']/a/span");
    private By payment = By.xpath("//*[@id='subtab-AdminParentPayment']/a/span");
    private By international = By.id("subtab-AdminInternational");
    private By shopParams = By.id("subtab-ShopParameters");
    private By config = By.xpath("//*[@id='subtab-AdminAdvancedParameters']/a/span");

    public DashboardPage(EventFiringWebDriver driver) {
        this.driver = driver;
    }

    public void clickOnAvatar () {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(avatarPic));
        driver.findElement(avatarPic).click();
    }

    public void clickLogoutBtn() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(logoutBtn));
        driver.findElement(logoutBtn).click();
    }

    public void clickLogoutBtnWithJS() {
        WebElement element = driver.findElement(logoutBtn);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void clickOnDashboard() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard));
        driver.findElement(dashboard).click();
        String beforeReload = driver.getTitle();
        driver.navigate().refresh();
        if (driver.getTitle().equals(beforeReload)) {
            System.out.println("\n*** Page titles are equal ***\n");
        } else System.out.println("\n!!! Something went wrong !!!\n");
    }

    public void clickOnOrders() {
        driver.findElement(orders).click();
        String beforeReload = driver.getTitle();
        driver.navigate().refresh();
        if (driver.getTitle().equals(beforeReload)) {
            System.out.println("\n*** Page titles are equal ***\n");
        } else System.out.println("\n!!! Something went wrong !!!\n");
    }

    public void clickOnCatalog() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(catalog));
        driver.findElement(catalog).click();
        String beforeReload = driver.getTitle();
        driver.navigate().refresh();
        if (driver.getTitle().equals(beforeReload)) {
            System.out.println("\n*** Page titles are equal ***\n");
        } else System.out.println("\n!!! Something went wrong !!!\n");
    }

    public void clickOnClients() {
        driver.findElement(clients).click();
        String beforeReload = driver.getTitle();
        driver.navigate().refresh();
        if (driver.getTitle().equals(beforeReload)) {
            System.out.println("\n*** Page titles are equal ***\n");
        } else System.out.println("\n!!! Something went wrong !!!\n");
    }

    public void clickOnSupport() {
        driver.findElement(support).click();
        String beforeReload = driver.getTitle();
        driver.navigate().refresh();
        if (driver.getTitle().equals(beforeReload)) {
            System.out.println("\n*** Page titles are equal ***\n");
        } else System.out.println("\n!!! Something went wrong !!!\n");
    }

    public void clickOnStatistics() {
        driver.findElement(statistics).click();
        String beforeReload = driver.getTitle();
        driver.navigate().refresh();
        if (driver.getTitle().equals(beforeReload)) {
            System.out.println("\n*** Page titles are equal ***\n");
        } else System.out.println("\n!!! Something went wrong !!!\n");
    }

    public void clickOnModules() {
        driver.findElement(modules).click();
        String beforeReload = driver.getTitle();
        driver.navigate().refresh();
        if (driver.getTitle().equals(beforeReload)) {
            System.out.println("\n*** Page titles are equal ***\n");
        } else System.out.println("\n!!! Something went wrong !!!\n");
    }

    public void clickOnDesign() {
        driver.findElement(design).click();
        String beforeReload = driver.getTitle();
        driver.navigate().refresh();
        if (driver.getTitle().equals(beforeReload)) {
            System.out.println("\n*** Page titles are equal ***\n");
        } else System.out.println("\n!!! Something went wrong !!!\n");
    }

    public void clickOnShipping() {
        driver.findElement(shipping).click();
        String beforeReload = driver.getTitle();
        driver.navigate().refresh();
        if (driver.getTitle().equals(beforeReload)) {
            System.out.println("\n*** Page titles are equal ***\n");
        } else System.out.println("\n!!! Something went wrong !!!\n");
    }

    public void clickOnPayment() {
        driver.findElement(payment).click();
        String beforeReload = driver.getTitle();
        driver.navigate().refresh();
        if (driver.getTitle().equals(beforeReload)) {
            System.out.println("\n*** Page titles are equal ***\n");
        } else System.out.println("\n!!! Something went wrong !!!\n");
    }

    public void clickOnInternational() {
        driver.findElement(international).click();
        String beforeReload = driver.getTitle();
        driver.navigate().refresh();
        if (driver.getTitle().equals(beforeReload)) {
            System.out.println("\n*** Page titles are equal ***\n");
        } else System.out.println("\n!!! Something went wrong !!!\n");
    }

    public void clickOnShopParams() {
        driver.findElement(shopParams).click();
        String beforeReload = driver.getTitle();
        driver.navigate().refresh();
        if (driver.getTitle().equals(beforeReload)) {
            System.out.println("\n*** Page titles are equal ***\n");
        } else System.out.println("\n!!! Something went wrong !!!\n");
    }

    public void clickOnConfig() {
        driver.findElement(config).click();
        String beforeReload = driver.getTitle();
        driver.navigate().refresh();
        if (driver.getTitle().equals(beforeReload)) {
            System.out.println("\n*** Page titles are equal ***\n");
        } else System.out.println("\n!!! Something went wrong !!!\n");
    }


    public void countMenuElements() {
        List<WebElement> numberOfElements = driver.findElements(By.className("maintab"));
        System.out.println("Всего: " + numberOfElements.size() + " пунктов меню.");
    }

    public boolean scrollPageDown() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(avatarPic));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,1000)");
        return true;
    }

    public void clickOnCategory() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(catalog));

        Actions act = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id='subtab-AdminCatalog']/a/span"));
        act.moveToElement(element).perform();
        driver.findElement(By.xpath("//*[@id='subtab-AdminCategories']/a")).click();
    }
}
