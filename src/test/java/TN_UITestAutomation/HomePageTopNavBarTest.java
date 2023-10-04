package TN_UITestAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePageTopNavBarTest {

    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("file:///Users/kamol/Desktop/MyBankApplication/LoginPage.html");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));

        username.sendKeys("admin");
        password.sendKeys("password");
        loginButton.click();

        boolean pageTitle =  driver.findElement(By.xpath("//h1[text()='Welcome to TN Bank']")).isDisplayed();
        System.out.println(pageTitle);

        //
        driver.findElement(By.xpath("//a[text()='Personal']")).isDisplayed();
        WebElement product = driver.findElement(By.xpath("//button[text()='Product']"));
        product.isDisplayed();

        Actions action = new Actions(driver);
        action.moveToElement(product).perform();

        driver.findElement(By.xpath("//a[text()='Auto']")).isDisplayed();
        driver.findElement(By.xpath("//a[text()='Visa']")).isDisplayed();
        driver.findElement(By.xpath("//a[text()='Mortgage']")).isDisplayed();

        WebElement business = driver.findElement(By.xpath("//button[text()='Business']"));
        business.isDisplayed();

        action = new Actions(driver);
        action.moveToElement(business).perform();

        driver.findElement(By.xpath("//a[text()='Credit Card']")).isDisplayed();
        driver.findElement(By.xpath("//a[text()='Saving']")).isDisplayed();
        driver.findElement(By.xpath("//a[text()='Checking']")).isDisplayed();

        driver.findElement(By.xpath("//a[text()='Schedule Appointment']")).isDisplayed();
        driver.findElement(By.xpath("//a[text()='Apply for New']")).isDisplayed();
        driver.findElement(By.xpath("//a[text()='Search']")).isDisplayed();
        driver.findElement(By.xpath("//a[text()='Log Out']")).isDisplayed();

    }
}
