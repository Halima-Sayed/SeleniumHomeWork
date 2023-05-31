package class04HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HW2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        /*
        goto facebook.com
 click on create account
and select the your  date of birth using select class
         */
        String url="https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccount.click();
        Thread.sleep(2000);

        WebElement month= driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select selMonth=new Select(month);
        selMonth.selectByIndex(11);
        Thread.sleep(2000);

        WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select selDay=new Select(day);
        selDay.selectByVisibleText("12");
        Thread.sleep(2000);

        WebElement year= driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select selYear=new Select(year);
        selYear.selectByVisibleText("1999");
    }
}
