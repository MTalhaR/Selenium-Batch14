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
        //driver.findElement(By.xpath("//a[@role='button']")).click();
        //driver.findElement(By.cssSelector("a[role='button']")).click();
        //driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Talha");;
        //driver.findElement(By.xpath("//*[@id=\"u_w_b_b0\"]")).sendKeys("Talha");

        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Talha");


        driver.findElement(By.name("lastname")).sendKeys("Riaz");
        driver.findElement(By.name("reg_email__")).sendKeys("talhariazmtrb@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("0123456789");
        driver.findElement(By.id("day")).sendKeys("21");
        driver.findElement(By.id("month")).sendKeys("Apr");
        driver.findElement(By.id("year")).sendKeys("1997");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
        driver.quit();
    }
}
