package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FacebookRegistration {

    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Jyoti");
        driver.findElement(By.name("lastname")).sendKeys("Shukla");
        driver.findElement(By.name("reg_email__")).sendKeys("8019809125");
        driver.findElement(By.name("reg_passwd__")).sendKeys("1234@12##4_VUBR3148#%*(");
        Thread.sleep(1000);
// The WebElement data type is used when we want to store the findElement/findElements  into the variable with WebElement data type
        WebElement Date = driver.findElement(By.id("day"));
//whenever there is an Html select tag in code it is used for dropdown buttons  we use Select class for this tag
        /**The Select class in Selenium is used for interacting with dropdown menus (also known as select elements) on web pages.
         * It provides methods to select options from dropdowns based on their visible text, index, or attribute values.
         * Select Class Methods:selectByIndex(int index),selectByValue(String value):,selectByValue(String value):
         getOptions(): Retrieves all available options as a list of WebElement objects.& deselectAll(): Deselects all selected options (useful for multi-select dropdowns).   */
        Select selectdate = new Select(Date);
        selectdate.selectByIndex(10);//selectByIndex(int index): Selects an option by its index (0-based).,

        WebElement month = driver.findElement(By.id("month"));
        Select selectmonth = new Select(month);
        selectmonth.selectByValue("9"); //selectByValue(String value): Selects an option by its attribute value.
        Thread.sleep(3000);

        WebElement year = driver.findElement(By.id("year"));
        Select selectyear = new Select(year);
        selectyear.selectByVisibleText("1992"); //selectByVisibleText(String text): Selects an option by its visible text.
//if in the webpage element locators having same/common values/names then we use list this list class is used for radiobuttons , etc.
//To List down Web Elements with common locator.

        List<WebElement> gender = driver.findElements(By.className("_8esa"));
        System.out.println(gender.size());

        for(int i =0; i<1;i++)
        {
            gender.get(i).click();
            Thread.sleep(2000);
        }

        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(1000);

        driver.close();
    }

}
