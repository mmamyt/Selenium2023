package TN_UITestAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WithdrawMoneyTest {

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


        driver.findElement(By.xpath("//button[text()='Withdraw Money']")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("500");
        alert.accept();
        //alert.dismiss();
        String text = alert.getText();
        System.out.println(text);
        alert.accept();
        String balance = driver.findElement(By.xpath("//div[@class='account-info']/p[1]")).getText();
        boolean test = balance.contains("$500");
        System.out.println(balance + " " + test);

        ///

        driver.findElement(By.xpath("//button[text()='Withdraw Money']")).click();
        alert = driver.switchTo().alert();
        alert.sendKeys("1200");
        alert.accept();
        String text2 = alert.getText();
        System.out.println(text2);
        boolean text3 = text2.contains("Insufficient balance. You cannot withdraw more than your current balance.");
        System.out.println(text3);
        alert.accept();






    }
}
