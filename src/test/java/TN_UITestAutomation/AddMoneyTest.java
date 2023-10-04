package TN_UITestAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AddMoneyTest {

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

        driver.findElement(By.xpath("//button[text()='Add Money to Checking']")).click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("500");
        alert.accept();
        //alert.dismiss();
        String text = alert.getText();
        System.out.println(text);
        alert.accept();

        String balance = driver.findElement(By.xpath("//div[@class='account-info']/p[1]")).getText();

        boolean test = balance.contains("$1500");
        System.out.println(balance + " " + test);










    }
}
