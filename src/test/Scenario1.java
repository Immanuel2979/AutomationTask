package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class Scenario1 {
 /* Please note: As the Dockerhub website is updated recently on 30th March, this test case fails */
    //private static WebDriver driver;
    public static void main(String[] args) {
        try {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            System.setProperty("WebDriver.chrome.driver", ObjectRepository.lnkChromeDriverPath);

            driver.get(ObjectRepository.txtBoxDockerSearch);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            boolean Containers = driver.findElement(By.xpath(ObjectRepository.btnContainers)).isDisplayed();
            System.out.println(Containers);
            driver.quit();
        }
        catch(Exception e)
        {
            System.out.println("Elements not visible / found");
        }
    }

}




