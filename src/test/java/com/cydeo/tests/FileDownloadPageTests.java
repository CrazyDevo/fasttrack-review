package com.cydeo.tests;

import com.cydeo.config.CommonConfig;
import com.cydeo.pages.FileDownloadPage;
import org.testng.annotations.Test;

public class FileDownloadPageTests {


    @Test
    public void test1() throws InterruptedException {
        FileDownloadPage fileDownloadPage = new FileDownloadPage();
        fileDownloadPage.loadPage();
        String fileName="Day 10 Practice Tasks.pdf";
        fileDownloadPage.downloadFile(fileName); //We need to have 5 seconds to download

        String filePath= CommonConfig.DOWNLOAD_PATH+fileName;
        fileDownloadPage.verifyFileDownloaded(filePath);




    }
}
