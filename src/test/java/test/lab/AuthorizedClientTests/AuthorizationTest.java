package test.lab.AuthorizedClientTests;

import org.junit.jupiter.api.*;
import test.lab.BrowserConfigTest;

public class AuthorizationTest extends BrowserConfigTest {

    @Test
    public void loginTest(){
        mainPage.clickLogin();
        BrowserConfigTest.loginPage.inputLogin("lexa200004@mail.ru");
        BrowserConfigTest.loginPage.inputPassword("AVU0707");
        BrowserConfigTest.loginPage.clickSubmit();
        String user = BrowserConfigTest.profilePage.getUsername();
        Assertions.assertEquals("A_V_U_1", user);
    }

    @AfterAll
    public static void quit(){
        BrowserConfigTest.profilePage.entryMenu();
        BrowserConfigTest.profilePage.clickLogout();
        BrowserConfigTest.driver.quit();
    }
}
