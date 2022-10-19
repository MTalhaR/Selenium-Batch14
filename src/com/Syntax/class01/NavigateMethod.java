package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        // go to google.com
        driver.get("https://www.google.com/");
        // go to fb.com
        driver.navigate().to("https://www.facebook.com/");
        // introduce some sleep, which is wait
        Thread.sleep(2000);
        // go back to google.com
        driver.navigate().back();
        // wait for 2 sec
        Thread.sleep(2000);
        // go back to fb.com
        driver.navigate().forward();
        // wait for 2 sec
        Thread.sleep(2000);
        // refresh the page
        driver.navigate().refresh();
        // quit
        driver.quit();
    }
}
