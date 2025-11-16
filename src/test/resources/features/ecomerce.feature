#language:pt


Funcionalidade: Site de compras

  @primeiro
  Cenario: Comprar uma mens outwear
    Dado que a pagina inicial esteja sendo exibida
    Quando for feito um clique no botao mens outerwear
    E for feito um clique em uma peca de roupa
    E for feito um clique no botao add to cart
    E for feito um clique no botao checkout
    E os dados forem preenchidos da seguinte forma
      | email      | teste@teste.com |
      | phone      | 1122334455      |
      | address    | rua dos bobos 1 |
      | city       | cidadela        |
      | country    | united states   |
      | cardholder | joao            |
      | cardnumber | 222333333333333 |
      | month      | dec             |
      | year       | 2022            |
      | cvv        | 123             |
    E for feito um clique no botao place order
    Entao valide a mensagem de finalizacao do checkout

  Cenario: Comprar duas mens outwear
    Dado que a pagina inicial esteja sendo exibida
    Quando for feito um clique no botao mens outerwear
    E for feito um clique em uma peca de roupa
    E for feito um clique no botao add to cart
    E for feito um clique no botao mens outerwear
    E for feito um clique em uma peca de roupa
    E for feito um clique no botao add to cart
    E for feito um clique no botao checkout
    E os dados forem preenchidos da seguinte forma
      | email      | teste@teste.com |
      | phone      | 1122334455      |
      | address    | rua dos bobos 1 |
      | city       | cidadela        |
      | country    | united states   |
      | cardholder | joao            |
      | cardnumber | 222333333333333 |
      | month      | dec             |
      | year       | 2022            |
      | cvv        | 123             |
    E for feito um clique no botao place order
    Entao valide a mensagem de finalizacao do checkout


  Cenario: Comprar uma ladies outwear
    Dado que a pagina inicial esteja sendo exibida
    Quando for feito um clique no botao ladies outerwear
    E for feito um clique em uma peca de roupa
    E for feito um clique no botao add to cart
    E for feito um clique no botao checkout
    E os dados forem preenchidos da seguinte forma
      | email      | teste@teste.com |
      | phone      | 1122334455      |
      | address    | rua dos bobos 1 |
      | city       | cidadela        |
      | country    | united states   |
      | cardholder | joao            |
      | cardnumber | 222333333333333 |
      | month      | dec             |
      | year       | 2022            |
      | cvv        | 123             |
    E for feito um clique no botao place order
    Entao valide a mensagem de finalizacao do checkout


  Cenario: Comprar duas ladies outwear
    Dado que a pagina inicial esteja sendo exibida
    Quando for feito um clique no botao ladies outerwear
    E for feito um clique em uma peca de roupa
    E for feito um clique no botao add to cart
    E for feito um clique no botao ladies outerwear
    E for feito um clique em uma peca de roupa
    E for feito um clique no botao add to cart
    E for feito um clique no botao checkout
    E os dados forem preenchidos da seguinte forma
      | email      | teste@teste.com |
      | phone      | 1122334455      |
      | address    | rua dos bobos 1 |
      | city       | cidadela        |
      | country    | united states   |
      | cardholder | joao            |
      | cardnumber | 222333333333333 |
      | month      | dec             |
      | year       | 2022            |
      | cvv        | 123             |
    E for feito um clique no botao place order
    Entao valide a mensagem de finalizacao do checkout


  Cenario: Comprar uma mens e uma ladies outerwear
    Dado que a pagina inicial esteja sendo exibida
    Quando for feito um clique no botao mens outerwear
    E for feito um clique em uma peca de roupa
    E for feito um clique no botao add to cart
    E for feito um clique no botao ladies outerwear
    E for feito um clique em outra peca de roupa do ladies outwear
    E for feito um clique no botao add to cart
    E for feito um clique no botao checkout
    E os dados forem preenchidos da seguinte forma
      | email      | teste@teste.com |
      | phone      | 1122334455      |
      | address    | rua dos bobos 1 |
      | city       | cidadela        |
      | country    | united states   |
      | cardholder | joao            |
      | cardnumber | 222333333333333 |
      | month      | dec             |
      | year       | 2022            |
      | cvv        | 123             |
    E for feito um clique no botao place order
    Entao valide a mensagem de finalizacao do checkout


  Cenario: Comprar uma mens tshirt
    Dado que a pagina inicial esteja sendo exibida
    Quando for feito um clique no botao mens t shirts
    E for feito um clique em uma peca de roupa
    E for feito um clique no botao add to cart
    E for feito um clique no botao checkout
    E os dados forem preenchidos da seguinte forma
      | email      | teste@teste.com |
      | phone      | 1122334455      |
      | address    | rua dos bobos 1 |
      | city       | cidadela        |
      | country    | united states   |
      | cardholder | joao            |
      | cardnumber | 222333333333333 |
      | month      | dec             |
      | year       | 2022            |
      | cvv        | 123             |
    E for feito um clique no botao place order
    Entao valide a mensagem de finalizacao do checkout


  Cenario: Comprar uma ladies tshirt
    Dado que a pagina inicial esteja sendo exibida
    Quando for feito um clique no botao ladies t shirts
    E for feito um clique em uma peca de roupa
    E for feito um clique no botao add to cart
    E for feito um clique no botao checkout
    E os dados forem preenchidos da seguinte forma
      | email      | teste@teste.com |
      | phone      | 1122334455      |
      | address    | rua dos bobos 1 |
      | city       | cidadela        |
      | country    | united states   |
      | cardholder | joao            |
      | cardnumber | 222333333333333 |
      | month      | dec             |
      | year       | 2022            |
      | cvv        | 123             |
    E for feito um clique no botao place order
    Entao valide a mensagem de finalizacao do checkout


  Cenario: Comprar uma mens tshirt e uma ladies tshirt
    Dado que a pagina inicial esteja sendo exibida
    Quando for feito um clique no botao mens t shirts
    E for feito um clique em uma peca de roupa
    E for feito um clique no botao add to cart
    E for feito um clique no botao ladies tshirt
    E for feito um clique em uma peca de roupa
    E for feito um clique no botao add to cart
    E for feito um clique no botao checkout
    E os dados forem preenchidos da seguinte forma
      | email      | teste@teste.com |
      | phone      | 1122334455      |
      | address    | rua dos bobos 1 |
      | city       | cidadela        |
      | country    | united states   |
      | cardholder | joao            |
      | cardnumber | 222333333333333 |
      | month      | dec             |
      | year       | 2022            |
      | cvv        | 123             |
    E for feito um clique no botao place order
    Entao valide a mensagem de finalizacao do checkout


  Cenario: Comprar uma mens outwear com tamanho e quantidade diferentes
    Dado que a pagina inicial esteja sendo exibida
    Quando for feito um clique no botao mens outerwear
    E for feito um clique em uma peca de roupa
    E os campos forem preenchidos dessa forma
      | size     | L |
      | quantity | 5 |
    E for feito um clique no botao add to cart
    E for feito um clique no botao checkout
    E os dados forem preenchidos da seguinte forma
      | email      | teste@teste.com |
      | phone      | 1122334455      |
      | address    | rua dos bobos 1 |
      | city       | cidadela        |
      | country    | united states   |
      | cardholder | joao            |
      | cardnumber | 222333333333333 |
      | month      | dec             |
      | year       | 2022            |
      | cvv        | 123             |
    E for feito um clique no botao place order
    Entao valide a mensagem de finalizacao do checkout


  Cenario: Comprar uma ladies outwear com tamanho e quantidade diferentes
    Dado que a pagina inicial esteja sendo exibida
    Quando for feito um clique no botao ladies outerwear
    E for feito um clique em uma peca de roupa
    E os campos forem preenchidos dessa forma
      | size     | S |
      | quantity | 3 |
    E for feito um clique no botao add to cart
    E for feito um clique no botao checkout
    E os dados forem preenchidos da seguinte forma
      | email      | teste@teste.com |
      | phone      | 1122334455      |
      | address    | rua dos bobos 1 |
      | city       | cidadela        |
      | country    | united states   |
      | cardholder | joao            |
      | cardnumber | 222333333333333 |
      | month      | dec             |
      | year       | 2022            |
      | cvv        | 123             |
    E for feito um clique no botao place order
    Entao valide a mensagem de finalizacao do checkout


  Cenario: Comprar uma mens tshirt com tamanho e quantidade diferentes
    Dado que a pagina inicial esteja sendo exibida
    Quando for feito um clique no botao mens tshirt
    E for feito um clique em uma peca de roupa
    E os campos forem preenchidos dessa forma
      | size     | XL |
      | quantity | 2  |
    E for feito um clique no botao add to cart
    E for feito um clique no botao checkout
    E os dados forem preenchidos da seguinte forma
      | email      | teste@teste.com |
      | phone      | 1122334455      |
      | address    | rua dos bobos 1 |
      | city       | cidadela        |
      | country    | united states   |
      | cardholder | joao            |
      | cardnumber | 222333333333333 |
      | month      | dec             |
      | year       | 2022            |
      | cvv        | 123             |
    E for feito um clique no botao place order
    Entao valide a mensagem de finalizacao do checkout


  Cenario: Comprar uma ladies tshirt com tamanho e quantidade diferentes
    Dado que a pagina inicial esteja sendo exibida
    Quando for feito um clique no botao ladies tshirt
    E for feito um clique em uma peca de roupa
    E os campos forem preenchidos dessa forma
      | size     | M |
      | quantity | 4 |
    E for feito um clique no botao add to cart
    E for feito um clique no botao checkout
    E os dados forem preenchidos da seguinte forma
      | email      | teste@teste.com |
      | phone      | 1122334455      |
      | address    | rua dos bobos 1 |
      | city       | cidadela        |
      | country    | united states   |
      | cardholder | joao            |
      | cardnumber | 222333333333333 |
      | month      | dec             |
      | year       | 2022            |
      | cvv        | 123             |
    E for feito um clique no botao place order
    Entao valide a mensagem de finalizacao do checkout


  Cenario: Comprar cada um dos tipos de roupa com quantidades e tamanhos diferentes
    Dado que a pagina inicial esteja sendo exibida
    Quando for feito um clique no botao mens outerwear
    E for feito um clique em uma peca de roupa
    E os campos forem preenchidos dessa forma
      | size     | xs |
      | quantity | 1  |
    E for feito um clique no botao add to cart
    E for feito um clique no botao ladies outerwear
    E for feito um clique em uma peca de roupa
    E os campos forem preenchidos dessa forma
      | size     | s |
      | quantity | 2 |
    E for feito um clique no botao add to cart
    E for feito um clique no botao mens tshirt
    E for feito um clique em uma peca de roupa
    E os campos forem preenchidos dessa forma
      | size     | m |
      | quantity | 3 |
    E for feito um clique no botao add to cart
    E for feito um clique no botao ladies tshirt
    E for feito um clique em uma peca de roupa
    E os campos forem preenchidos dessa forma
      | size     | l |
      | quantity | 4 |
    E for feito um clique no botao add to cart
    E for feito um clique no botao mens outerwear
    E for feito um clique em uma peca de roupa
    E os campos forem preenchidos dessa forma
      | size     | xl |
      | quantity | 5  |
    E for feito um clique no botao checkout
    E os dados forem preenchidos da seguinte forma
      | email      | teste@teste.com |
      | phone      | 1122334455      |
      | address    | rua dos bobos 1 |
      | city       | cidadela        |
      | country    | united states   |
      | cardholder | joao            |
      | cardnumber | 222333333333333 |
      | month      | dec             |
      | year       | 2022            |
      | cvv        | 123             |
    E for feito um clique no botao place order
    Entao valide a mensagem de finalizacao do checkout


  Cenario: Comprar uma roupa com email invalido
    Dado que a pagina inicial esteja sendo exibida
    Quando for feito um clique no botao mens outerwear
    E for feito um clique em uma peca de roupa
    E for feito um clique no botao add to cart
    E for feito um clique no botao checkout
    E os dados forem preenchidos da seguinte forma
      | email      | 123             |
      | phone      | 1122334455      |
      | address    | rua dos bobos 1 |
      | city       | cidadela        |
      | country    | united states   |
      | cardholder | joao            |
      | cardnumber | 222333333333333 |
      | month      | dec             |
      | year       | 2022            |
      | cvv        | 123             |
    E for feito um clique fora do campo email
    Entao valide a mensagem de invalid email


  Cenario: Comprar uma roupa com cartao invalido
    Dado que a pagina inicial esteja sendo exibida
    Quando for feito um clique no botao mens outerwear
    E for feito um clique em uma peca de roupa
    E for feito um clique no botao add to cart
    E for feito um clique no botao checkout
    E os dados forem preenchidos da seguinte forma
      | email      | teste@teste.com |
      | phone      | 1122334455      |
      | address    | rua dos bobos 1 |
      | city       | cidadela        |
      | country    | united states   |
      | cardholder | joao            |
      | cardnumber | 2223            |
      | month      | dec             |
      | year       | 2022            |
      | cvv        | 123             |
    E for feito um clique na fora do campo card number
    Entao valide a mensagem de invalid card number


  Cenario: Limpar carrinho
    Dado que a pagina inicial esteja sendo exibida
    Quando for feito um clique no botao mens outerwear
    E for feito um clique em uma peca de roupa
    E for feito um clique no botao add to cart
    E for feito um clique no botao view cart
    E for feito um clique no botao excluir
    Entao valide a mensagem de your cart is empty


  Cenario: Comprar dois tipos de roupa e excluir uma do carrinho e comprar a outra
    Dado que a pagina inicial esteja sendo exibida
    Quando for feito um clique no botao mens outerwear
    E for feito um clique em uma peca de roupa
    E os campos forem preenchidos dessa forma
      | size     | xs |
      | quantity | 1  |
    E for feito um clique no botao add to cart
    E for feito um clique no botao ladies outerwear
    E for feito um clique em uma peca de roupa
    E os campos forem preenchidos dessa forma
      | size     | s |
      | quantity | 2 |
    E for feito um clique no botao add to cart
    E for feito um clique no botao view cart
    E for feito um clique no botao excluir da primeira peca
    E for feito um clique no botao checkout
    E os dados forem preenchidos da seguinte forma
      | email      | teste@teste.com |
      | phone      | 1122334455      |
      | address    | rua dos bobos 1 |
      | city       | cidadela        |
      | country    | united states   |
      | cardholder | joao            |
      | cardnumber | 222333333333333 |
      | month      | dec             |
      | year       | 2022            |
      | cvv        | 123             |
    E for feito um clique no botao place order
    Entao valide a mensagem de finalizacao do checkout
















