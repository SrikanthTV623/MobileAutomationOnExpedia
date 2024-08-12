package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayItemDetailsPage extends BasePage{

    @FindBy(id ="com.ebay.mobile:id/imageview_image")
    WebElement itemImage;

    public void verifyZoomFunctionality() {
        itemImage.click();
    }
}
