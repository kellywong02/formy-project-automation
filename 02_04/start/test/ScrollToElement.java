import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        //Find element
        WebElement name = driver.findElement(By.id("name"));
        //Create action instance
        Actions action = new Actions(driver);
        //Use action to move to the element we want
        action.moveToElement(name);
        name.sendKeys("Yujinie");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("20/01/2020");

        driver.quit();
    }
}
