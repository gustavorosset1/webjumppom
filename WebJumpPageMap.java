package map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;


public class WebJumpPageMap extends BasePage {
    public WebJumpPageMap(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "btn_one")
    WebElement btnOne;

    @FindBy(id = "btn_two")
    WebElement btnTwo;

    @FindBy(id = "btn_three")
    WebElement btnThree;

    @FindBy(id = "opt_one")
    WebElement optionOne;

    @FindBy(id = "select_box")
    WebElement getSelectBox;

    @FindBy(id = "first_name")
    WebElement firstName;

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

    @FindBy(id = "btn_one")
    WebElement frameOneClick;



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

    public WebElement userClicksOnOption() {
        return optionOne;
    }

    public WebElement userWriteFirst() {
        return firstName;
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

    public WebElement userClicksOnFrameOne() {
        return frameOneClick;
    }



//    public void clickBtnSignIn() {
//        clickJS(btnSignIn);
    }

