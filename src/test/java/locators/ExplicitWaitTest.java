package locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWaitTest {

    public static void main(String[] args) {


        WebDriverManager.edgedriver().setup();;
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        By userName = By.name("username");
        By password = By.name("password");
        wait.until(ExpectedConditions.presenceOfElementLocated(userName)).sendKeys("Admin");
        wait.until(ExpectedConditions.presenceOfElementLocated(password)).sendKeys("admin123");









    }
}
