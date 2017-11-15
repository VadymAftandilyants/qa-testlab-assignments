package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckMainMenuTest extends BaseScript{

//    public static void main(String[] args) throws InterruptedException {
//        TODO Script to check Main Menu items


//
//        List<WebElement> refers2 = driver.findElements(By.className("maintab"));
//        System.out.println(refers2.size());
//
//        for (WebElement refer: refers2) {
//            WebElement cl = refer.findElement(By.tagName("span"));
//            System.out.println(refer.getText());
////            System.out.println(driver.getTitle());
////            driver.navigate().refresh();
////            refer.click();
////            Thread.sleep(3000);
////            System.out.println(driver.getTitle());
////            refer.click();
////            Thread.sleep(3000);
////
//        }



    public void menuClick() throws Exception {
        WebDriver driver =  getDriver();

        Properties properties = new Properties();

        driver.get(properties.getBaseAdminUrl());

        By email = By.id("email");
        By pass = By.id("passwd");
        By loginBtn = By.name("submitLogin");

        WebElement login = driver.findElement(email);
        login.clear();
        login.sendKeys("webinar.test@gmail.com");

        WebElement password = driver.findElement(pass);
        password.clear();
        password.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement button = driver.findElement(loginBtn);
        button.click();
        Thread.sleep(3000);

        /**
         * Хотелось реализовать нажатие на пункты меню, но получаю:
         * StaleElementReferenceException: stale element reference: element is not attached to the page document
         * Подскажите пожалуйста как можно это сделать?
         * Пришлось находить каждый пункт меню по отдельности. Также не понятно, почему у некоторых элементов изменяются
         * локаторы и какие способы борьюы с этим существуют.
         */

//        List<WebElement> refers2 = driver.findElements(By.className("maintab"));
//        for (WebElement refer: refers2) {
//            WebElement cl = refer.findElement(By.tagName("span"));
//            System.out.println(refer.getText());
//            cl.click();}

        driver.findElement(By.xpath("//*[@id='tab-AdminDashboard']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getTitle());

        driver.findElement(By.id("subtab-AdminParentOrders")).click();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getTitle());

        driver.findElement(By.id("subtab-AdminCatalog")).click();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("/html/body/nav/ul/li[5]/a/span")).click();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getTitle());

        driver.findElement(By.id("subtab-AdminParentCustomerThreads")).click();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getTitle());

        driver.findElement(By.id("subtab-AdminStats")).click();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getTitle());

        driver.findElement(By.id("subtab-AdminParentModulesSf")).click();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("/html/body/nav/ul/li[10]/a/span")).click();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//*[@id='subtab-AdminParentShipping']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//*[@id='subtab-AdminParentPayment']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getTitle());

        driver.findElement(By.id("subtab-AdminInternational")).click();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getTitle());

        driver.findElement(By.id("subtab-ShopParameters")).click();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//*[@id='subtab-AdminAdvancedParameters']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getTitle());

        List<WebElement> numberOfElements = driver.findElements(By.className("maintab"));
        System.out.println("Всего: " +numberOfElements.size() + " пунктов меню.");

        driver.quit();

    }

}

