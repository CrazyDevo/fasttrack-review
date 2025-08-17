package com.cydeo.pages;

import com.cydeo.config.CommonConfig;
import com.cydeo.config.PageEndpoints;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.File;

public class FileDownloadPage extends Page{


    @Override
    public void loadPage() {
        Driver.getDriver().get(CommonConfig.PAGE_URL + PageEndpoints.FILE_DOWNLOAD_PAGE);

    }

    public void downloadFile(String fileName){
        Driver.getDriver().findElement(By.partialLinkText(fileName)).click();
    }

    public void verifyFileDownloaded(String filePath) {

        File file=new File(filePath);
        int counter=1;
        while (!file.exists() && counter<20){
            BrowserUtils.sleep(counter++);
        }

        Assert.assertTrue(file.exists());


        BrowserUtils.sleep(5);
        file.delete();



    }
}
