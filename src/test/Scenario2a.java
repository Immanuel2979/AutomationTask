package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.time.Duration;

public class Scenario2a {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.setProperty("WebDriver.chrome.driver", ObjectRepository.lnkChromeDriverPath);
        driver.get(ObjectRepository.txtBoxDockerSearch);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath(ObjectRepository.chkVerifyPublisher)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        boolean eleSelected= driver.findElement(By.xpath(ObjectRepository.tagPublisherContent)).isDisplayed();
        System.out.println(eleSelected);
        driver.quit();
    }
}
