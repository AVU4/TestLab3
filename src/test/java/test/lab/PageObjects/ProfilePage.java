package test.lab.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {

    private WebDriver driver;

    @FindBy(xpath = "//span[@class=\"cm-user-menu-link_cutted-text\"]")
    private WebElement usernameField;

    @FindBy(xpath = "//a[@class=\"cm-user-menu-link js-cm-dropdown-link js-cm-event js-cm-user-menu-link\"]")
    private WebElement linkToCabinet;

    @FindBy(xpath = "//a[@class=\"cm-footer-logout_link js-cm-event js-cm-link-ignore-target\"]")
    private WebElement logout;

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getUsername(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"common_menu\"]/div/div[1]/div[1]/a[2]/span[3]")));
        return usernameField.getText();
    }

    public void entryMenu(){
        linkToCabinet.click();
    }

    public void clickLogout(){
        logout.click();
    }
}
