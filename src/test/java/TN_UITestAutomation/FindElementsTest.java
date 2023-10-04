package TN_UITestAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.*;

public class FindElementsTest {

    public static void main(String[] args) {

       // How to get all the links from any page
        // LinkedText

        // findElements => returns the lost of elements

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

        List<WebElement> list = driver.findElements(By.tagName("a"));

        System.out.println(list.get(0).getText());
        System.out.println(list.get(1).getText());
        System.out.println(list.get(2).getText());
        System.out.println(list.get(3).getText());
        System.out.println(list.get(4).getText());
        System.out.println(list.get(5).getText());
        System.out.println(list.get(6).getText());
        System.out.println(list.get(7).getText());
        System.out.println(list.get(8).getText());
        System.out.println(list.get(9).getText());
        System.out.println(list.get(10).getText());
    }
}
