package class06HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW3MethodTester extends CommonMethods {
    //develop a function in common methods to select from dropdown(single select)
    public static void main(String[] args) {
        String url = "https://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement createNewAccount= driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();

        String monthXpath="//select[@id='month']";
        String month="Dec";
        selectByVisibleText(driver,monthXpath,month);
    }
}
