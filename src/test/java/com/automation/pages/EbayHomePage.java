package com.automation.pages;

import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePage extends BasePage {

    @FindBy(id = "com.ebay.mobile:id/identity_app_onboarding_screen_close")
    WebElement initialCloseBtn;

    @FindBy(id = "com.ebay.mobile:id/search_box")
    WebElement searchBox;

    @FindBy(id = "com.ebay.mobile:id/search_landing_container")
    WebElement searchResult;

    @FindBy(id = "com.ebay.mobile:id/search_item_card_header")
    WebElement searchItem;

    @FindBy(id = "com.ebay.mobile:id/search_src_text")
    WebElement searchInput;

    @FindBy(id = "com.ebay.mobile:id/text_slot_1")
    WebElement textInfo;

    public void openApplication() {
        initialCloseBtn.click();
    }

    public void searchWithKeyword(String keyword) {
        searchBox.click();
        waitForElementToBeClickable(searchInput);
        searchInput.sendKeys(keyword);
        searchResult.click();
    }

    public void clickOnFirstLink() {
        textInfo.click();
        searchItem.click();
    }
}
