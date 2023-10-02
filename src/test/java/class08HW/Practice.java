package class08HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Practice extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://www.aa.com/homePage.do?locale=en_US";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        // Click on calendar
        WebElement calendar = driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));
        calendar.click();

        // Select the date August 4, 2023
        String calenderXpath= "//table[@class='ui-datepicker-calendar']//td";
        String monthXpath= "(//span[@class='ui-datepicker-month'])[1]";
        String yearXpath="(//select[@class='ui-datepicker-year'])[1]";
        String dateXpath="//table[@class='ui-datepicker-calendar']//td";
        String selectDate="4";
        String selectMonth="August";
        String selectYear="2023";
        selectDateOnCalendar(calenderXpath,monthXpath,yearXpath,dateXpath,selectDate,selectMonth,selectYear);
    /*    selectDateOnCalendar(

                "(//button[@class='ui-datepicker-trigger'])[1]",
                "(//span[@class='ui-datepicker-month'])[1]",
                "(//select[@class='ui-datepicker-year'])[1]",
                "//table[@class='ui-datepicker-calendar']//td",
                "4",
                "August",
                "2023"
        );

     */
    }
}
