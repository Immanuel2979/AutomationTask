package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Scenario1b {
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();
            System.setProperty("webDriver.chrome.driver", ObjectRepository.lnkChromeDriverPath);
            driver.get(ObjectRepository.txtBoxDockerSearch);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            boolean eleOnePresent = driver.findElement(By.xpath(ObjectRepository.txtVerifyPublisher)).isDisplayed();
            System.out.println(eleOnePresent);

            boolean eleTwoPresent = driver.findElement(By.xpath(ObjectRepository.txtOfficialImages)).isDisplayed();
            System.out.println(eleTwoPresent);
            driver.quit();
        }
        catch(Exception e) {
            System.out.println("Elements not visible / found");
        }
    }
}
