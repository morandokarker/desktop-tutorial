package demoblaze;


import io.qameta.allure.Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


import java.util.concurrent.TimeUnit;

public class CartPage {


    WebDriver driver;
    HomePage homePage;

    String okbut="\"/html/body/div[11]/div[7]/div/button\"";

    String getmassege= "Thank you for your purchase!";

    public CartPage(WebDriver driver){

    }





    @FindBy(id = "cartur")
    private WebElement cart;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/tr/td[3]")
    private WebElement price;

    @FindBy(id = "totalp")
    private WebElement totalPrice;

    @FindBy(linkText = "Delete")
    private WebElement delete;
    @FindBy (xpath = "//*[@id=\"page-wrapper\"]/div/div[2]/button")
    private WebElement placeOrderButton;

    @FindBy(id = "name")
    private WebElement nameText;

    @FindBy(id = "country")
    private WebElement countryText;

    @FindBy(id = "city")
    private WebElement cityText;

    @FindBy(id = "card")
    private WebElement creditCardText;

    @FindBy(id = "month")
    private WebElement monthText;

    @FindBy(id = "year")
    private WebElement yearText;

    @FindBy(xpath = "//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
    private WebElement purchaseButton;


    @FindBy(xpath = "//*[@id=\"orderModal\"]/div/div/div[3]/button[1]")
    private WebElement closeButton;


   @FindBy(xpath = "/html/body/div[11]/div[7]/div/button")
    private WebElement okButton;





    @Step("click ok button")
    public void clickOkButton(){
        okButton.click();
    }

    @Step ("Click On Place Order")
    public void clickOnPlaceOrder(){
        placeOrderButton.click();
    }

    @Step ("Write Name")
    public void writeName(String Name){
        nameText.sendKeys(Name);

    }


    @Step ("Write Country")
    public void writeCountry(String Country){
        countryText.sendKeys(Country);
    }

    @Step ("Write City")
    public void writeCity(String City){
        cityText.sendKeys(City);
    }


    @Step ("Write Credit Card Num")
    public void writeCreditCardNum(String CreditCard){
        creditCardText.sendKeys(CreditCard);

    }

    @Step("Write Month")
    public void writeMonth(String Month){
        monthText.sendKeys(Month);
    }

    @Step ("Write Year")
    public void writeYear(String Year){
        yearText.sendKeys(Year);
    }


    @Step ("Click On Purchase Button")
    public void clickOnPurchaseButton(){
        purchaseButton.click();
    }

    @Step("TotalPrice")
    public void total(){
        String totalprice = totalPrice.getText();

    }


    @Step ("Click On Ok Button")
    public void clickOkBut() {
        driver.switchTo().frame("iframeResult");
        WebElement element=
        driver.findElement(By.tagName(okbut));
        element.click();driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
    }




    @Step ("Click Ok")
    public void click(WebDriver driver){
        driver.switchTo().parentFrame();
        okButton.click();

    }

    @Step ("ok")
    public void clickOnOk(String expectedMessage){
       String message= okButton.getText();
        Assert.assertTrue(getmassege.contains(expectedMessage));

    }
       public String getMsg(){
        String msg;
        msg= By.tagName(okbut="Thank you for your purchase!").
                findElement(driver).getText();
        return msg;


    }

public int getTotal(){
        return Integer.parseInt(totalPrice.getText());

}

public HomePage clickok() throws InterruptedException{
    TimeUnit.SECONDS.sleep(1);
    return new HomePage(driver);
}





}
