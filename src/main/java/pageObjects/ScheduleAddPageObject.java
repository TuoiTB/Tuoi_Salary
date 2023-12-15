package pageObjects;

import commons.BasePage;
import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pageUI.ScheduleAddPageUI;
import pageUI.ScheduleListPageUI;

public class ScheduleAddPageObject extends BasePage {
    WebDriver driver;

    public ScheduleAddPageObject(WebDriver driver) {
        this.driver = driver;
    }
    public void clickToAddButton(){
        waitForElementClickable(driver, ScheduleListPageUI.ADD_BUTTON);
        clickToElement(driver, ScheduleListPageUI.ADD_BUTTON);
    }
    public void inputToDateStudy(String attributeName, String attributeValue) {
        waitForElementVisible(driver, ScheduleAddPageUI.NGAY_HOC_TEXTBOX);
        setAttributeInDOM(driver, ScheduleAddPageUI.NGAY_HOC_TEXTBOX,attributeName, attributeValue);
    }
    public void inputStartTime(String time){
        waitForElementVisible(driver, ScheduleAddPageUI.THOI_GIAN_START_TIME_TEXTBOX);
        sendkeyToElement(driver, ScheduleAddPageUI.THOI_GIAN_START_TIME_TEXTBOX, time);
    }
    public void inputEndTime(String time){
        waitForElementVisible(driver, ScheduleAddPageUI.THOI_GIAN_END_TIME_TEXTBOX);
        sendkeyToElement(driver, ScheduleAddPageUI.THOI_GIAN_END_TIME_TEXTBOX, time);
    }
    public void clickOkButton(){
        waitForElementClickable(driver, ScheduleAddPageUI.OK_BUTTON);
        clickToElement(driver, ScheduleAddPageUI.OK_BUTTON);
    }
    public void chooseItemAtDropdownByText(String dropdownText, String expectedText) {
        waitForElementClickable(driver, ScheduleAddPageUI.DYNAMIC_DROPDOWN_PARENT_BY_TEXT, dropdownText);
        selectItemInCustomDropdown(driver, ScheduleAddPageUI.DYNAMIC_DROPDOWN_PARENT_BY_TEXT, ScheduleAddPageUI.DROPDOWN_CHILD, expectedText, dropdownText);
        sleepInSecond(2);
    }
    public void clickToSaveButton(){
        waitForElementClickable(driver, ScheduleAddPageUI.SAVE_BUTTON);
        clickToElement(driver, ScheduleAddPageUI.SAVE_BUTTON);
    }
    public boolean isMessageDisplayed(){
        waitForElementVisible(driver,ScheduleAddPageUI.MESSAGE_SUCCESS);
        return isElementDisplayed(driver,ScheduleAddPageUI.MESSAGE_SUCCESS);
    }

}
