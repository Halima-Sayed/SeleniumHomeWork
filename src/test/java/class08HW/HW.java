package class08HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW extends CommonMethods {
    public static void main(String[] args) {
        /*
        goto syntax hrms
login
click on recruitment
select a date on the calanader
         */
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginButton.click();

        WebElement recruitment = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recruitment.click();

        String calenderXpath="//input[@id='candidateSearch_fromDate']";
        String monthXpath="//select[@class='ui-datepicker-month']";
        String yearXpath="//select[@class='ui-datepicker-year']";
        String dateXpath="//table/tbody/tr/td";
        String selectDate="12";
        String selectMonth="Dec";
        String selectYear="1999";
       selectDateOnCalendar(calenderXpath,monthXpath,yearXpath,dateXpath,selectDate,selectMonth,selectYear);
    }
}