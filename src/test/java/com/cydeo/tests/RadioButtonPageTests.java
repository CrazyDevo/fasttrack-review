package com.cydeo.tests;

import com.cydeo.pages.RadioButtonsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonPageTests {
    RadioButtonsPage rbp;

    @BeforeMethod
    public void setUp() {
         rbp = new RadioButtonsPage();
        rbp.loadPage();
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

    @Test
    public void test1() {

        WebElement webElement = rbp.selectOption("Red");
        BrowserUtils.sleep(4);
        Assert.assertTrue(webElement.isSelected());

    }

    @Test
    public void test2() {

        WebElement webElement = rbp.selectOption("Blue");
        BrowserUtils.sleep(4);
        Assert.assertTrue(webElement.isSelected());

    }
}
