package com.Syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/*goto https://chercher.tech/practice/frames
        1.check the checkBox
        2.Select BabyCat from drop dwon
        3. Send text in text box "DONE"*/
public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame(0);
        driver.switchTo().frame("frame3");
        driver.findElement(By.id("a")).click();
        driver.switchTo().defaultContent();

        WebElement frame=driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(frame);
        WebElement DD=driver.findElement(By.id("animals"));
        Select select=new Select(DD);
        select.selectByValue("babycat");
        driver.switchTo().defaultContent();

        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector("input")).sendKeys("DONE");

    }
}
