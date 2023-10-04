package TN_UITestAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NewLoginTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String baseUrl = "https://technovaschool.github.io/TechNovaBank/LoginPage.html";
        String userName = "admin";
        String passWord = "password";

        driver.get(baseUrl);
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        username.sendKeys(userName);
        password.sendKeys(passWord);

        WebElement login = driver.findElement(By.id("login-btn"));
        login.click();

        WebElement google = driver.findElement(By.xpath("//a[text()='Go To Google']"));
        google.click();

        Set<String> setWindows = driver.getWindowHandles();
        List<String> listOfWindows = new ArrayList<>(setWindows);

        driver.switchTo().window(listOfWindows.get(1));

        Thread.sleep(2000);
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("iPhone 15");

        Thread.sleep(2000);

        driver.switchTo().window(listOfWindows.get(0));
        Thread.sleep(2000);

        WebElement logOut = driver.findElement(By.id("logOut"));
        logOut.click();



        Thread.sleep(12000);
        driver.quit();
    }
}
