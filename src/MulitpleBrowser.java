import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MulitpleBrowser {

    public static void main(String[] args) {
MulitpleBrowser obj1 = new MulitpleBrowser();
obj1.multiBrowser();







    }
    String browser = "chrome";
    String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    WebDriver driver;
    public  void  multiBrowser() {
        if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
    } else if (browser.equalsIgnoreCase("FireFox")) {
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.out.println("Please select the driver for the above three");
        }
        driver.get(baseUrl);
    }


}