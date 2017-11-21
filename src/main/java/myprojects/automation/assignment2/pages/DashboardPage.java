package myprojects.automation.assignment2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
    private By catalog = By.id("subtab-AdminCatalog");
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

    public void clickOnAvatar() {
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
        WebElement element= driver.findElement(logoutBtn);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void clickOnDashboard () {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard));
        driver.findElement(dashboard).click();
        System.out.println("*** " + driver.getTitle() + " ***");
        driver.navigate().refresh();
        System.out.println("*** " + driver.getTitle() + " ***");
    }
    public void clickOnOrders () {
        driver.findElement(orders).click();
        System.out.println("*** " + driver.getTitle() + " ***");
        driver.navigate().refresh();
        System.out.println("*** " + driver.getTitle() + " ***");
    }
    public void clickOnCatalog () {
        driver.findElement(catalog).click();
        System.out.println("*** " + driver.getTitle() + " ***");
        driver.navigate().refresh();
        System.out.println("*** " + driver.getTitle() + " ***");
    }
    public void clickOnClients () {
        driver.findElement(clients).click();
        System.out.println("*** " + driver.getTitle() + " ***");
        driver.navigate().refresh();
        System.out.println("*** " + driver.getTitle() + " ***");
    }
    public void clickOnSupport () {
        driver.findElement(support).click();
        System.out.println("*** " + driver.getTitle() + " ***");
        driver.navigate().refresh();
        System.out.println("*** " + driver.getTitle() + " ***");
    }
    public void clickOnStatistics () {
        driver.findElement(statistics).click();
        System.out.println("*** " + driver.getTitle() + " ***");
        driver.navigate().refresh();
        System.out.println("*** " + driver.getTitle() + " ***");
    }
    public void clickOnModules () {
        driver.findElement(modules).click();
        System.out.println("*** " + driver.getTitle() + " ***");
        driver.navigate().refresh();
        System.out.println("*** " + driver.getTitle() + " ***");
    }
    public void clickOnDesign () {
        driver.findElement(design).click();
        System.out.println("*** " + driver.getTitle() + " ***");
        driver.navigate().refresh();
        System.out.println("*** " + driver.getTitle() + " ***");
    }
    public void clickOnShipping () {
        driver.findElement(shipping).click();
        System.out.println("*** " + driver.getTitle() + " ***");
        driver.navigate().refresh();
        System.out.println("*** " + driver.getTitle() + " ***");
    }
    public void clickOnPayment () {
        driver.findElement(payment).click();
        System.out.println("*** " + driver.getTitle() + " ***");
        driver.navigate().refresh();
        System.out.println("*** " + driver.getTitle() + " ***");
    }
    public void clickOnInternational () {
        driver.findElement(international).click();
        System.out.println("*** " + driver.getTitle() + " ***");
        driver.navigate().refresh();
        System.out.println("*** " + driver.getTitle() + " ***");
    }
    public void clickOnShopParams () {
        driver.findElement(shopParams).click();
        System.out.println("*** " + driver.getTitle() + " ***");
        driver.navigate().refresh();
        System.out.println("*** " + driver.getTitle() + " ***");
    }
    public void clickOnConfig () {
        driver.findElement(config).click();
        System.out.println("*** " + driver.getTitle() + " ***");
        driver.navigate().refresh();
        System.out.println("*** " + driver.getTitle() + " ***");
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
}
