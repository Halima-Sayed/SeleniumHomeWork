package class01HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        // Navigate
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        //maximize
        driver.manage().window().maximize();
        //find element and send text
        driver.findElement(By.id("customer.firstName")).sendKeys("Barney");
        driver.findElement(By.id("customer.lastName")).sendKeys("Stinson");
        driver.findElement(By.name("customer.address.street")).sendKeys("East 84th Street and 3rd Avenue");
        driver.findElement(By.name("customer.address.city")).sendKeys("Manhattan");
        driver.findElement(By.id("customer.address.state")).sendKeys("New York");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("10001");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("123456789");
        driver.findElement(By.name("customer.ssn")).sendKeys("1234-9876");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.username")).sendKeys("Barney.Stinson");
        driver.findElement(By.id("customer.password")).sendKeys("legendwaitforitDARY");
        driver.findElement(By.name("repeatedPassword")).sendKeys("legendwaitforitDARY");
        Thread.sleep(5000);
        driver.quit();





    }
}
