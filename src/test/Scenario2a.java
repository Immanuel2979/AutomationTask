package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Scenario2a {
    public static void main(String[] args) {
        try {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            System.setProperty("WebDriver.chrome.driver", ObjectRepository.lnkChromeDriverPath);
            driver.get(ObjectRepository.txtBoxDockerSearch);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.xpath(ObjectRepository.chkVerifyPublisher)).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            boolean tagSelected = driver.findElement(By.xpath(ObjectRepository.tagPublisherContent)).isDisplayed();
            System.out.println(tagSelected);
            driver.quit();
        }
        catch(Exception e)
        {
            System.out.println("Elements not visible / found");

        }
    }
}
