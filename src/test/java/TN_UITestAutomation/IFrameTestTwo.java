package TN_UITestAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IFrameTestTwo {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String url = "https://the-internet.herokuapp.com/iframe";
        driver.manage().window().maximize();
        driver.get(url);

        driver.switchTo().frame(0);

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='tinymce']/p")).clear();
        driver.findElement(By.xpath("//*[@id='tinymce']/p")).sendKeys("Scooby Doo");







        Thread.sleep(12000);
        driver.quit();
    }
}
