package com.Syntax.class10;

import com.Syntax.HRM.SignupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/*
     Go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login:
     1. Click on the Recruitment tab.
     2. Click on the Date of Application From calendar.
     3. Select any date, month, and year from the calendar.
    */
public class HW {
    public static void main(String[] args) throws IOException {
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
        driver.findElement(By.xpath("//b[text()='Recruitment']")).click();
        driver.findElement(By.id("candidateSearch_fromDate")).click();
        WebElement DD1=driver.findElement(By.className("ui-datepicker-month"));
        Select month=new Select(DD1);
        month.selectByVisibleText("Apr");
        WebElement DD2=driver.findElement(By.className("ui-datepicker-year"));
        Select year=new Select(DD2);
        year.selectByVisibleText("1997");
        List<WebElement> calender=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[1]"));
        for (int i = 0; i < calender.size(); i++) {
            var date=calender.get(i).getText();
            if (date.equals("21")){
                calender.get(i).click();
            }
        }
    }
}
