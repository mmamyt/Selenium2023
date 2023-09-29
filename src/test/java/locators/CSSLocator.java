package locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CSSLocator {


    public static <IWebElement> void main(String[] args) throws InterruptedException {


        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
        //driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("admin123");
        //driver.findElement(By.xpath("//*[@name='password']")).clear();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[@type='submit']")).click();
        driver.findElement(By.xpath("//*[@type='submit']")).submit();
        Thread.sleep(10000);

        String text = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6")).getText();


        driver.findElement(By.xpath("//*[text()='Admin']")).click();
        Thread.sleep(3000);
        System.out.println(text);

        driver.findElement(By.xpath("//*[text()='PIM']")).click();
        Thread.sleep(3000);
        System.out.println(text);



        driver.findElement(By.xpath("//*[text()='Leave']")).click();
        Thread.sleep(3000);
        System.out.println(text);



        driver.findElement(By.xpath("//*[text()='Time']")).click();
        Thread.sleep(3000);
        System.out.println(text);



        driver.findElement(By.xpath("//*[text()='Recruitment']")).click();
        Thread.sleep(3000);
        System.out.println(text);



        driver.findElement(By.xpath("//*[text()='My Info']")).click();
        Thread.sleep(3000);
        System.out.println(text);


        driver.findElement(By.xpath("//*[text()='Performance']")).click();
        Thread.sleep(3000);
        System.out.println(text);


        driver.findElement(By.xpath("//*[text()='Dashboard']")).click();
        Thread.sleep(3000);
        System.out.println(text);


        driver.findElement(By.xpath("//*[text()='Directory']")).click();
        Thread.sleep(3000);
        System.out.println(text);




        driver.findElement(By.xpath("//*[text()='Maintenance']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text() = ' Confirm ']")).click();
        Thread.sleep(5000);
        System.out.println(text);

        Thread.sleep(3000);



        driver.findElement(By.xpath("//*[text()='Claim']")).click();
        Thread.sleep(3000);
        System.out.println(text);



        driver.findElement(By.xpath("//*[text()='Buzz']")).click();
        Thread.sleep(3000);
        System.out.println(text);



        driver.close();


    }
}
