package locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;

public class IdLocator {
    //By ID

    public static void main(String[] args) throws InterruptedException {
        //Etsy Title Verification
        //1. Open a browser
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
        Thread.sleep(2000);

        //3. Search for gift box
        String str = "Gift box";
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys(str + Keys.ENTER);

        Thread.sleep(2000);


        //4. Verify title --> expected Gift box | Etsy
        String actualTitle = driver.getTitle();

        System.out.println(actualTitle);
        boolean result = actualTitle.contains(str);
        System.out.println(result);

        //

        driver.quit();

    }

}
