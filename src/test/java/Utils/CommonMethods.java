package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.time.Duration;
import java.util.List;

public class CommonMethods {

    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication(String url, String browser) {
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void selectOption(String elementXpath, String option) {
        WebElement e = driver.findElement(By.xpath(elementXpath));
        if (e.getTagName().equalsIgnoreCase("select")) {
            Select sel = new Select(e);
            sel.selectByVisibleText(option);
        } else {
            List<WebElement> options = e.findElements(By.tagName("div"));
            for (WebElement opt : options) {
                if (opt.getText().equals(option)) {
                    opt.click();
                    break;
                }
            }
        }
    }
    /*
    //HW:
//create a method in Common methods for screen shot
//it should take file name as a parameter.
     */
    public static void screenShot(String fileName){
        TakesScreenshot ts=(TakesScreenshot)driver;
        File screenShot=ts.getScreenshotAs(OutputType.FILE);
        String path="C:\\Users\\Halim\\OneDrive\\Desktop\\SeleniumHomeWork\\screenshot\\"+fileName+".png";
        try{
            FileUtils.copyFile(screenShot,new File(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //HW develop a function in common methods to select from dropdown(single select)
    public static void selectByVisibleText(WebDriver driver, String xpath, String text){
        WebElement element=driver.findElement(By.xpath(xpath));
        Select sel=new Select(element);
        sel.selectByVisibleText(text);
    }
    public static void selectByValue(WebDriver driver, String xpath, String value){
        WebElement element=driver.findElement(By.xpath(xpath));
        Select sel=new Select(element);
        sel.selectByValue(value);
    }
    public static void selectByIndex(WebDriver driver, String xpath, int index){
        WebElement element=driver.findElement(By.xpath(xpath));
        Select sel=new Select(element);
        sel.selectByIndex(index);
    }

    public static void selectDateOnCalendar( String calendarXapth, String monthXpath, String yearXapth, String dateXpath, String selectDate, String selectMonth, String selectYear) {
        WebElement calendar = CommonMethods.driver.findElement(By.xpath((calendarXapth)));
        calendar.click();

        WebElement month = CommonMethods.driver.findElement(By.xpath(monthXpath));
        Select selMonth = new Select(month);
        selMonth.selectByVisibleText(selectMonth);

        WebElement year = CommonMethods.driver.findElement(By.xpath(yearXapth));
        Select selYear = new Select(year);
        selYear.selectByValue(selectYear);

        boolean found = false;
        while (!found) {
            List<WebElement> allDates = CommonMethods.driver.findElements(By.xpath(dateXpath));
            for (WebElement date : allDates) {
                String currentDate = date.getText();
                if (currentDate.equals(selectDate)) {
                    date.click();
                    found = true;
                    break;
                }
            }
        }
 /*   public static void selectDateOnCalendar(String calendarXapth, String monthXpath, String yearXapth, String dateXpath,String selectDate,String selectMonth,String selectYear){
        WebElement calendar= driver.findElement(By.xpath((calendarXapth)));
        calendar.click();

       selectOption(monthXpath,selectMonth);
       selectOption(yearXapth,selectYear);

        boolean found=false;
        while (!found) {
            List<WebElement> allDates = driver.findElements(By.xpath(dateXpath));
            for (WebElement date : allDates) {
                String currentDate = date.getText();
                if (currentDate.equals(selectDate)) {
                    date.click();
                    found = true;
                    break;
                }
            }
        }
    }

  */
    }
}
