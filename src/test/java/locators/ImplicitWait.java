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

public class ImplicitWait {

    public static void main(String[] args) throws InterruptedException {

        // 1.ImplicitWait => static
        // 2.ExplicitWait => dynamic

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        //Thread.sleep(5000);
        //driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(160));

        wait.until(ExpectedConditions.visibilityOf(userName)).sendKeys("Tester");










    }
}
