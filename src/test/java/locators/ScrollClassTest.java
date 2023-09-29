package locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollClassTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        Actions action = new Actions(driver);

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

       /* action.sendKeys(Keys.END).perform(); // scrolls to the bottom of the page
        Thread.sleep(3000);
        action.sendKeys(Keys.HOME).perform();*/



        WebElement dragAndDrop = driver.findElement(By.xpath("//a[text() = 'Drag and Drop']"));
        //dragAndDrop.click();
        action.click(dragAndDrop).perform();
        Thread.sleep(2000);

        WebElement sourceElement = driver.findElement(By.id("column-a"));
        WebElement targetElement = driver.findElement(By.id("column-b"));

        action.dragAndDrop(sourceElement, targetElement).perform();

        Thread.sleep(2000);

        action.dragAndDrop(sourceElement, targetElement).perform();

















    }
}
