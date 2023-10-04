package TN_UITestAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindowTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/");
        Actions action =  new Actions(driver);
        action.sendKeys(Keys.END).perform();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
        driver.findElement(By.xpath("//h3[text()='Opening a new window']")).isDisplayed();
        driver.findElement(By.linkText("Click Here")).click();



        Set <String> windowHandle = driver.getWindowHandles();

       // String parentWindow = null;

      /*  for(String w : windowHandle){

            driver.switchTo().window(w);
            Thread.sleep(3000);
            parentWindow = w;


        }*/

        List <String> newWindowHandle = new ArrayList<>(windowHandle);

        driver.switchTo().window(newWindowHandle.get(1));

        System.out.println(newWindowHandle.get(0));
        System.out.println(newWindowHandle.get(1));


        Thread.sleep(2000);
        driver.findElement(By.xpath("//h3[text()='New Window']")).isDisplayed();
        Thread.sleep(2000);
        driver.switchTo().window(newWindowHandle.get(0));












        Thread.sleep(12000);
        driver.quit();

    }
}
