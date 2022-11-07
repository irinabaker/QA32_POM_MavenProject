package com.telran.pages.widgets;

import com.telran.pages.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToolTipsPage extends PageBase {

    public ToolTipsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "toolTipButton")
    WebElement toolTipButton;

    @FindBy(css = ".tooltip-inner")
    WebElement buttonToolTip;

    public ToolTipsPage hoverToolTipWithAttribute() {
        pause(500);
        click(toolTipButton);

        String actualToolTip = buttonToolTip.getText();
       // System.out.println("Retrieved tooltip as: " + actualToolTip);
        String expectedToolTip = "You hovered over the Button";
        if (actualToolTip.equals(expectedToolTip)) {
            System.out.println("PASS: Text is matching the expected tool tip");
        } else {
            System.out.println("FAIL: Text is NOT matching the expected tool tip");
        }
        return this;
    }
}
