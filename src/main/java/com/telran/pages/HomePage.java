package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[.='Book Store Application']")
    WebElement bookStoreApp;

    public SidePanelPage getBookStoreApplication() {
        clickWithJSExecutor(bookStoreApp,0,300);
        return new SidePanelPage(driver);
    }
}
