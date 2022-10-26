package com.telran.tests.widgets;

import com.telran.pages.HomePage;
import com.telran.pages.SidePanelPage;
import com.telran.pages.widgets.SelectMenuPage;
import com.telran.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectMenuTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        new HomePage(driver).getWidgets();
        new SidePanelPage(driver).getSelectMenu();
    }

    @Test
    public void oldStyleSelectMenuTest() {
        new SelectMenuPage(driver).oldStyleSelectMenu("Black");
    }

    @Test
    public void multiSelectDropDownTest() {
        new SelectMenuPage(driver).multiSelectDropDown("Red").deselect().multiSelectDropDown1(new String[]{"Red", "Blue", "Green"});
    }

    @Test
    public void standardMultiSelectTest() {
        new SelectMenuPage(driver).standardMultiSelect();
    }


}
