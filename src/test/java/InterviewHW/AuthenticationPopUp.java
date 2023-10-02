package InterviewHW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AuthenticationPopUp extends CommonMethods {
    public static void main(String[] args) {
        String url="http://the-internet.herokuapp.com/basic_auth";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        String url2="@the-internet.herokuapp.com/basic_auth";
        String uN="admin";
        String pass="admin";
        String addCredentials=uN+":"+pass;
        //this code will encode the username and password
        String hiddenCred=java.util.Base64.getEncoder().encodeToString(addCredentials.getBytes());
        driver.get("http://"+hiddenCred+url2);
    }
}
