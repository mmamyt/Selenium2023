package seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTask {
    public static void main(String[] args) {

        //create connection between driver and selenium, set up driver
        WebDriverManager.firefoxdriver().setup();

        //create firefox driver instance
        WebDriver driver = new FirefoxDriver();

        //maximize the window
        driver.manage().window().maximize();

        //go to google page
        driver.get("https://www.google.com/");

        //get title
        String actualTitle = driver.getTitle();

        //verify that the title is correct
        String expectedTitle = "Google";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test PASSED");
        } else{
            System.out.println("Failed");
        }


        driver.quit();
    }
}
