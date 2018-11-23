# factory

Implementação do padrão de projeto factory baseado no artigo https://www.thiengo.com.br/padrao-de-projeto-factory-method

Quando usar?

- Diminuir o acoplamento entre classes através da delegação da responsabilidade de criação de objetos a uma classe específica. Assim caso em algum momento seja necessário retirar a instanciação do objeto basta apenas modificar a classe de instanciação factory, deixando as classes de negócio com menos repetição de código devido a não ter vários new.