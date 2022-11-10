package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

/***WindowHandles**
        1.goto
        http://accounts.google.com/signup
        2.click on help and privacy btn
        3.click on community Button
        4.goto gmail.com page and enter your user name in form*/
public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://accounts.google.com/signup");
        WebElement helpBtn=driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        WebElement privacyBtn=driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();
        String gmail=driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle: windowHandles) {
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Google Account Help")){
                System.out.println("the current page under focus is :"+title);
                driver.findElement(By.xpath("//a[text()='Community']")).click();
            }
            /*else if (title.equalsIgnoreCase("Create your Google Account")){
                System.out.println("the current page under focus is :"+title);
                driver.findElement(By.id("username")).sendKeys("Talhariaz");
            }*/
        }
        driver.switchTo().window(gmail);
        driver.findElement(By.id("username")).sendKeys("Talhariaz");
    }
}
