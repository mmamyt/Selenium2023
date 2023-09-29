package locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdowns {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.xpath("//a[text() = 'Checkboxes']")).click();
        driver.findElement(By.xpath("//h3[text() = 'Checkboxes']")).isDisplayed();

        // isSelected()
        boolean checkbox2 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).isSelected();
        System.out.println(checkbox2);
        //isEnabled
        boolean checkbox1 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).isEnabled();
        System.out.println(checkbox1);


        driver.navigate().back();
        driver.findElement(By.xpath("//a[text() = 'Dropdown']")).click();
        driver.findElement(By.xpath("//h3[text()='Dropdown List']")).isDisplayed();


        Select select = new Select(driver.findElement(By.cssSelector("[id='dropdown']")));
        Thread.sleep(300);
        //select.selectByVisibleText("Option 2");
        select.selectByValue("2");
















        Thread.sleep(10000);
        driver.close();


    }
}
