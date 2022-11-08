package com.Syntax.ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/*1.Go to facebook
        2.click on create New Account
        3.Fill out the whole form
        4.Take screen shot of filled out form manually and share in HW channel along with code*/
public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Talha");
        driver.findElement(By.name("lastname")).sendKeys("Riaz");
        driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
        WebElement days = driver.findElement(By.cssSelector("select#day"));
        Select selday = new Select(days);
        selday.selectByVisibleText("21");
        WebElement months = driver.findElement(By.cssSelector("select#month"));
        Select selmonth = new Select(months);
        selmonth.selectByIndex(3);
        WebElement years = driver.findElement(By.cssSelector("select#year"));
        Select selyear = new Select(years);
        selyear.selectByValue("1997");
        driver.findElement(By.cssSelector("input[value='2']")).click();

    }
}
