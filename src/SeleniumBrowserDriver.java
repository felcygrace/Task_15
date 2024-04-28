import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBrowserDriver {
    public SeleniumBrowserDriver() {
        // Set the system property for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\FELCY\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    }

    public void seleniumBrowserDriver() {
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com/");

        // Find the search input element and type "Selenium Browser Driver"
        driver.findElement(By.name("q")).sendKeys("Selenium Browser Driver");

        // Press Enter
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
        
       
        // Close the browser
        driver.quit();
    }

    public static void main(String[] args) {
    	SeleniumBrowserDriver seleniumBrowserDriver = new SeleniumBrowserDriver();
    	seleniumBrowserDriver.seleniumBrowserDriver();
    }
}
