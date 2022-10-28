package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create New Account")).click();
        //driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Talha");
        driver.findElement(By.name("lastname")).sendKeys("Riaz");
        driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
        driver.quit();
    }
}
