import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    public static void main(String[] args) {
        // setup the browser
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//open the URL
        driver.get(baseUrl);
        // Print the title of the page
        String title = driver.getTitle();
        System.out.println("The title of the page is :"  + title);
        // Print the current URL
        String currenturl = driver.getCurrentUrl();
        System.out.println("The Current URL = " +currenturl);
        //Print the page source
        System.out.println("The page source is :" +driver.getPageSource());
        // Enter the email address in the email field
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("pramukhswami@gmail.com");
        // Enter the password in the password field
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("1234@##");

        // close the driver
        driver.close();
    }

}
