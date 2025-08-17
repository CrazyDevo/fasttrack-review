package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class Page {

    public Page() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    public abstract void loadPage();
}
