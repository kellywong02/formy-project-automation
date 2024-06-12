import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://developers.google.com/maps/documentation/javascript/examples/places-autocomplete-addressform");

        WebElement ship_address = driver.findElement(By.id("ship-address"));
        ship_address.click();
        ship_address.sendKeys("S Chrisman Rd");

        WebElement button = driver.findElement(By.className("pac_item"));
        driver.quit();
    }
}
