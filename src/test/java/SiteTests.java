package demoblaze;


import com.google.common.util.concurrent.Uninterruptibles;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


import javax.xml.bind.annotation.XmlType;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

   @TestInstance(TestInstance.Lifecycle.PER_CLASS) public class SiteTests {
       WebDriver driver;
       HomePage homePage;

       Header header;

       CartPage cartPage;

       ContactUs contactUs;
       AddToCart addToCart;


       String email= "morang123@walla.com";

       String name= "moran dukarker";


       String message= "please send me refund";


       String alert;

       String writeName= "idan choen";

       String writeCountry= "Israel";

       String writeCity="Ashdod";

       String writeCreditCard= "4580097654896547";

       String writeMonth="12";

       String writeYear="2027";

       String ok="\"/html/body/div[11]/div[7]/div/button\"";

       String clickPhonesOk= "Phones";

       String string= "string";

       String result= "result";

        String alertTxt;

        String expectedtotalPrice="1150";









       @BeforeAll
       public void Browseropen() {
           System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");
           driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.demoblaze.com");
           driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
           homePage = PageFactory.initElements(driver, HomePage.class);
           header= PageFactory.initElements(driver, Header.class);
           cartPage=PageFactory.initElements(driver,CartPage.class);
           contactUs=PageFactory.initElements(driver, ContactUs.class);
           addToCart=PageFactory.initElements(driver, AddToCart.class);







       }


       @AfterAll
       public void closeBrowser() throws Exception {
           Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
           driver.quit();
       }






       //3----->


       @Test
       @Description("click On Phones In Home Page")
       public void clickPhones() {
           homePage.clickOnPhones();
         Assert.assertTrue(homePage.isPhonesSelected());
       }


           @Test
           @Description ("click On Laptops In Home Page")
           public void clickLaptops(){
               homePage.clickOnLaptops();
               Assert.assertTrue(homePage.isLaptopsSelected());
        }

        @Test
       @Description("click On Monitors In Home Page")
       public void clickMonitors(){
           homePage.clickOnMonitors();
            Assert.assertTrue(homePage.isMonitorsSelected());
        }


       //4----->

        @Test
        @Description("Click On Home")
        public void clickOnHome(){
           header.clickOnHome();
           Assert.assertTrue(header.isHomeSelected());

        }

        @Test
       @Description("Press On Contact")
       public void openContactTab(){
           header.clickOnContact();
            Assert.assertTrue(header.isContactSelected());
           
        }

       @Test
       @Description("Press On About Us")
       public void openAboutUsTab(){
           header.clickOnAbouteUs();
           Assert.assertTrue(header.isAboutUsSelected());

        }


        @Test
       @Description("Press On Cart")
       public void openCartTab(){
           header.clickOnCart();
            Assert.assertTrue(header.isCartSelected());

        }

        @Test
       @Description("Press On Log In")
       public void openLogInTab(){
           header.clickOnLogIn();
           Assert.assertTrue(header.isLogInSelected());
        }

        @Test
       @Description("Press On Sign Up")
       public void openSignUpTab(){
           header.clickOnSignUp();
           Assert.assertTrue(header.isSingUpSelected());
        }


       //5----->


       @Test
       @Description("Fill Contact Details")
       public void fillContact() {
           header.clickOnContact();
           Assert.assertTrue(header.isContactSelected());
           contactUs.writeEmail(email);
           Assert.assertEquals(email+"","morang123@walla.com");
           contactUs.writeContactName(name);
           Assert.assertEquals(name+"","moran dukarker");
           contactUs.writeMessage(message);
           Assert.assertEquals(message+"","please send me refund");
           contactUs.clickOnSendMessage();

       }

           //6----->
           @Test
       @Description("Add To Cart And Purchase")
       public void addToCardAndPurchase(){
           addToCart.clickOnSamsungGalaxyS6();
           addToCart.clickOnAddToCardButton();
           header.clickOnHome();
           addToCart.clickOnSonyVaI5();
           addToCart.clickOnAddToCardButton();
           header.clickOnCart();

             String alertText = addToCart.getTextFromAlert(driver);
              Assert.assertEquals(alertText, "Product added");

               cartPage.getTotalPrice();

               String totalPrice= cartPage.getTotalPrice();
                //  Assert.assertEquals(totalPrice ,expectedtotalPrice);

               cartPage.clickOnPlaceOrder();
           cartPage.writeName(writeName);
           Assert.assertEquals(writeName+"","idan choen");
           cartPage.writeCountry(writeCountry);
           Assert.assertEquals(writeCountry+"","Israel");
           cartPage.writeCity(writeCity);
           Assert.assertEquals(writeCity+"","Ashdod");
           cartPage.writeCreditCardNum(writeCreditCard);
           Assert.assertEquals(writeCreditCard+"","4580097654896547");
           cartPage.writeMonth(writeMonth);
           Assert.assertEquals(writeMonth+"","12");
           cartPage.writeYear(writeYear);
           Assert.assertEquals(writeYear+"","2027");
           cartPage.clickOnPurchaseButton();






           }

       }






