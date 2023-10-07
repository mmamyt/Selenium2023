package TN_UITestAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNGTest {



    WebDriver driver = new EdgeDriver();

    @AfterTest
    public void closeDriver(){

     driver.close();
    }


    @Test
    public void loginTest(){


        driver.get("https://technovaschool.github.io/TechNovaBank/LoginPage.html");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
        username.sendKeys("admin");
        password.sendKeys("password");
        loginButton.click();

    }


    @Test
    public void loginTest2(){

        driver.get("https://technovaschool.github.io/TechNovaBank/LoginPage.html");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
        username.sendKeys("admin");
        password.sendKeys("password");
        loginButton.click();

    }


    @Test
    public void loginTest3(){

        driver.get("https://technovaschool.github.io/TechNovaBank/LoginPage.html");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
        username.sendKeys("admin");
        password.sendKeys("password");
        loginButton.click();

    }


}
