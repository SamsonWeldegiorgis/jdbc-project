package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy (id = "inputEmail" )
    public WebElement emailInput;

    @FindBy (id = "inputPassword" )
    public WebElement passwordInput;


    @FindBy (xpath = "//button" )
    public WebElement signBtn;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
