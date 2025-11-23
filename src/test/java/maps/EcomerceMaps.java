package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class EcomerceMaps {

   @FindBy(xpath = "//*[@id=\"main\"]/header/h1")
    public WebElement mainTitle;

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[1]/a[2]")
    public WebElement btnAddToCart;

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[1]/a[3]")
    public WebElement btnViewCart;

    @FindBy(xpath = "//*[@id=\"post-6\"]/div/div/div[2]/div/div/a")
    public WebElement btnProceedToCheckout;

    @FindBy(xpath = "//*[@id=\"post-7\"]/header/h1")
    public WebElement checkoutTitle;


    @FindBy(id = "billing_first_name")
    public WebElement formFirstName;

    @FindBy(id ="billing_last_name" )
    public WebElement formLastName;

    @FindBy(id ="billing_company")
    public WebElement formCompany;

    @FindBy(id = "billing_country")
    public WebElement formCountry;

    @FindBy(id ="billing_address_1" )
    public WebElement formStreet;


    @FindBy(id = "billing_address_2")
    public WebElement formNumber;

    @FindBy(id = "billing_city")
    public WebElement formCity;

    @FindBy(id= "billing_state")
    public WebElement formState;

    @FindBy(id = "billing_postcode")
    public WebElement formZip;

    @FindBy(id = "billing_phone")
    public WebElement formPhone;

     @FindBy(id ="billing_email")
    public WebElement formEmail;

     @FindBy(id = "place_order")
    public WebElement btnPlaceOrder;

    @FindBy(xpath = "//*[@id=\"post-7\"]/div/div/div/p")
    public WebElement checkoutFinished;


    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[2]/a[2]")
    public WebElement btnAddToCartProtonRocket;

   @FindBy(xpath = "//*[@id=\"site-header-cart\"]/li[1]/a")
    public WebElement btnCart;

   @FindBy(xpath = "//*[@id=\"main\"]/ul/li[4]/a[2]")
    public WebElement btnSaturnRocket;

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[5]/a[2]")
    public WebElement btnFalconHeavy;

    @FindBy(xpath = "//*[@id=\"post-6\"]/div/div/form/table/tbody/tr[3]/td[1]/a")
    public WebElement btnDeleteSaturn;


}
