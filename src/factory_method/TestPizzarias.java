package factory_method;

public class TestPizzarias {
	
	public static void main(String[] args) {
		PizzaFactory pizzariaSaoPaulo = new PizzaFactorySaoPaulo();
		pizzariaSaoPaulo.criarPizza("queijo");
		Pizza pizza = pizzariaSaoPaulo.delivery();
		
		PizzaFactory pizzariaRioDeJaneiro = new PizzaFactoryRioDeJaneiro();
		pizzariaRioDeJaneiro.criarPizza("calabresa");
		pizza = pizzariaRioDeJaneiro.delivery();
	}

}
