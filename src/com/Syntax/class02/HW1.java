package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.id("customer.firstName")).sendKeys("Muhammad Talha");
        driver.findElement(By.id("customer.lastName")).sendKeys("Riaz");
        driver.findElement(By.id("customer.address.street")).sendKeys("H#D-59");
        driver.findElement(By.id("customer.address.city")).sendKeys("Wah Cantt");
        driver.findElement(By.id("customer.address.state")).sendKeys("Pakistan");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("47040");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("03440548100");
        driver.findElement(By.id("customer.ssn")).sendKeys("000000");
        driver.findElement(By.id("customer.username")).sendKeys("TalhaRiaz");
        driver.findElement(By.id("customer.password")).sendKeys("78952");
        driver.findElement(By.id("repeatedPassword")).sendKeys("78952");
        //driver.findElement(By.xpath("//input[@type='submit']")).click();
        //driver.findElement(By.cssSelector("input[type='submit']")).click();
        driver.findElement(By.className("button")).click();

    }
}
