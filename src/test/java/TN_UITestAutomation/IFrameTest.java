package TN_UITestAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IFrameTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String url = "https://technovaschool.github.io/TechNovaBank/IFrameLoginPage.html";
        driver.manage().window().maximize();
        driver.get(url);

        //driver.switchTo().frame(0); // by index
        driver.switchTo().frame("iframe-container");



        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();


















        Thread.sleep(12000);
        driver.quit();
    }
}
