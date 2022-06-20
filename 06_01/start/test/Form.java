import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/alisa/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Alisa");

        driver.findElement(By.id("last-name")).sendKeys("Poon");

        driver.findElement(By.id("job-title")).sendKeys("QA Tester");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.id("select-menu")).click();
        driver.findElement(By.cssSelector("option[value='2']")).click();

        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.sendKeys("06/19/2022");
        datepicker.sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        driver.quit();
    }
}
