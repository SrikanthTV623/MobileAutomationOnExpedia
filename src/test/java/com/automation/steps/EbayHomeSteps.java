package com.automation.steps;

import com.automation.pages.EbayHomePage;
import io.cucumber.java.en.Given;

public class EbayHomeSteps {

    EbayHomePage homePage = new EbayHomePage();

    @Given("user opens ebay application")
    public void user_opens_ebay_application() {
        homePage.openApplication();
    }

    @Given("search with keyword {string}")
    public void search_with_keyword(String keyword) {
        homePage.searchWithKeyword(keyword);
    }

    @Given("click on the first item")
    public void click_on_the_first_item() {
        homePage.clickOnFirstLink();
    }


}
