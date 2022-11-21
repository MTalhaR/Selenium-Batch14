package com.Syntax.HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Login {

    //public static void main(String[] args) throws IOException {
public static void login() throws IOException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        String path="HRMData/properties.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fis);
        driver.findElement(By.id("txtUsername")).sendKeys(properties.getProperty("username"));
        driver.findElement(By.id("txtPassword")).sendKeys(properties.getProperty("password"));
        driver.findElement(By.id("btnLogin")).click();
    //}
}
}
