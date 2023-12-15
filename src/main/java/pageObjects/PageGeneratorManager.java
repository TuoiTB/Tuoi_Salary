package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
    public static LoginPageObject getLoginPage(WebDriver driver){
        return new LoginPageObject(driver);
    }
    public static DashBoardPageObject getDashBoardPage(WebDriver driver){
        return new DashBoardPageObject(driver);
    }
    public static ScheduleListPageObject getScheduleListPage(WebDriver driver){
        return new ScheduleListPageObject(driver);
    }
    public static ScheduleAddPageObject getScheduleAddPage(WebDriver driver){
        return new ScheduleAddPageObject(driver);
    }

}
