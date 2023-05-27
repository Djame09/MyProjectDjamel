package page;

import base.CommonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonApi {


    public HomePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='Account']")
    WebElement accountbtn;

    @FindBy(xpath = "//*[@data-element-name=\"Sign in\"]")
    WebElement Signinbtn;
    @FindBy(xpath = "//a[@data-element-name='Account']")
    public WebElement dropdown;

    public void clickOnAccoutntBtn(){
        click(accountbtn);
    }

    public void clickOnSigninBtn(){
        click(Signinbtn);
    }

}
