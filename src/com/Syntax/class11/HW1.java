package com.Syntax.class11;

import com.Syntax.utils.CommonMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


/* goto https://demo.guru99.com/test/simple_context_menu.html
       right click  on the button, select edit and handle the alert
       double click on the button and handle the alert */
public class HW1 {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.get("https://demo.guru99.com/test/simple_context_menu.html");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
            Actions action=new Actions(driver);
            action.contextClick(rightClick).perform();
            WebElement Editbtn = driver.findElement(By.xpath("//span[text()='Edit']"));
            action.click(Editbtn).perform();
            Alert alert=driver.switchTo().alert();
            alert.accept();
            WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
            action.doubleClick(doubleClick).perform();
            Alert alert1=driver.switchTo().alert();
            alert.accept();
        }
}

