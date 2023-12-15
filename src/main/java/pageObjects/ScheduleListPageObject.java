package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUI.LoginPageUI;
import pageUI.ScheduleListPageUI;

public class ScheduleListPageObject extends BasePage {
    WebDriver driver;

    public ScheduleListPageObject(WebDriver driver) {
        this.driver = driver;
    }
    public ScheduleAddPageObject clickToAddButton(){
        waitForElementClickable(driver, ScheduleListPageUI.ADD_BUTTON);
        clickToElement(driver, ScheduleListPageUI.ADD_BUTTON);
        return PageGeneratorManager.getScheduleAddPage(driver);
    }

}
