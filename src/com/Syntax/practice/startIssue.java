package com.Syntax.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class startIssue {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            //driver.get("https://www.amazon.com/");
            System.out.println("opening the amazone page through driver");
            driver.manage().window().maximize();
            //driver.navigate().to("https://www.ebay.com/");
            System.out.println("Navigated to evay through driver.navgate.to() ");
            driver.manage().window().maximize();
        }
    }

