package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/**Element Locators:- In Selenium, element locators are techniques used to identify specific elements on a web page. These locators help interact with web elements during test
 * automation. Here are some common types of locators: List of  Locators:-
 * 1.ID , 2.Name , 3.Class , 4.Tag , 5.Link Text/Partial link text ,6.Css & 7. X path*/
public class Element_Locators
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driverE = new EdgeDriver();
        driverE.manage().window().maximize();
        driverE.get("https://www.google.com/");
        Thread.sleep(2000);
        driverE.findElement(By.linkText("हिन्दी")).click();
        Thread.sleep(3000);
        driverE.findElement(By.partialLinkText("Eng")).click();
        Thread.sleep(3000);
        WebElement SearchBox =driverE.findElement(By.id("APjFqb")); // Here we stored findelement into the variable "SearchBox"
        //ID Locator: Targets elements using their unique identifiers within the HTML structure.
//        driverE.findElement(By.clas name("gLFyf")).click(); Class Name Locator: Identifies elements based on their class name
//        driverE.findElement(By.name("q")).click(); Name Locator: Relies on the name attribute of HTML elements.
        SearchBox.click();
        SearchBox.sendKeys("One piece");
        Thread.sleep(3000);
        SearchBox.clear();
//        As here below we can see we are using "findelement" so many times instead we can create the variable of "findelement" and stroke it then it will be easy to write SEE ABOVE CODE
//        driverE.findElement(By.className("gLFyf")); , driverE.findElement(By.name("q")).click(); , driverE.findElement(By.id("APjFqb")).send keys();
    }
}
