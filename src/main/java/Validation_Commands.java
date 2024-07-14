import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**validation commands are used for verifying or validating the behavior of web applications. */
public class Validation_Commands {

    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement createaccount = driver.findElement(By.linkText("Create new account"));
        if(createaccount.isDisplayed())/**isDisplayed() is used To Verify whether the element(Create new account) is displaying/present in the application or not.*/
        {
            System.out.println("Test case is passed");
            createaccount.click();
        }
        else
        {
            System.out.println("Test case is Failed because Create new account is not displayed ");

        }

        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Jyoti");
        driver.findElement(By.name("lastname")).sendKeys("Shukla");
        driver.findElement(By.name("reg_email__")).sendKeys("8019809125");
        driver.findElement(By.name("reg_passwd__")).sendKeys("1234@12##4_VUBR3148#%*(");
        Thread.sleep(1000);

        WebElement Date = driver.findElement(By.id("day"));
        Select selectdate = new Select(Date);
        selectdate.selectByIndex(10);

        WebElement month = driver.findElement(By.id("month"));
        Select selectmonth = new Select(month);
        selectmonth.selectByValue("9");
        Thread.sleep(3000);

        WebElement year = driver.findElement(By.id("year"));
        Select selectyear = new Select(year);
        selectyear.selectByVisibleText("1992");

        List<WebElement> gender = driver.findElements(By.className("_8esa"));
        if(!(gender.get(0)).isSelected())/**isSelected() is used To verify whether the check box/radio button selected or not.*/
        {
            System.out.println("Female radio button is not selected");
            gender.get(0).click();
        }
        else
        {
            System.out.println("Female Radio button is already selected");
        }

        WebElement Signup = driver.findElement(By.name("websubmit"));
        if(Signup.isEnabled())
        {
            System.out.println("The Signup button is Enabled");
            Signup.click();

        }
        else
        {
            System.out.println("The signup button is not Enabled");
        }

    }

}

