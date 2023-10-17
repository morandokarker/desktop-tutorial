package demoblaze;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs {
    WebDriver driver;
    HomePage homePage;

    Header header;

    SiteTests siteTests;



    public ContactUs(WebDriver driver) {

    }

    @FindBy (xpath = "//*[@id=\"recipient-email\"]")
    private WebElement contactEmail;

    @FindBy (id = "recipient-name")
    private WebElement contactName;

    @FindBy (id ="message-text" )
    private WebElement message;

    @FindBy (xpath = "//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")
    private WebElement sendMessage;


    @FindBy (xpath = "//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]")
    private WebElement close;


    @Step("Click On Contact Email")
    public void clickOnContactEmail(){
        contactEmail.click();
    }

    @Step("Click On Contact Name")
    public void clickOnContactName(){
        contactName.click();
    }

    @Step("Click On Message")
    public void clickOnMessage(){
        message.click();
    }

    @Step("Click On Send Message")
    public void clickOnSendMessage(){
        sendMessage.click();
    }

    @Step("Click On Close")
    public void clickOnClose(){
        close.click();
    }

    @Step("write Email")
    public void writeEmail(String emailAddress) {
        contactEmail.sendKeys(emailAddress);

    }

    @Step("write Contact Name")
    public void writeContactName(String Name) {
        contactName.sendKeys(Name);

    }
    @Step("write Message")
    public void writeMessage(String Message){
        message.sendKeys(Message);

    }

}
