package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchBrowser
{
    public static void main(String[] args) throws InterruptedException {
//        To launch the Browser we use "WebDriver" It is a child interface of parent interface SearchContext this Web driver implements class "RemoteWeb driver"
       WebDriver driverE = new EdgeDriver(); //EdgeDriver,ChromeDriver,firefox ,, & Internet Explorer ,, . are the child class of  parent class"Remote Web Driver".
//To maximize the window
        driverE.manage().window().maximize();
//To pass the URL of the webpage
driverE.get("https://www.msn.com/en-in/money/video/10-detective-anime-you-must-watch/ar-BB1pNDub?ocid=msedgntp&pc=LCTS&cvid=728f41e2d34248888344e3255a3cc694&ei=77");
Thread.sleep(3000);
driverE.close(); //it is used to close if there is only single tab in the browser
//driverE.quit();      It is used to close multiple tabs in the browser



    }
}
