package locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectDeselectTest {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Context Menu")).click();
        WebElement link = driver.findElement(By.xpath("//div[@id='hot-spot']"));

        Actions action = new Actions(driver);
        Thread.sleep(3000);
        action.contextClick(link); // right click































        //Select select = new Select(dropdown);
        //select.selectByVisibleText("Option 1");
        //Thread.sleep(3000);
        //select.deselectByVisibleText("Option 1");
        //select.selectByValue("2");
        //select.selectByIndex(2);
       // deselectByVisibleText(), deselectByValue(), deselectByIndex(), deselectAll()





        Thread.sleep(15000);
        driver.close();



    }
}
