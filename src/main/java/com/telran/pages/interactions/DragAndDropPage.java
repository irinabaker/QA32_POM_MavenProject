package com.telran.pages.interactions;

import com.telran.pages.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends PageBase {

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "draggable")
    WebElement dragMe;

    @FindBy(id = "droppable")
    WebElement dropHere;

    public DragAndDropPage actionDragMe() {

        Actions actions = new Actions(driver);
        pause(2000);
        actions.dragAndDrop(dragMe, dropHere).build().perform();
        String textTo = dropHere.getText();
        if (textTo.equals("Dropped!")) {
            System.out.println("PASS: Source is dropped to target as expected");
        } else {
            System.out.println("FAIL: Source couldn't be dropped to target as expected");
        }
        return this;
    }

    public DragAndDropPage dragAndDropBy() {
        hideAd();
        Actions actions = new Actions(driver);

        int xOffSet = dragMe.getLocation().getX();
        int yOffSet = dragMe.getLocation().getY();
        System.out.println("xOffSet-->" + xOffSet + " yOffSet-->" + yOffSet);

        int xOffSet1 = dropHere.getLocation().getX();
        int yOffSet1 = dropHere.getLocation().getY();
        System.out.println("xOffSet1-->" + xOffSet1 + " yOffSet1-->" + yOffSet1);

        xOffSet1 = (xOffSet1 - xOffSet) + 20;
        yOffSet1 = (yOffSet1 - yOffSet) + 30;

        pause(1000);

        actions.dragAndDropBy(dragMe,xOffSet1,yOffSet1).perform();
        String textTo = dropHere.getText();
        if (textTo.equals("Dropped!")) {
            System.out.println("PASS: Source is dropped to target as expected");
        } else {
            System.out.println("FAIL: Source couldn't be dropped to target as expected");
        }

        return this;
    }

    public DragAndDropPage dragAndDropByIndex(int x, int y) {
        hideAd();
        Actions actions = new Actions(driver);
        pause(1000);
        actions.dragAndDropBy(dragMe, x, y).perform();

        return this;
    }
}
