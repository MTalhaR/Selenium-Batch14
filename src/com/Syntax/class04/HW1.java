package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Open chrome browser
    Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
    Enter valid username and password (username - Admin, password - Hum@nhrm123)
    Click on login button
    Then verify the message "Welcome Admin " is there on the top right corner*/
public class HW1 {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
            WebDriver driver= new ChromeDriver();
            driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
            driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("Admin");
            driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
            driver.findElement(By.cssSelector("input.button")).click();
            Thread.sleep(2000);
            WebElement welcomeText=driver.findElement(By.cssSelector("a[class*='panel']"));
            String text = welcomeText.getText();
            boolean displayed = welcomeText.isDisplayed();
            System.out.println("Text on right top corner is"+text+" : "+displayed);;
            System.out.println("Text on right top corner is"+welcomeText.getText()+" : "+welcomeText.isDisplayed());;
        }
}
