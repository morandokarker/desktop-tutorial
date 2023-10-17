package demoblaze;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header {

    WebDriver driver;
    HomePage homePage;
    public Header(WebDriver driver) {
    }

    @FindBy (className= "navbar-brand")
    private WebElement logo;

    @FindBy (xpath = "//*[@id=\"navbarExample\"]/ul/li[1]/a")
    private WebElement home;


    @FindBy (linkText = "Contact")
    private WebElement contact;


    @FindBy (linkText = "About us")
    private WebElement aboutUs;


    @FindBy(id = "cartur")
    private WebElement cart;

    @FindBy(id = "login2")
    private WebElement logIn;

    @FindBy(xpath = "//*[@id=\"signin2\"]")
    private WebElement signUp;



    @Step("Click On Home")
    public void clickOnHome(){
        home.click();
    }




    @Step("Click On Contact")
    public void clickOnContact(){
        contact.click();
    }


    @Step("Click On AboutUs")
    public void clickOnAbouteUs(){
        aboutUs.click();
    }

    @Step("Click On Cart")
    public void clickOnCart(){
        cart.click();
    }


    @Step("Click On LogIn")
    public void clickOnLogIn() {
        logIn.click();
    }

        @Step("Click On SignUp")
        public void clickOnSignUp(){
            signUp.click();
        }

    }



