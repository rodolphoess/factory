package simple_factory;

public class Pizzaria {
	private Pizza pizza;
	
	public void criarPizza(String tipo) {
		pizza = PizzaFactory.criarPizza(tipo);
	}
}
