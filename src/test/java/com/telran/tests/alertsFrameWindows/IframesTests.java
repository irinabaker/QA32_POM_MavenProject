package com.telran.tests.alertsFrameWindows;

import com.telran.pages.HomePage;
import com.telran.pages.SidePanelPage;
import com.telran.pages.aletsFrameWindows.FramesPage;
import com.telran.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframesTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanelPage(driver).selectFrames();
    }

    @Test
    public void returnListOfIframesTest() {
        new FramesPage(driver).returnListOfIframes();
    }

    @Test
    public void switchToIframeByIndexTest() {
        new FramesPage(driver).switchToIframeByIndex(1);
    }

    @Test
    public void switchToIframeByIdTest() {
        new FramesPage(driver).switchToIframeById();
    }
}
