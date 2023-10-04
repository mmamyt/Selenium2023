package TN_UITestAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class AssertionTest {


    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        String baseUrl = "https://technovaschool.github.io/TechNovaBank/LoginPage.html";
        driver.get(baseUrl);

        String expectedTitle = "TN Bank - Login";
        String actualTitle = driver.getCurrentUrl();

        //TBD after we cover JUnit & TestNG




    }
}
