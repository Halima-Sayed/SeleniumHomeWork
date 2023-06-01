package class05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SeekableByteChannel;

public class HW2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        /*
        HW2:
goto https://chercher.tech/practice/frames

click on check box
then select bay cat from drop down
then enter text in text box

         */
        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");
        WebElement checkBox= driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();


        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement dd= driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(dd);
        sel.selectByVisibleText("Baby Cat");


        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame1");
        WebElement textBox=driver.findElement(By.xpath("//input"));
        textBox.sendKeys("hi");
    }
}
