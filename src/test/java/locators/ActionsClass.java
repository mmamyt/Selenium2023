package locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        Actions action = new Actions(driver);

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement hovers = driver.findElement(By.xpath("//a[text() = 'Hovers']"));

        //hovers.click();
        //action.click(hovers).perform();

        // scroll to the bottom of the page
        action.sendKeys(Keys.END).perform();
        Thread.sleep(3000);
        action.doubleClick(hovers).perform();

        WebElement pageTitle = driver.findElement(By.xpath("//h3[text() = 'Hovers']"));
        pageTitle.isDisplayed();

        WebElement pictureOne = driver.findElement(By.xpath("//*[@class='figure']/img[1]"));
        action.moveToElement(pictureOne).perform();
        Thread.sleep(4000);

        WebElement pictureTwo = driver.findElement(By.xpath("//*[@class='figure'][2]/img"));
        action.moveToElement(pictureTwo).perform();
        Thread.sleep(4000);

        WebElement pictureThree = driver.findElement(By.xpath("//*[@class='figure'][3]/img"));
        action.moveToElement(pictureThree).perform();
        Thread.sleep(4000);

        driver.navigate().back();
        action.sendKeys(Keys.END).perform();
        Thread.sleep(3000);

        WebElement Infinite_Scroll = driver.findElement(By.xpath("//a[text() = 'Infinite Scroll']"));
        action.click(Infinite_Scroll).perform();
        action.sendKeys(Keys.END).perform();
        action.sendKeys(Keys.END).perform();
        action.sendKeys(Keys.END).perform();
        action.sendKeys(Keys.END).perform();
        action.sendKeys(Keys.END).perform();
        action.sendKeys(Keys.END).perform();
        action.sendKeys(Keys.END).perform();
        action.sendKeys(Keys.END).perform();
        action.sendKeys(Keys.END).perform();
        action.sendKeys(Keys.END).perform();








        Thread.sleep(6000);
        driver.close();

    }
}
