package com.Syntax.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SyntaxPractice {
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe"); // Setting system properties of FirefoxDriver

        //WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver

        driver.get("http://syntaxprojects.com/basic-select-dropdown-demo.php");
                //driver.get("http://www.google.com/%22);

                driver.manage().deleteAllCookies();

        driver.manage().window().maximize();

        Thread.sleep(1000);

        Select drpdown = new Select(driver.findElement(By.id("select-demo")));
        drpdown.selectByValue("Sunday");

        drpdown = new Select(driver.findElement(By.id("multi-select")));

        drpdown.selectByValue("New York");

        WebElement button =driver. findElement(By.id("printMe"));

        button.click();

        driver.findElement(By.linkText("Alerts & Modals")).click();

        driver.findElement(By.linkText("Bootstrap Alerts")).click();

        Thread.sleep(1000);

        button = driver.findElement(By.id("autoclosable-btn-success"));

        button.click();

        driver.findElement(By.linkText("Alerts & Modals")).click();

        Thread.sleep(1000);

        driver.findElement(By.linkText("Bootstrap Modals")).click();

        Thread.sleep(1000);

        button = driver.findElement(By.linkText("Launch modal"));

        button.click();

        String temp = driver.getWindowHandle();

        //fe18f8e3-4514-4f81-9817-26442c9fcb1b

        System.out.println(temp);

        Thread.sleep(1000);

        button = driver.findElement(By.linkText("Close"));

        button.click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@href='#myModal']")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@href='#myModal2']")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@id='myModal2']//a[@class='btn btn-primary'][normalize-space()='Save changes']")).click();

        Thread.sleep(1000);
    }
}
