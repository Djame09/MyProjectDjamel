package test;

import base.CommonApi;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.HomePage;
import page.SigninPage;
import properties.GetProperties;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestLogin extends CommonApi {
    Properties prop=GetProperties.loadProperty();
    String titleSigninPage= prop.getProperty("titleSignine");
    String userName= prop.getProperty("username");
    String PassWord= prop.getProperty("password");
    String incorrectPassWord= prop.getProperty("invalidPassword");
    public TestLogin() {
    }

    @Test
    public void loginWithValidCridentiels()  {
        HomePage homePage=new HomePage(driver);
        SigninPage signinPage=new SigninPage(driver);

        homePage.clickOnAccoutntBtn();
        Assert.assertEquals("true", homePage.dropdown.getAttribute("aria-expanded"));
        homePage.clickOnSigninBtn();
        Assert.assertEquals(titleSigninPage,driver .getTitle());
        signinPage.typeOnEmail();
        Assert.assertEquals(userName, signinPage.eamilField.getAttribute("value"));
        signinPage.typePassword(PassWord);
        Assert.assertEquals(PassWord,signinPage.passwordField.getAttribute("value"));
        signinPage.clickOnSign();

        Assert.assertTrue(true);

    }

    @Test
    public void loginWithInvalidCridentiels() {

        HomePage homePage=new HomePage(driver);
        SigninPage signinPage=new SigninPage(driver);
        homePage.clickOnAccoutntBtn();
        Assert.assertEquals("true", homePage.dropdown.getAttribute("aria-expanded"));
        homePage.clickOnSigninBtn();
        Assert.assertEquals(titleSigninPage, driver.getTitle());
        signinPage.typeOnEmail();
        Assert.assertEquals(userName, signinPage.eamilField.getAttribute("value"));
        signinPage.typePassword(incorrectPassWord);
        Assert.assertEquals(incorrectPassWord,signinPage.passwordField.getAttribute("value"));
        signinPage.clickOnSign();
        Assert.assertFalse(true);



    }

}
