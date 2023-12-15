package Bussiness;

import commons.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import lombok.extern.java.Log;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.*;

@Epic("Bussiness")
@Feature("Schedule")
public class Schedule extends BaseTest {

    public WebDriver driver;
    private String userNameLogin;
    private String passwordLogin;
    private String dateStudy, startTime, endTime, truong, khoi, lop, giaoTrinh, hocPhan, baiHoc;
    @Parameters({"browser","url"})
    @BeforeClass
    public void beforeClass(String browserName, String url) {
        userNameLogin = "admin";
        passwordLogin = "12345";
        driver = getBrowserDriver(browserName, url);
        loginPage = PageGeneratorManager.getLoginPage(driver);
        loginPage.loginToSystem(userNameLogin,passwordLogin);
        userNameLogin = "admin";
        passwordLogin = "12345";
        dateStudy = "7/12/2023";
        startTime = "07:00";
        endTime = "08:00";
        truong = "TiH Phan Chu Trinh";
        khoi = "5";
        lop = "5/9";
        giaoTrinh = "QT70 TIẾT - IC3 SPARK LO";
        hocPhan = "LUYỆN THI";
        baiHoc = "Luyện thi 7";
    }
    @Description("TC_01")
    @Test
    public void Schedule_01_Add_Schedule(){
        log.info("Schedule_01 - Step 01: Open dashboard page");
        dashBoardPage = PageGeneratorManager.getDashBoardPage(driver);

        log.info("Schedule_01 - Step 02: Click Bussiness icon");
        dashBoardPage.clickToBussinessIcon();

        log.info("Schedule_01 - Step 03: Click Schedule link");
        scheduleListPage = dashBoardPage.clickToDynamicLinkInSideBarByText("Thời khóa biểu");

        log.info("Schedule_01 - Step 04: Click icon Thêm mới");
        scheduleAddPage = scheduleListPage.clickToAddButton();

        log.info("Schedule_01 - Step 05: Input to Ngày học textbox");
        scheduleAddPage.inputToDateStudy("value",dateStudy);

        log.info("Schedule_01 - Step 06: Input to Thời gian textbox");
        scheduleAddPage.inputStartTime(startTime);
        scheduleAddPage.inputEndTime(endTime);
        scheduleAddPage.clickOkButton();

        log.info("Schedule_01 - Step 07: Choose Trường dropdown");
        scheduleAddPage.chooseItemAtDropdownByText("Thời gian",truong);

        log.info("Schedule_01 - Step 08: Choose Khối dropdown");
        scheduleAddPage.chooseItemAtDropdownByText("Khối",khoi);

        log.info("Schedule_01 - Step 09: Choose Lớp dropdown");
        scheduleAddPage.chooseItemAtDropdownByText("Lớp",lop);

        log.info("Schedule_01 - Step 10: Choose Giáo trình dropdown");
        scheduleAddPage.chooseItemAtDropdownByText("Giáo trình",giaoTrinh);

        log.info("Schedule_01 - Step 11: Choose Học phần dropdown");
        scheduleAddPage.chooseItemAtDropdownByText("Học phần",hocPhan);

        log.info("Schedule_01 - Step 12: Choose Bài học dropdown");
        scheduleAddPage.chooseItemAtDropdownByText("Bài học",baiHoc);

        log.info("Schedule_01 - Step 13: Click to Lưu button");
        scheduleAddPage.clickToSaveButton();

        log.info("Schedule_01 - Step 14: Verify message success is displayed");
        verifyTrue(scheduleAddPage.isMessageDisplayed());
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        //quitBrowserDriver();
    }

    LoginPageObject loginPage;
    DashBoardPageObject dashBoardPage;
    ScheduleListPageObject scheduleListPage;
    ScheduleAddPageObject scheduleAddPage;

}
