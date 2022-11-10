package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*1.Goto https://syntaxprojects.com/dynamic-elements-loading.php
2.Click on start button
3. get the text Welcome Syntax technologies and print on console
the text will be Empty
write down  whatever the reason you understand  of text being empty after exploring DOM*/
public class HW3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement StartBtn=driver.findElement(By.xpath("//button[text()='Start']"));
        StartBtn.click();
        WebElement WelcomeText=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text=WelcomeText.getText();
        System.out.println("Text is "+text);
    }
}
