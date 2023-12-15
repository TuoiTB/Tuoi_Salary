package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUI.DashBoardPageUI;
import pageUI.LoginPageUI;

public class DashBoardPageObject extends BasePage {
    WebDriver driver;

    public DashBoardPageObject(WebDriver driver) {
        this.driver = driver;
    }
    public void clickToBussinessIcon(){
        waitForElementClickable(driver, DashBoardPageUI.BUSSINESS_ICON);
        clickToElement(driver, DashBoardPageUI.BUSSINESS_ICON);
    }

    public ScheduleListPageObject clickToDynamicLinkInSideBarByText(String textName){
        waitForElementClickable(driver, DashBoardPageUI.DYNAMIC_MENU_LINK, textName);
        clickToElementByJS(driver, DashBoardPageUI.DYNAMIC_MENU_LINK, textName);
        return PageGeneratorManager.getScheduleListPage(driver);
    }

}
