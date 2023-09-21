package seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondTask {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup(); //connecting driver with selenium
        //Open FireFox browser
        WebDriver driver = new FirefoxDriver();

        //Go to https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //check if the username label exist
        //System.out.println(String.valueOf(driver.findElement(By.xpath("//label[contains(text(), 'Username')]"))));

/*        String actualUsername = driver.findElement(By.xpath("//label[contains(text(), 'Username')]")).getText();
        System.out.println(actualUsername);
        String expectedUsername = "Username";

        if(actualUsername.equals(expectedUsername)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }*/

        Thread.sleep(3000);

        //verify if the main Login text is displayed
        String actual = driver.findElement(By.tagName("h5")).getText();
        String expected = "Login";

        if(actual.equals(expected)){
            System.out.println("TRUE");
        }else{
            System.out.println("FAILED");
        }

        //second way to verify
        boolean result = driver.findElement(By.tagName("h5")).isDisplayed();
        System.out.println(result);


        driver.quit();

    }
}
