package BasicPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.HashMap;
import java.util.Map;

public abstract class ChromeDriverSetup {

    public static WebDriver driver;

    @BeforeSuite
    public static void setDriver() {
        System.setProperty("webdriver.Chrome.driver", "chromedriver.exe");
      //  ChromeOptions options = new ChromeOptions();
      //  options.addArguments("user-agent=\"Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)\"");
      //  driver = new ChromeDriver();

        // this part for notification allow disallow
        //Create a map to store  preferences
        Map<String, Object> prefs = new HashMap<String, Object>();

        //add key and value to map as follow to switch off browser notification
        //Pass the argument 1 to allow and 2 to block
        prefs.put("profile.default_content_setting_values.notifications", 2);

        //Create an instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // set ExperimentalOption - prefs
        options.setExperimentalOption("prefs", prefs);

        //Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
        driver = new ChromeDriver(options);
    }



    @AfterSuite
    public static void close() {
        driver.close();
    }
}
