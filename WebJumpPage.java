package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class WebJumpPage extends BasePage {
    public WebJumpPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "btn_one")
    WebElement btnOne;

    @FindBy(id = "btn_two")
    WebElement btnTwo;

    @FindBy(id = "btn_three")
    WebElement btnThree;

    @FindBy(id = "opt_one")
    WebElement checkBoxOne;

    @FindBy(id = "select_box")
    WebElement getSelectBox;

    @FindBy(id = "first_name")
    WebElement firstName1;

    @FindBy(id = "mid_name")
    WebElement midName;

    @FindBy(id = "last_name")
    WebElement lastName;

    @FindBy(id = "age")
    WebElement age;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "job")
    WebElement job;

    @FindBy(id = "gender")
    WebElement gender;

    @FindBy(className = "well")
    WebElement sit;

    @FindBy(css = "#iframe_panel_body > iframe")
    WebElement changeFrame;

    @FindBy(css = "#iframe_panel_body_two > iframe")
    WebElement frameFieldsButtons;

    @FindBy(css = "#panel_body_three > img:nth-child(1)")
    WebElement phpImage;

    @FindBy(css = "#col_title > div > img")
    WebElement noImageShowing;




    public WebElement getChangeFrame() {
        return changeFrame;
    }

    public WebElement getFrameFields() {
        return frameFieldsButtons;
    }

    public WebElement getBtnOne() {
        return btnOne;
    }

    public WebElement getBtnTwo() {
        return btnTwo;
    }

    public WebElement getBtnThree() {
        return btnThree;
    }

    public WebElement clickSelectBox() {
        return getSelectBox;
    }

    public WebElement checkBoxOne() {
        return checkBoxOne;
    }

    public WebElement fieldFirstName() {
        return firstName1;
    }

    public WebElement userWriteMid() {
        return midName;
    }

    public WebElement userWriteLast() {
        return lastName;
    }

    public WebElement userWriteAge() {
        return age;
    }

    public WebElement userWriteEmail() {
        return email;
    }

    public WebElement userWriteJob() {
        return job;
    }

    public WebElement userWriteGender() {
        return gender;
    }

    public WebElement userFindSit() {
        return sit;
    }

    public WebElement getPhpImage() {
        return phpImage;
    }

    public WebElement getNoImage() {
        return noImageShowing;
    }



    public void sit() {
        WebElement sitElement = userFindSit();
        sitElement.click();
        ExpectedConditions.textToBePresentInElement(sitElement, "sit");

    }



}
