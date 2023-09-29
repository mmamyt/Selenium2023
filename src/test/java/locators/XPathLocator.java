package locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPathLocator {

    public static void main(String[] args) throws InterruptedException {

        // Selenium Locators
        // By ID
        // By LinkedText
        // By Name
        // By Class
        // By Tag Name
        // By Partial LinkedText
        // By CSS
        // By Xpath

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();

        //driver.findElement(By.id("user_login")).sendKeys("TestData");
        //driver.findElement(By.id("user_password")).sendKeys("Password");

        //driver.findElement(By.name("user_login")).sendKeys("TestData");
        //driver.findElement(By.name("user_password")).sendKeys("Password");

        //boolean textIsDisplay = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/h3")).isDisplayed();
        //System.out.println(textIsDisplay);

        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("XPATH for rel xpath");
        driver.findElement(By.xpath("//*[@name='user_password']")).sendKeys("Password for Rel Xpath");
        driver.findElement(By.xpath("//*[@name='submit']")).click();


        // navigate().to(url)
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        Thread.sleep(3000);
        boolean dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
        System.out.println(dashboard);











    }



}
