package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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
    public static void selectDateOnCalendar(String calendarXapth, String monthXpath, String yearXapth, String dateXpath,String selectDate,String selectMonth,String selectYear){
        WebElement calendar= driver.findElement(By.xpath((calendarXapth)));
        calendar.click();

        WebElement month=driver.findElement(By.xpath(monthXpath));
        Select selMonth=new Select(month);
        selMonth.selectByVisibleText(selectMonth);

        WebElement year=driver.findElement(By.xpath(yearXapth));
        Select selYear=new Select(year);
        selYear.selectByValue(selectYear);

        boolean found=false;
        while (!found){
            List<WebElement> allDates=driver.findElements(By.xpath(dateXpath));
            for(WebElement date:allDates){
                String currentDate=date.getText();
                if (currentDate.equals(selectDate)){
                    date.click();
                    found=true;
                    break;
                }
            }
        }


    }
}
