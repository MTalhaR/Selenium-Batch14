package com.Syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(@class, 'list')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Please')]")).sendKeys("YAMA");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}
