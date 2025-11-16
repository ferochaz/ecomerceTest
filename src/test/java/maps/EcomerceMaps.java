package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EcomerceMaps {

    @FindBy(xpath = "//*[@id=\"tabContainer\"]/shop-tabs/shop-tab[1]/a")
    public WebElement btnMensOuterwear;

    @FindBy(xpath = "//*[@id=\"tabContainer\"]/shop-tabs/shop-tab[2]/a")
    public WebElement btnLadiesOuterwear;

    @FindBy(xpath = "//*[@id=\"tabContainer\"]/shop-tabs/shop-tab[3]/a")
    public WebElement btnMensTshirt;

    @FindBy(xpath = "//*[@id=\"tabContainer\"]/shop-tabs/shop-tab[4]/a")
    public WebElement btnLadiesTshirt;


    @FindBy(xpath = "/html/body/shop-app//iron-pages/shop-list//ul/li[1]/a")
    public WebElement mensOutewearLink;


    @FindBy(xpath = "/html/body/shop-app//iron-pages/shop-list//ul/li[5]/a")
    public WebElement ladiesOutewearLink;


    @FindBy(xpath = "/html/body/shop-app//iron-pages/shop-list//ul/li[10]/a")
    public WebElement mensTshirtLink;

    @FindBy(xpath = "/html/body/shop-app//iron-pages/shop-list//ul/li[16]/a")
    public WebElement ladiesTshirtLink;


    @FindBy(xpath = "//*[@id=\"sizeSelect\"]")
    public WebElement sizeSelect;


    @FindBy(xpath = "//*[@id=\"quantitySelect\"]")
    public WebElement quantitySelect;


    @FindBy(xpath = "//*[@id=\"content\"]/div/shop-button/button")
    public WebElement btnAddtocart;


    @FindBy(xpath = "//*[@id=\"viewCartAnchor\"]")
    public WebElement btnViewCart;


    @FindBy(xpath = "//*[@id=\"content\"]/div/shop-button/button")
    public WebElement btnCheckout;


    @FindBy(xpath = "//*[@id=\"icon\"]")
    public WebElement btnDelete;

    @FindBy(xpath = "/html/body/shop-app//iron-pages/shop-cart//div/div[2]/div[2]/shop-button/a")
    public WebElement btnCheckoutScreen;


    @FindBy(xpath = "//*[@id=\"accountEmail\"]")
    public WebElement formEmail;

    @FindBy(xpath = "//*[@id=\"accountPhone\"]")
    public WebElement formPhone;

    @FindBy(xpath = "//*[@id=\"shipAddress\"]")
    public WebElement formAddress;


    @FindBy(xpath = "//*[@id=\"shipCity\"]")
    public WebElement formCity;


    @FindBy(xpath = "//*[@id=\"shipState\"]")
    public WebElement formState;


    @FindBy(xpath = "//*[@id=\"shipZip\"]")
    public WebElement formZipCode;


    @FindBy(xpath = "//*[@id=\"shipCountry\"]")
    public WebElement formCountry;

    @FindBy(xpath = "//*[@id=\"ccName\"]")
    public WebElement formCardHolder;

    @FindBy(xpath = "//*[@id=\"ccNumber\"]")
    public WebElement formCardNumber;

    @FindBy(xpath = "//*[@id=\"ccCVV\"]")
    public WebElement formCvv;

    @FindBy(xpath = "//*[@id=\"submitBox\"]/input")
    public WebElement btnformPlaceOrder;


    @FindBy(xpath = "//*[@id=\"pages\"]/header[1]/p")
    public WebElement checkoutMsg;


    @FindBy(xpath = "/html/body/shop-app//iron-pages/shop-cart//div/div[1]/p")
    public WebElement emptyCartMsg;



}
