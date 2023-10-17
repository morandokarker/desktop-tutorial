package demoblaze;

import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart {

    WebDriver driver;
    HomePage homePage;
    Header header;
    ContactUs contactUs;


    public AddToCart(WebDriver driver) {

    }


    @FindBy(linkText = "Samsung galaxy s6")
    private WebElement samsungGalaxyS6;

    @FindBy(linkText = "Sony vaio i5")
    private WebElement sonyVaioI5;
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a")
    private WebElement addToCartButton;

    @Step("Click On Samsung Galaxy S6")
    public void clickOnSamsungGalaxyS6() {
        samsungGalaxyS6.click();
    }

    @Step("Click On Sony vaio i5")
    public void clickOnSonyVaI5() {
        sonyVaioI5.click();
    }

    @Step("Click On Add To Cart Button")
    public void clickOnAddToCardButton() {
        addToCartButton.click();

    }

    @Step("popup")
    public String alert(WebDriver driver) {
        driver.switchTo().alert().accept();
        return alert(driver);

    }

    @Step("Click Popup")
    public String clickPopup(WebDriver driver) {
        driver.switchTo().alert().accept();
        return clickPopup(driver);
    }



    @Step("Click On Popup")
    public void clickOnPpup() {
        Alert click = driver.switchTo().alert();
        click.accept();


    }
}




