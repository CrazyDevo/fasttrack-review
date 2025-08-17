package com.cydeo.pages;

import com.cydeo.config.CommonConfig;
import com.cydeo.config.PageEndpoints;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonsPage extends Page {


    public WebElement selectOption(String id) {
        WebElement element = Driver.getDriver().findElement(By.id(id.toLowerCase()));
        element.click();
        return element;

    }

    @Override
    public void loadPage(){
        Driver.getDriver().get(CommonConfig.PAGE_URL + PageEndpoints.RADI_BUTTONS_PAGE);
    }
}
