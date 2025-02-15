import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");


        WebElement filePath = driver.findElement(By.id("file-upload-field"));
        filePath.sendKeys("file-to-upload.png");

        WebElement reset = driver.findElement(By.cssSelector(".btn.btn-warning.btn-reset"));
        reset.click();

        driver.quit();
    }
}
