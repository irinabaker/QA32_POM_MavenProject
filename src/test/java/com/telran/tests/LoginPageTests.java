package com.telran.tests;

import com.telran.pages.HomePage;
import com.telran.pages.LoginPage;
import com.telran.pages.ProfilePage;
import com.telran.pages.SidePanelPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        new HomePage(driver).getBookStoreApplication();
        new SidePanelPage(driver).selectLogin();
    }

    @Test
    public void loginPositiveTest() {
        new LoginPage(driver).login("neuer","Neuer1234!");
        new ProfilePage(driver).verifyUserName("neuer").logout();
    }
}
