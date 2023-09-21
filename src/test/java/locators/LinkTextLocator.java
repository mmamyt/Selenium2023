package locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextLocator {

    public static void main(String[] args) throws InterruptedException {
        //Verify if embedded link operates as expected
        //1. open a browser
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().fullscreen();

        //2. go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. click on logo
        driver.findElement(By.linkText("Zero Bank")).click();

        Thread.sleep(3000);

        //4. verify that we are on home webpage
        String expectedURL = "http://zero.webappsecurity.com/index.html";
        String actualURL = driver.getCurrentUrl();
        if(expectedURL.equals(actualURL)){
            System.out.println("True");
        }else{
            System.out.println("false");
        }

        boolean result = driver.findElement(By.id("pages-nav")).isDisplayed();
        if(result == true){
            System.out.println("Home Page Confirmed");
        }else{
            System.out.println("Home page is not confirmed");
        }

        driver.quit();
    }
}
