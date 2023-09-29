package locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BuyCar {

    public static void main(String[] args) {


        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.carbyu.com/");

        Select select = new Select(driver.findElement(By.xpath("//*[@id='searchByFilterType']")));
        select.selectByVisibleText("Certified");

        select = new Select(driver.findElement(By.xpath("//*[@id='searchByFilterYear']")));
        select.selectByVisibleText("2015");


    }
}
