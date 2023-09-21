package seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
    public static void main(String[] args) throws InterruptedException {

        //this is in order to create connection between the driver and selenium, set up driver
        WebDriverManager.firefoxdriver().setup();

        //to create instance of the FireFoxDriver
        WebDriver driver = new FirefoxDriver();

        //to open URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //to maximize the page
        driver.manage().window().maximize();
        Thread.sleep(3000);

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        //to quit
        driver.quit();
    }
}
