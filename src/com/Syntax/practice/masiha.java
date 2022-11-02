package com.Syntax.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class masiha {
    public static void main(String[] args) throws InterruptedException {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//        goto syntaxProject.com radio button
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/log%22");
                Thread.sleep(200);
        WebElement input= driver.findElement(By.cssSelector("input[name='txtUsername']"));

        input.sendKeys("Admin");
        WebElement password =    driver.findElement(By.cssSelector("input#txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement login=  driver.findElement(By.cssSelector("input[id='btnLogin']"));

        login.click();
        WebElement message=driver.findElement(By.xpath("//a[text()='Welcome Admin']"));

        // boolean displayStatus = text.isDisplayed();
//        print the display status
        Thread.sleep(200);
        System.out.println(message.getText()+" is there on the top right corner : "+message.isDisplayed());
    }
}
