package TN_UITestAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class JSExecutorTestTwo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String url = "https://technovaschool.github.io/TechNovaBank/HomePage.html";
        driver.get(url);
        driver.manage().window().maximize();

        Actions action = new Actions(driver);
        WebElement productLink = driver.findElement(By.xpath("//button[text()='Product']"));
        action.moveToElement(productLink).perform();

        WebElement visaLink = driver.findElement(By.xpath("//a[text()='Visa']"));

        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
        jsDriver.executeScript("arguments[0].click()", visaLink);

        Set<String> setWindow = driver.getWindowHandles();
        List<String> listWindow = new ArrayList<String>(setWindow);

        driver.switchTo().window(listWindow.get(1));

        String pageTitle = (String) jsDriver.executeScript("return document.title;");

        String expectedTitle = "Visa Loan Application";

        boolean isTitleMatch = pageTitle.equals(expectedTitle);
        System.out.println("Is page's title match? = " + isTitleMatch);

        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("Adam");
        Select select = new Select(driver.findElement(By.id("title")));
        select.selectByIndex(1);

        driver.findElement(By.id("single")).click();
        driver.findElement(By.id("email")).sendKeys("JohnAdam@gmail.com");
        driver.findElement(By.id("mother-name")).sendKeys("John's Mother");

        driver.findElement(By.id("middle-name")).sendKeys("Smith");
        driver.findElement(By.id("address")).sendKeys("123 Main street , MainCity, ManinState 123456");
        driver.findElement(By.id("date-of-birth")).sendKeys("10201977");

        driver.findElement(By.id("income")).sendKeys("12500");
        select = new Select(driver.findElement(By.id("job-title")));
        select.selectByValue("Engineer");

        driver.findElement(By.id("loan-amount")).sendKeys("50000");
        select = new Select(driver.findElement(By.id("employment-status")));
        select.selectByVisibleText("Employed");

        driver.findElement(By.id("submit-btn")).click();

        Alert alert = driver.switchTo().alert();
        String expectedMessage = alert.getText();
        String actualMessage = "Application Has been successfully submitted!";

        boolean doesMessageMatch = expectedMessage.equals(actualMessage);
        System.out.println("Does Message Match? = " + doesMessageMatch);
        alert.accept();





















        Thread.sleep(12000);
        driver.quit();





    }
}
