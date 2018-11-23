# factory

Implementação do padrão de projeto factory baseado nos artigos https://www.thiengo.com.br/padrao-de-projeto-simple-factory , https://www.thiengo.com.br/padrao-de-projeto-factory-method , https://www.thiengo.com.br/padrao-de-projeto-abstract-factory

Quando usar?

- Diminuir o acoplamento entre classes através da delegação da responsabilidade de criação de objetos a uma classe específica, a factory. Assim caso em algum momento seja necessário retirar a instanciação do objeto por motivo negocial basta apenas modificar a classe de instanciação factory, ocasionando também nas classes de negócio com menos repetição de código new.

OBS.: No exemplo proposto, assuma que a classe Pizzaria é uma classe de domínio ou controle e que terá mais métodos realizando ações ou validando regras de negócio, portanto, poderia haver muita repetição de instanciação dos tipos de pizza. O método criarPizza() evita essa repetição de instanciação.