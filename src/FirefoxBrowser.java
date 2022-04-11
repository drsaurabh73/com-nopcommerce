import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // get the URL
        driver.get(baseUrl);
        // Print the title of the page
        String title = driver.getTitle();
        System.out.println("The title of the Page is :"  +title);
        //Print the current URL
        String currenturl = driver.getCurrentUrl();
        System.out.println("The current URL = " +currenturl);
        //Print the page source
        System.out.println("The page source is : " +driver.getPageSource());
        // Enter the email in the email field
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("pramukhswami@gmail.com");
        // Enter the password to password field
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("1234@##");
        // close the Browser
        driver.close();


    }


}
