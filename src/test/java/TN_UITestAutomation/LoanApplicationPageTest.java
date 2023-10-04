package TN_UITestAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoanApplicationPageTest {

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


        driver.findElement(By.xpath("//a[text()='Personal']")).click();

        driver.findElement(By.name("first_name")).sendKeys("Nick");
        driver.findElement(By.name("last_name")).sendKeys("Nicolas");


        Select select = new Select(driver.findElement(By.name("month_of_birth")));
        select.selectByValue("January");

        Select select1 = new Select(driver.findElement(By.name("day_of_birth")));
        select1.selectByValue("3");

        Select select3 = new Select(driver.findElement(By.name("year_of_birth")));
        select3.selectByValue("2002");

        driver.findElement(By.name("ssn")).sendKeys("123456");

        Select select2 = new Select(driver.findElement(By.name("employment")));
        select2.selectByValue("Unemployed");

        driver.findElement(By.name("income")).sendKeys("1000$");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // create alert obj
        Alert alert = driver.switchTo().alert();
        alert.accept();






    }
}
