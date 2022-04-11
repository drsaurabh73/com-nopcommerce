import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MircroSoftEdgeBrowser {

    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        // open the base URL
        driver.get(baseUrl);
        // Print the tile of the page
        String title = driver.getTitle();
        System.out.println("The title of the page is " +title);
        // print the current URL
        String currenturl = driver.getCurrentUrl();
        System.out.println("The current URL = " +currenturl);
        // Print the page source
        System.out.println("The page source is : " +driver.getPageSource());
        // Enter the email in to the email field
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("Swamibapa@gmail.com");
        // Enter the password in the password field
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("1234@##");
        // close the browser
        driver.close();


    }
}
