package com.ait.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindElementsTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://icarro-v1.netlify.app/search?page=0&size=10");
        driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(900,400));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    }
    @Test
    public void findElementByTagNameTest(){
        //by tagName h1
        WebElement title = driver.findElement(By.tagName("h1"));
        System.out.println(title.getText());
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }

}
