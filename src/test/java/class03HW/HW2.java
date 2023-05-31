package class03HW;


import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        /*
        Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.
         */
        openBrowserAndLaunchApplication("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D","chrome");

        WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement loginButton= driver.findElement(By.xpath("//input[@value='LOGIN']"));
        Thread.sleep(2000);
        loginButton.click();
        WebElement error=driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
        if(error.getText().equals("Password cannot be empty")){
            System.out.println("HAS error message");
        }else {
            System.out.println("NO error message");
        }
    }
}
