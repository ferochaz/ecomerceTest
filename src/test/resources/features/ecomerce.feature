#language:pt

Funcionalidade: Comprar

  Cenario: Comprar falcon nove
    Dado que a pagina principal esteja sendo exibida
    Quando for feito um clique no botao add to cart do falcon nove
    E for feito um clique no botao view cart do falcon nove
    E for feito um clique no botao proceed to checkout
    E os dados do formulario forem preenchidos
    E for feito um clique no botao place order
    Entao valide se a mensagem order received esta sendo exibida

  Cenario: Comprar proton rocket
    Dado que a pagina principal esteja sendo exibida
    Quando for feito um clique no botao add to cart do proton rocket
    E for feito um clique no link do cart
    E for feito um clique no botao proceed to checkout
    E os dados do formulario forem preenchidos
    E for feito um clique no botao place order
    Entao valide se a mensagem order received esta sendo exibida


  Cenario: Comprar saturn rocket
    Dado que a pagina principal esteja sendo exibida
    Quando for feito um clique no botao add to cart do saturn rocket
    E for feito um clique no link do cart
    E for feito um clique no botao proceed to checkout
    E os dados do formulario forem preenchidos
    E for feito um clique no botao place order
    Entao valide se a mensagem order received esta sendo exibida


  Cenario: Comprar falcon heavy
    Dado que a pagina principal esteja sendo exibida
    Quando for feito um clique no botao add to cart do falcon heavy
    E for feito um clique no link do cart
    E for feito um clique no botao proceed to checkout
    E os dados do formulario forem preenchidos
    E for feito um clique no botao place order
    Entao valide se a mensagem order received esta sendo exibida


  Cenario: Comprar quatro foguetes
    Dado que a pagina principal esteja sendo exibida
    Quando for feito um clique no botao add to cart do falcon nove
    E for feito um clique no botao add to cart do proton rocket
    E for feito um clique no botao add to cart do saturn rocket
    E for feito um clique no botao add to cart do falcon heavy
    E for feito um clique no link do cart
    E for feito um clique no botao proceed to checkout
    E os dados do formulario forem preenchidos
    E for feito um clique no botao place order
    Entao valide se a mensagem order received esta sendo exibida

  @excluir
  Cenario: Adicionar quatro foguetes e excluir um comprando 3 foguetes
    Dado que a pagina principal esteja sendo exibida
    Quando for feito um clique no botao add to cart do falcon nove
    E for feito um clique no botao add to cart do proton rocket
    E for feito um clique no botao add to cart do saturn rocket
    E for feito um clique no botao add to cart do falcon heavy
    E for feito um clique no link do cart
    E for excluido o terceiro foguete da lista
    E for feito um clique no botao proceed to checkout
    E os dados do formulario forem preenchidos
    E for feito um clique no botao place order
    Entao valide se a mensagem order received esta sendo exibida










