package TN_UITestAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JSAlertsTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://technovaschool.github.io/TechNovaBank/LoginPage.html");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));

        username.sendKeys("admin");
        password.sendKeys("password");
        loginButton.click();
        //

        WebElement addMoney = driver.findElement(By.cssSelector("[class='action-buttons']>button:nth-child(1)"));
        addMoney.click();

        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

        String alertText = alert.getText();
        System.out.println("Alerts Text is : " + alertText);

        Thread.sleep(3000);
        alert.accept();

        // enter text into alert(JS promt)
        addMoney.click();
        alert.sendKeys("600");
        alert.accept();
        alertText = alert.getText();
        System.out.println("New alerts text is : " + alertText);
        Thread.sleep(3000);
        alert.accept();












        Thread.sleep(10000);
        driver.close();
    }
}
