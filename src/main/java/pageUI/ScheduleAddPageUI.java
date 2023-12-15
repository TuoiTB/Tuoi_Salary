package pageUI;

import org.openqa.selenium.devtools.v85.layertree.model.StickyPositionConstraint;

public class ScheduleAddPageUI {
    public static final String NGAY_HOC_TEXTBOX =
            "XPATH=//div[text()='Thêm mới']//parent::div//following-sibling::div//label[text()='Ngày học']//parent::div//following-sibling::div//input";
    public static final String THOI_GIAN_START_TIME_TEXTBOX =
            "XPATH=//div[text()='Thêm mới']//parent::div//following-sibling::div//label[text()='Thời gian']//parent::div//following-sibling::div//input[@placeholder='Start time']";
    public static final String THOI_GIAN_END_TIME_TEXTBOX =
            "XPATH=//div[text()='Thêm mới']//parent::div//following-sibling::div//label[text()='Thời gian']//parent::div//following-sibling::div//input[@placeholder='End time']";
    public static final String DYNAMIC_DROPDOWN_PARENT_BY_TEXT =
            "XPATH=//div[text()='Thêm mới']//parent::div//following-sibling::div//label[text()='%S']//parent::div//following-sibling::div//input";
    public static final String OK_BUTTON = "XPATH=//span[text()='OK']";
    public static final String TRUONG_DROPDOWN_PARENT =
            "XPATH=//div[text()='Thêm mới']//parent::div//following-sibling::div//label[text()='Trường']//parent::div//following-sibling::div//input";
    public static final String DROPDOWN_CHILD = "XPATH=//div[@class='ant-select-item-option-content']";
    public static final String KHOI_DROPDOWN_PARENT =
            "XPATH=//div[text()='Thêm mới']//parent::div//following-sibling::div//label[text()='Khối']//parent::div//following-sibling::div//input";
    public static final String  KHOI_DROPDOWN_CHILD = "XPATH=";
    public static final String LOP_DROPDOWN_PARENT =
            "XPATH=//div[text()='Thêm mới']//parent::div//following-sibling::div//label[text()='Lớp']//parent::div//following-sibling::div//input";
    public static final String LOP_DROPDOWN_CHILD = "XPATH=";
    public static final String GIAO_TRINH_DROPDOWN_PARENT =
            "XPATH=//div[text()='Thêm mới']//parent::div//following-sibling::div//label[text()='Giáo trình']//parent::div//following-sibling::div//input";
    public static final String GIAO_TRINH_DROPDOWN_CHILD = "XPATH=";
    public static final String HOC_PHAN_DROPDOWN_PARENT =
            "XPATH=//div[text()='Thêm mới']//parent::div//following-sibling::div//label[text()='Học phần']//parent::div//following-sibling::div//input";
    public static final String HOC_PHAN_DROPDOWN_CHILD = "XPATH=";
    public static final String BAI_HOC_DROPDOWN_PARENT =
            "XPATH=//div[text()='Thêm mới']//parent::div//following-sibling::div//label[text()='Bài học']//parent::div//following-sibling::div//input";
    public static final String BAI_HOC_DROPDOWN_CHILD = "XPATH=";
    public static final String SAVE_BUTTON="XPATH=//div[text()='Thêm mới']//parent::div//following-sibling::div//span[text()='Lưu']";
    public static final String MESSAGE_SUCCESS = "XPATH=//span[text()='Lưu thông tin thành công']";




}
