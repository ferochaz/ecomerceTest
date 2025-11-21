package pages;

import core.Driver;
import org.openqa.selenium.WebElement;

public class EcomercePage {


    public  void clicaBotao(WebElement element){

        Driver.esperaElemento(element);
        element.click();
    }

}
