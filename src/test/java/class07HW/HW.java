package class07HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HW extends CommonMethods {
    public static void main(String[] args) {
        /*

goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
login
click on PIM

from the table choose any ID
and print out the row number of that id

please make sure that ur code is dynamic enough to cater if another row gets deleted , it still prints the row correctly
         */
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement userName= driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password= driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton= driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginButton.click();

        WebElement pimButton=driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimButton.click();

        //id=56764A
        List<WebElement> allIDs=driver.findElements(By.xpath("//table/tbody//tr/td[2]"));
        for (int i = 0; i <allIDs.size(); i++) {
            String id=allIDs.get(i).getText();
            if(id.equals("56764A")){
                System.out.print("The employee Id is "+id +":");
                System.out.println("the id row number is "+(i+1));
                break;
            }
        }
    }
}
