package class02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        HW  (only use XPATH)
navigate to fb.com
click on create new account
fill up all the textboxes
close the popup
close the browser
Note : in order for ur code to work
u have to put Thread.sleep(2000) after clicking on Create new account

         */
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement createNewAcc=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAcc.click();
        Thread.sleep(2000);
        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Ted");
        WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Mosby");
        Thread.sleep(2000);
        WebElement emailOrPhone=driver.findElement(By.xpath("//input[@name='reg_email__']"));
        emailOrPhone.sendKeys("TedMosby@Gmail.com");
        WebElement reEnterEmail= driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        reEnterEmail.sendKeys("TedMosby@Gmail.com");
        WebElement password= driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        password.sendKeys("TedTheArchitectMosby");
        Thread.sleep(2000);
        WebElement monthOfBirth=driver.findElement(By.xpath("//option[text()='Apr']"));
        monthOfBirth.click();
        WebElement dateOfBirth= driver.findElement(By.xpath("//option[text()='25']"));
        dateOfBirth.click();
        WebElement yearOfBirth=driver.findElement(By.xpath("//option[text()='1978']"));
        yearOfBirth.click();
        Thread.sleep(2000);
        WebElement gender= driver.findElement(By.xpath("//label[text()='Female']"));
        gender.click();
        WebElement signUp= driver.findElement(By.xpath("//button[@name='websubmit']"));
        signUp.click();
        Thread.sleep(2000);
        WebElement closePopUp= driver.findElement(By.xpath("//img[@class='_8idr img']"));
        closePopUp.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
