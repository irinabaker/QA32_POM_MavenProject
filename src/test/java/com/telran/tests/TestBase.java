package com.telran.tests;

import com.telran.pages.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;

    Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeMethod
    public void init() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod(enabled = true)
    public void tearDawn() {
        driver.quit();
    }

    @BeforeMethod
    public void startTest(Method m, Object[] p) {
        logger.info("Test start " + m.getName());
    }

    @AfterMethod
    public void stopTest(ITestResult result) {
        if (result.isSuccess()) {
            logger.info("PASSED: test method " + result.getMethod().getMethodName());
        } else {
            logger.error("FAILED: Test method " + result.getMethod().getMethodName());
            String screen = "screenshots/screen-" + (System.currentTimeMillis()/1000%3600) + ".png";
            new PageBase(driver).takeScreenshot(screen);
        }
        logger.info("Stop test: " + result.getMethod().getMethodName());
    }
}
