package TN_UITestAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class JSExecutorsTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        String baseUrl = "https://technovaschool.github.io/TechNovaBank/LoginPage.html";
        String userName = "admin";
        String passWord = "password";

        driver.get(baseUrl);
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-btn"));

        //setAttribute("value", "Text"); => sendKeys()

        //
     /*
        username.sendKeys(userName);
        password.sendKeys(passWord);
        login.click();

        */

        //executor.executeScript("arguments[0].setAttribute('value', 'admin')", username);
        //executor.executeScript("arguments[0].setAttribute('value', 'password')", password);
        //executor.executeScript("arguments[0].click()",  loginBtn);
        Thread.sleep(2000);
        WebElement becomeAMember = driver.findElement(By.xpath("//*[@id='loginForm']/div[4]/button"));

        executor.executeScript("arguments[0].click()", becomeAMember);


        WebElement cancelButton = driver.findElement(By.xpath("//button[text()='Cancel']"));

        Thread.sleep(2000);
        executor.executeScript("arguments[0].scrollIntoView(true)",  cancelButton);



        //get page title   getTitle()
        String pageTitle = (String) executor.executeScript("return document.title");

        // get url => getCurrentURL()
        String getUrl = (String) executor.executeScript("return window.location.href");

        // how to send JS pop up alerts into the page
        executor.executeScript("alert('Welcome To Selenium & Java Coding class')");
        executor.executeScript("prompt('enter your name!')");
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(2000);
        executor.executeScript("arguments[0].click()", cancelButton);







        System.out.println(pageTitle);
        System.out.println(getUrl);













        Thread.sleep(12000);
        driver.close();









    }
}
