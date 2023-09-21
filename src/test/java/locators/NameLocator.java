package locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NameLocator {
    //By Name

    public static void main(String[] args) {
        ///* HerokuApp Url verification
        //1. Open a browser
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        //2. Go to https://the-internet.herokuapp.com/forgot_password
        driver.get("https://the-internet.herokuapp.com/forgot_password");

        //3. Enter any email into input box
        driver.findElement(By.name("email")).sendKeys("email@gmail.com");

        //4. Click on Retrieve password button
        driver.findElement(By.id("form_submit")).click();

        //5. Verify the next page
        boolean result = driver.findElement(By.tagName("h1")).isDisplayed();
        System.out.println(result);

        driver.quit();
    }

}
