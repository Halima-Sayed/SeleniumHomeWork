package class03HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {
        /*
        HW1:
        use xpath and css
Open chrome browser
Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
fill in the complete form

         */

        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");

        driver.manage().window().maximize();

        //fill in first name using xpath
        WebElement firstName=driver.findElement(By.xpath("//input[@name='first_name']"));
        firstName.sendKeys("Lily");

        //fill in last name using css
        WebElement lastName= driver.findElement(By.cssSelector("input[name='last_name']"));
        lastName.sendKeys("Aldrin");

        //fill in email using xpath
        WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("LilyAldrin@gmail.com");

        //fill in phone number using css
        WebElement phoneNumber= driver.findElement(By.cssSelector("input[name='phone']"));
        phoneNumber.sendKeys("12344688");

        //fill in address using xpath
        WebElement address= driver.findElement(By.xpath("//input[@name='address']"));
        address.sendKeys(" 150 W. 85th Street");

        //fill in city using css
        WebElement city=driver.findElement(By.cssSelector("input[name='city']"));
        city.sendKeys("NYC");

        //click in state using xpath
        WebElement state=driver.findElement(By.xpath("//option[text()='New York']"));
        state.click();

        //zip code using xpath
        WebElement zipCode=driver.findElement(By.xpath("//input[@name='zip']"));
        zipCode.sendKeys("10001");

        //fill in website or domain name using css
        WebElement domainName=driver.findElement(By.cssSelector("input[placeholder='Website or domain name']"));
        domainName.sendKeys("LilyLily");

        //click hosting using xpath
        WebElement hosting=driver.findElement(By.xpath("//input[@value='no']"));
        hosting.click();

        //fill in comment using css
        WebElement comment=driver.findElement(By.cssSelector("textarea[name='comment']"));
        comment.sendKeys("New Project");
    }
}
