package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*HRMS Application Negative Login:
    Open chrome browser
    Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
    Enter valid username
    Leave password field empty
    Click on login button
    Verify error message with text “Password cannot be empty” is displayed.
    Hint:
    you can use if else condition for verification of message */
public class HW2 {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
            WebDriver driver= new ChromeDriver();
            driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
            driver.findElement(By.cssSelector("input[name^='txtU']")).sendKeys("Admin");
            driver.findElement(By.cssSelector("input[id$='in']")).click();
            WebElement errorText=driver.findElement(By.cssSelector("span[id*='span']"));
            var text = errorText.getText();
            var displayed = errorText.isDisplayed();
            if (displayed){
                System.out.println(text+" is displayed : "+displayed);
            } else {
                System.out.println(text+" is displayed : "+displayed);
            }


        }
}
