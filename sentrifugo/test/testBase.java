package com.test.sentrifugo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class testBase {
  public   WebDriver driver;

    @BeforeMethod
    public void SetUp(){
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demo.sentrifugo.com/index.php/");

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }
}
