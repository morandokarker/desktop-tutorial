package demoblaze;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class HomePage extends SiteTests {
  public HomePage(WebDriver driver){

    }



    @FindBy(id = "cat")
    private WebElement categories;

    @FindBy (linkText = "Phones")
    private WebElement phones;

    @FindBy (linkText = "Laptops")
    private WebElement laptops;

    @FindBy (linkText = "Monitors")
    private WebElement monitors;

    @FindBy (css = "img[alt='First slide']")
    private WebElement firstSlide;

    @FindBy (css = "img[alt='Second slide']")
    private WebElement secondSlide;

    @FindBy (css = "img[alt='Third slide']")
    private WebElement thirdSlide;


    @FindBy (xpath = "//*[@id=\"carouselExampleIndicators\"]/a[2]")
    private WebElement rightArrow;


    @FindBy (xpath = "//*[@id=\"carouselExampleIndicators\"]/a[1]")
    private WebElement leftArrow;

    @FindBy (id = "next2")
    private WebElement nextPageButton;

    @FindBy (linkText = "Samsung galaxy s6")
    private WebElement samsungGalaxyS6;

    @FindBy (linkText = "Sony vaio i5")
    private WebElement sonyVaioI5;

    @FindBy (linkText = "ASUS Full HD")
    private WebElement asusFullHd;






   @Step ("Click On Categories")
   public void clickOnCategories(){
       categories.click();
    }


    @Step ("Click On Phones")
    public void clickOnPhones(){
        phones.click();

    }

    @Step ("Click On Laptops")
    public void clickOnLaptops(){
        laptops.click();
    }

    @Step ("Click On Monitors")
    public void clickOnMonitors(){
        monitors.click();
    }




    @Step ("Click On Button Next")
    public void clickOnButtonNext(){
       nextPageButton.click();
    }

    @Step ("Click On Right Arrow")
    public void clickOnRightArrow(){
        rightArrow.click();
    }


    @Step ("Click On Left Arrow")
    public void clickOnLeftArrow(){
        leftArrow.click();
    }

    @Step ("Is First Slide Displayed?")
    public boolean isFirstSlideDisplayed() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
        return firstSlide.isDisplayed();

    }

    @Step ("Is Second Slide Displayed?")
    public boolean isSecondSlideDisplayed() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
        return secondSlide.isDisplayed();

    }

    @Step ("Is Third Slide Displayed?")
    public boolean isThirdSlideDisplayed() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
        return thirdSlide.isDisplayed();

    }


    @Step ("Click On Samsung Galaxy S6")
    public void clickOnSamsungGalaxyS6(){
       samsungGalaxyS6.click();

    }

    @Step ("Click On Sony vaio i5")
    public void clickOnSonyVaioi5(){
        sonyVaioI5.click();

    }

    @Step ("Click On ASUS Full HD")
    public void clickOnASUSFullHD(){
        asusFullHd.click();

    }

    @Step ("Is Samsung Galaxy S6 Appears On Page?")
    public boolean isSamsungGalaxyS6Appears(){
        return samsungGalaxyS6.isDisplayed();
    }



    
    }

