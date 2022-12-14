package com.telran.pages;

import com.telran.pages.aletsFrameWindows.AlertsPage;
import com.telran.pages.aletsFrameWindows.FramesPage;
import com.telran.pages.aletsFrameWindows.NestedFramesPage;
import com.telran.pages.aletsFrameWindows.WindowsPage;
import com.telran.pages.bookStore.BookStorePage;
import com.telran.pages.bookStore.LoginPage;
import com.telran.pages.bookStore.ProfilePage;
import com.telran.pages.elements.BrokenLinksImagesPage;
import com.telran.pages.elements.ButtonsPage;
import com.telran.pages.elements.TextBoxPage;
import com.telran.pages.elements.UploadAndDownloadPage;
import com.telran.pages.forms.PracticeFormPage;
import com.telran.pages.interactions.DragAndDropPage;
import com.telran.pages.widgets.MenuPage;
import com.telran.pages.widgets.SelectMenuPage;
import com.telran.pages.widgets.ToolTipsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanelPage extends PageBase {

    public SidePanelPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[.='Login']")
    WebElement login;

    public LoginPage selectLogin() {
        clickWithJSExecutor(login, 0, 500);
        return new LoginPage(driver);
    }

    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;

    public AlertsPage selectAlerts() {
        clickWithJSExecutor(alerts, 0, 300);
        return new AlertsPage(driver);
    }

    @FindBy(xpath = "//span[.='Book Store']")
    WebElement bookStore;

    public BookStorePage selectBookStore() {
        clickWithJSExecutor(bookStore, 0, 500);
        return new BookStorePage(driver);
    }

    @FindBy(css = ".show #item-3")
    WebElement profile;

    public ProfilePage selectProfile() {
        clickWithJSExecutor(profile, 0, 500);
        return new ProfilePage(driver);
    }

    @FindBy(css = ".show #item-0")
    WebElement windows;

    public WindowsPage selectWindows() {
        clickWithJSExecutor(windows, 0, 200);
        return new WindowsPage(driver);
    }

    @FindBy(xpath = "//span[.='Frames']")
    WebElement frames;

    public FramesPage selectFrames() {
        clickWithJSExecutor(frames, 0, 200);
        return new FramesPage(driver);
    }

    @FindBy(xpath = "//span[.='Nested Frames']")
    WebElement nestedFrames;

    public NestedFramesPage selectNestedFrames() {
        clickWithJSExecutor(nestedFrames, 0, 300);
        return new NestedFramesPage(driver);
    }

    @FindBy(xpath = "//span[.='Buttons']")
    WebElement buttons;

    public ButtonsPage selectButtons() {
        clickWithJSExecutor(buttons, 0, 500);
        return new ButtonsPage(driver);
    }

    @FindBy(xpath = "//span[.='Select Menu']")
    WebElement selectMenu;

    public SelectMenuPage getSelectMenu() {
        clickWithJSExecutor(selectMenu, 0, 500);
        return new SelectMenuPage(driver);
    }

    @FindBy(xpath = "//span[.='Droppable']")
    WebElement droppable;

    public DragAndDropPage selectDroppable() {
        clickWithJSExecutor(droppable, 0, 500);
        return new DragAndDropPage(driver);
    }

    @FindBy(xpath = "//span[.='Text Box']")
    WebElement textBox;

    public TextBoxPage selectTextBox() {
        click(textBox);
        return new TextBoxPage(driver);
    }

    @FindBy(xpath = "//span[.='Menu']")
    WebElement menu;

    public MenuPage getMenu() {
        clickWithJSExecutor(menu, 0, 500);
        return new MenuPage(driver);
    }

    @FindBy(xpath = "//span[.='Practice Form']")
    WebElement practiceForm;

    public PracticeFormPage selectPracticeForm() {
        click(practiceForm);
        return new PracticeFormPage(driver);
    }

    @FindBy(xpath = "//span[.='Broken Links - Images']")
    WebElement brokenLinksImages;

    public BrokenLinksImagesPage selectBrokenLinksImages() {
        clickWithJSExecutor(brokenLinksImages, 0, 400);
        return new BrokenLinksImagesPage(driver);
    }

    @FindBy(xpath = "//span[.='Tool Tips']")
    WebElement toolTips;

    public ToolTipsPage selectToolTips() {
        clickWithJSExecutor(toolTips,0,500);
        return new ToolTipsPage(driver);
    }

    @FindBy(xpath = "//span[.='Upload and Download']")
    WebElement uploadAndDownload;

    public UploadAndDownloadPage selectUploadAndDownload() {
        clickWithJSExecutor(uploadAndDownload,0,500);
        return new UploadAndDownloadPage(driver);
    }
}
