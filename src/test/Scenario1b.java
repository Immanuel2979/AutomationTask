package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.time.Duration;


public class Scenario1b {
    public static void main(String[] args)

    {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webDriver.chrome.driver", ObjectRepository.lnkChromeDriverPath);
        driver.get(ObjectRepository.txtBoxDockerSearch);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        if(driver.findElement(By.xpath(ObjectRepository.chkVerifyPublisher))!= null)
        {
            System.out.println("The check box of Verify publisher is present");

        }
        else
        {
            System.out.println("Verify publisher check box is not present");
        }
        if(driver.findElement(By.xpath(ObjectRepository.chkOfficialImages))!= null){

            System.out.println("Official images check box is present");

        }else {

            System.out.println("Official images check box is not present");
        }
        driver.quit();
    }
}
