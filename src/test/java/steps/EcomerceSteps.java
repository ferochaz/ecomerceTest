package steps;

import core.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import maps.EcomerceMaps;
import pages.EcomercePage;

import java.util.Map;

public class EcomerceSteps {

    private EcomercePage ecomercePage;



    @Before
    public void inicializaTeste(){
        Driver.inicializaNavegador();
    }


    @Dado("que a pagina principal esteja sendo exibida")
    public void queAPaginaPrincipalEstejaSendoExibida() {


        Driver.getDriver().get("https://demos.bellatrix.solutions/");
        ecomercePage = new EcomercePage();
        ecomercePage.validaTituloPrincipal();
    }
    @Quando("for feito um clique no botao add to cart do falcon nove")
    public void forFeitoUmCliqueNoBotaoAddToCart() {

        ecomercePage.clicaBtnAddToCart();
    }
    @Quando("for feito um clique no botao view cart do falcon nove")
    public void forFeitoUmCliqueNoBotaoViewCart() {
        ecomercePage.clicaBtnViewCart();
    }
    @Quando("for feito um clique no botao proceed to checkout")
    public void forFeitoUmCliqueNoBotaoProceedToCheckout() {
        ecomercePage.clicaBtnProceedToCheckout();
    }
    @Quando("os dados do formulario forem preenchidos")
    public void osDadosDoFormularioForemPreenchidosDaSeguinteForma() {

        ecomercePage.preencheFormulario("jonh","williams","automation","rua teste","123","City1","49633","1199887766","teste@teste.com");
    }
    @Quando("for feito um clique no botao place order")
    public void forFeitoUmCliqueNoBotaoPlaceOrder() {

        ecomercePage.clickBtnPlaceOrder();
    }
    @Entao("valide se a mensagem order received esta sendo exibida")
    public void valideSeAMensagemOrderReceivedEstaSendoExibida() {

        ecomercePage.validaCheckoutFinished();
    }

    @Quando("for feito um clique no botao add to cart do proton rocket")
    public void forFeitoUmCliqueNoBotaoAddToCartDoProtonRocket() {

      ecomercePage.clicaBtnAddToCartProtonRocket();
    }


    @E("for feito um clique no link do cart")
    public void forFeitoUmCliqueNoLinkDoCart() {

        ecomercePage.clicaBtnCart();
    }


    @After
    public void finalizaTeste(){
        Driver.getDriver().quit();
    }

    @Quando("for feito um clique no botao add to cart do saturn rocket")
    public void forFeitoUmCliqueNoBotaoAddToCartDoSaturnRocket() {

        ecomercePage.clicaBtnSaturnRocket();

    }

    @Quando("for feito um clique no botao add to cart do falcon heavy")
    public void forFeitoUmCliqueNoBotaoAddToCartDoFalconHeavy() {
        ecomercePage.clicaBtnFalconHeavy();
    }

    @E("for excluido o terceiro foguete da lista")
    public void forExcluidoOTerceiroFogueteDaLista() {
        ecomercePage.clicaBtnDeleteSaturn();
    }
}
