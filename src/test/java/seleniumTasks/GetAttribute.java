package seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttribute {
    //By PartialLinkText

    public static void main(String[] args) {
        // Zero Bank header verification
        ////1. Open a browser
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        ////2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        ////3. Click on forgot your password
        driver.findElement(By.partialLinkText("Forgot your")).click();

        ////4. Verify title - Zero - Forgotten Password
        String actualTitle = driver.getTitle();
        String expectedTitle = "Zero - Forgotten Password";

        boolean result = actualTitle.equals(expectedTitle);
        System.out.println(result);

        ////5. Check if "Forgotten Password" is present in the page
        String actualText = driver.findElement(By.tagName("h3")).getText();
        String expectedText = "Forgotten Password";

        boolean result2 = actualText.equals(expectedText);
        System.out.println(result2);

        driver.quit();


    }

}
