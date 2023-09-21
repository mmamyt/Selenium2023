package seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicLoginAuthentification {
    //By Name

    public static void main(String[] args) throws InterruptedException {
        //Basic login authentication
        //1. Open a browser
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        //2. Go to : http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //3. Verify title equals/contains -->expected "Web Orders Login "
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle.contains(expectedTitle));

        //4. Enter username : Tester
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");

        //5. Enter Password: test
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        Thread.sleep(3000);

        //6. Click "Sign In" button
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();
        Thread.sleep(3000);

        //7. Verify title equals --> expected Web Orders

        //quit drive
        driver.quit();
    }
}
