package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Scenario1c {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.setProperty("WebDriver.chrome.driver", ObjectRepository.lnkChromeDriverPath);
        driver.get(ObjectRepository.txtBoxDockerSearch);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        try {
            // Analytics check box
            boolean analyticsChkBox = driver.findElement(By.xpath(ObjectRepository.txtAnalytics)).isDisplayed();
            System.out.println(analyticsChkBox);

            //Base images check box
            boolean baseImagesChkBox = driver.findElement(By.xpath(ObjectRepository.txtBaseImages)).isDisplayed();
            System.out.println(baseImagesChkBox);

            //DataBase check box
            boolean databasesChkBox = driver.findElement(By.xpath(ObjectRepository.txtDatabases)).isDisplayed();
            System.out.println(databasesChkBox);

            //Storage check box
            boolean storageChkBox = driver.findElement(By.xpath(ObjectRepository.txtStorage)).isDisplayed();
            System.out.println(storageChkBox);
        }
        catch(Exception e)
        {
            System.out.println("Elements not visible / found");

        }

        driver.quit();

    }
}


