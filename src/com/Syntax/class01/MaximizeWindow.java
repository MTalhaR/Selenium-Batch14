package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        // go to google.com
        driver.get("https://www.google.com/");
        // maximize
        driver.manage().window().maximize();
        // fullscreen
        driver.manage().window().fullscreen();
        // quit
        driver.quit();
    }
}