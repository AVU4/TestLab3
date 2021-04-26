package test.lab.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{


    @FindBy(xpath = "//input[@name=\"login\"]")
    private WebElement loginField;

    @FindBy(xpath = "//input[@name=\"password\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@class=\"button-airy  button-airy__enter js-auth-throbbing-element\"]")
    private WebElement submit;


    public LoginPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSubmit() {
        submit.click();
    }
}
