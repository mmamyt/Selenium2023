package locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathPractice {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[text()='Admin']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='PIM']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Leave']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Time']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Recruitment']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='My Info']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Performance']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Dashboard']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Directory']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Maintenance']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Claim']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Buzz']")).isDisplayed();

        driver.close(); // closes current window
        //vs
        //driver.quit(); // closes all the window sessions






    }
}
