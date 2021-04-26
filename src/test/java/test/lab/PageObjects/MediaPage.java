package test.lab.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MediaPage {

    private WebDriverWait wait;

    @FindBy(xpath = "//h2[@class=\"b-composite-heading_title\"]")
    private WebElement title;

    @FindBy(xpath = "//a[@class=\"nav-submenu_link\"]")
    private WebElement logo;

    public MediaPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 30);
    }

    public String getTitle(){
        return title.getText();
    }

    public void clickLogo() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"nav-submenu_link\"]")));
        logo.click();
    }
}
