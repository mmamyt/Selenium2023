package TN_UITestAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class VisaLoanApp {

    public static void main(String[] args) throws InterruptedException {


        // login
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String baseUrl = "https://technovaschool.github.io/TechNovaBank/LoginPage.html";
        String userName = "admin";
        String passWord = "password";
        Actions action = new Actions(driver);

        driver.get(baseUrl);
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        username.sendKeys(userName);
        password.sendKeys(passWord);

        WebElement login = driver.findElement(By.id("login-btn"));
        login.click();



        WebElement product = driver.findElement(By.xpath("//*[text()='Product']"));
        action.moveToElement(product).perform();
        Thread.sleep(2000);

        //click the visa
        WebElement visa = driver.findElement(By.xpath("//*[text()='Visa']"));
        visa.click();
        Thread.sleep(2000);

        //handle the new window
        Set<String> setWindows = driver.getWindowHandles();
        List<String> listWindows = new ArrayList<>(setWindows);

        driver.switchTo().window(listWindows.get(1));
        Thread.sleep(2000);

        //verify the visa loan app page header is displayed
        WebElement text = driver.findElement(By.xpath("//h1[text()='Visa Loan Application']"));
        if(text.isDisplayed()) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        // hover over APR button to see APR%
        action.sendKeys(Keys.END).perform();
        Thread.sleep(2000);
        WebElement apr = driver.findElement(By.id("apr-btn"));
        action.moveToElement(apr).perform();






    }
}
