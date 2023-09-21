package seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZeroBankHeaderVerification {
    //By TagName


    public static void main(String[] args) {
        //Zero Bank header verification
        //1. Open a browser
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Check header textExpected --> "Log in to ZeroBank"
        System.out.println(driver.findElement(By.tagName("h3")));

        String actualText = driver.findElement(By.tagName("h3")).getText();
        System.out.println("using getText() method, we got " + actualText);

        String expectedText = "Log in to ZeroBank";

        //4. close session
        driver.close();
    }


}
