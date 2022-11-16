package com.Syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/* go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled */
public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[text()='Remove']")).click();
        WebElement message=driver.findElement(By.id("message"));
        String text=message.getText();
        if (message.isDisplayed()){
            System.out.println("The text is "+text);
        } else {
            System.out.println("There is no text");
        }
        driver.findElement(By.xpath("//button[text()='Enable']")).click();
        WebElement textBox=driver.findElement(By.xpath("//input[@type='text']"));
        //WebDriverWait wait=new WebDriverWait(driver,20);
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));
        WebElement message2=driver.findElement(By.xpath("//p[@id='message']"));
        textBox.sendKeys("It's Enabled");
        System.out.println("The text box is enabled: "+textBox.isEnabled());
        System.out.println("The text after enabling: "+message2.getText());
        driver.findElement(By.xpath("//button[text()='Disable']")).click();
        WebElement message3=driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println("The text after disabling: "+message3.getText());
        System.out.println("The text box is enabled: "+textBox.isEnabled());
    }
}
