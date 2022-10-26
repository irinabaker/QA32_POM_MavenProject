package com.telran.pages.widgets;

import com.telran.pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectMenuPage extends PageBase {

    public SelectMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "oldSelectMenu")
    WebElement oldSelectMenu;

    public SelectMenuPage oldStyleSelectMenu(String text) {
        Select select = new Select(oldSelectMenu);
        select.selectByVisibleText(text);
        List<WebElement> options = select.getOptions();
        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println("*************************************");
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
        }
        return this;
    }

    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[3]")
    WebElement multiSelectDropDown;

    @FindBy(css = ".row")
    WebElement space;

    public SelectMenuPage multiSelectDropDown(String text) {
        clickWithJSExecutor(multiSelectDropDown,0,300);
        WebElement element = driver.findElement(By.xpath(String.format("//div[text()='%s']", text)));
        //int - %d
        click(element);
        pause(2000);
        click(space);
        return this;
    }

    @FindBy(css = ".css-xb97g8")
    WebElement des;

    public SelectMenuPage deselect() {
        click(des);
        return this;
    }

    @FindBy(id = "react-select-4-input")
    WebElement inputSelect;

    public SelectMenuPage multiSelectDropDown1(String[] text) {
        for (int i = 0; i < text.length; i++) {
            if (text[i] != null) {
                inputSelect.sendKeys(text[i]);
                inputSelect.sendKeys(Keys.ENTER);
            }
            click(space);
        }
        return this;
    }

    @FindBy(id = "cars")
    WebElement cars;

    public SelectMenuPage standardMultiSelect() {
        Select multi = new Select(cars);
        if (multi.isMultiple()) {
            multi.selectByIndex(1);
            multi.selectByIndex(2);
            multi.selectByIndex(3);
        }
        List<WebElement> selectedOptions = multi.getAllSelectedOptions();
        for (WebElement element: selectedOptions) {
            System.out.println(element.getText() + "<---- Multi");
        }
        return this;
    }
}
