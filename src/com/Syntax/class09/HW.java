package com.Syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
    got to the url, click on PIM, click on Employee List
    from the table choose one id (it must be from the first page)
    and check the checkBox for that id   (your logic should be dynamic  , should work for any ID number)
    the user name is 'admin'
    the password is 'Hum@nhrm123' */
public class HW {
    public static void main(String[] args) throws IOException {
        String path="HRMData/properties.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fis);
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("txtUsername")).sendKeys(properties.getProperty("username"));
        driver.findElement(By.id("txtPassword")).sendKeys(properties.getProperty("password"));
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.xpath("//b[text()='PIM']")).click();
        driver.findElement(By.xpath("//a[text()='Employee List']")).click();
        List<WebElement> columnItems=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for (int i=0; i<columnItems.size(); i++) {
            var IDText=columnItems.get(i);
        if (IDText.equals("44869A")){
            WebElement checkBox =driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]"));
            checkBox.click();
            }
        }
    }
}
