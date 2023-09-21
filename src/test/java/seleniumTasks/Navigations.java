package seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigations {

    public static void main(String[] args) throws InterruptedException {

        //connect with browser
        WebDriverManager.firefoxdriver().setup();

        //instance of the firefox driver
        WebDriver driver = new FirefoxDriver();

        //maximize the screen
        driver.manage().window().maximize();

        //get to URL
        driver.get("https://www.google.com");
        Thread.sleep(2000);

        //navigate to
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        //navigate back - opening the prev webpage
        driver.navigate().back();
        Thread.sleep(3000);

        //navigates forward
        driver.navigate().forward();
        Thread.sleep(3000);

        //refresh webpage
        driver.navigate().refresh();

        //get the title of the webpage and print it in the console
        System.out.println(driver.getTitle());

        //check if the current URL contains facebook or google text
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        if(currentUrl.contains("facebook")){
            System.out.println("Current URL belongs to facebook page");
        } else if(currentUrl.contains("google")){
            System.out.println("Current URL belongs to google page");
        } else{
            System.out.println("invalid URL");
        }

        //quitting driver
        driver.quit();

    }
}
