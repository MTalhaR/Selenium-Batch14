package com.Syntax.HRM;

import com.Syntax.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Login extends CommonMethods {

        public WebElement userNameField = driver.findElement(By.id("txtUsername"));
        public WebElement passwordField = driver.findElement(By.id("txtPassword"));
        public WebElement loginButton = driver.findElement(By.id("btnLogin"));
        public WebElement LoginSign = driver.findElement(By.xpath(" //div[text()='LOGIN Panel']"));


}
