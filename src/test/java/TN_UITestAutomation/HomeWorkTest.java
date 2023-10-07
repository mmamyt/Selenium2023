package TN_UITestAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HomeWorkTest {

    public static void main(String[] args) throws InterruptedException {



        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        JavascriptExecutor executor = (JavascriptExecutor)  driver;
        Actions action = new Actions(driver);

        driver.get("https://technovaschool.github.io/TechNovaBank/HomePage.html");

        WebElement product = driver.findElement(By.xpath("//button[text()='Product']"));
        executor.executeScript("arguments[0].click()", product);

        WebElement Auto = driver.findElement(By.xpath("//a[text()='Auto']"));
        executor.executeScript("arguments[0].click()", Auto);

        Set<String> setWindows = driver.getWindowHandles();

        List<String> allWindows = new ArrayList<>(setWindows);

        driver.switchTo().window(allWindows.get(1));
        Thread.sleep(2000);

        WebElement name = driver.findElement(By.xpath("//input[@id='first-name']"));
        executor.executeScript("arguments[0].setAttribute('value', 'Tony')",name);


        WebElement lastName = driver.findElement(By.id("last-name"));
        executor.executeScript("arguments[0].setAttribute('value', 'Gang')",lastName);


        WebElement Address = driver.findElement(By.id("address"));
        executor.executeScript("arguments[0].setAttribute('value', '1234 W hilton ave ')",Address);


        WebElement email = driver.findElement(By.id("email"));
        executor.executeScript("arguments[0].setAttribute('value', 'Tony123@gmail.com ')",email);


        WebElement phone = driver.findElement(By.id("phone"));
        executor.executeScript("arguments[0].setAttribute('value', '7054512345 ')",phone);

        WebElement social = driver.findElement(By.id("social-security"));
        executor.executeScript("arguments[0].setAttribute('value', '123456789 ')",social);



        WebElement income = driver.findElement(By.xpath("//input[@id='income']"));
        executor.executeScript("arguments[0].setAttribute('value', '500000')", income);


        WebElement jobTitle = driver.findElement(By.id("job-title"));
        executor.executeScript("arguments[0].setAttribute('value', 'Accountant')",jobTitle);

        WebElement cont = driver.findElement(By.id("submit"));
        executor.executeScript("arguments[0].click()", cont);
        Thread.sleep(2000);


        Select select = new Select(driver.findElement(By.xpath("//select[@id='vehicle-type']")));
        select.selectByValue("Sedan");

        Select select1 = new Select(driver.findElement(By.xpath("//select[@id='vehicle-year']")));
        select1.selectByValue("2021");

        Select select2 = new Select(driver.findElement(By.xpath("//select[@id='make']")));
        select2.selectByValue("Honda");

        Select select3 = new Select(driver.findElement(By.xpath("//select[@id='model']")));
        select3.selectByValue("F-150");

        Select select4 = new Select(driver.findElement(By.xpath("//select[@id='color']")));
        select4.selectByValue("Black");

        WebElement vin = driver.findElement(By.xpath("//input[@id='vin-number']"));
        executor.executeScript("arguments[0].setAttribute('value', '1HGBH41JXMN109186')",vin);


        WebElement mileage = driver.findElement(By.xpath("//input[@id='mileage']"));
        executor.executeScript("arguments[0].setAttribute('value', '15000')",mileage);


        WebElement submit = driver.findElement(By.xpath("//button[@id='submit-btn']"));
        executor.executeScript("arguments[0].click()", submit);
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

    }
}
