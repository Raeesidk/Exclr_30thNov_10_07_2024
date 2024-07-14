package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidationCommand_with_GetMethods {

    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //the getTitle method expects an string so thats why we are storing it in string Variable
        String actualTitle = driver.getTitle();//To Know/capture the title of the application.
        System.out.println("The Actual Title is :" + actualTitle);
        String expectedTitle = "Facebook – log in or sign up";
        if(expectedTitle.equals(actualTitle))
        {
            System.out.println("Test case is pass");
        }
        else
        {
            System.out.println("Test case is fail");
        }

        WebElement Loginbutton = driver.findElement(By.name("login"));

        //getAttribute ():To capture the locator value of the element from the application.
        System.out.println("The attribute/locator value is : "+ Loginbutton.getAttribute("id"));

        //getTagName ():To capture the HTML tag name of the element.
        System.out.println("The Tag name of Loginbutton is :" + Loginbutton.getTagName());

        //getTagName ():To capture the HTML tag name of the element.
        System.out.println("The size/Dimension of Login button is : " + Loginbutton.getSize());

        //getText ():To capture the name of the element.
        System.out.println("The name of the element is : "+ Loginbutton.getText());


        System.out.println(driver.getCurrentUrl());//To capture the current URL of the application.
        driver.findElement(By.linkText("Forgotten password?")).click();
        System.out.println(driver.getCurrentUrl());


    }

}
