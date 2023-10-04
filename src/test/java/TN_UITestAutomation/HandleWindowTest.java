package TN_UITestAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleWindowTest {


    public static void main(String[] args) throws InterruptedException {

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

        driver.findElement(By.xpath("//a[text()='Go To OrangeHRM']")).click();

        Thread.sleep(5000);


        // get set
        Set<String> setWindows = driver.getWindowHandles();
        // convert all the set into List
        List<String> allWindows = new ArrayList<>(setWindows);

        // switching  between the windows
        driver.switchTo().window(allWindows.get(1));


        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");


        Thread.sleep(3000);

        driver.switchTo().window(allWindows.get(0));


        Thread.sleep(3000);
        driver.switchTo().window(allWindows.get(2));










        Thread.sleep(10000);
        driver.quit();


















    }
}
