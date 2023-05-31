package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {

    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(String url,String browser){
        switch (browser){
            case"chrome":
              driver=new ChromeDriver();
              break;

            case "firefox":
                driver=new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.get(url);
    }
    public static void closeBrowser(){
        if (driver!=null){
            driver.quit();
        }
    }
}
