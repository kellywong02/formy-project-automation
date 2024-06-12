import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Yujin");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Ahn");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("Software Engineer");

        WebElement education_level = driver.findElement(By.cssSelector("input[value='radio-button-2']"));
        education_level.click();

        WebElement gender = driver.findElement(By.id("checkbox-2"));
        gender.click();

        WebElement experiences = driver.findElement(By.id("select-menu"));
        experiences.click();
        WebElement years = driver.findElement(By.cssSelector("option[value='2']"));
        years.click();

        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("11/06/2024");
        date.sendKeys(Keys.RETURN);

        WebElement submit = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
        submit.click();
        driver.quit();

    }
}
