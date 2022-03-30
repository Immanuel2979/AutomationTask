package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*Please note: Since the Docker Hub test website is updated as of 30th March, I am trying for a test case of clicking on X of
   Verify publisher button*/
public class Scenario4a {
    public static void main(String[] args) {
        try {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            System.setProperty("WebDriver.chrome.driver", ObjectRepository.lnkChromeDriverPath);
            driver.get(ObjectRepository.txtBoxDockerSearch);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.xpath(ObjectRepository.chkVerifyPublisher)).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.findElement(By.xpath(ObjectRepository.tagPublisherContent)).click();
            boolean eleSelected = driver.findElement(By.xpath(ObjectRepository.chkVerifyPublisher)).isSelected();
            System.out.println(eleSelected);
            driver.quit();
        }
        catch(Exception e)
        {
            System.out.println("Elements not visible / found");
        }
    }
}
