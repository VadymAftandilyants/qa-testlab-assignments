package myprojects.automation.assignment2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoryPage {
    private EventFiringWebDriver driver;

    private By categoryText = By.id("name_1");
    private By saveBtn = By.id("category_form_submit_btn");
    private By filter = By.xpath("//*[@id='table-category']/thead/tr[2]/th[3]/input");
    private By searchBtn = By.id("submitFilterButtoncategory");
    private By addBtn = By.xpath("//*[@id='page-header-desc-category-new_category']/i");

    public CategoryPage (EventFiringWebDriver driver) {
        this.driver = driver;
    }

    public void addNewCategory() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(addBtn));
        driver.findElement(addBtn).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(categoryText));
        driver.findElement(categoryText).sendKeys("TestCat01");
        JavascriptExecutor jse = driver;
        jse.executeScript("window.scrollBy(0,1000)", "");
        wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
        driver.findElement(saveBtn).click();

        WebElement success = driver.findElement(By.xpath("//*[@id='content']/div[3]/div"));
        if (success.getText().contains("Создано")) {
            System.out.println("\n*** Категория созданна успешно ***\n");
        } else System.out.println("\n!!! Что-то пошло не так !!!\n");
    }

    public void filterCategory() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(filter));
        driver.findElement(filter).sendKeys("");
        driver.findElement(filter).sendKeys("TestCat01");
        JavascriptExecutor jse = driver;
        jse.executeScript("window.scrollBy(0,200)", "");
        wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
        driver.findElement(searchBtn).click();

        WebElement success = driver.findElement(By.xpath("//*[@id='tr_2_26_7']/td[3]"));
        if (success.getText().contains("TestCat01")) {
            System.out.println("\n*** Категория есть в списке ***\n");
        } else System.out.println("\n!!! Что-то пошло не так !!!\n");
    }
}
