package com.Syntax.ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*1.Go to ebay.com
        2.get all the categories and print them in the console (in search bar you will see cate gories mentioned as dropdown)
        3.select Computers/Tables & Networking
        4.click on search
        5.verify the title*/
public class HW2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        WebElement DD=driver.findElement(By.cssSelector("select[size='1']"));
        Select select=new Select(DD);
        select.selectByVisibleText("Computers/Tablets & Networking");
        driver.findElement(By.cssSelector("input[value='Search']")).click();
        String title=driver.getTitle();
        System.out.println(title);
    }
}
