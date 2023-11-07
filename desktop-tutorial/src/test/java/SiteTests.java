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
           driver.findElement(By.linkText("Phones")).isSelected();

       }


           @Test
           @Description ("click On Laptops In Home Page")
           public void clickLaptops(){
               homePage.clickOnLaptops();
               driver.findElement(By.linkText("Laptops")).isSelected();

        }

        @Test
       @Description("click On Monitors In Home Page")
       public void clickMonitors(){
           homePage.clickOnMonitors();
            driver.findElement(By.linkText("Monitors")).isSelected();
        }


       //4----->

        @Test
        @Description("Click On Home")
        public void clickOnHome(){
           header.clickOnHome();
            driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).isSelected();
        }

        @Test
       @Description("Press On Contact")
       public void openContactTab(){
           header.clickOnContact();
            driver.findElement(By.linkText("Contact")).isSelected();
        }

       @Test
       @Description("Press On About Us")
       public void openAboutUsTab(){
           header.clickOnAbouteUs();
            driver.findElement(By.linkText("About us")).isSelected();

        }


        @Test
       @Description("Press On Cart")
       public void openCartTab(){
           header.clickOnCart();
            driver.findElement(By.linkText("Cart")).isSelected();

        }

        @Test
       @Description("Press On Log In")
       public void openLogInTab(){
           header.clickOnLogIn();
            driver.findElement(By.linkText("Log in")).isSelected();
        }

        @Test
       @Description("Press On Sign Up")
       public void openSignUpTab(){
           header.clickOnSignUp();
            driver.findElement(By.linkText("Sign up")).isSelected();
        }


       //5----->


       @Test
       @Description("Fill Contact Details")
       public void fillContact() {
           header.clickOnContact();
           driver.findElement(By.linkText("Contact")).isSelected();
           contactUs.writeEmail(email);
           contactUs.writeContactName(name);
           contactUs.writeMessage(message);
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
           //cartPage.total();
           cartPage.clickOnPlaceOrder();
           cartPage.writeName(writeName);
           cartPage.writeCountry(writeCountry);
           cartPage.writeCity(writeCity);
           cartPage.writeCreditCardNum(writeCreditCard);
           cartPage.writeMonth(writeMonth);
           cartPage.writeYear(writeYear);
           cartPage.clickOnPurchaseButton();






           }

       }






