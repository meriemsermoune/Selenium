package com.test.sentrifugo.test;

import com.test.sentrifugo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest extends testBase{

    @Test
    public void validateSuperAdmin(){
        LoginPage loginpage=new LoginPage(driver);
        loginpage.login("EM01","sentrifugo");
        Assert.assertEquals(driver.getTitle(),"Sentrifugo - Open Source HRMS");


    }
    @Test
    public void validateManagement() {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.login("EM02", "sentrifugo");
        Assert.assertEquals(driver.getTitle(), "Sentrifugo - Open Source HRMS");
    }
    @Test
    public void validateManager() {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.login("EM03", "sentrifugo");
        Assert.assertEquals(driver.getTitle(), "Sentrifugo - Open Source HRMS");

    }



    }
