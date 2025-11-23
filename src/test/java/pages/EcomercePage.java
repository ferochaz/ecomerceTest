package pages;

import core.Driver;
import io.cucumber.java.eo.Se;
import maps.EcomerceMaps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EcomercePage {


    private EcomerceMaps ecomerceMaps;

    public EcomercePage() {

        ecomerceMaps = new EcomerceMaps();
        PageFactory.initElements(Driver.getDriver(),ecomerceMaps);
    }

   public void preencheFormulario(String firstName, String lastName , String company , String street , String number
           , String city, String zip, String phone, String email){


        Select country = new Select(ecomerceMaps.formCountry);
        Select state =   new Select(ecomerceMaps.formState);


       Driver.esperaElemento(ecomerceMaps.checkoutTitle);
       ecomerceMaps.formFirstName.sendKeys(firstName);
       ecomerceMaps.formLastName.sendKeys(lastName);
       ecomerceMaps.formCompany.sendKeys(company);
       country.selectByValue("US");
       ecomerceMaps.formStreet.sendKeys(street);
       ecomerceMaps.formNumber.sendKeys(number);
       ecomerceMaps.formCity.sendKeys(city);
       state.selectByValue("MI");
       ecomerceMaps.formZip.sendKeys(zip);
       ecomerceMaps.formPhone.sendKeys(phone);
       ecomerceMaps.formEmail.sendKeys(email);

    }


    public void clicaBtnAddToCart(){

        ecomerceMaps.btnAddToCart.click();
    }


    public void clicaBtnViewCart(){

        Driver.esperaElemento(ecomerceMaps.btnViewCart);
        ecomerceMaps.btnViewCart.click();
    }



    public void  clicaBtnAddToCartProtonRocket(){

        Driver.esperaElemento(ecomerceMaps.btnAddToCartProtonRocket);
        ecomerceMaps.btnAddToCartProtonRocket.click();
    }


    public void clicaBtnCart(){

        try {
            Thread.sleep(Duration.ofSeconds(5));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ecomerceMaps.btnCart.click();
    }



    public void clicaBtnProceedToCheckout(){

        Driver.esperaElemento(ecomerceMaps.btnProceedToCheckout);
        ecomerceMaps.btnProceedToCheckout.click();
    }

    public void clicaBtnSaturnRocket(){

        Driver.esperaElemento(ecomerceMaps.btnSaturnRocket);
        ecomerceMaps.btnSaturnRocket.click();
    }

    public void clicaBtnFalconHeavy(){

        Driver.esperaElemento(ecomerceMaps.btnFalconHeavy);
        ecomerceMaps.btnFalconHeavy.click();
    }

    public void clicaBtnDeleteSaturn(){

        ecomerceMaps.btnDeleteSaturn.click();
        try {
            Thread.sleep(Duration.ofSeconds(5));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Driver.refresh();



    }

    public void clickBtnPlaceOrder(){

        WebElement btn;
        btn = null;


        try {
            ecomerceMaps.btnPlaceOrder.click();
            Driver.refresh();
        } catch (StaleElementReferenceException e ){

           btn = ecomerceMaps.btnPlaceOrder;
        }
         btn.click();
    }

    public void validaTituloPrincipal(){

        Assert.assertEquals("Shop",ecomerceMaps.mainTitle.getText());
        System.out.println(ecomerceMaps.mainTitle.getText());
    }

    public void validaCheckoutFinished(){

        Driver.esperaElemento(ecomerceMaps.checkoutFinished);
        Assert.assertEquals("Thank you. Your order has been received.",ecomerceMaps.checkoutFinished.getText());
        System.out.println(Driver.getDriver().getTitle());
        System.out.println(ecomerceMaps.checkoutFinished.getText());
    }



}
