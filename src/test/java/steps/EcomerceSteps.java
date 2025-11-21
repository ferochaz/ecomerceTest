package steps;

import core.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import maps.EcomerceMaps;
import pages.EcomercePage;

public class EcomerceSteps {

    private EcomercePage ecomercePage;
    private EcomerceMaps ecomerceMaps;

    @Before
    public void inicializaTeste(){

        Driver.inicializaNavegador();
    }

    @Dado("que a pagina inicial esteja sendo exibida")
    public void queAPaginaInicialEstejaSendoExibida() {

        Driver.getDriver().get("https://shop.polymer-project.org/");
        ecomercePage= new EcomercePage();
    }

    @Quando("for feito um clique no botao mens outerwear")
    public void forFeitoUmCliqueNoBotaoMensOuterwear() {

        ecomercePage.clicaBotao(ecomerceMaps.btnMensOuterwear);


    }

    @Quando("for feito um clique em uma peca de roupa")
    public void forFeitoUmCliqueEmUmaPecaDeRoupa() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("for feito um clique no botao add to cart")
    public void forFeitoUmCliqueNoBotaoAddToCart() {

        ecomercePage.clicaBotao(ecomerceMaps.btnAddtocart);
    }

    @Quando("for feito um clique no botao checkout")
    public void forFeitoUmCliqueNoBotaoCheckout() {

        ecomercePage.clicaBotao(ecomerceMaps.btnCheckout);
    }

    @Quando("os dados forem preenchidos da seguinte forma")
    public void osDadosForemPreenchidosDaSeguinteForma(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

    @Quando("for feito um clique no botao place order")
    public void forFeitoUmCliqueNoBotaoPlaceOrder() {

        ecomercePage.clicaBotao(ecomerceMaps.btnformPlaceOrder);
    }

    @Entao("valide a mensagem de finalizacao do checkout")
    public void valideAMensagemDeFinalizacaoDoCheckout() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Quando("for feito um clique no botao ladies outerwear")
    public void forFeitoUmCliqueNoBotaoLadiesOuterwear() {

        ecomercePage.clicaBotao(ecomerceMaps.btnLadiesOuterwear);
    }


    @Quando("for feito um clique no botao mens t shirts")
    public void forFeitoUmCliqueNoBotaoMensTShirts() {

        ecomercePage.clicaBotao(ecomerceMaps.btnMensTshirt);
    }


    @Quando("for feito um clique no botao ladies t shirts")
    public void forFeitoUmCliqueNoBotaoLadiesTShirts() {
        ecomercePage.clicaBotao(ecomerceMaps.btnLadiesTshirt);
    }


    @Quando("for feito um clique no botao ladies tshirt")
    public void forFeitoUmCliqueNoBotaoLadiesTshirt() {
        ecomercePage.clicaBotao(ecomerceMaps.btnLadiesTshirt);
    }


    @Quando("os campos forem preenchidos dessa forma")
    public void osCamposForemPreenchidosDessaForma(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }


    @Quando("for feito um clique no botao mens tshirt")
    public void forFeitoUmCliqueNoBotaoMensTshirt() {
        ecomercePage.clicaBotao(ecomerceMaps.btnMensTshirt);
    }


    @Quando("for feito um clique fora do campo email")
    public void forFeitoUmCliqueForaDoCampoEmail() {

        ecomercePage.clicaBotao(ecomerceMaps.formCity);
    }

    @Entao("valide a mensagem de invalid email")
    public void valideAMensagemDeInvalidEmail() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Quando("for feito um clique na fora do campo card number")
    public void forFeitoUmCliqueNaForaDoCampoCardNumber() {

        ecomercePage.clicaBotao(ecomerceMaps.formCountry);
    }

    @Entao("valide a mensagem de invalid card number")
    public void valideAMensagemDeInvalidCardNumber() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("for feito um clique no botao view cart")
    public void forFeitoUmCliqueNoBotaoViewCart() {

        ecomercePage.clicaBotao(ecomerceMaps.btnViewCart);
    }

    @Quando("for feito um clique no botao excluir")
    public void forFeitoUmCliqueNoBotaoExcluir() {

        ecomercePage.clicaBotao(ecomerceMaps.btnDelete);
    }

    @Entao("valide a mensagem de your cart is empty")
    public void valideAMensagemDeYourCartIsEmpty() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("for feito um clique no botao excluir da primeira peca")
    public void forFeitoUmCliqueNoBotaoExcluirDaPrimeiraPeca() {

        ecomercePage.clicaBotao(ecomerceMaps.btnDelete);
    }
}
