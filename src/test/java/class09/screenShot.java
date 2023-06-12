package class09;

import Utils.CommonMethods;

public class screenShot extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://www.google.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        screenShot("screenshot1");
    }
}
