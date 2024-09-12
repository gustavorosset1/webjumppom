package stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.WebJumpPage;

public class AccessPageStep extends BaseClass {
    private final WebJumpPage wj = new WebJumpPage(driver);


    @Given("User access page")
    public void userAccessPage() {
        logger.info("Accessing search page");

    }

    @And("User waits for cookie consent")
    public void userWaitsCookieConsent(){
        logger.info("User waits for cookie consent");
        clickElement(wj.getBtnOne());
    }

    @When("user clicks on button one")
    public void userClicksOnBtnOne() {
        logger.info("Filling out the form");
        wj.getBtnOne().click();
        clickElement(wj.getBtnOne());


    }

    @When("user clicks on button two")
    public void userClicksOnBtnTwo(){
       clickElement(wj.getBtnTwo());
    }

    @When("user clicks on button three")
    public void userClicksOnBtnThree() {
        clickElement(wj.getBtnThree());
    }

    @When("user clicks on select box")
    public void userClicksOnBox() {
        clickElement(wj.clickSelectBox());
    }

    @When("user clicks on option one")
    public void userClicksOnOption() {
        clickElement(wj.checkBoxOne());
    }

    @When("fill out all the fields")
    public void fillOutFields() {
        sendKeys(wj.fieldFirstName(), "Gustavo");
        sendKeys(wj.userWriteMid(), "Rosset");
        sendKeys(wj.userWriteLast(), "Lopes");
        sendKeys(wj.userWriteAge(), "25");
        sendKeys(wj.userWriteEmail(), "g@rosset.com");
        sendKeys(wj.userWriteJob(), "Programação");
        sendKeys(wj.userWriteGender(), "Masculino");

    }

    @When("user types {string}")
    public void fillOutFieldsxxx(String s) {
        sendKeys(wj.getBtnOne(), s);
    }


    @When("user find text sit")
    public void userFindSit() {
        wj.sit();
    }

    @When("user locate php")
    public void imageDisplayedVerified() {
        elementIsDisplayed(wj.getPhpImage());
    }

    @When("user locate no image")
    public void imageShowing() {
        elementIsDisplayed(wj.getNoImage());
    }


    @When("user switch frame buttons")
    public void userClicksOnFrameOne(){
        switchFrame(wj.getChangeFrame());
        fluentWait(wj.getBtnOne(), 10, 1000, "clickable");
        clickElement(wj.getBtnOne());
        clickElement(wj.getBtnThree());
        clickElement(wj.clickSelectBox());
        clickElement(wj.checkBoxOne());
        unselectFrame(wj.getChangeFrame());
    }

    @When("user switch frame fields")
    public void switchFrameFields() {
        switchFrame(wj.getFrameFields());
        sendKeys(wj.fieldFirstName(), "Gustavo");
        sendKeys(wj.userWriteMid(), "Rosset");
        sendKeys(wj.userWriteLast(), "Lopes");
        sendKeys(wj.userWriteAge(), "25");
        sendKeys(wj.userWriteEmail(), "g@rosset.com");
        sendKeys(wj.userWriteJob(), "Programação");
        sendKeys(wj.userWriteGender(), "Masculino");

    }

}


//    @When("I fill in the login form with the data email {string} and password {string}")
//    public void iFillInTheLoginFormWithTheDataEmailAndPassword(String email, String password) {
//        logger.info("Filling out the form");
//        lp.btnOneClick(email, password);
//    }

