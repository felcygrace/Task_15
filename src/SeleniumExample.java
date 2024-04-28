import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumExample {

	public static void main(String[] args) {
		// Set the system property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FELCY\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.guvi.in/");

        // Find an element by ID and perform an action
        WebElement element = driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle down-icon evtCourses'])[1]"));
        element.click();
        // get the title of the page 
        String title = driver.getTitle();
        System.out.println(title);

        // Close the browser
        driver.quit();

	}

}
