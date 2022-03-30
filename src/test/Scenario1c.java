package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Scenario1c {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.setProperty("WebDriver.chrome.driver", ObjectRepository.lnkChromeDriverPath);
        driver.get(ObjectRepository.txtBoxDockerSearch);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Analytics check box
        if (driver.findElement(By.xpath(ObjectRepository.chkAnalytics)) != null)
        {
            System.out.println("Analytics check box is present");
        } else
        {
            System.out.println("Analytics check box is not present");
        }
        //Base images check box
        if (driver.findElement(By.xpath(ObjectRepository.chkBaseImages)) != null)
        {
            System.out.println("Base images check box is present");
        }
        else
        {
            System.out.println("Base images check box is not present");
        }
        //DataBase check box
        if (driver.findElement(By.xpath(ObjectRepository.chkDatabases)) != null)
        {
            System.out.println("Databases check box is present");
        }
        else
        {
            System.out.println("Databases check box is not present");
        }
        //Storage check box
        if (driver.findElement(By.xpath(ObjectRepository.chkStorage)) != null)
        {
            System.out.println("Storage check box is present");
        }
        else
        {
            System.out.println("Storage check box is not present");
        }
        driver.quit();

    }
}


