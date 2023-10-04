package TN_UITestAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BecomeANewMember {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("file:///Users/kamol/Desktop/MyBankApplication/LoginPage.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id='loginForm']/div[4]/button")).click();
        driver.findElement(By.xpath("//h2[text()='TN Bank - New Member Account Creation']")).isDisplayed();

        driver.findElement(By.id("firstName")).sendKeys("John");
        driver.findElement(By.id("lastName")).sendKeys("Smith");
        driver.findElement(By.id("email")).sendKeys("aaa@gmail.com");
        driver.findElement(By.id("phoneNumber")).sendKeys("7705432123");
        driver.findElement(By.id("address")).sendKeys(" 1234 S main street , Chicago, IL 303322");
        driver.findElement(By.id("ssn")).sendKeys("445678890");

        WebElement education = driver.findElement(By.cssSelector("#education"));
        Select select = new Select(education);
        select.selectByValue("college");

        WebElement month = driver.findElement(By.cssSelector("#birthMonth"));
        select = new Select(month);
        select.selectByValue("10");

        Select s3 = new Select(driver.findElement(By.xpath("//select[@id='birthDay']")));
        s3.selectByValue("1");

        Select s4 = new Select(driver.findElement(By.xpath("//select[@id='birthYear']")));
        s4.selectByValue("1994");

        Actions action = new Actions(driver);
        action.sendKeys(Keys.END).perform();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Submit']")).click();


    }
}
