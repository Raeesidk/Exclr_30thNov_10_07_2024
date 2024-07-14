package org.example;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetch_Listof_Links {

    public static void main(String[] args) throws InterruptedException
    {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rediff.com/");
        Thread.sleep(2000);
//		use List<WebElement> when you want to work with multiple web elements simultaneously.
        List<WebElement>fetchlinks=driver.findElements(By.tagName("a"));
        System.out.println("The Total no.of links are : " + fetchlinks.size());
        for(int i=0;i<fetchlinks.size();i++)
        {
            String LinkName = fetchlinks.get(i).getText();
            String url = fetchlinks.get(i).getAttribute("href");
            if(LinkName.startsWith("M"))
            {
                System.out.println(i + "." + LinkName + " ➡️➡️➡️ " + url );
            }
        }

    }

}
