package page;

import base.CommonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage extends CommonApi {

    public SigninPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user_name")
            public
    WebElement eamilField;
    @FindBy(id ="user_password" )
            public
    WebElement passwordField;
    @FindBy(id= "submit_btn")
    WebElement loginBtn;

    public void typeOnEmail(){
        type(eamilField,"jamesheadson2@gmail.com");
    }
    public void typePassword(String password){
        type(passwordField,password);
    }
    public void clickOnSign(){
        click(loginBtn);
    }

}
